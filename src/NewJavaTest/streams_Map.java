package NewJavaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class streams_Map {

	public static void main(String[] args) {
		
		
		//Manulipulation Data using different methods of streams.
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Rishi1");
		names1.add("Moodys1");
		names1.add("Saini1");
		names1.add("Rajender1");
		names1.add("Raghav1");
		
		
		//1 -> Update the filtered values to Uppercase.
		Stream.of("Rishi","Moodys","Saini","Rajender","Raghav").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//2 -> print names which have first letter as R with uppercase and sorted.
		List<String> names =  Arrays.asList("Rishi","Moodys","Saini","Rajender","Raghav"); // Converting Arrays into list.

		names.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("******************************");
		
		//3 -> Merge two different list/Array.
		Stream<String> newStream = Stream.concat(names1.stream(), names.stream());
		
		//newStream.sorted().forEach(s->System.out.println(s));
		
		Boolean val = newStream.anyMatch(s->s.equalsIgnoreCase("Rishi"));
		System.out.println(val);
		
		
		//4 -> Converting streams into list using the collect method.
		
		List<String> list1 = Stream.of("Rishi","Moodys","Saini","Rajender","Raghav").filter(s->s.endsWith("i"))
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(list1.get(0));
		
		
		
		// Assignment:
		// From the given array perform the following action.
		List<Integer> val1 =  Arrays.asList(2,4,3,2,6,5,4,5,3,2,1);
		
		// -> print unique number from this array
		// val1.stream().distinct().forEach(s->System.out.println(s));
		
		// -> Sort the Array
	    List<Integer> sorted = val1.stream().distinct().sorted().collect(Collectors.toList());
		sorted.stream().forEach(s->System.out.println(s));
	    System.out.println(sorted.get(3));
		
		
	}

}
