import java.util.Scanner;
public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個數");
		int n=scn.nextInt();
		int i;
		int sum = 0;
		
	    if(n%2 == 0){
	    	for(i=n+1;i<=1399;i=i+2){
	    		sum = sum + i;
	    	}System.out.print(sum);
	    }else{
	    	for(i=n;i<=1399;i=i+2){
	    		sum = sum + i;
	    	}System.out.print(sum);
	    }
		
	}

}
