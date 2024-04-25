package NewJavaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* ArrayList<String> names = new ArrayList<String>();
		
		names.add("Rishi");
		names.add("Rishu");
		names.add("Rakesh");
		names.add("Ajay");
		names.add("Ashwani");
		
		 int Count = 0;
		
		for(int i=0;i<names.size();i++)
		{
			String name = names.get(i);
			
			if(name.startsWith("A"))
			{
			Count++;
			}
				
		}
		System.out.println(Count); */
		
		//By Using Streams:
			
		/* Long c = names.stream().filter(s->s.startsWith("R")).count();
		System.out.println(c);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		
		//Using Multiple lambda expression.
		
		//Stream.of("Rishi","Ajay","Rakesh","Rishu","Ashwani").filter(s->s.length()<=5)
		//.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//Print the names which start with R in Uppercase and  Sorted
		Stream.of("Rishi","Ajay","Rakesh","Rishu","Ashwani").filter(s->s.startsWith("A")).sorted()
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
		//Merging 2 array list and concatenating.
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Rishi");
		names.add("Rishu");
		names.add("Rakesh");
		names.add("Ajay");
		names.add("Ashwani");
		
				
		List<String> names1 = Arrays.asList("Read","Create","Update","Delete","All");

		Stream<String> newstream = Stream.concat(names.stream(),names1.stream());
		
		//newstream.sorted().forEach(s->System.out.println(s));
		
		//Collecting items of array list in a new list.
		
		List<String> ls = newstream.filter(s->s.startsWith("R")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls.get(3)); */
		
		
		
		//Printing unique Values from Array using Streams.
		
		List<Integer> num = Arrays.asList(4,6,4,2,1,3,6,2,8,9);
		
		
		//num.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		//Collect unique value in list and print value present at 2nd index.
		
		List<Integer> sortednum = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortednum.get(5));
	
	}


}
