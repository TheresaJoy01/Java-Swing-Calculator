import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator  implements ActionListener {
	
	Boolean isResultDisplayed = false;
	Boolean isOperatorClicked = false;
	String operator = ""; 
	String oldValue;
	JFrame jf;
	JLabel displayLabel;
	JButton b7,b8,b9,b4,b5,b6,b1,b2,b3,b0;
	JButton dotButton,equalButton,divButton,multiButton,minusButton,sumButton,clearButton;
	
	public Calculator() {
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(400, 100);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 40, 530, 80);
		displayLabel.setBackground(Color.black);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setFont(new Font("Arial", Font.BOLD, 32));
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		b7=new JButton("7");
		b7.setBounds(30, 130, 80, 80);
		b7.setFont(new Font("Arial", Font.PLAIN, 40));
		b7.addActionListener(this);
		jf.add(b7);
		
		b8=new JButton("8");
		b8.setBounds(150, 130, 80, 80);
		b8.setFont(new Font("Arial", Font.PLAIN, 40));
		b8.addActionListener(this);
		jf.add(b8);
		
		b9=new JButton("9");
		b9.setBounds(270, 130, 80, 80);
		b9.setFont(new Font("Arial", Font.PLAIN, 40));
		b9.addActionListener(this);
		jf.add(b9);
		
		b4=new JButton("4");
		b4.setBounds(30, 240, 80, 80);
		b4.setFont(new Font("Arial", Font.PLAIN, 40));
		b4.addActionListener(this);
		jf.add(b4);
		
		b5=new JButton("5");
		b5.setBounds(150,240, 80, 80);
		b5.setFont(new Font("Arial", Font.PLAIN, 40));
		b5.addActionListener(this);
		jf.add(b5);
		
		b6=new JButton("6");
		b6.setBounds(270,240, 80, 80);
		b6.setFont(new Font("Arial", Font.PLAIN, 40));
		b6.addActionListener(this);
		jf.add(b6);
		
		b1=new JButton("1");
		b1.setBounds(30, 350, 80, 80);
		b1.setFont(new Font("Arial", Font.PLAIN, 40));
		b1.addActionListener(this);
		jf.add(b1);
		
		b2=new JButton("2");
		b2.setBounds(150,350, 80, 80);
		b2.setFont(new Font("Arial", Font.PLAIN, 40));
		b2.addActionListener(this);
		jf.add(b2);
		
		b3=new JButton("3");
		b3.setBounds(270,350, 80, 80);
		b3.setFont(new Font("Arial", Font.PLAIN, 40));
		b3.addActionListener(this);
		jf.add(b3);
		
		b0=new JButton("0");
		b0.setBounds(150,460, 80, 80);
		b0.setFont(new Font("Arial", Font.PLAIN, 40));
		b0.addActionListener(this);
		jf.add(b0);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 460, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(270,460, 80, 80);
		clearButton.setFont(new Font("Arial",Font.PLAIN, 40));
		clearButton.addActionListener(this);
		jf.add(clearButton);

		divButton=new JButton("/");
		divButton.setBounds(380, 130, 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		multiButton=new JButton("x");
		multiButton.setBounds(380,240, 80, 80);
		multiButton.setFont(new Font("Arial", Font.PLAIN, 40));
		multiButton.addActionListener(this);
		jf.add(multiButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(380,350, 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		sumButton=new JButton("+");
		sumButton.setBounds(380,460, 80, 80);
		sumButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sumButton.addActionListener(this);
		jf.add(sumButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(480, 460, 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==b7) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("7");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("7");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource()==b8) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("8");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("8");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource()==b9) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("9");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("9");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if(e.getSource()==b4) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("4");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("4");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource()==b5) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("5");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("5");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource()==b6) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("6");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("6");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource()==b1) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked = false;
			}
			else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("1");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("1");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource()==b2) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked = false;
			}
			else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("2");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("2");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if(e.getSource()==b3) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("3");
			}
			else if(isResultDisplayed) {
				displayLabel.setText("3");
				isResultDisplayed=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource()==dotButton) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			// prevent multiple dots
			if(displayLabel.getText().contains(".")) {
				return;
			}
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}
		else if(e.getSource()==b0) {
			if (displayLabel.getText().equals("Error")) {
				displayLabel.setText("");
			}
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked = false;
			}else if(displayLabel.getText().equals("0")) {
				displayLabel.setText("0");
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		else if(e.getSource()==equalButton) {
			isResultDisplayed=true;
			// if operator was clicked but second number not entered
			if(isOperatorClicked) {
				return;
			}
			String newValue=displayLabel.getText();
			if(newValue.equals("Error")) {
				return;
			}
			if(oldValue.equals("")) {
				return;
			}
			
			Float oldValueF=Float.parseFloat(oldValue);  //converting string(oldValue,newValue) to float.
			Float newValueF=Float.parseFloat(newValue);
			
			float result =  0;
			if (operator.equals("+")) {
				result = oldValueF+newValueF;
			}
			if (operator.equals("-")) {
				result = oldValueF-newValueF; 
			}
			if (operator.equals("*")) {
				result = oldValueF*newValueF; 
			}
			if (operator.equals("/")) {
				if (newValueF==0) {
					displayLabel.setText("Error");
					
					operator = "";
					oldValue = "";
					isOperatorClicked = false;
					return;
				}
				result = oldValueF/newValueF; 
			}
			if(result==(int)result) {
				displayLabel.setText((int)result+"");
			}else {
				displayLabel.setText(result+"");   			/*To convert result to String.
		   													The screen (JLabel) can show only text, not numbers.*/ 
			}
			oldValue=result+"";
			isOperatorClicked=false;
			operator="";
		}
		else if(e.getSource()==divButton) {
			isResultDisplayed = false;
			if(displayLabel.getText().equals("")) {
				return;
			}
			if(isOperatorClicked) {
				return;
			}
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			operator = "/";
		}
		else if(e.getSource()==multiButton) {
			isResultDisplayed = false;
			if(displayLabel.getText().equals("")) {
				return;
			}
			if(isOperatorClicked) {
				return;
			}
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			operator = "*";
		}
		else if(e.getSource()==minusButton) {
			isResultDisplayed = false;
			if(displayLabel.getText().equals("")) {
				return;
			}
			if(isOperatorClicked) {
				return;
			}
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			operator = "-";
		}
		else if(e.getSource()==sumButton) {
			isResultDisplayed = false;
			// prevent operator if no number entered
			if(displayLabel.getText().equals("")) {
				return;
			}
			
			if(isOperatorClicked) {
				return;
			}
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			operator = "+";
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			oldValue="";
			operator="";
			isOperatorClicked=false;
			isResultDisplayed = false;
			
		}
		
	}
}
