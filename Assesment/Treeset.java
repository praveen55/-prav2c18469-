import java.util.Iterator;
import java.util.TreeSet;


public class Treeset {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeSet<String> EmployeeList1 = new TreeSet<String>();
		EmployeeList1.add("ram");
		EmployeeList1.add("john");
		EmployeeList1.add("sandy");
		System.out.println(EmployeeList1);
		Iterator<String> itr = EmployeeList1.iterator();
		while(itr.hasNext())
		{
			System.out.println("EmployeeList1 : "+itr.next());
		}
		{
	TreeSet<String> EmployeeList2 = new TreeSet<String>();
	EmployeeList2.add("suresh");
	EmployeeList2.add("ramesh");
	EmployeeList2.add("rajesh");
	System.out.println(EmployeeList2);
	for(String sub : EmployeeList2)
	{
		System.out.println("EmployeeList2 = "+sub);
		}
	EmployeeList1.addAll(EmployeeList2);
	System.out.println("Employee Details added.. " +EmployeeList1);
		}
	}
}



