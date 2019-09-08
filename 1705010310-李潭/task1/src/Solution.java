package solution;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solution extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4756489117424790153L;
	int year1,year3,long1,instruct_number,salary;
	double M1,answer1,answer2,answer3;
	
	// �������
	
	JLabel jL1 = null;//������洢������������:
	JLabel jL2 = null;//�洢���۸������½�:
	JLabel jL3 = null;//һ�����:
	JLabel jL4 = null;//�����ֳ�:
	JLabel jL5 = null;//����ÿ��ָ����:
	JLabel jL6 = null;//��ƽ������:
	JLabel jL7 = null;//���:
	
	JLabel jL8 = null;//������洢����:
	JLabel jL9 = null;//�洢���۸�:
	JLabel jL10 = null;//�洢��װ������ĳɱ�:
	
	JTextField jTF11 = null;//��ʽ1
	JTextField jTF22 = null;//��ʽ2
	JTextField jTF33 = null;//��ʽ3
	JTextField jTF1 = null;//���
	JTextField jTF2 = null;//�洢����������
	JTextField jTF3 = null;//�ֳ�
	JTextField jTF4 = null;//�洢���۸�
	JTextField jTF5 = null;//ÿ��ָ����
	JTextField jTF6 = null;//��ƽ������
	JTextField jTF7 = null;//���
	JTextField jTF8 = null;//�洢���ɱ�

	JButton jB1 = null;//����
	JButton jB2 = null;//����
	JButton jB3 = null;//����
	
	// ���캯��
	public Solution() {
		
		ImageIcon img = new ImageIcon("F:\\�γ����\\���ݿ�γ����\\���汳��ͼ\\14.jpg");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false); 
		
		// �������	
		jL1 = new JLabel("������洢������������:");
		jL1.setSize(180, 30);
		jL1.setLocation(15, 30);
		jL2 = new JLabel("�洢���۸������½�:");
		jL2.setSize(150, 30);
		jL2.setLocation(15, 90);
		jL3 = new JLabel("һ�����:");
		jL3.setSize(75, 30);
		jL3.setLocation(15, 185);
		jL4 = new JLabel("�����ֳ�:");
		jL4.setSize(68, 30);
		jL4.setLocation(15, 245);
		jL5 = new JLabel("����ÿ��ָ����:");
		jL5.setSize(125, 30);
		jL5.setLocation(15, 305);
		jL6 = new JLabel("��ƽ������:");
		jL6.setSize(94, 30);
		jL6.setLocation(255, 305);
		jL7 = new JLabel("���:");
		jL7.setSize(50, 30);
		jL7.setLocation(45, 360);
		jL8 = new JLabel("������洢����:");
		jL8.setSize(127, 30);
		jL8.setLocation(255, 185);
		jL9 = new JLabel("�洢���۸�:");
		jL9.setSize(111, 30);
		jL9.setLocation(255, 245);
		jL10 = new JLabel("�洢��װ������ĳɱ�:");
		jL10.setSize(158, 30);
		jL10.setLocation(45, 410);
		
		jTF11 = new JTextField(25);
		jTF11.setSize(215, 30);
		jTF11.setLocation(235, 30);
		jTF22 = new JTextField(25);
		jTF22.setSize(290, 30);
		jTF22.setLocation(175, 90);
		jTF33 = new JTextField(25);
		jTF33.setSize(290, 30);
		jTF33.setLocation(175, 140);
		jTF1 = new JTextField(5);
		jTF1.setSize(80, 30);
		jTF1.setLocation(95, 185);
		jTF2 = new JTextField(10);
		jTF2.setSize(90, 30);
		jTF2.setLocation(375, 185);
		jTF3 = new JTextField(5);
		jTF3.setSize(80, 30);
		jTF3.setLocation(95, 245);
		jTF4 = new JTextField(10);
		jTF4.setSize(90, 30);
		jTF4.setLocation(375, 245);
		jTF5 = new JTextField(5);
		jTF5.setLocation(145, 305);
		jTF5.setSize(85, 30);
		jTF6 = new JTextField(5);
		jTF6.setSize(90, 30);
		jTF6.setLocation(375, 305);
		jTF7 = new JTextField(5);
		jTF7.setLocation(95, 360);
		jTF7.setSize(80, 30);
		jTF8 = new JTextField(10);
		jTF8.setLocation(250, 410);
		jTF8.setSize(165, 30);
		
		jTF11.setText("M = 4080e^(0.28(Y-1960))");
		jTF22.setText("P1 = 0.3*0.72^(Y-1974) (�ֳ�32λ)");
		jTF33.setText("P2 = 0.048*0.72^(Y-1974) (�ֳ�16λ)");
		jTF11.setEditable(false);
		jTF22.setEditable(false);
		jTF33.setEditable(false);
		
		jB1 = new JButton("����1");
		jB1.setLocation(180, 185);
		jB1.setSize(70, 30);
		jB2 = new JButton("����2");
		jB2.setLocation(180, 245);
		jB2.setSize(70, 30);
		jB3 = new JButton("����3");
		jB3.setLocation(255, 360);
		jB3.setSize(70, 30);
		
		jB1.addActionListener(this);
		jB2.addActionListener(this);
		jB3.addActionListener(this);
		
		getContentPane().add(jL1);
		getContentPane().add(jL2);
		getContentPane().add(jL3);
		getContentPane().add(jL4);
		getContentPane().add(jL5);
		getContentPane().add(jL6);
		getContentPane().add(jL7);
		getContentPane().add(jL8);
		getContentPane().add(jL9);
		getContentPane().add(jL10);
		getContentPane().add(jTF1);
		getContentPane().add(jTF2);
		getContentPane().add(jTF3);
		getContentPane().add(jTF4);
		getContentPane().add(jTF5);
		getContentPane().add(jTF6);
		getContentPane().add(jTF7);
		getContentPane().add(jTF8);
		getContentPane().add(jTF11);
		getContentPane().add(jTF22);
		getContentPane().add(jTF33);
		getContentPane().add(jB1);
		getContentPane().add(jB2);
		getContentPane().add(jB3);
		
		getContentPane().setLayout(null);
		this.setLayout(null);
		this.setTitle("ϰ��1-5");
		this.setSize(500, 500);
		setLocationRelativeTo(null); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����1")  
				){
			int year1 = Integer.valueOf(jTF1.getText()).intValue();
			answer1 = 4080*Math.pow(Math.E,((year1-1960)*0.28));
			answer1 = (double) Math.round(answer1 * 100) / 100;
			jTF2.setText(""+answer1);
		}else if(e.getActionCommand().equals("����2")  
				){
			int year1 = Integer.valueOf(jTF1.getText()).intValue();
			int long1 = Integer.valueOf(jTF3.getText()).intValue();
			if(long1 == 16)
				answer2 = 0.048*Math.pow(0.72,(year1-1974));
			else if(long1 == 32)
				answer2 = 0.3*Math.pow(0.72,(year1-1974));
			jTF4.setText(String.format("%.9f",answer2));
		}else if(e.getActionCommand().equals("����3")
				){
			int year3 = Integer.valueOf(jTF7.getText()).intValue();
			int instruct_number = Integer.valueOf(jTF5.getText()).intValue();
			int salary = Integer.valueOf(jTF6.getText()).intValue();
			answer3 = salary*4080*Math.pow(Math.E,((year3-1960)*0.28))/(instruct_number*30);
			jTF8.setText(String.format("%.2f",answer3));
				}
	}
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		Solution solution = new  Solution();
    }
}
