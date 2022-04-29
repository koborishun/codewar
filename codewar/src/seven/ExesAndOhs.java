package seven;

//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//
//Examples input/output:
//
//XO("ooxx") => true
//XO("xooxx") => false
//XO("ooxXm") => true
//XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//XO("zzoo") => false
public class ExesAndOhs {
	public static void main(String[] args) {
		System.out.println(getXO("xxxooo"));
	}

	//自答
	public static boolean getXO(String str) {
		char[] array = str.toLowerCase().toCharArray();
		int countX = 0;
		int countO = 0;
		for (int i = 0; i < array.length; i++) {
			if ('x' == array[i]) {
				countX++;
			}
			if ('o' == array[i]) {
				countO++;
			}
		}
		return countX == countO;
	}
	//解答例1
	//解き方 文字列中のxとoを””に置き換える。xとoが同数であれば置き換え後の元の文字列の長さが同じであることがわかる
	//	public static boolean getXO (String str) {
	//	    str = str.toLowerCase();
	//	    return str.replace("o","").length() == str.replace("x","").length();
	//
	//	  }

}
