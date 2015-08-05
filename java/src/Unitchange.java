import java.math.BigDecimal;
import java.util.Scanner;
public class Unitchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入身高");
		int H=scn.nextInt();
		System.out.print("請輸入體重");
		int W=scn.nextInt();
		double P,I;
		P = W / 0.454;
		I = H / 2.54;
		
		double p1 = new BigDecimal(P)
                .setScale(1, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
		double i1 = new BigDecimal(I)
                .setScale(1, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
		System.out.print("身高為:"+i1+"英吋"+" 體重為:"+p1+"磅");
		
	}

}
