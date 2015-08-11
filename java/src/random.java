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
		System.out.print("請猜");
		while(j<3){
			int A=scn.nextInt();
			if(A == count){
				System.out.print("猜對了");
				break;
			}else{
				if(j<2){
					System.out.print("猜錯了再猜一次");
				}else{
					System.out.print("你GG了");
				}
				j++;
			}
		}
	}

}
