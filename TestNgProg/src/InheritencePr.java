
public class InheritencePr {

	int sal=12000;
}

class Employee extends InheritencePr{
	int sal2=23243;
	
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.sal+"aaaaaa");
		System.out.println(e.sal2+"sss");
	}
}