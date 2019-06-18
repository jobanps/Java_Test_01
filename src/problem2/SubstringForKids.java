package problem2;

public class SubstringForKids {

	public static void main(String[] args) {
		System.out.println("SUBSTRING FOR KIDS");
		SubstringForKids obj = new SubstringForKids();
		
		// i = j
		System.out.println(obj.substringForKids(2, 2, "This is a sentence"));
		
	}
	
	public String substringForKids(int i, int j, String sentence) {
		
			return "" + sentence.charAt(i);

	}
}