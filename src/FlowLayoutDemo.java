import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyJfram extends JFrame{
	
	private JPanel contenPanel;
	public MyJfram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KAOUM");
		setBounds(100, 100, 250, 400);
		contenPanel = new JPanel();
		setContentPane(contenPanel);
		contenPanel.setLayout(new FlowLayout(FlowLayout.CENTER,25,25));
		
		
		
		JButton btn1 = new JButton("1");
		contenPanel.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "00");
			}
		});
		
		JButton btn2 = new JButton("2");
		contenPanel.add(btn2);
		
		JButton btn3 = new JButton("3");
		contenPanel.add(btn3);
		
		JButton btn4 = new JButton("4");
		contenPanel.add(btn4);
		
		JButton btn5 = new JButton("5");
		contenPanel.add(btn5);
		
		JButton btn6 = new JButton("6");
		contenPanel.add(btn6);
		
		JButton btn7 = new JButton("7");
		contenPanel.add(btn7);
		
		JButton btn8 = new JButton("8");
		contenPanel.add(btn8);
		
		JButton btn9 = new JButton("9");
		contenPanel.add(btn9);
		
		JButton btn0= new JButton("0");
		contenPanel.add(btn0);
		
		setVisible(true);
		
		
		
		
		
	}
}





public class FlowLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJfram f = new MyJfram();
	}

}
