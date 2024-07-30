package Conceptual;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchoolAdmission {

//	 public static void main(String[] args) {
//	        String[] applications = {"jay", "sam", "vi", "li", "my", "xi", "on", "mo", "an", "bo"};
//	        String[] test_ok = {"xi", "my", "sam", "an", "mo", "on"};
//	        String[] interview_ok = {"my", "li", "an", "mo", "bo", "jay"};
//	        String[] legacy = {"sue", "bo", "xi"};
//
//	        Set<String> admittedStudents = new HashSet<>();
//
//	        // Check for legacy students
//	        for (String applicant : legacy) {
//	            admittedStudents.add(applicant);
//	        }
//
//	        // Check for students who passed either test or interview
//	        for (String applicant : applications) {
//	            if (admittedStudents.contains(applicant)) {
//	                // If legacy student, no need to check further
//	                continue;
//	            }
//	            if (isPassedTest(applicant, test_ok) || isPassedInterview(applicant, interview_ok)) {
//	                admittedStudents.add(applicant);
//	            }
//	        }
//
//	        // Sort and print the accepted students
//	        List<String> sortedAdmittedStudents = new ArrayList<>(admittedStudents);
//	        sortedAdmittedStudents.sort(String::compareTo);
//
//	        System.out.println("Accepted students: " + String.join(", ", sortedAdmittedStudents));
//	    }
//
//	    private static boolean isPassedTest(String applicant, String[] test_ok) {
//	        for (String student : test_ok) {
//	            if (applicant.equals(student)) {
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
//
//	    private static boolean isPassedInterview(String applicant, String[] interview_ok) {
//	        for (String student : interview_ok) {
//	            if (applicant.equals(student)) {
//	                return true;
//	            }
//	        }
//	        return false;
//	    }

	public static void main(String args[]) {

		List<String> applications = List.of("jay", "sam", "vi", "li", "my", "xi", "on", "mo", "an", "bo");
		List<String> test_ok = List.of("xi", "my", "sam", "an", "mo", "on");

		List<String> interview_ok = List.of("my", "li", "an", "mo", "bo", "jay");
		List<String> legacy = List.of("sue", "bo", "xi");

		List<String> acceptedStudent = new ArrayList<String>();

		legacy.stream().forEach(lega -> {
			if (test_ok.contains(lega) || interview_ok.contains(lega)) {
				acceptedStudent.add(lega);
			}
		});
		applications.stream().forEach(applicant -> {
			if (test_ok.contains(applicant) && interview_ok.contains(applicant)) {
				acceptedStudent.add(applicant);
			}
		});
		System.out.println("Accepted students are" + acceptedStudent);

	}

}
