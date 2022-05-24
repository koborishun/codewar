package seven;

//You might know some pretty large perfect squares. But what about the NEXT one?
//
//Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
//
//If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
//
//Examples:(Input --> Output)
//
//121 --> 144
//625 --> 676
//114 --> -1 since 114 is not a perfect square
public class FindTheNextPerfectSquare {
	public static void main(String[] args) {
		System.out.println(findNextSquare(121));
		System.out.println(findNextSquare(625));
		System.out.println(findNextSquare(114));
	}

	public static long findNextSquare(long sq) {
		//sqの平方根が整数かどうかを確認
		if (Math.sqrt(sq) % 1 == 0) {
			return (long) Math.pow(Math.sqrt(sq) + 1, 2);
		}
		return -1;
	}
	//解答例1
	//	public static long findNextSquare(long sq) {
	//	    long root = (long) Math.sqrt(sq);
	//	    return root * root == sq ? (root + 1) * (root + 1) : -1;
	//	}
}
