
class Std{
	int rollNo;
	String name;
	static String clgName="ITS";
	
	static void change() {
		clgName="SNd";
	}
	
	public Std(int r, String n) {
		rollNo=r;
		name=n;
	}
	void display() {
		System.out.println(name+" "+rollNo+" "+clgName);
	}
}
public class StaticVar {
	public static void main(String[] args) {
		Std.change();
		Std s1=new Std(12, "Ani");
		s1.display();
	}
/*
	static int var=0;
	public StaticVar() {
		var++;
		System.out.println(var);
	}
	public static void main(String[] args) {

		StaticVar s1=new StaticVar();
		StaticVar s2=new StaticVar();
		StaticVar s3=new StaticVar();
	}
*/
	
}
