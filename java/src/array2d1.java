import java.util.Scanner;
public class array2d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		float a[][]=new float[4][4];
		String name[]=new String[4];
		boolean flag=false;
		int b=0;
		float m=999;
		float M=0;
		int i;
		for(i=0;i<4;i++){
			System.out.print("�п�J��"+(i+1)+"��P�ǦW�r");
			name[i]=scn.next();
			System.out.print("�п�J�T�즨�Z");
			a[i][0]=scn.nextFloat();
			a[i][1]=scn.nextFloat();
			a[i][2]=scn.nextFloat();
			a[i][3]=(a[i][0]+a[i][1]+a[i][2])/3;
			
		}System.out.print("���Z��Ʀp�U:");
		for(i=0;i<4;i++){
			System.out.print("\t"+name[i]+"\t"+a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]+"\t"+a[i][3]);
		}
		for(i=0;i<4;i++){
			flag=false;
			if(a[i][3]<60){
				flag=true;
				b++;
			}
		}if(flag == false){
			i++;
		}System.out.print("���ή�H�Ʀ�: "+b+" �H");
		
		for(i=0;i<4;i++){
			if(a[i][3]<m){
				m=a[i][3];
			}if(a[i][3]>M){
				M=a[i][3];
			}
		}System.out.print("�̧C����: "+m);
		System.out.print("�̰�����: "+M);
	}

}
