package seven;

//A square of squares
//
//You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!
//
//However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.
//
//Task
//
//Given an integral number, determine if it's a square number:
//
//In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
//
//The tests will always use some integral number, so don't worry about that in dynamic typed languages.
public class YouAreASquare {
	public static void main(String[] args) {
		System.out.println(-1);
		System.out.println(0);
		System.out.println(3);
		System.out.println(4);
	}

	//解答例1
	//・Math.sqrt 数値の平方根を取得
	public static boolean isSquare(int n) {
		return Math.sqrt(n) % 1 == 0;
		//3.454とかを1で割ったら余りが0となることはないのでfalseを返す
	}
	//解答例2
	//・Math.round 数値を四捨五入
	//	public static boolean isSquare(int n) {
	//        long s = Math.round(Math.sqrt(n));
	//        return s * s == n;
	//    }
}
