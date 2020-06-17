


import javax.swing.*;

class Myjf extends JFrame {
	private JPanel contentPane;
	Myjf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KAOUM");
		setBounds(100, 100, 800, 800);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("ヶ턵1");
		btn1.setBounds(10, 10, 100, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("ヶ턵2");
		btn2.setBounds(120, 10, 100, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("ヶ턵3");
		btn3.setBounds(230, 10, 100, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("ヶ턵4");
		btn4.setBounds(340, 10, 100, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("ヶ턵5");
		btn5.setBounds(450, 10, 100, 23);
		contentPane.add(btn5);

		setVisible(true);
	}

}

public class jframedemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myjf f = new Myjf();

	}

}
