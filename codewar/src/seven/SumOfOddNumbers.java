package seven;

//Given the triangle of consecutive odd numbers:
//
//    1
// 3     5
//7     9    11
//13    15    17    19
//21    23    25    27    29
//...
//Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
//
//1 -->  1
//2 --> 3 + 5 = 8
//1列目は1,2列目は8,3列目は27,4列目は64 -> 引数の3乗倍を返す
public class SumOfOddNumbers {
	public static void main(String[] args) {
		System.out.println(rowSumOddNumbers(1));
		System.out.println(rowSumOddNumbers(42));
	}

	public static int rowSumOddNumbers(int n) {
		//TODO
		return (int) Math.pow(n, 3);
	}
}
