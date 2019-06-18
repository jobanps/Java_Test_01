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
		
		//i>j
		System.out.println(obj.substringForKids(5, 3, "bad"));
		
		// i is negative number
		System.out.println(obj.substringForKids(-1, -2, "fun"));
		
	}
	
	public String substringForKids(int i, int j, String sentence) {
		
		String result = "";
		if(i < 0 ) {
			return "You gave me invalid numbers!";
		} else if(i == j) {
			return "" + sentence.charAt(i);
		} else if(i < j){
			
			for(int a=i; a<=j ; a++) {
				result += sentence.charAt(a);
			}
			return result; 
		
		} else {
			return "You gave me invalid numbers!";
		}
		
	}
}