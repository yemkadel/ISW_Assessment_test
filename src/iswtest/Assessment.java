package iswtest;

public class Assessment {

	public static void main(String[] args) {
		//Used to test code
		useText("qui");

	}
	
	public static void useText(String text) {
		if (text.length() > 300) 
			text = text.substring(0, 300);
		int textLength = text.length();
		if (textLength == 3) 
			text = text.toUpperCase();
		String newText = "";
		for (int i=textLength-1;i>=0;i--) {
			newText = newText + text.charAt(i);
		}
		System.out.println(newText);
	}

}
