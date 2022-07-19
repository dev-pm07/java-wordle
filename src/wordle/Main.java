package wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Main {
	
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_RESET = "\u001B[0m";
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
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		pickWord();
		guessWord();
		
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
    
    public static void pickWord() {
    	
		String path = new File("").getAbsolutePath() + "/valid-wordle-words.txt";
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

    }

    public static void guessWord() throws InterruptedException, FileNotFoundException {
    	
		@SuppressWarnings("resource")
		Scanner attemptscnr = new Scanner(System.in);
    	
    	System.out.print("Enter a 5-letter word:     ");
    	String attempt = attemptscnr.nextLine();
		String[] attemptChars = attempt.split("");
        
    	clear();
    	
    	if (attempt.length() != 5) {
    		
    		
    		System.out.println("Word was not 5-letters long, please try again");
    		TimeUnit.SECONDS.sleep(3);
    		clear();
    		guessWord();
    		
    	} if (attempt.length() == 5) {
    		
    			if (checkWord(attempt) == true) {
    				tryNumber++;
    				
    				boolean sameWord = attempt.equals(wordle);
    				
    				if (sameWord == true) {
    					
    					clear();
    					System.out.println("Great! The wordle was " + wordle + 
    					", and you solved it in " + tryNumber + " tries!");
    					System.exit(0);
    					
    				} if (sameWord == false) {
    					
    					if (tryNumber == 7) {
        					
        					clear();
        					System.out.println("Oh No! You failed the wordle! The wordle was " +
        					wordle + ".");
        					System.exit(0);
        					
        				} if (tryNumber == 1) {
    					
        					clear();
        					try1 = Calculate.result(wordleChars, attemptChars);
        					System.out.println(try1);
        					guessWord();
        					
        				} if (tryNumber == 2) {
    					
        					clear();
        					try2 = Calculate.result(wordleChars, attemptChars);
        					System.out.println(try1);
        					System.out.println(try2);
        					guessWord();
    					
        				} if (tryNumber == 3) {
    					
        					clear();
        					try3 = Calculate.result(wordleChars, attemptChars);
        					System.out.println(try1);
        					System.out.println(try2);
        					System.out.println(try3);
        					guessWord();
    					
        				} if (tryNumber == 4) {
    					
        					clear();
        					try4 = Calculate.result(wordleChars, attemptChars);
        					System.out.println(try1);
        					System.out.println(try2);
        					System.out.println(try3);
        					System.out.println(try4);
        					guessWord();
    					
        				} if (tryNumber == 5) {
    					
        					clear();
        					try5 = Calculate.result(wordleChars, attemptChars);
        					System.out.println(try1);
        					System.out.println(try2);
        					System.out.println(try3);
        					System.out.println(try4);
        					System.out.println(try5);
        					guessWord();
    					
        				} if (tryNumber == 6) {
    					
        					clear();
        					try6 = Calculate.result(wordleChars, attemptChars);
        					System.out.println(try1);
        					System.out.println(try2);
        					System.out.println(try3);
        					System.out.println(try4);
        					System.out.println(try5);
        					System.out.println(try6);
        					guessWord();
    					
        				}
    					
    				}
    				
    				
    			} if (checkWord(attempt) == false) {
    				
    				
	    				System.out.println("Word is not in the dictionary.");
	    	    		TimeUnit.SECONDS.sleep(3);
	    	    		clear();
	    	    		guessWord();
    				
    			}


    		
    	}


    }
    
    public static boolean checkWord(String attempt) {
		File file = new File("valid-wordle-words.txt");
		
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
    
	public static void clear() {
		
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		
	
	}
}
