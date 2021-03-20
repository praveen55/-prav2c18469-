
public class Stringg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Tom";
		String s2 = "Tom";
		String s3 = "John";
		String s4 = "Sam";
		
		String ss2= s3.replace("John","Ram");
		System.out.println("Replaced : "+ss2);
		
		
		int s = s1.compareTo(s2);
		if(s == 0)
		{
			System.out.println("String are same and value is : " +s);
		}
		else
		{
			System.out.println("String are same and value is : " +s3.compareTo(s4));	
		}
		int ss1 = s3.compareTo(s4);
		if(ss1 == 0)
		{
			System.out.println("String are same and value is : " +ss1);
		}
		else
		{
			System.out.println("String are not same and value is : " +s2.compareTo(s3));
	}
	}
	
}
