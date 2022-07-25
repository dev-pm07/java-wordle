package wordle;

public class Calculate {

	public static String[] resultArray = {"", "", "", "", "", ""};
	public static final String TEXT_YELLOW = "<html> <font color = 'yellow'>";
	public static final String TEXT_GREEN = "<html> <font color = 'green'>";
	public static final String TEXT_NORMAL = "<html> <font color = '#F5F5DC'>";
	public static final String TEXT_RESET = "</font> <html>";
	
	public static String result(String[] wordle, String[] attempt) {
		
		if (attempt[0].equals(wordle[0])) {
			
			resultArray[0] = TEXT_GREEN + attempt[0] + TEXT_RESET;
			
		} else if (attempt[0].equals(wordle[1]) ||
				attempt[0].equals(wordle[2]) ||
				attempt[0].equals(wordle[3]) ||
				attempt[0].equals(wordle[4])) {
			
			resultArray[0] = TEXT_YELLOW + attempt[0] + TEXT_RESET;
			
		} else if (!attempt[0].equals(wordle[0]) &&
				!attempt[0].equals(wordle[1]) &&
				!attempt[0].equals(wordle[2]) &&
				!attempt[0].equals(wordle[3]) &&
				!attempt[0].equals(wordle[4])) {
			
			resultArray[0] = TEXT_NORMAL + attempt[0] + TEXT_RESET;
			
		}
		
		if (attempt[1].equals(wordle[1])) {
			
			resultArray[1] = TEXT_GREEN + attempt[1] + TEXT_RESET;
			
		} else if (attempt[1].equals(wordle[0]) ||
				attempt[1].equals(wordle[2]) ||
				attempt[1].equals(wordle[3]) ||
				attempt[1].equals(wordle[4])) {
			
			resultArray[1] = TEXT_YELLOW + attempt[0] + TEXT_RESET;
			
		} else if (!attempt[1].equals(wordle[0]) &&
				!attempt[1].equals(wordle[1]) &&
				!attempt[1].equals(wordle[2]) &&
				!attempt[1].equals(wordle[3]) &&
				!attempt[1].equals(wordle[4])) {
			
			resultArray[1] = TEXT_NORMAL + attempt[1] + TEXT_RESET;
			
		}
		
		if (attempt[2].equals(wordle[2])) {
			
			resultArray[2] = TEXT_GREEN + attempt[2] + TEXT_RESET;
			
		} else if (attempt[2].equals(wordle[0]) ||
				attempt[2].equals(wordle[1]) ||
				attempt[2].equals(wordle[3]) ||
				attempt[2].equals(wordle[4])) {
			
			resultArray[2] = TEXT_YELLOW + attempt[2] + TEXT_RESET;
			
		} else if (!attempt[2].equals(wordle[0]) &&
				!attempt[2].equals(wordle[1]) &&
				!attempt[2].equals(wordle[2]) &&
				!attempt[2].equals(wordle[3]) &&
				!attempt[2].equals(wordle[4])) {
			
			resultArray[2] = TEXT_NORMAL + attempt[2] + TEXT_RESET;
			
		}
		
		if (attempt[3].equals(wordle[3])) {
			
			resultArray[3] = TEXT_GREEN + attempt[3] + TEXT_RESET;
			
		} else if (attempt[3].equals(wordle[0]) ||
				attempt[3].equals(wordle[1]) ||
				attempt[3].equals(wordle[2]) ||
				attempt[3].equals(wordle[4])) {
			
			resultArray[3] = TEXT_YELLOW + attempt[3] + TEXT_RESET;
			
		} else if (!attempt[3].equals(wordle[0]) &&
				!attempt[3].equals(wordle[1]) &&
				!attempt[3].equals(wordle[2]) &&
				!attempt[3].equals(wordle[3]) &&
				!attempt[3].equals(wordle[4])) {
			
			resultArray[3] = TEXT_NORMAL + attempt[3] + TEXT_RESET;
			
		}
		
		if (attempt[4].equals(wordle[4])) {
			
			resultArray[4] = TEXT_GREEN + attempt[4] + TEXT_RESET;
			
		} else if (attempt[4].equals(wordle[0]) ||
				attempt[4].equals(wordle[1]) ||
				attempt[4].equals(wordle[2]) ||
				attempt[4].equals(wordle[3])) {
			
			resultArray[4] = TEXT_YELLOW + attempt[4] + TEXT_RESET;
			
		} else if (!attempt[4].equals(wordle[0]) &&
				!attempt[4].equals(wordle[1]) &&
				!attempt[4].equals(wordle[2]) &&
				!attempt[4].equals(wordle[3]) &&
				!attempt[4].equals(wordle[4])) {
			
			resultArray[4] = TEXT_NORMAL + attempt[4] + TEXT_RESET;
			
		}
		
    	StringBuffer sb = new StringBuffer();
        for(int i = 0; i < resultArray.length; i++) {
            sb.append(resultArray[i]);
         }
        
    	String result = sb.toString();
		return result;
		
	}

}
