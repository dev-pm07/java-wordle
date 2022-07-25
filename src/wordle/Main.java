package wordle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;



public class Main implements ActionListener {
	
	static String wordle;
	static String[] wordleChars;
	static int tryNumber = 0;
	static int multipleLetters = 0;
	static String try1;
	static String try2;
	static String try3;
	static String try4;
	static String try5;
	static String try6;	
	static JFrame frame;
	static JTextField guessBox;
	JLabel welcome;
	JButton guess;
	static JLabel multipleLettersLabel = new JLabel("");
	JLabel try1Label;
	JLabel try2Label;
	JLabel try3Label;
	JLabel try4Label;
	JLabel try5Label;
	JLabel try6Label;
	JLabel try7Label;
	File font_file;
	Font font;  
	public static Font titleFont;
	public static Font textFont;
	
	
	 private void initiateFont() {
		 
		try {
			
			font_file = new File("C:\\Program Files (x86)\\Wordle In Java\\Nunito-Regular.ttf");
			font = Font.createFont(Font.TRUETYPE_FONT, font_file);
			titleFont = font.deriveFont(20f);
			textFont = font.deriveFont(12f);
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(frame, "The Font file is either missing or corrupted.");
			setUIFont (new javax.swing.plaf.FontUIResource("Serif",Font.ITALIC,12));
			
		}
		
	}
	 
