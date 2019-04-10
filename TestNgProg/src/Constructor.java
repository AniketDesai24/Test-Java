
public class Constructor {

	int no;
	String Name;
	Constructor() {
		System.out.println("Cons");
	}

	Constructor(int i, String b){
		no=i;
		Name=b;
	}
	void print() {
		System.out.println("Print Arrka");
		System.out.println(no+" "+Name);
	}
	
	public static void main(String[] args) {

		Constructor p1=new Constructor();
		Constructor p2=new Constructor(12,"Arrka");
		p2.print();
		p1.print();
	}

}
