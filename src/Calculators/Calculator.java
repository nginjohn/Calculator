package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;



import javax.swing.ImageIcon;

public class Calculator {

	private JFrame frame= new JFrame("Calculator");
	private JTextField textField;
    ImageIcon icon;

	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
		frame.setTitle("Calculator");

	    icon= new ImageIcon("image/image.jpg");
		 frame.setIconImage(icon.getImage());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 264, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(35, 11, 197, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//---------Row 1--------------------------------
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(35, 80, 50, 30);
		frame.getContentPane().add(btnC);
		
		JButton btnPo = new JButton("(");
		btnPo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btnPo.getText();
			textField.setText(EnterNumber);
			}
		});
		btnPo.setBounds(84, 80, 50, 30);
		frame.getContentPane().add(btnPo);
		
		JButton btnPc = new JButton(")");
		btnPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnPc.getText();
				textField.setText(EnterNumber);
			}
		});
		btnPc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPc.setBounds(133, 80, 50, 30);
		frame.getContentPane().add(btnPc);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDiv.setBounds(182, 80, 50, 30);
		frame.getContentPane().add(btnDiv);
		
		//---------Row 2 --------------------------------

		JButton btnx = new JButton("x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnx.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnx.setBounds(182, 110, 50, 30);
		frame.getContentPane().add(btnx);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(133, 110, 50, 30);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
			
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(84, 110, 50, 30);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(35, 110, 50, 30);
		frame.getContentPane().add(btn7);
		
		//----------- Row 3 -----------------------------------

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
			textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(35, 140, 50, 30);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(84, 140, 50, 30);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(133, 140, 50, 30);
		frame.getContentPane().add(btn6);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Arial", Font.BOLD, 15));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setBounds(182, 140, 50, 30);
		frame.getContentPane().add(btnPlus);
		
		//----------- Row 4 -----------------------------------

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(35, 170, 50, 30);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn2.setBounds(84, 170, 50, 30);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(133, 170, 50, 30);
		frame.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Arial", Font.BOLD, 15));
		btnMinus.setBounds(182, 170, 50, 30);
		frame.getContentPane().add(btnMinus);
		
		//----------- Row 5 -----------------------------------

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(35, 200, 50, 30);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btndot.getText();
				textField.setText(EnterNumber);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btndot.setBounds(84, 200, 50, 30);
		frame.getContentPane().add(btndot);
		
		JButton btnbackspace = new JButton("\u2190");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if(textField.getText().length()> 0){
				StringBuilder strB= new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length() -1);
				backspace = strB.toString();
				textField.setText(backspace);
		}
				
			}
		});
		btnbackspace.setFont(new Font("Arial", Font.BOLD, 15));
		btnbackspace.setBounds(133, 200, 50, 30);
		frame.getContentPane().add(btnbackspace);
		
		JButton btneql = new JButton("=");
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String answer;
				secondnum =Double.parseDouble(textField.getText());
				if (operations =="+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				else if (operations =="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations =="*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations =="/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btneql.setFont(new Font("Arial", Font.BOLD, 15));
		btneql.setBounds(182, 200, 50, 30);
		frame.getContentPane().add(btneql);
		
	}
	
}
