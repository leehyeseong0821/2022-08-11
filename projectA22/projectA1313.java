package projectA22;

public class projectA1313 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append("is pancel");
		System.out.println(sb);
		
		sb.insert(7, "my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		sb.delete(8, 13);
       System.out.println(sb);
       
       sb.setLength(4);
       System.out.println(sb);
	}

}
