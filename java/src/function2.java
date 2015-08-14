import java.util.Scanner;
public class function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("½Ð¿é¤J¦¨ÁZ");
		float a[]=new float[3]; 
		int i;
		float sum = 0;
		float avg = 0;
		for(i=0;i<3;i++){
			a[i]=scn.nextFloat();
		}
		for(i=0;i<3;i++){
			sum = a[i]+a[i]+a[i];
		}
		avg = sum/3;
		System.out.print("sum: "+sum+"\t"+"avg: "+avg);
	}

}
