package project01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalFrame extends JFrame implements ActionListener{
	JLabel labelq1 = new JLabel("       ��ϵͳ���㣺1��ĳ�������洢��������2���ֳ�Ϊ16��32λʱ����������洢���۸�");
	JLabel labelq2 = new JLabel("3������Աÿ�쿪�� N ��ָ�ƽ������ Y Ԫ/�£�һָ��Ϊһ�ֳ�����������洢��װ����������ɱ�");
	JLabel label1 = new JLabel("��ݣ�");
	JLabel label2 = new JLabel("N��");
	JLabel label3 = new JLabel("Y��");
	JLabel label4 = new JLabel("��������������洢����");
	JLabel label5 = new JLabel("��������洢���۸�");
	JLabel label6 = new JLabel("����洢��װ����������ɱ�");
	JTextField textField1 = new JTextField();
	JTextField textField2 = new JTextField();
	JTextField textField3 = new JTextField();
	JTextField textField4 = new JTextField();
	JTextField textField5 = new JTextField();
	JTextField textField6 = new JTextField();
	JRadioButton radioButton1 = new JRadioButton("16λ");
	JRadioButton radioButton2 = new JRadioButton("32λ");
	ButtonGroup buttonGroup1 = new ButtonGroup();
	ButtonGroup buttonGroup2 = new ButtonGroup();
	JButton button = new JButton("����");
	public CalFrame() {
		try {
			Init();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void Init() throws Exception{
		// TODO Auto-generated method stub
		getContentPane().setLayout(null);
		labelq1.setBounds(new Rectangle(10, 10, 600, 20));
		labelq2.setBounds(new Rectangle(10, 30, 600, 20));
		label1.setBounds(new Rectangle(158, 60, 105, 31));
		label2.setBounds(new Rectangle(160, 146, 87, 32));
		label3.setBounds(new Rectangle(160, 180, 87, 32));
		textField1.setBounds(new Rectangle(225, 59, 152, 28));
		textField2.setBounds(new Rectangle(227, 143, 151, 30));
		textField3.setBounds(new Rectangle(227, 180, 151, 30));
		button.addActionListener(this);
		textField4.setEnabled(false);
		textField5.setEnabled(false);
		textField6.setEnabled(false);
		textField4.setBounds(new Rectangle(270, 236, 150, 30));
		label4.setBounds(new Rectangle(81, 236, 1000, 26));
		textField5.setBounds(new Rectangle(270, 276, 150, 30));
		label5.setBounds(new Rectangle(81, 276, 1000, 26));
		textField6.setBounds(new Rectangle(270, 316, 150, 30));
		label6.setBounds(new Rectangle(81, 316, 1000, 26));
		radioButton1.setBounds(new Rectangle(240, 111, 70, 23));
		radioButton2.setBounds(new Rectangle(310, 112, 70, 23));
		button.setBounds(new Rectangle(230, 370, 129, 34));
		this.getContentPane().add(labelq1);
		this.getContentPane().add(labelq2);
		this.getContentPane().add(label1);
		this.getContentPane().add(label2);
		this.getContentPane().add(label3);
		this.getContentPane().add(textField4);
		this.getContentPane().add(label4);
		this.getContentPane().add(textField5);
		this.getContentPane().add(label5);
		this.getContentPane().add(textField6);
		this.getContentPane().add(label6);
		this.getContentPane().add(textField2);
		this.getContentPane().add(textField1);
		this.getContentPane().add(textField3);
		this.getContentPane().add(radioButton2);
		this.getContentPane().add(radioButton1);
		this.getContentPane().add(button);
		radioButton1.setSelected(true);
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		this.setTitle("������̵�һ����ҵ");
		this.setVisible(true);
		this.setSize(610, 450);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//��ȡ����
		String d1 = textField1.getText();  //��һλ��
		String d2 = textField2.getText();  //�ڶ�λ��
		String d3 = textField3.getText();  //����λ��
		String op = "";  //�������
		if (radioButton1.isSelected()) {
			op = radioButton1.getActionCommand();
		} else if (radioButton2.isSelected()) {
			op = radioButton2.getActionCommand();
		}
		//��֤����
		CheckData cd = new CheckData();
		boolean flag;
		flag = cd.check(d1);
		//��һλ������������
		if (!flag) {
			textField1.setText("");
			textField1.requestFocus();
			return;
		}
		//������ת��Ϊdouble���ͽ��м���
		double data1 = Double.parseDouble(d1);
		double data2 = Double.parseDouble(d2);
		double data3 = Double.parseDouble(d3);
		Calculate calculate = new Calculate();
		double[] result = new double[5];
		result = calculate.cal(data1, data2, data3, op);
		textField4.setText(String.valueOf((int)result[0]));
		textField5.setText(String.valueOf((int)result[1]));
		textField6.setText(String.valueOf(result[2]));
	}
}