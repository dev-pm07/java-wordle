package wordle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrorTwo {

	public ErrorTwo() {
		JFrame error2 = new JFrame("Error!");
		JButton proceed = new JButton("Continue");
		proceed.setBackground(Color.decode("#FF9532"));
		proceed.setFont(Main.textFont);
		error2.getContentPane().setBackground(Color.decode("#cf8699"));
		JLabel error1Label = new JLabel("Word is not in the dictionary, please try again");
		error1Label.setFont(Main.textFont);
		error1Label.setForeground(Color.decode("#F5F5DC"));
		
		proceed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				error2.setVisible(false);
				Main.guessBox.setText(null);
				
			}
		});
		
		proceed.setBounds(125, 125, 150, 25);
		error1Label.setBounds(50, 30, 250, 30);
		error2.add(error1Label);
		error2.add(proceed);
		
		
		error2.setSize(375, 225);
		error2.setLayout(null);
		error2.setVisible(true);
	}

	public static void message() {
		
		new ErrorTwo();
		
	}
	
}
