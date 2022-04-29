package seven;

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
