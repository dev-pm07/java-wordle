package wordle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fail {

	public Fail() {
		
		JFrame failure = new JFrame("Oh No!");
		JButton proceed = new JButton("Exit");
		proceed.setBackground(Color.decode("#FF9532"));
		proceed.setFont(Main.textFont);
		failure.getContentPane().setBackground(Color.decode("#cf8699"));
		JLabel error1Label = new JLabel("Oh No! You failed the wordle! The wordle was " +
										Main.wordle + ".");
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
		failure.add(error1Label);
		failure.add(proceed);
		
		
		failure.setSize(375, 225);
		failure.setLayout(null);
		failure.setVisible(true);
		
	}

}
