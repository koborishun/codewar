package seven;

import java.util.Arrays;

//An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//Note: anagrams are case insensitive
//
//Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
//
//Examples
//
//"foefet" is an anagram of "toffee"
//
//"Buckethead" is an anagram of "DeathCubeK"
public class AnagramDetection {
	public static void main(String[] args) {
		System.out.println(isAnagram("foefet", "toffee"));
		System.out.println(isAnagram("Buckethead", "DeathCubeK"));
	}

	public static boolean isAnagram(String test, String original) {
		// your code goes here
		//testとoriginalを並び替えたら同じかどうか
		//		if (test == null || original == null || test.length() != original.length()) {
		//			return false;
		//		}
		char[] a = test.toLowerCase().toCharArray();
		char[] b = original.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
	}
}
//解答例１
//public static boolean isAnagram(String test, String original) {
//※そもそもtest,originalがnullもしくは両者の文字列長が違う時false
//    if( test == null || original == null || test.length() != original.length())
//      return false;
//
//    char ch1 [] = test.toLowerCase().toCharArray();
//    char ch2 [] = original.toLowerCase().toCharArray();
//
//    Arrays.sort(ch1);
//    Arrays.sort(ch2);
//
//    return Arrays.equals(ch1, ch2);
//
// }
