import java.util.Scanner;
public class array2d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		float a[][]=new float[4][4];
		String name[]=new String[4];
		boolean flag=false;
		int b=0;
		int k=0;
		float m=999;
		float M=0;
		int i;
		for(i=0;i<4;i++){
			System.out.print("請輸入第"+(i+1)+"位同學名字");
			name[i]=scn.next();
			System.out.print("請輸入三科成績");
			a[i][0]=scn.nextFloat();
			a[i][1]=scn.nextFloat();
			a[i][2]=scn.nextFloat();
			a[i][3]=(a[i][0]+a[i][1]+a[i][2])/3;
			
		}System.out.print("全班資料如下:");
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
		}
		System.out.print("不及格人數有: "+b+" 人");
		
		for(i=0;i<4;i++){
			if(a[i][3]<m){
				m=a[i][3];
			}if(a[i][3]>M){
				M=a[i][3];
			}
		}
		System.out.print("最低分為: "+m);
		System.out.print("最高分為: "+M);
		
		for(i=0;i<4;i++){
			for(k=i+1;k<4;k++){
				if(a[i][3] > a[k][3]){
					float change=a[i][3];
					a[i][3] = a[k][3];
					a[k][3] = change;
				}
			}
		}
		System.out.print("平均分數排序為: ");
		for(i=0;i<4;i++){
			System.out.print(a[i][3]+"\t");
		}
		
	}

}
