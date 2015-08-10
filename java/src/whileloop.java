import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int w = 500 * 78 / 100;
		w = 500 - w;
		int h=1;
		double r=2;
		while(r < w){
			 r = r * 0.15 + r;
			 h = h + 1;
		}
		System.out.print("水庫到達滿水位需時"+h+"小時");
	}

}
