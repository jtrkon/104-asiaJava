import java.util.Scanner;
public class weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入星期幾");
		int D=scn.nextInt();
		if(D < 1 || D > 7){
			System.out.print("沒有這一天喔");
		}else{
			switch(D){
			case 1:
				System.out.print("星期"+D+"的英文是Monday");
				break;
			case 2:
				System.out.print("星期"+D+"的英文是Tuesday");
				break;
			case 3:
				System.out.print("星期"+D+"的英文是Wednesday");
				break;
			case 4:
				System.out.print("星期"+D+"的英文是Thursday");
				break;
			case 5:
				System.out.print("星期"+D+"的英文是Friday");
				break;
			case 6:
				System.out.print("星期"+D+"的英文是Saturday");
				break;
			case 7:
				System.out.print("星期"+D+"的英文是Sunday");
				break;
		}
		}
		
	}

}