	 private static void checkDictionary() {

			File file = new File("C:\\Program Files (x86)\\Wordle In Java\\valid-wordle-words.txt");
			
			if (file.exists() == true) {} else if (file.exists() == false) {
			
		    	JOptionPane.showMessageDialog(frame, "The Wordle Dictionary is either missing or corrupted.");
		    	System.exit(1);

			}
	 }
	 
	
	Main() {
		initiateFont();
		frame = new JFrame("Wordle in Java");
		try1Label = new JLabel();
		try2Label = new JLabel();
		try3Label = new JLabel();
		try4Label = new JLabel();
		try5Label = new JLabel();
		try6Label = new JLabel();
		try7Label = new JLabel();
		guess = new JButton("Guess!");
		welcome = new JLabel("Wordle in Java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setBackground(Color.decode("#cf8699"));
		welcome.setFont(titleFont);
		welcome.setForeground(Color.decode("#F5F5DC"));
		welcome.setBounds(80, 50, 150, 20);
		guessBox = new JTextField();
		guessBox.setBackground(Color.decode("#FF9532"));
		guessBox.setForeground(Color.decode("#36454F"));
		guessBox.setFont(textFont);
		guessBox.setBounds(70, 100, 150, 20);
		guess.setForeground(Color.decode("#36454F"));
		guess.setFont(textFont);
		guess.setBounds(70, 150, 150, 20);
		guess.setBackground(Color.decode("#FF9532"));
		guess.addActionListener(this);
		multipleLettersLabel.setFont(textFont);
		multipleLettersLabel.setForeground(Color.decode("#F5F5DC"));
		multipleLettersLabel.setBounds(72, 200, 300, 20);
		try1Label.setFont(textFont);
		try1Label.setForeground(Color.decode("#F5F5DC"));
		try1Label.setBounds(115, 300, 150, 20);
		try2Label.setFont(textFont);
		try2Label.setForeground(Color.decode("#F5F5DC"));
		try2Label.setBounds(115, 350, 150, 20);
		try3Label.setFont(textFont);
		try3Label.setBounds(115, 400, 150, 20);
		try3Label.setForeground(Color.decode("#F5F5DC"));
		try4Label.setFont(textFont);
		try4Label.setForeground(Color.decode("#F5F5DC"));
		try4Label.setBounds(115, 450, 150, 20);
		try5Label.setFont(textFont);
		try5Label.setForeground(Color.decode("#F5F5DC"));
		try5Label.setBounds(115, 500, 150, 20);
		try6Label.setFont(textFont);
		try6Label.setBounds(115, 550, 150, 20);
		try6Label.setForeground(Color.decode("#F5F5DC"));
		try7Label.setForeground(Color.decode("#F5F5DC"));
		try7Label.setFont(textFont);
		try7Label.setBounds(115, 600, 150, 20);
		frame.add(guessBox);
		frame.add(welcome);
		frame.add(guess);
		frame.add(multipleLettersLabel);
		frame.add(try1Label);
		frame.add(try2Label);
		frame.add(try3Label);
		frame.add(try4Label);
		frame.add(try5Label);
		frame.add(try6Label);
		frame.add(try7Label);		
		frame.setSize(300, 700);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {

		checkDictionary();
		pickWord();
		new Main();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String attempt = guessBox.getText();
		String[] attemptChars = attempt.split("");
		
		if (attempt.length() != 5) {
    		
    		
			ErrorOne.message();

    		
    	} if (attempt.length() == 5) {
    		
    			if (checkWord(attempt) == true) {
    				tryNumber++;
    				
    				boolean sameWord = attempt.equals(wordle);
    				
    				if (sameWord == true) {
    					
    					Success.message();
    					
    				} if (sameWord == false) {
    					
    					if (tryNumber == 7) {
        					

        					System.out.println("Oh No! You failed the wordle! The wordle was " +
        					wordle + ".");
        					System.exit(0);
        					
        				} if (tryNumber == 1) {
    					

        					try1Label.setText(Calculate.result(wordleChars, attemptChars));
        					guessBox.setText("");
        					
        				} if (tryNumber == 2) {
    					

        					try2Label.setText(Calculate.result(wordleChars, attemptChars));
        					guessBox.setText("");
    					
        				} if (tryNumber == 3) {
    					

        					try3Label.setText(Calculate.result(wordleChars, attemptChars));
        					guessBox.setText("");
    					
        				} if (tryNumber == 4) {
    					
        					try4Label.setText(Calculate.result(wordleChars, attemptChars));
        					guessBox.setText("");
    					
        				} if (tryNumber == 5) {
    					
        					try5Label.setText(Calculate.result(wordleChars, attemptChars));
        					guessBox.setText("");
    					
        				} if (tryNumber == 6) {
    					
        					try6Label.setText(Calculate.result(wordleChars, attemptChars));
        					guessBox.setText("");
    					
        				}
    					
    				}
    				
    				
    			} if (checkWord(attempt) == false) {
    				
    				ErrorTwo.message();
    				
    			}
		

    			
    	}

	} 
    
    private static void pickWord() {
    	
		String path = "C:\\Program Files (x86)\\Wordle In Java\\valid-wordle-words.txt";
        wordle = getRandomLine(path);
    	wordleChars = wordle.split("");

		if (wordle.length() - wordle.replace("a", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("b", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("c", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("d", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("e", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("f", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("g", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("h", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("i", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("j", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("k", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("l", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("m", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("n", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("o", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("p", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("q", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("r", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("s", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("t", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("u", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("v", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("w", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("x", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("y", "").length() > 1) {
			
			multipleLetters++;
		  
		} if (wordle.length() - wordle.replace("z", "").length() > 1) {
			
			multipleLetters++;
		  
		}
    	
		System.out.println("There are " + multipleLetters + " multiple letters.");

		multipleLettersLabel.setText("There are " + multipleLetters + " multiple letters.");
		
    }
    
    private static boolean checkWord(String attempt) {
    	
		File file = new File("C:\\Program Files (x86)\\Wordle In Java\\valid-wordle-words.txt");
 
    		
		boolean validWord;
		
		
		try {
		
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
	    
	    //now read the file line by line...
	    for (scanner.hasNextLine();;) {
	        String line = scanner.nextLine();
	        boolean check = attempt.equals(line);
		    if(check == true) { 

		    	
	        	break;
	        	
	        	
	        } else {}
	        
		    
		    
	    }
	    
	} catch (Exception fileException) {
		
		validWord = false;
		return validWord;
		
	}

	    validWord = true;
	    return validWord;
		
    }
    
   private static String getRandomLine(String path) {
    	
        List<String> lines;
        
        try {
        	
            lines = Files.readAllLines(Paths.get(path));
            
        } catch (IOException e) {
        	
            e.printStackTrace();
            return null;
        }

        Random random = new Random();
        
        return lines.get(random.nextInt(lines.size()));
    }
    
   
   public static void setUIFont (javax.swing.plaf.FontUIResource f){
       Enumeration<Object> keys = UIManager.getDefaults().keys();
       while (keys.hasMoreElements()) {
         Object key = keys.nextElement();
         Object value = UIManager.get (key);
         if (value instanceof javax.swing.plaf.FontUIResource)
           UIManager.put (key, f);
         }
       } 
   
	public static void clear() {
		
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		
	
	}
}
