package project01;

import javax.swing.JOptionPane;

public class CheckData {
	public CheckData() {
	}
	
	public boolean check(String s) {
		//�ж������Ƿ�Ϸ�
		if (s.equals("")) {
			JOptionPane.showMessageDialog(null, "����Ϊ�գ�������Ϸ�����", "��ʾ", JOptionPane.ERROR_MESSAGE);
			return false;
		} 
		else {
			try {
				double d = Double.parseDouble(s);
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "����������к��зǷ��ַ���������Ϸ�����", "���ݴ���", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
		return true;
	}
}