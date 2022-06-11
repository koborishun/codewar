package seven;

//Simple, given a string of words, return the length of the shortest word(s).
//
//String will never be empty and you do not need to account for different data types.
public class ShortestWord {
	public static void main(String[] args) {
		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
		System.out.println(findShort("Let's travel abroad shall we"));
	}

	public static int findShort(String s) {
		String[] array = s.split(" ");

		if (s == null || array.length == 0) {
			return 0;
		}
		int i = 0;
		String shortestWord = array[i];
		for (String string : array) {
			if (shortestWord.length() > string.length()) {
				shortestWord = string;
			}
		}
		return shortestWord.length();
	}
	//解答例1
	//・mapToInt()でStreamをIntStreamに変換
	//・getAsInt()値を返す
	//	 public static int findShort(String s) {
	//	        return Stream.of(s.split(" "))
	//	          .mapToInt(String::length)
	//	          .min()
	//	          .getAsInt();
	//	 }
	//解答例2
	//	public static int findShort(String s) {
	//		int min = Integer.MAX_VALUE;
	//		for(String each : s.split(" ")) {
	//			if(each.length() < min)
	//				min = each.length();
	//		}
	//		return min;
	//	}
}
