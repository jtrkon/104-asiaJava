import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J���Z:");
		int G=scn.nextInt();
		
		if(G>97){
			System.out.println("���Z���ĬO:A+");
		}else{
			if(94 <= G && G <= 97){
				System.out.println("���Z���ĬO:A");
			}else{
				if(90 <= G && G <= 93){
					System.out.println("���Z���ĬO:A-");
				}else{
					if(87 <= G && G <= 89){
						System.out.println("���Z���ĬO:B+");
					}else{
						if(84 <= G && G <= 86){
							System.out.println("���Z���ĬO:B");
						}else{
							if(80 <= G && G <= 83){
								System.out.println("���Z���ĬO:B-");
							}else{
								if(77 <= G && G <= 79){
									System.out.println("���Z���ĬO:C+");
								}else{
									if(74 <= G && G <= 76){
										System.out.println("���Z���ĬO:C");
									}else{
										if(70 <= G && G <= 73){
											System.out.println("���Z���ĬO:C-");
										}else{
											if(67 <= G && G <= 69){
												System.out.println("���Z���ĬO:D+");
											}else{
												if(64 <= G && G <= 66){
													System.out.println("���Z���ĬO:D");
												}else{
													if(60 <= G && G <= 63){
														System.out.println("���Z���ĬO:D-");
													}else{
														System.out.println("���Z���ĬO:E");
														
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

