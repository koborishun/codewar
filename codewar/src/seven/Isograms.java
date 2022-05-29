package seven;

//An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

//Example: (Input --> Output)
//
//"Dermatoglyphics" --> true
//"aba" --> false
//"moOse" --> false (ignore letter case)
public class Isograms {
	public static void main(String[] args) {
		System.out.println(isIsogram("Dermatoglyphics"));
		System.out.println(isIsogram("aba"));
		System.out.println(isIsogram("moOse"));
	}

	public static boolean isIsogram(String str) {
		return str.length() == str.toLowerCase().chars().distinct().count();

	}
}
//解答例1(stream使用)
//解き方:
//引数の文字列の長さと重複を除いたストリームを流れる値の個数が同じなら重複はないということが証明(逆に重複あればストリームを流れる値が少なくなっているはず
//・distinct() ストリームに含まれる値の重複を除去できる
//・count()　ストリームを流れる要素の個数をカウント
//	public static boolean  isIsogram(String str) {
//	    return str.length() == str.toLowerCase().chars().distinct().count();
//	  }
//解答例2(hashset使用)
//hashset 要素の集まりを扱うクラス。要素の重複不可
//解き方:引数のstrを１個ずつ重複がないかを見ていって追加していく。ダブりがあれば即falseを	返す。
//	public static boolean isIsogram(String str) {
//	    Set<Character> letters = new HashSet<Character>();
//
//	    for (int i = 0; i < str.length(); ++i) {
//	      if (letters.contains(str.toLowerCase().charAt(i))) {
//	        return false;
//	      }
//
//	      letters.add(str.charAt(i));
//	    }
//
//	    return true;
//	  }
