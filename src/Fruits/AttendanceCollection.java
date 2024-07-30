package Fruits;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AttendanceCollection {
    public static void main(String[] args) {
        List<AttendanceEntry> attendanceEntries = new ArrayList<>();

        // Add entries to the collection
        attendanceEntries.add(new AttendanceEntry(5994, "01/01/2024", "10:00", "21:00"));
       // attendanceEntries.add(new AttendanceEntry(5994, "02/01/2024", "01:00", "06:00"));
        attendanceEntries.add(new AttendanceEntry(5994, "02/01/2024", "14:00", "22:00"));

        // Calculate the total time spent inside the office for employee 5994 across two consecutive days
        Duration totalTime = calculateTotalTimeInside(attendanceEntries, 5994);

        // Print the total time spent inside the office
        long hours = totalTime.toHours();
        long minutes = totalTime.minusHours(hours).toMinutes();
        System.out.println("Total time inside the office for employee 5994 across two consecutive days: " + hours + " hours and " + minutes + " minutes");
    }

    private static Duration calculateTotalTimeInside(List<AttendanceEntry> attendanceEntries, int empId) {
        Duration totalDuration = Duration.ZERO;
        LocalDateTime lastOutTime = null;
        LocalDateTime lastDate = null;

        for (AttendanceEntry entry : attendanceEntries) {
            if (entry.getEmpId() == empId) {
                LocalDateTime inTime = parseDateTime(entry.getDate(), entry.getInTime());
                LocalDateTime outTime = parseDateTime(entry.getDate(), entry.getOutTime());

                // Adjust date if out time crosses midnight
                if (lastOutTime != null && outTime.isBefore(lastOutTime)) {
                    inTime = inTime.plusDays(1); // Next day
                    lastDate = inTime; // Update lastDate
                } else if (lastDate != null && inTime.toLocalDate().isAfter(lastDate.toLocalDate())) {
                    lastDate = inTime; // Update lastDate
                }

                if (lastOutTime != null && lastDate != null && Duration.between(lastOutTime, inTime).toHours() < 6) {
                    totalDuration = totalDuration.plus(Duration.between(lastOutTime, inTime));
                }
                
                totalDuration = totalDuration.plus(Duration.between(inTime, outTime));
                lastOutTime = outTime;
            }
        }

        return totalDuration;
    }

    private static LocalDateTime parseDateTime(String date, String time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.parse(date + " " + time, formatter);
    }
}

