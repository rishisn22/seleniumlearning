package NewJavaTest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class stream_basics {
	
	public static void main (String[] args) {		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rishi");
		names.add("Moodys");
		names.add("Saini");
		names.add("Rajender");
		names.add("Raghav");
		int count = 0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("R"))
			{
				count++;
			}
		}
		System.out.println(count);
	


		// Using the Java Streams to Optimized the above code.
	 
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Rishi");
		names1.add("Moodys");
		names1.add("Saini");
		names1.add("Rajender");
		names1.add("Raghav");
		
		//Convert the Arraylist into stream and filter it using the Lambda expression
		Long c = names1.stream().filter(s->s.startsWith("R")).count();
		System.out.println(c);	
		
		
		//Now instead of creating collection()ArrayList) we can directly store value in Streams and perform the action
		
		Long c1 = Stream.of("Rishi","Moodys","Saini","Rajender","Raghav").filter(s->s.startsWith("R")).count();
		System.out.println(c1);
		
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s));
		
	}

}
