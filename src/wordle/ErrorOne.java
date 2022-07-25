package wordle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ErrorOne {

	public ErrorOne() {
		
		JFrame error1 = new JFrame("Error!");
		JButton proceed = new JButton("Continue");
		proceed.setBackground(Color.decode("#FF9532"));
		proceed.setFont(Main.textFont);
		error1.getContentPane().setBackground(Color.decode("#cf8699"));
		JLabel error1Label = new JLabel("Word is not 5-letters long, please try again");
		error1Label.setFont(Main.textFont);
		error1Label.setForeground(Color.decode("#F5F5DC"));
		
		proceed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				error1.setVisible(false);
				Main.guessBox.setText(null);
				
			}
		});
		
		proceed.setBounds(125, 125, 150, 25);
		error1Label.setBounds(50, 30, 250, 30);
		error1.add(error1Label);
		error1.add(proceed);
		
		
		error1.setSize(375, 225);
		error1.setLayout(null);
		error1.setVisible(true);
		
	}
	
	public static void message() {
		
		new ErrorOne();
		
	}

}
