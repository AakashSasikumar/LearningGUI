package first;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class hw {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField res;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hw window = new hw();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setEnabled(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Addition");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a, b, c;
				try{
					a = Integer.parseInt(textField.getText());
					b = Integer.parseInt(textField_1.getText());
					c=a+b;
					res.setText(String.valueOf(c));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
				
			}
		});
		JButton newbtn = new JButton("Subtract");
		newbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a, b, c;
				try{
					a = Integer.parseInt(textField.getText());
					b = Integer.parseInt(textField_1.getText());
					c=a-b;
					res.setText(String.valueOf(c));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
			}
		});
		newbtn.setBounds(222, 176, 144, 25);
		frame.getContentPane().add(newbtn);
		btnNewButton.setBounds(50, 176, 144, 25);
		frame.getContentPane().add(btnNewButton);
		res = new JTextField();
		res.setBounds(158, 143,116, 22);
		frame.getContentPane().add(res);
		res.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(12, 43, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(304, 43, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("Result");
		lblNewLabel.setBounds(60, 146, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		Image img =new ImageIcon(this.getClass().getResource("/calculator.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		
		lblNewLabel_1.setBounds(140, 13, 152, 128);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
