import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�@�Ӽ�");
		int n=scn.nextInt();
		int i;
		int sum = 0;
		for(i=n;i<=1399;i=i+1){
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
