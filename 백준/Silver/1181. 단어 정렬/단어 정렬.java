import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	String arr[] = new String[num];
	
    for(int i =0; i<arr.length; i++) { 
    	arr[i] = input.next();
    }
    
    Arrays.sort(arr,new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) { 
			if(o1.length() == o2.length()) { 
				return o1.compareTo(o2);
			}			
			else {
				return Integer.compare(o1.length(),o2.length());
			}
			
		}
    	
    });
    
    System.out.println(arr[0]); 
    for(int i=1;i<arr.length;i++) { 
    	if(arr[i-1].equals(arr[i])) continue; 
    	System.out.println(arr[i]); 
    }
  }
}