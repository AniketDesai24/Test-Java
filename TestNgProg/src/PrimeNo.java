
public class PrimeNo {

	public static void main(String[] args) {
		int no=13;
		int sum=0, flag=0;
		sum=no/2;
		for(int i=2;i<=sum;i++) {
			if(no%10==0) {
				System.out.println("No is not Prime");
				flag=1;
			break;
			}
			
		}
		if(flag==0) {
			System.out.println("No is prime");
			
		}
	}

}
