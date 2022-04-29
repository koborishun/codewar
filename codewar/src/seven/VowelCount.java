package seven;
//Return the number (count) of vowels in the given string.

//
//We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//The input string will only consist of lower case letters and/or spaces.

public class VowelCount {
	public static void main(String[] args) {
		System.out.println(getCount("abracadabra"));
	}

	public static int getCount(String str) {
		int count = 0;
		char[] array = str.toCharArray();
		for (char c : array) {
			switch (c) {
			case 'a':
			case 'i':
			case 'u':
			case 'e':
			case 'o':
				count++;
				break;
			}
		}
		return count;
	}
	//解答例1
	//・replaceAllは正規表現を許容
	//・(?i)・・・大文字小文字問わず
	//・[^aeiou]・・・aeiou以外 [^...]は[^]内の文字以外と一致、という意味
	//	public static int getCount(String str) {
	//        return str.replaceAll("(?i)[^aeiou]", "").length();
	//    }
	//解答例2
	//	public static int getCount(String str) {
	//	    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
	//	  }
}
