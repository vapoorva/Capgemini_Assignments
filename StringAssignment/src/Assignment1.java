/**
 * Display String in reverse order word by word
 * @author apoorva
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		String [] arr = input.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for (int i = arr.length-1; i >=0; i--) 
		{
			sb.append(arr[i]+ " ");
		}
		return sb.toString();
	}

}
