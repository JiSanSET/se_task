package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculate_cost extends JFrame {

	private JPanel contentPane;
	private JTextField year;//�����������
	private JTextField wordLong;//���������ֳ�
	private JLabel label_4;
	private JLabel label_5;
	private JTextField instruction;//����ÿλ����Աÿ��ɿ�����ָ����
	private JTextField salary;//����Ա���¹���
	private JLabel label_6;
	private JTextField m_cost;//�洢��װ�����������õĳɱ�
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate_cost frame = new Calculate_cost();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculate_cost() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setBackground(Color.CYAN);
		setTitle("�����Ӳ��������ɱ��仯����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("������ݣ�");
		label.setBounds(44, 40, 93, 32);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("�����ֳ���");
		label_1.setBounds(44, 87, 98, 34);
		contentPane.add(label_1);
		
		year = new JTextField();
		year.setBounds(141, 43, 96, 27);
		contentPane.add(year);
		year.setColumns(10);
		
		wordLong = new JTextField();
		wordLong.setBounds(141, 91, 96, 27);
		contentPane.add(wordLong);
		wordLong.setColumns(10);
		
		JButton button = new JButton("ȷ������");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("ȷ������")  
	    				&& !year.getText().isEmpty()){
	    		    			
	    				System.out.println("actionPerformed(). ȷ������");
	    				//����ı���������ĸ�ֵ
	    				String year1 =year.getText();
	    				String wordLong1 =wordLong.getText();
	    				String instruction1 =instruction.getText();
	    				String salary1 =salary.getText();
	    				//ǿ��ת��Ϊint��
	    				int year2=Integer.parseInt( year1);
	    				int wordLong2=Integer.parseInt( wordLong1);
	    				int instruction2=Integer.parseInt( instruction1);
	    				int salary2=Integer.parseInt( salary1);
	    				//����洢������������Ϊ����
	    				int M=(int) (Math.pow(Math.E,(0.28*(year2-1960)))*4080);
	    			    //����۸�
	    				int P=(int) (M*(Math.pow(0.72, (year2-1974)))*0.003*wordLong2);
	    				//����ɱ�
	    				int C=M/(instruction2*30)*salary2;
	    				//������
	    				m_cost.setText(String.valueOf(C));
				}
			}
		});
		button.setBounds(44, 162, 145, 32);
		contentPane.add(button);
		
		label_4 = new JLabel("ÿ��ÿ�쿪��ָ�������");
		label_4.setBounds(268, 42, 224, 28);
		contentPane.add(label_4);
		
		label_5 = new JLabel("��ƽ�����ʣ���Ԫ����");
		label_5.setBounds(268, 90, 185, 28);
		contentPane.add(label_5);
		
		instruction = new JTextField();
		instruction.setBounds(480, 43, 93, 27);
		contentPane.add(instruction);
		instruction.setColumns(10);
		
		salary = new JTextField();
		salary.setBounds(480, 91, 93, 27);
		contentPane.add(salary);
		salary.setColumns(10);
		
		label_6 = new JLabel("����ɱ����ƣ���Ԫ����");
		label_6.setBounds(44, 232, 198, 32);
		contentPane.add(label_6);
		
		m_cost = new JTextField();
		m_cost.setBounds(253, 235, 155, 27);
		contentPane.add(m_cost);
		m_cost.setColumns(10);
		
		btnNewButton = new JButton("���ز˵�");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main=new Main();
				main.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(268, 162, 140, 32);
		contentPane.add(btnNewButton);
	}
}
