import java.util.Scanner;
public class weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�P���X");
		int D=scn.nextInt();
		if(D < 1 || D > 7){
			System.out.print("�S���o�@�ѳ�");
		}else{
			switch(D){
			case 1:
				System.out.print("�P��"+D+"���^��OMonday");
				break;
			case 2:
				System.out.print("�P��"+D+"���^��OTuesday");
				break;
			case 3:
				System.out.print("�P��"+D+"���^��OWednesday");
				break;
			case 4:
				System.out.print("�P��"+D+"���^��OThursday");
				break;
			case 5:
				System.out.print("�P��"+D+"���^��OFriday");
				break;
			case 6:
				System.out.print("�P��"+D+"���^��OSaturday");
				break;
			case 7:
				System.out.print("�P��"+D+"���^��OSunday");
				break;
		}
		}
		
	}

}
