import java.util.Scanner;

public class Ex1change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���X�˰ӫ~");
		int total = scn.nextInt();
		Course3 cousData[] = new Course3[total];
		for (int i = 0; i < total; i++) {
			System.out.print("�п�J�ӫ~�W�١A�ӭӼƶq�M����");
			cousData[i] = new Course3(scn.next(), scn.next(), scn.nextInt());
		}
		String str = "Y";
		int x, z;
		while (str.equals("Y") || str.equals("y")) {
			System.out.println("�\�ඵ��");
			System.out.println("1:�d�ӫ~�W");
			System.out.println("2:�C�L�o����T");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.print("�z�n�d�߲ĴX�˰ӫ~?");
				z = scn.nextInt();
				System.out.println("�ӫ~�W��" + cousData[z].getName() + "��" + cousData[z].getNumber() + "��");
				break;
			case 2:
				System.out.print("�z�n�d�߲ĴX�˰ӫ~?");
				z = scn.nextInt();
				cousData[z].showInfo();
				break;
			default:
				System.out.println("�L���\��!!");
			}
			System.out.print("�O�_�~��?(Y/n)");
			str = scn.next();
		}
		System.out.println("���¨ϥΥ��t��");

	}

}

class Course3 {
	private String cousName,cousNumber;
	private int cousMoney;

	public Course3(String Name, String Number, int Money) {
		cousName = Name;
		cousNumber = Number;
		cousMoney = Money;
	}

	public void setName(String str) {
		cousName = str;
	}

	public String getName() {
		return cousName;
	}

	public void setNumber(String str) {
		cousNumber = str;
	}

	public String getNumber() {
		return cousNumber;
	}

	public void setMoney(int v2) {
		if (v2 > 0 && v2 < 999) {
			cousMoney = v2;
		} else {
			System.out.println("�ܩ�p�z��J����Ʈ榡�����T");
		}
	}

	public int getMoney() {
		return cousMoney;
	}

	public void showInfo() {
		System.out.println("�~�W" + cousName);
		System.out.println("�ƶq:" + cousNumber);
		System.out.println("����:" + cousMoney + "\n");
	}
}