import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Linkedhasset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Employeelist> set = new LinkedHashSet<Employeelist>();
		Employeelist e1 = new Employeelist(123,2010,"Max","HR",50000);
		Employeelist e2 = new Employeelist(124,2014,"jhon","Software Developer",80000);
		Employeelist e3 = new Employeelist(125,2016,"clint","Supervisor",70000);
		Employeelist e4 = new Employeelist(126,2018,"Ramesh","Manager",100000);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		for(Employeelist sub : set){
			System.out.println("Id : "+sub.id+ ",\t " + "Joinedyear : "+sub.joinedyear+ ",\t " + "Employeename : "+sub.Employeename+ ",\t "+"Department : "+sub.dept+ ",\t " +"Salary : "+sub.salary+ ";\t ");
		}
		
	}

}
class Employeelist{
	int id , joinedyear,salary;
	String Employeename,dept;
	public Employeelist(int id,int joinedyear,String Employeename,String dept, int salary ){
		super();
		this.id = id;
		this.joinedyear = joinedyear;
		this.Employeename = Employeename;
		this.dept = dept;
		this.salary = salary;
	}
}