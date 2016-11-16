package tdd.training.session1;

public class Utils {
	/*public static enum Direction{
		FORWARD('f'),
		BACKWARD('b');
		
	    private final char value;
	    private Direction(char value) {
	        this.value = value;
	    }

	    public char getChar() {
	        return value;
	    }
	    static Direction getByValue(char value) {
	    	Direction result = null;
	    	for(Direction e: Direction.values()) {
	    		if(e.value == value) {
	    			result = e;
	    		}
	    	}
	    	return result;
	    }
	}*/
	public final static char FORWARD = 'f';
	public final static char BACKWARD = 'b';
	public final static char LEFT = 'l';
	public final static char RIGHT = 'r';

	public static String cycleDirectionLeft(String dir){
		String newDir = dir;
		if (newDir.equals("N")){
			newDir = "W";
		}else if (newDir.equals("W")){
			newDir = "S";
		}else if (newDir.equals("S")){
			newDir = "E";
		}else if (newDir.equals("E")){
			newDir = "N";
		}
		return newDir;
	}

	public static String cycleDirectionRight(String dir){
		String newDir = dir;
		if (newDir.equals("N")){
			newDir = "E";
		}else if (newDir.equals("E")){
			newDir = "S";
		}else if (newDir.equals("S")){
			newDir = "W";
		}else if (newDir.equals("W")){
			newDir = "N";
		}
		return newDir;
	}
	
	public static int countOccurencesOf(String str, String chars){
		int count = str.length() - str.replace(chars, "").length();
		return count;
	}
	
	public static String formatPosition(int x, int y){
		String str = "(" + x + "," + y + ")";
		return str;
	}
	
	public static String formatPosition(int x, int y, String dir){
		String str = "(" + x + "," + y + "," + dir + ")";
		return str;
	}
	
	public static boolean isInteger(String s) {
	    return isInteger(s,10);
	}
	
	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
}
