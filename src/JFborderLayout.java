
import javax.swing.*;
import java.awt.*;

class MyjFrame extends JFrame{
	private JPanel contentPanel;
	public MyjFrame() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KAOUM");
		setBounds(100, 100, 450, 300);
		contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout(20,20));
		setContentPane(contentPanel);
		
		JButton btnN = new JButton("N");
		contentPanel.add(btnN,BorderLayout.NORTH);
		
		JButton btnW = new JButton("W");
		contentPanel.add(btnW,BorderLayout.WEST);
		
		JButton btnE = new JButton("E");
		contentPanel.add(btnE,BorderLayout.EAST);
		
		JButton btnC = new JButton("C");
		contentPanel.add(btnC,BorderLayout.CENTER);
		
		JButton btnS = new JButton("S");
		contentPanel.add(btnS,BorderLayout.SOUTH);
		
		setVisible(true);
	}
}







public class JFborderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyjFrame f = new MyjFrame();
	}

}
