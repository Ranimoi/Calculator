package elec463calc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class elec463calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			JFrame frame = new JFrame();
			frame.setBounds(200, 200, 500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("ELEC 463 Assignment #1");
			frame.setLayout(null);
			frame.setVisible(true);
			JLabel label1 = new JLabel();
			label1.setBounds(30, 30, 120, 30);
			frame.getContentPane().add(label1);
			label1.setText("First Number:");
			JLabel label2 = new JLabel();
			label2.setBounds(30, 50, 120, 30);
			frame.getContentPane().add(label2);
			label2.setText("Second Number:");
			final JLabel label3 = new JLabel();
			label3.setBounds(30, 80, 500, 30);
			frame.getContentPane().add(label3);
			label3.setText("Answer: ");
			final JTextField textfield1 = new JTextField();
			textfield1.setBounds(200, 30, 200, 30);
			frame.getContentPane().add(textfield1);
			final JTextField textfield2 = new JTextField();
			textfield2.setBounds(200, 60, 200, 30);
			textfield1.setVisible(true);
			textfield1.setEnabled(true);
			frame.getContentPane().add(textfield2);
			
			JButton button1 = new JButton("+");
			button1.setBounds(30, 120, 60, 30);
			frame.getContentPane().add(button1);
			
			JButton button2 = new JButton("-");
			button2.setBounds(100, 120, 60, 30);
			frame.getContentPane().add(button2);
			
			JButton button3 = new JButton("x");
			button3.setBounds(170, 120, 60, 30);
			frame.getContentPane().add(button3);
			
			JButton button4 = new JButton("÷");
			button4.setBounds(240, 120, 60, 30);
			frame.getContentPane().add(button4);
			
			JButton button6 = new JButton("Min");
			button6.setBounds(310, 120, 60, 30);
			frame.getContentPane().add(button6);
			
			JButton button5 = new JButton("Max");
			button5.setBounds(380, 120, 60, 30);
			frame.getContentPane().add(button5);

			button1.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = number1 + number2;
						label3.setText("Answer: " + textfield1.getText() +  " + " + textfield2.getText() + "=" + numero);
						}
						catch (Exception ex) {
							
							label3.setText("Not a valid number");
						}

					}});
						
			
						
			button2.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
									
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = number1 - number2;
						label3.setText("Answer: " + textfield1.getText() +  " - " + textfield2.getText() + "=" + numero);
						}
						catch (Exception ex) {
										
							label3.setText("Not a valid number");
						}
					}});
			
			
			
			button3.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = (number1) * (number2);
						label3.setText("Answer: " + textfield1.getText() +  " x " + textfield2.getText() + "=" + numero);
						}
						catch (Exception ex) {
							
							label3.setText("Not a valid number");
						}
					}});
			
			
			
			button4.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						double numero = 0;
						numero = (number1) / (number2);
						label3.setText("Answer: " + textfield1.getText() +  " ÷ " + textfield2.getText() + "=" + numero);
						}
						catch (Exception ex) {
							
							label3.setText("Not a valid number");
						}
					}});

			
			
			button6.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						
						if (number1 > number2) {
							label3.setText("Answer: Minimum is" + textfield2.getText());
						}
						
						else {
							label3.setText("Answer: Minimum is" + textfield1.getText());
						}
						}
						catch (Exception ex) {
							
							label3.setText("Not a valid number");
						}
					}});

			
	
			
			button5.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						try {
						
						double number1 = Double.parseDouble(textfield1.getText());
						double number2 = Double.parseDouble(textfield2.getText());
						
						if (number1 > number2) {
							label3.setText("Answer: Maximum is" + textfield1.getText());
						}
						
						else {
							label3.setText("Answer: Maximum is" + textfield2.getText());
						}
						}
						catch (Exception ex) {
							
							label3.setText("Not a valid number");
						}
					}});
			
			
	}};
		