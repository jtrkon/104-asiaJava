import java.util.Scanner;
public class IDcodearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入身分證字號英文字母");
		char z=scn.next().charAt(0);
		String str = "";
		switch(z){
		case 'A':
			System.out.print(z+"是台北市");
			break;
		case 'B':
			System.out.print(z+"是台中市");
			break;
		case 'C':
			System.out.print(z+"是基隆市");
			break;
		case 'D':
			System.out.print(z+"是台南市");
			break;
		case 'E':
			System.out.print(z+"是高雄市");
			break;
		case 'F':
			System.out.print(z+"是新北市");
			break;
		case 'G':
			System.out.print(z+"是宜蘭縣");
			break;
		case 'H':
			System.out.print(z+"是桃園縣");
			break;
		case 'I':
			System.out.print(z+"是嘉義市");
			break;
		case 'J':
			System.out.print(z+"是新竹縣");
			break;
		case 'K':
			System.out.print(z+"是苗栗縣");
			break;
		case 'L':
			System.out.print(z+"是台中縣");
			break;
		case 'M':
			System.out.print(z+"是南投縣");
			break;
		case 'N':
			System.out.print(z+"是彰化縣");
			break;
		case 'O':
			System.out.print(z+"是新竹市");
			break;
		case 'P':
			System.out.print(z+"是雲林縣");
			break;
		case 'Q':
			System.out.print(z+"是嘉義縣");
			break;
		case 'R':
			System.out.print(z+"是台南縣");
			break;
		case 'S':
			System.out.print(z+"是高雄縣");
			break;
		case 'T':
			System.out.print(z+"是屏東縣");
			break;
		case 'U':
			System.out.print(z+"是花蓮縣");
			break;
		case 'V':
			System.out.print(z+"是台東縣");
			break;
		case 'W':
			System.out.print(z+"是金門縣");
			break;
		case 'X':
			System.out.print(z+"是澎湖縣");
			break;
		case 'Y':
			System.out.print(z+"是陽明山");
			break;
		case 'Z':
			System.out.print(z+"是馬祖");
			break;
			
		}
		
	}

}
