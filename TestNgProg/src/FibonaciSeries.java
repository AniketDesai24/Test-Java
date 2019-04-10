
public class FibonaciSeries {

	public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int sum=0;
	int max=10;
	System.out.print(n1+" "+n2+" ");
	for(int i=2;i<max;i++) {
		sum=n1+n2;
		n1=n2;
		n2=sum;		
		System.out.print(sum+" ");
	}

		/*int n1=0,max=5;
		int n2=1,sum=0;
		System.out.println(n1 + " "+n2);
		for(int i=2;i<max;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum +" ");
		}*/
	}

}
