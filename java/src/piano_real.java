package piano;
import sun.audio.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;



import java.net.URL;

public class piano_real extends JFrame {

	Scanner scn = new Scanner(System.in);
	private JButton jbtnExit = new JButton("Exit"); // 離開按鈕
	private JButton jbtndo = new JButton("Do");// 音符按鈕(白鍵)
	private JButton jbtnre = new JButton("Re");// 音符按鈕(白鍵)
	private JButton jbtnmi = new JButton("Mi");// 音符按鈕(白鍵)
	private JButton jbtnfa = new JButton("Fa");// 音符按鈕(白鍵)
	private JButton jbtnso = new JButton("So");// 音符按鈕(白鍵)
	private JButton jbtnla = new JButton("La");// 音符按鈕(白鍵)
	private JButton jbtnti = new JButton("Ti");// 音符按鈕(白鍵)
	private JButton jbtndoo = new JButton("Do");// 音符按鈕(白鍵)
	private JButton jbtndoup = new JButton("Do#");// 音符按鈕(黑鍵)
	private JButton jbtnreup = new JButton("Re#");// 音符按鈕(黑鍵)
	private JButton jbtnfaup = new JButton("Fa#");// 音符按鈕(黑鍵)
	private JButton jbtnsoup = new JButton("So#");// 音符按鈕(黑鍵)
	private JButton jbtnlaup = new JButton("La#");// 音符按鈕(黑鍵)
	private String str = "鋼琴";
	private JLabel jlb1 = new JLabel();// 標籤物件
	private Container cp; // 宣告一個視窗容器

	

	public piano_real() { // 視窗類別的建構元
		initComp(); // 呼叫initComp函式以繪製視窗模式
	}

	private void initComp() {
		cp = this.getContentPane();// 取得視窗的容器用來放置各種物件

		this.setBounds(150, 100, 1200, 400);// 設定標籤物件在視窗的起始位置與視窗大小
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 設定視窗案X就結束
		cp.setLayout(null);// 不適用視窗佈局類別��

		// -------設定標籤---------
		jlb1.setBounds(50, 70, 250, 25);//
		jlb1.setText(str);// 顯示標籤上的字
		cp.add(jlb1); // 將標籤加入視窗中
		// ----------輸入元
	
	//--------黑鍵-------//
		
		jbtndoup.setBounds(80, 100, 56, 85); // 設定Do#按鈕在視窗的起始位置與視窗大小
		jbtndoup.setBackground(Color.black);
		cp.add(jbtndoup);// 將push鈕加入到視窗容器中
		jbtndoup.addActionListener(new ActionListener() {// 為Do#按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {	
			
			}
		
		
			
		});
		
		
		jbtnreup.setBounds(140, 100, 56, 85); // 設定Re#按鈕在視窗的起始位置與視窗大小
		jbtnreup.setBackground(Color.black);
		cp.add(jbtnreup);// 將push鈕加入到視窗容器中
		jbtnreup.addActionListener(new ActionListener() {// 為Re#按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {	
				
			}
		});
		jbtnfaup.setBounds(260, 100, 56, 85); // 設定Fa#按鈕在視窗的起始位置與視窗大小
		jbtnfaup.setBackground(Color.black);
		cp.add(jbtnfaup);// 將push鈕加入到視窗容器中
		jbtnfaup.addActionListener(new ActionListener() {// 為Fa#按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {		
				
			}
		});
		jbtnsoup.setBounds(320, 100, 56, 85); // 設定So#按鈕在視窗的起始位置與視窗大小
		jbtnsoup.setBackground(Color.black);
		cp.add(jbtnsoup);// 將push鈕加入到視窗容器中
		jbtnsoup.addActionListener(new ActionListener() {// 為So#按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {	
				
			}
		});
		jbtnlaup.setBounds(380, 100, 56, 85); // 設定La#按鈕在視窗的起始位置與視窗大小
		jbtnlaup.setBackground(Color.black);
		cp.add(jbtnlaup);// 將push鈕加入到視窗容器中
		jbtnlaup.addActionListener(new ActionListener() {// 為La#按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {
				
			}
		});
		
		
		
		// 音符按鈕(白鍵)
		jbtndo.setBounds(50, 100, 60, 200); // 設定Do按鈕在視窗的起始位置與視窗大小
		jbtndo.setBackground(Color.white);
		cp.add(jbtndo);// 將push鈕加入到視窗容器中
		jbtndo.addActionListener(new ActionListener() {// 為Do按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnre.setBounds(110, 100, 60, 200); // 設定Re按鈕在視窗的起始位置與視窗大小
		jbtnre.setBackground(Color.white);
		cp.add(jbtnre);// 將push鈕加入到視窗容器中
		jbtnre.addActionListener(new ActionListener() {// 為Re按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnmi.setBounds(170, 100, 60, 200); // 設定Mi按鈕在視窗的起始位置與視窗大小
		jbtnmi.setBackground(Color.white);
		cp.add(jbtnmi);// 將push鈕加入到視窗容器中
		jbtnmi.addActionListener(new ActionListener() {// 為mMi按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnfa.setBounds(230, 100, 60, 200); // 設定Fa按鈕在視窗的起始位置與視窗大小
		jbtnfa.setBackground(Color.white);
		cp.add(jbtnfa);// 將push鈕加入到視窗容器中
		jbtnfa.addActionListener(new ActionListener() {// 為Fa按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnso.setBounds(290, 100, 60, 200); // 設定So按鈕在視窗的起始位置與視窗大小
		jbtnso.setBackground(Color.white);
		cp.add(jbtnso);// 將push鈕加入到視窗容器中
		jbtnso.addActionListener(new ActionListener() {// 為So按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnla.setBounds(350, 100, 60, 200); // 設定La按鈕在視窗的起始位置與視窗大小
		jbtnla.setBackground(Color.white);
		cp.add(jbtnla);// 將push鈕加入到視窗容器中
		jbtnla.addActionListener(new ActionListener() {// 為La按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnti.setBounds(410, 100, 60, 200); // 設定Ti按鈕在視窗的起始位置與視窗大小
		jbtnti.setBackground(Color.white);
		cp.add(jbtnti);// 將push鈕加入到視窗容器中
		jbtnti.addActionListener(new ActionListener() {// 為Ti按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtndoo.setBounds(470, 100, 60, 200); // 設定Doo按鈕在視窗的起始位置與視窗大小
		jbtndoo.setBackground(Color.white);
		cp.add(jbtndoo);// 將push鈕加入到視窗容器中
		jbtndoo.addActionListener(new ActionListener() {// 為Doo按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		
		
	
		// -------設定EXIT鈕----
		jbtnExit.setBounds(1000, 300, 80, 25);// 設定EXIT按鈕在視窗的起始位置與視窗大小
		cp.add(jbtnExit);// 將EXIT鈕加入到視窗容器中
		jbtnExit.addActionListener(new ActionListener() {// 為Exit按鈕加上事件處理
			public void actionPerformed(ActionEvent ae) {

				System.exit(0);
			}
		});

	}

	}

