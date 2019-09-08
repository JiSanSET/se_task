package computerPrice;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ī������
 * @version ����16λ�洢��������
 */
@SuppressWarnings("serial")
public class Gui extends JFrame implements ActionListener{
	JLabel jLY = null;//���
	JLabel jLN = null;//����Ա����ָ����
	JLabel jLS = null;//����Ա��ƽ������
	JLabel jLM = null;//������洢����
	JLabel jLP = null;//�洢���۸�
	JLabel jLE=null;//ʹ�洢��װ����������ɱ�
	

	JTextField jTFY = null;//���
	JTextField jTFN = null;//����Ա����ָ����
	JTextField jTFS = null;//����Ա��ƽ������
	JTextField jTFM = null;//������洢����
	JTextField jTFP = null;//�洢���۸�
	JTextField jTFE = null;//ʹ�洢��װ����������ɱ�
	
	JButton jBCount = null;//����
	
	
	//�������� GUI���ֵ����
	JPanel jP1, jP2,jP3,jP4,jP5,jP6,jP7 = null;
	JPanel jPTop,jPCenter, jPBottom= null;
	
	// ���캯��
	public Gui() {
		// �������
		
		jLY = new JLabel("            ���:               ");
		jLN = new JLabel("����Աÿ�쿪��ָ������");
		jLS = new JLabel("����Աƽ���¹��ʣ�");
		jLM = new JLabel("������洢�������ƣ�");//Ա����
		jLP = new JLabel("�洢���۸�");
		jLE=new JLabel("�洢��װ����������ɱ���");
		
		jTFY = new JTextField(10);//���
		jTFN = new JTextField(10);//����Ա����ָ����
		jTFS = new JTextField(10);//����Ա��ƽ������
		jTFM=new JTextField(30);//������洢����
		jTFP = new JTextField(30);//�洢���۸�
		jTFE = new JTextField(30);//ʹ�洢��װ����������ɱ�
		
		
		jBCount = new JButton("����");
		// ���ü���
		jBCount.addActionListener(this);

		jP1 = new JPanel();
		jP2 = new JPanel();
		jP3 = new JPanel();
		jP4 = new JPanel();
		jP5 = new JPanel();
		jP6 = new JPanel();
		jP7 = new JPanel();
		jPTop = new JPanel();
		jPBottom = new JPanel();
		jPCenter= new JPanel();
		
		jP1.add(jLY);
		jP1.add(jTFY);
		jP2.add(jLN);
		jP2.add(jTFN);
		jP3.add(jLS);
		jP3.add(jTFS);
		
		jP4.add(jLM);
		jP4.add(jTFM);
		jP4.setPreferredSize(new Dimension(1000,20));
		
		jP5.add(jLP);
		jP5.add(jTFP);
		jP5.setPreferredSize(new Dimension(1000,20));
		
		jP6.add(jLE);
		jP6.add(jTFE);
		jP6.setPreferredSize(new Dimension(1000,20));
		
		
		jP7.add(jBCount);
		
		jPTop.setLayout(new GridLayout(1,3));
		jPTop.add(jP1);
		jPTop.add(jP2);
		jPTop.add(jP3);
		
		jPCenter.setLayout(new GridLayout(3,1));
		jPCenter.add(jP4);
		jPCenter.add(jP5);
		jPCenter.add(jP6);
		
		jPBottom.setLayout(new BorderLayout());
		jPBottom.add(jP7,BorderLayout.CENTER);
		
		this.add("North", jPTop);
		this.add("Center",jPCenter);
		this.add("South", jPBottom);
	
		this.setLayout(new GridLayout(3,1,0,50));
		this.setTitle("����16λ������������");
		this.setSize(700,400);
		this.setLocation(430, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")  
			&& !jTFY.getText().isEmpty()
			&& !jTFN.getText().isEmpty()
			&& !jTFS.getText().isEmpty()){
			System.out.println("��ֵ�Ѵ������ģ��");
			String CY = jTFY.getText().trim();
			double Y = Double.parseDouble(CY);
			String CN = jTFN.getText().trim();
			double N = Double.parseDouble(CN);
			String CS = jTFS.getText().trim();
			double S = Double.parseDouble(CS);
			System.out.printf("%f %f %f",Y,N,S);
			
			double M,P,E,a;
			a=0.28*(Y-1960);
			M=4080*Math.exp(a);
			P=0.3*Math.pow(0.72,(Y-1974));
			E=(S*M)/(30*N);
			System.out.printf("\n");
			System.out.printf("%f %f %f",M,P,E);
			String m=String.valueOf(M);
			jTFM.setText(m);
			String p=String.valueOf(P);
			jTFP.setText(p);
			String f=String.valueOf(E);
			jTFE.setText(f);
			
		}
	}

	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		new  Gui();
    }
}
	
