package Conceptual;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test{
	  
	 public static void main(String arg[]) {
		 String[] arrayOfWords = {"Iammm", "Destroyyyy"};
		 Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		 streamOfWords.map(s->s.split("")) //Converting word in to array of letters
		     .flatMap(Arrays::stream).distinct() //Make array in to separate stream
		     .collect(Collectors.toList()).forEach(System.out::print);
		    //System.out.println((streamOfWords));
		 System.out.println("-----------------------------");
		 
		 List<String> lst = Arrays.asList("Iammm","Desdtroyyyy");
		    lst.stream().map(w->w.split("")).distinct().collect(Collectors.toList());
		    //System.out.println(Arrays.toString(lst));
		   
		    
		    //.forEach(System.out::print);;
		    
		    String[] data = {"hi","hello"};
		    Stream<String> newdata = Arrays.stream(data);
		    newdata.map(s->s.split("")).flatMap(Arrays::stream).distinct()
            .collect(Collectors.toList()).forEach(System.out::print);		    
		  }
    
  }
  
