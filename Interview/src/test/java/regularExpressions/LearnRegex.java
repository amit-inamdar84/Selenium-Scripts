package regularExpressions;
//Strings in Java have built-in support for regular expressions. Strings have four built-in methods for regular expressions: 
//matches(), split()), replaceFirst(), replaceAll()

public class LearnRegex {
	public static void checkNum(String[] s4){
		for(String str : s4){
			try {
				int n = Integer.parseInt(str);
				System.out.println("int exists in string array");
			} catch (NumberFormatException e) {
				//Do nothing
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		String s = "helloworlda";
		System.out.println(s.replaceAll("[abc]", "I"));//It would match with text if the text is having either one of them(a,b or c) and only once.
		System.out.println(s.replaceFirst("[^abc]", "I"));//Only replace first occurence of pattern [^abc] - ^ is negation
		
		String s1 = "1AT&T";
		System.out.println(s1.replaceAll("[0-9]", "2"));//Match digits
		
		String s2 = " Bell";
		System.out.println(s2.replaceAll("\\s", "2"));//Replace space with 2
		//System.out.println(s2.trim().replaceAll("\n", "2"));
		
		String[] s4 = {"Test", "TTE", "ABC"};
		checkNum(s4);

		
	}

}
