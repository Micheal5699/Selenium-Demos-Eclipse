
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object
		
	//	String s1 = "Popoola Ibukun Micheal";
		String s5 = "hello";
		
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Popoola Ibukun Micheal";
		String[] splittedString = s.split("Ibukun");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i =s.length()-1;i>=0;i--)
		{
			
			System.out.println(s.charAt(i));
		}
		
		
		
		
		
		
		
		

	}

}
