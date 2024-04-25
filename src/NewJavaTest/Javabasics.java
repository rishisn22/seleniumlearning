package NewJavaTest;

public class Javabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // Practice for Loops, Arrays and Conditions
		
	/*	int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] != 0)
			System.out.println(arr[i]);
		}
	
		String[] arr2 = {"Rishi", "Is","Learning","Selenium"};
		
		for(int j=0; j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		
		
		int[] arr3 = {1,2,3,4,5,6,7,8,23,21,32,54,78,12,90};
		
		for(int k=0; k<arr3.length ; k++)
		{
			if(arr3[k] % 2 == 0)
			{
			System.out.println(arr3[k]);
		   }
	    }
	  
		
		String s = "Hello Rishi Saini";
		
		System.out.println(s);
		
		for(int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("\n");
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.println(s.charAt(j));
		}
		*/
		
		methodclass m = new methodclass();
		
		m.getdata();
		
		String s = m.getdata();
		System.out.println(s);
	}

}
