package seven;

//Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.
//
//Note: a and b are not ordered!
//
//Examples (a, b) --> output (explanation)
//
//(1, 0) --> 1 (1 + 0 = 1)
//(1, 2) --> 3 (1 + 2 = 3)
//(0, 1) --> 1 (0 + 1 = 1)
//(1, 1) --> 1 (1 since both are same)
//(-1, 0) --> -1 (-1 + 0 = -1)
//(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
public class BegginerSeries3SumOfNumbers {
	public static void main(String[] args) {
		System.out.println(GetSum(1, 0));
		System.out.println(GetSum(1, 2));
		System.out.println(GetSum(0, 1));
		System.out.println(GetSum(1, 1));
		System.out.println(GetSum(-1, 0));
		System.out.println(GetSum(-1, 2));
	}

	public static int GetSum(int a, int b) {
		//Good luck!
		return (a + b) * (Math.abs(a - b) + 1) / 2;
	}
	//解答例1
	//     public int GetSum(int a, int b)  {
	//        return (a + b) * (Math.abs(a - b) + 1) / 2;
	//     }
	//解答例2
	//IntStreamのrange(int start, int end) 	開始値以上、終了値未満の連続する整数を返す
	//     public int GetSum(int a, int b) {
	//        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
	//     }
}
