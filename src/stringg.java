
public class stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = null;
		String s3 = "Tom";
		String s4 = "John";
		String s5 = "John";
		System.out.println(s3.contains(s4));
		System.out.println(s4.contains(s5));
		System.out.println(s3.compareTo(s4));
		if(s1.isEmpty())
		{
			System.out.println("It is Empty String");
		}
		else
		{
			System.out.println("It is Not a Empty");
		}
		if(s3.isEmpty())
		{
			System.out.println("It is Empty String");
		}
		else
		{
			System.out.println("It is Not a Empty");
		}
		if(s3.contains("john"))
		{
			System.out.println("It is Present");
		}
		else
		{
			System.out.println("Not Present");
		}
		if (s2.isEmpty())
		{
			System.out.println("It is Empty String");
		}
		else
		{
			System.out.println("It is NOT Empty");
		}
	}
}

