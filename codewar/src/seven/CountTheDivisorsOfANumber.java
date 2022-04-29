package seven;

//Count the number of divisors of a positive integer n.
//
//Random tests go up to n = 500000.
//
//Examples (input --> output)
//
//4 --> 3 (1, 2, 4)
//5 --> 2 (1, 5)
//12 --> 6 (1, 2, 3, 4, 6, 12)
//30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)
public class CountTheDivisorsOfANumber {
	public static void main(String[] args) {
		System.out.println(numberOfDivisors(1));
		System.out.println(numberOfDivisors(4));
		System.out.println(numberOfDivisors(12));
	}

	//自答
	public static long numberOfDivisors(int n) {
		// TODO please write your code below this comment
		long count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}
	//解答例1
	//	public long numberOfDivisors(int n) {
	//	    return IntStream.range(1, n+1).filter(i -> n%i==0).count();
	//	  }
}
