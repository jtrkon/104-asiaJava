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
	private JButton jbtnExit = new JButton("Exit"); // ���}���s
	private JButton jbtndo = new JButton("Do");// ���ū��s(����)
	private JButton jbtnre = new JButton("Re");// ���ū��s(����)
	private JButton jbtnmi = new JButton("Mi");// ���ū��s(����)
	private JButton jbtnfa = new JButton("Fa");// ���ū��s(����)
	private JButton jbtnso = new JButton("So");// ���ū��s(����)
	private JButton jbtnla = new JButton("La");// ���ū��s(����)
	private JButton jbtnti = new JButton("Ti");// ���ū��s(����)
	private JButton jbtndoo = new JButton("Do");// ���ū��s(����)
	private JButton jbtndoup = new JButton("Do#");// ���ū��s(����)
	private JButton jbtnreup = new JButton("Re#");// ���ū��s(����)
	private JButton jbtnfaup = new JButton("Fa#");// ���ū��s(����)
	private JButton jbtnsoup = new JButton("So#");// ���ū��s(����)
	private JButton jbtnlaup = new JButton("La#");// ���ū��s(����)
	private String str = "���^";
	private JLabel jlb1 = new JLabel();// ���Ҫ���
	private Container cp; // �ŧi�@�ӵ����e��

	

	public piano_real() { // �������O���غc��
		initComp(); // �I�sinitComp�禡�Hø�s�����Ҧ�
	}

	private void initComp() {
		cp = this.getContentPane();// ���o�������e���Ψө�m�U�ت���

		this.setBounds(150, 100, 1200, 400);// �]�w���Ҫ���b�������_�l��m�P�����j�p
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// �]�w������X�N����
		cp.setLayout(null);// ���A�ε����G�����O��

		// -------�]�w����---------
		jlb1.setBounds(50, 70, 250, 25);//
		jlb1.setText(str);// ��ܼ��ҤW���r
		cp.add(jlb1); // �N���ҥ[�J������
		// ----------��J��
	
	//--------����-------//
		
		jbtndoup.setBounds(80, 100, 56, 85); // �]�wDo#���s�b�������_�l��m�P�����j�p
		jbtndoup.setBackground(Color.black);
		cp.add(jbtndoup);// �Npush�s�[�J������e����
		jbtndoup.addActionListener(new ActionListener() {// ��Do#���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {	
			
			}
		
		
			
		});
		
		
		jbtnreup.setBounds(140, 100, 56, 85); // �]�wRe#���s�b�������_�l��m�P�����j�p
		jbtnreup.setBackground(Color.black);
		cp.add(jbtnreup);// �Npush�s�[�J������e����
		jbtnreup.addActionListener(new ActionListener() {// ��Re#���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {	
				
			}
		});
		jbtnfaup.setBounds(260, 100, 56, 85); // �]�wFa#���s�b�������_�l��m�P�����j�p
		jbtnfaup.setBackground(Color.black);
		cp.add(jbtnfaup);// �Npush�s�[�J������e����
		jbtnfaup.addActionListener(new ActionListener() {// ��Fa#���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {		
				
			}
		});
		jbtnsoup.setBounds(320, 100, 56, 85); // �]�wSo#���s�b�������_�l��m�P�����j�p
		jbtnsoup.setBackground(Color.black);
		cp.add(jbtnsoup);// �Npush�s�[�J������e����
		jbtnsoup.addActionListener(new ActionListener() {// ��So#���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {	
				
			}
		});
		jbtnlaup.setBounds(380, 100, 56, 85); // �]�wLa#���s�b�������_�l��m�P�����j�p
		jbtnlaup.setBackground(Color.black);
		cp.add(jbtnlaup);// �Npush�s�[�J������e����
		jbtnlaup.addActionListener(new ActionListener() {// ��La#���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {
				
			}
		});
		
		
		
		// ���ū��s(����)
		jbtndo.setBounds(50, 100, 60, 200); // �]�wDo���s�b�������_�l��m�P�����j�p
		jbtndo.setBackground(Color.white);
		cp.add(jbtndo);// �Npush�s�[�J������e����
		jbtndo.addActionListener(new ActionListener() {// ��Do���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnre.setBounds(110, 100, 60, 200); // �]�wRe���s�b�������_�l��m�P�����j�p
		jbtnre.setBackground(Color.white);
		cp.add(jbtnre);// �Npush�s�[�J������e����
		jbtnre.addActionListener(new ActionListener() {// ��Re���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnmi.setBounds(170, 100, 60, 200); // �]�wMi���s�b�������_�l��m�P�����j�p
		jbtnmi.setBackground(Color.white);
		cp.add(jbtnmi);// �Npush�s�[�J������e����
		jbtnmi.addActionListener(new ActionListener() {// ��mMi���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnfa.setBounds(230, 100, 60, 200); // �]�wFa���s�b�������_�l��m�P�����j�p
		jbtnfa.setBackground(Color.white);
		cp.add(jbtnfa);// �Npush�s�[�J������e����
		jbtnfa.addActionListener(new ActionListener() {// ��Fa���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnso.setBounds(290, 100, 60, 200); // �]�wSo���s�b�������_�l��m�P�����j�p
		jbtnso.setBackground(Color.white);
		cp.add(jbtnso);// �Npush�s�[�J������e����
		jbtnso.addActionListener(new ActionListener() {// ��So���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnla.setBounds(350, 100, 60, 200); // �]�wLa���s�b�������_�l��m�P�����j�p
		jbtnla.setBackground(Color.white);
		cp.add(jbtnla);// �Npush�s�[�J������e����
		jbtnla.addActionListener(new ActionListener() {// ��La���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtnti.setBounds(410, 100, 60, 200); // �]�wTi���s�b�������_�l��m�P�����j�p
		jbtnti.setBackground(Color.white);
		cp.add(jbtnti);// �Npush�s�[�J������e����
		jbtnti.addActionListener(new ActionListener() {// ��Ti���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		jbtndoo.setBounds(470, 100, 60, 200); // �]�wDoo���s�b�������_�l��m�P�����j�p
		jbtndoo.setBackground(Color.white);
		cp.add(jbtndoo);// �Npush�s�[�J������e����
		jbtndoo.addActionListener(new ActionListener() {// ��Doo���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {			
			}
		});
		
		
	
		// -------�]�wEXIT�s----
		jbtnExit.setBounds(1000, 300, 80, 25);// �]�wEXIT���s�b�������_�l��m�P�����j�p
		cp.add(jbtnExit);// �NEXIT�s�[�J������e����
		jbtnExit.addActionListener(new ActionListener() {// ��Exit���s�[�W�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {

				System.exit(0);
			}
		});

	}

	}

