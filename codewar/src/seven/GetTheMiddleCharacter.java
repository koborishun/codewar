package seven;

//You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
//
//#Examples:
//
//Kata.getMiddle("test") should return "es"
//
//Kata.getMiddle("testing") should return "t"
//
//Kata.getMiddle("middle") should return "dd"
//
//Kata.getMiddle("A") should return "A"
public class GetTheMiddleCharacter {
	public static void main(String[] args) {
		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("middle"));
	}

	public static String getMiddle(String word) {
		//Code goes here!
		char[] array = word.toCharArray();
		//文字列長が奇数の時
		if (word.length() % 2 == 1) {
			return String.valueOf(array[word.length() / 2]);
		}
		//文字列長が偶数の時
		//		String left = String.valueOf(array[(word.length() / 2) - 1]);
		//		String right = String.valueOf(array[word.length() / 2]);
		//		return left + right;
		//25~27を1行に
		return String.valueOf(array[(word.length() / 2) - 1]) + String.valueOf(array[word.length() / 2]);
	}
	//解答例1
	//・substringで文字列から抽出
	//	public static String getMiddle(String word) {
	//	    String s = "";
	//	    int length = word.length();
	//	    int half = length/2;
	//
	//	    if (length % 2 == 0) {
	//
	//	      s = word.substring(half - 1, half + 1);
	//
	//	    } else {
	//
	//	      s = word.substring(half, half + 1);
	//
	//	    }
	//
	//	    return s;
	//	  }
}
