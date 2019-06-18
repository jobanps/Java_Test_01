package problem2;

public class SubstringForKids {

	public static void main(String[] args) {
		System.out.println("SUBSTRING FOR KIDS");
		SubstringForKids obj = new SubstringForKids();
		
		// i = j
		System.out.println(obj.substringForKids(1, 1, "fun"));
		
		//i < j
		System.out.println(obj.substringForKids(0, 5, "peterisshouting"));
		System.out.println(obj.substringForKids(2, 4, "apple"));
		
	}
	
	public String substringForKids(int i, int j, String sentence) {
		
		String result = "";
		if(i == j)
			return "" + sentence.charAt(i);
		else {
			
			for(int a=i; a<=j ; a++) {
				result += sentence.charAt(a);
			}
			return result; 

		}
	}
}