
public class ArmstrongNo {

	public static void main(String[] args) {
		/*int no=371;
		int temp=0;
		int r=0;
		int sum=0;
		temp=no;
		while(no>0) {
			r=no%10;
			sum=sum+(r*r*r);
			no=no/10;
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("No is Armstrong");
		else
			System.out.println("No is not Armstrong");
	}
*/
		int no=371;
		int r, temp=0, sum=0;
		temp=no;
		while(no>0) {
			r=no%10;
			sum=sum+(r*r*r);
			no=no/10;
		}
		if(temp==sum)
			System.out.println("no is Armsstrong : "+sum);
		else
			System.out.println("no is not Armstrong : "+sum);
	}
}
