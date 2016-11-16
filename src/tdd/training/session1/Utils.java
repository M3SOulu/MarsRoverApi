package tdd.training.session1;

public class Utils {
	public static int countOccurencesOf(String str, String chars){
		int count = str.length() - str.replace(chars, "").length();
		return count;
	}
}
