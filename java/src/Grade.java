import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入成績:");
		int G=scn.nextInt();
		
		if(G>97){
			System.out.println("成績等第是:A+");
		}else{
			if(94 <= G && G <= 97){
				System.out.println("成績等第是:A");
			}else{
				if(90 <= G && G <= 93){
					System.out.println("成績等第是:A-");
				}else{
					if(87 <= G && G <= 89){
						System.out.println("成績等第是:B+");
					}else{
						if(84 <= G && G <= 86){
							System.out.println("成績等第是:B");
						}else{
							if(80 <= G && G <= 83){
								System.out.println("成績等第是:B-");
							}else{
								if(77 <= G && G <= 79){
									System.out.println("成績等第是:C+");
								}else{
									if(74 <= G && G <= 76){
										System.out.println("成績等第是:C");
									}else{
										if(70 <= G && G <= 73){
											System.out.println("成績等第是:C-");
										}else{
											if(67 <= G && G <= 69){
												System.out.println("成績等第是:D+");
											}else{
												if(64 <= G && G <= 66){
													System.out.println("成績等第是:D");
												}else{
													if(60 <= G && G <= 63){
														System.out.println("成績等第是:D-");
													}else{
														System.out.println("成績等第是:E");
														
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}

