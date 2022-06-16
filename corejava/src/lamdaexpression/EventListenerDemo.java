package lamdaexpression;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventListenerDemo {
	public static void main(String[] args) {
		JTextField tf = new JTextField();
		tf.setBounds(50,50,120,20);
		JButton b = new JButton("click");
		b.setBounds(80, 100, 70, 30);;
		b.addActionListener(e -> {tf.setText("hello");});
		JFrame f = new JFrame();
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(300,200);
		f.setVisible(true);
	}
}
