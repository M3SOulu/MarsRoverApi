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
}
