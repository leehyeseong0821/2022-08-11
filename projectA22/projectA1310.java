package projectA22;

public class projectA1310 {

	public static void main(String[] args) {
		 System.out.println(Character.toLowerCase('A'));
		 System.out.println(Character.toUpperCase('a'));
		 
		 char c1='4';
		 char c2='A';
		 if(Character.isDigit(c1)) {
			 System.out.println(c1+"는 숫자");
		 }
		 if(Character.isAlphabetic(c2)) {
			 System.out.println(c2+"는 문자");
		 }
		 System.out.println(Integer.parseInt("-123"));
		 System.out.println(Integer.toHexString(28));
		 System.out.println(Integer.toBinaryString(28));
		 System.out.println(Integer.bitCount(28));
		 
		 Double d1 = Double.valueOf(3.14);
		 String s1 = d1.toString();
		 System.out.println(Double.parseDouble("3.14"));

	}

}
