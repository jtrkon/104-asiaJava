import java.util.Scanner;
import java.util.Random;
public class random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		int i=0;
		int a[] = new int[10];
		boolean flag=false;
		while(i<10){
			a[i]=rnd.nextInt(99)+1;
			flag=false;
			for(int j=0;j<i;j++){
				if(a[i] == a[j]){
					flag = true;
				}
			}
		}if(flag == false){
			i++;
		}
		
		for (int k = 0;k<10;k++){
			System.out.println(a[k]);
		}
	}

}
