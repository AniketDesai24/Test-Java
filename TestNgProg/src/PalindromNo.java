
public class PalindromNo {

	public static void main(String[] args) {
		int sum=0;
		int no=121;
		int temp=0;
		int r=0;
		temp=no;
		while(no>0) {
			r=no%10;
			sum=(sum*10)+r;
			no=no/10;
			//System.out.println(sum);
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("no is palindrom");
		else
			System.out.println("No is not palindrom");
	}
}
