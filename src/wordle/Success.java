package wordle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Success {

	public Success() {

		JFrame success = new JFrame("You did it!");
		JButton proceed = new JButton("Exit");
		proceed.setBackground(Color.decode("#FF9532"));
		proceed.setFont(Main.textFont);
		success.getContentPane().setBackground(Color.decode("#cf8699"));
		JLabel error1Label = new JLabel("Great! The wordle was " + 
									Main.wordle + ", and you solved it in " + 
									Main.tryNumber + " tries!");
		error1Label.setFont(Main.textFont);
		error1Label.setForeground(Color.decode("#F5F5DC"));
		
		proceed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		proceed.setBounds(125, 125, 150, 25);
		error1Label.setBounds(50, 30, 250, 30);
		success.add(error1Label);
		success.add(proceed);
		
		
		success.setSize(375, 225);
		success.setLayout(null);
		success.setVisible(true);
		
	}
	
	public static void message() {
		
		new Success();
		
	}

}
