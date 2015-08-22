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
	private JButton jbtnExit = new JButton("Exit"); // Â÷¶}«ö¶s
	private JButton jbtndo = new JButton("Do");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtnre = new JButton("Re");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtnmi = new JButton("Mi");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtnfa = new JButton("Fa");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtnso = new JButton("So");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtnla = new JButton("La");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtnti = new JButton("Ti");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtndoo = new JButton("Do");// ­µ²Å«ö¶s(¥ÕÁä)
	private JButton jbtndoup = new JButton("Do#");// ­µ²Å«ö¶s(¶ÂÁä)
	private JButton jbtnreup = new JButton("Re#");// ­µ²Å«ö¶s(¶ÂÁä)
	private JButton jbtnfaup = new JButton("Fa#");// ­µ²Å«ö¶s(¶ÂÁä)
	private JButton jbtnsoup = new JButton("So#");// ­µ²Å«ö¶s(¶ÂÁä)
	private JButton jbtnlaup = new JButton("La#");// ­µ²Å«ö¶s(¶ÂÁä)
	private String str = "¿ûµ^";
	private JLabel jlb1 = new JLabel();// ¼ÐÅÒª«¥ó
	private Container cp; // «Å§i¤@­Óµøµ¡®e¾¹

	

	public piano_real() { // µøµ¡Ãþ§Oªº«Øºc¤¸
		initComp(); // ©I¥sinitComp¨ç¦¡¥HÃ¸»sµøµ¡¼Ò¦¡
	}

	private void initComp() {
		cp = this.getContentPane();// ¨ú±oµøµ¡ªº®e¾¹¥Î¨Ó©ñ¸m¦UºØª«¥ó

		this.setBounds(150, 100, 1200, 400);// ³]©w¼ÐÅÒª«¥ó¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// ³]©wµøµ¡®×X´Nµ²§ô
		cp.setLayout(null);// ¤£¾A¥Îµøµ¡§G§½Ãþ§Oˆ¥

		// -------³]©w¼ÐÅÒ---------
		jlb1.setBounds(50, 70, 250, 25);//
		jlb1.setText(str);// Åã¥Ü¼ÐÅÒ¤Wªº¦r
		cp.add(jlb1); // ±N¼ÐÅÒ¥[¤Jµøµ¡¤¤
		// ----------¿é¤J¤¸
	
	//--------¶ÂÁä-------//
		
		jbtndoup.setBounds(80, 100, 56, 85); // ³]©wDo#«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtndoup.setBackground(Color.black);
		cp.add(jbtndoup);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtndoup.addActionListener(new ActionListener() {// ¬°Do#«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {	
			
			}
		
		
			
		});
		
		
		jbtnreup.setBounds(140, 100, 56, 85); // ³]©wRe#«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnreup.setBackground(Color.black);
		cp.add(jbtnreup);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnreup.addActionListener(new ActionListener() {// ¬°Re#«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {	
				
			}
		});
		jbtnfaup.setBounds(260, 100, 56, 85); // ³]©wFa#«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnfaup.setBackground(Color.black);
		cp.add(jbtnfaup);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnfaup.addActionListener(new ActionListener() {// ¬°Fa#«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {		
				
			}
		});
		jbtnsoup.setBounds(320, 100, 56, 85); // ³]©wSo#«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnsoup.setBackground(Color.black);
		cp.add(jbtnsoup);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnsoup.addActionListener(new ActionListener() {// ¬°So#«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {	
				
			}
		});
		jbtnlaup.setBounds(380, 100, 56, 85); // ³]©wLa#«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnlaup.setBackground(Color.black);
		cp.add(jbtnlaup);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnlaup.addActionListener(new ActionListener() {// ¬°La#«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {
				
			}
		});
		
		
		
		// ­µ²Å«ö¶s(¥ÕÁä)
		jbtndo.setBounds(50, 100, 60, 200); // ³]©wDo«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtndo.setBackground(Color.white);
		cp.add(jbtndo);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtndo.addActionListener(new ActionListener() {// ¬°Do«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnre.setBounds(110, 100, 60, 200); // ³]©wRe«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnre.setBackground(Color.white);
		cp.add(jbtnre);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnre.addActionListener(new ActionListener() {// ¬°Re«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnmi.setBounds(170, 100, 60, 200); // ³]©wMi«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnmi.setBackground(Color.white);
		cp.add(jbtnmi);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnmi.addActionListener(new ActionListener() {// ¬°mMi«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnfa.setBounds(230, 100, 60, 200); // ³]©wFa«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnfa.setBackground(Color.white);
		cp.add(jbtnfa);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnfa.addActionListener(new ActionListener() {// ¬°Fa«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnso.setBounds(290, 100, 60, 200); // ³]©wSo«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnso.setBackground(Color.white);
		cp.add(jbtnso);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnso.addActionListener(new ActionListener() {// ¬°So«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnla.setBounds(350, 100, 60, 200); // ³]©wLa«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnla.setBackground(Color.white);
		cp.add(jbtnla);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnla.addActionListener(new ActionListener() {// ¬°La«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnti.setBounds(410, 100, 60, 200); // ³]©wTi«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtnti.setBackground(Color.white);
		cp.add(jbtnti);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnti.addActionListener(new ActionListener() {// ¬°Ti«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtndoo.setBounds(470, 100, 60, 200); // ³]©wDoo«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		jbtndoo.setBackground(Color.white);
		cp.add(jbtndoo);// ±Npush¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtndoo.addActionListener(new ActionListener() {// ¬°Doo«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		
		
	
		// -------³]©wEXIT¶s----
		jbtnExit.setBounds(1000, 300, 80, 25);// ³]©wEXIT«ö¶s¦bµøµ¡ªº°_©l¦ì¸m»Pµøµ¡¤j¤p
		cp.add(jbtnExit);// ±NEXIT¶s¥[¤J¨ìµøµ¡®e¾¹¤¤
		jbtnExit.addActionListener(new ActionListener() {// ¬°Exit«ö¶s¥[¤W¨Æ¥ó³B²z
			public void actionPerformed(ActionEvent ae) {

				System.exit(0);
			}
		});

	}

	}

