import java.util.Scanner;
import java.util.Random;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		int i;
		int j=0;
		int a[] = new int[10];
		int count=0;
		for(i=0;i<10;i++){
			a[i]=(rnd.nextInt(99)+1);
		}
		for(i=0;i<10;i++){
			System.out.print(a[i]+"\t");
			if(a[i]%2 == 0){
				count++;
			}
		}
		System.out.print("�вq");
		while(j<3){
			int A=scn.nextInt();
			if(A == count){
				System.out.print("�q��F");
				break;
			}else{
				if(j<2){
					System.out.print("�q���F�A�q�@��");
				}else{
					System.out.print("�AGG�F");
				}
				j++;
			}
		}
	}

}
