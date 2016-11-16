package tdd.training.session1;

public class Utils {
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
