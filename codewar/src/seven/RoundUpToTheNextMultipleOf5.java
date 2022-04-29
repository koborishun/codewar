package seven;

//Given an integer as input, can you round it to the next (meaning, "higher") multiple of 5?
//
//Examples:
//
//input:    output:
//0    ->   0
//2    ->   5
//3    ->   5
//12   ->   15
//21   ->   25
//30   ->   30
//-2   ->   0
//-5   ->   -5
//etc.
//Input may be any positive or negative integer (including 0).
//
//You can assume that all inputs are valid integers.
public class RoundUpToTheNextMultipleOf5 {
	public static void main(String[] args) {
		System.out.println(roundToNext5(0));
		System.out.println(roundToNext5(2));
		System.out.println(roundToNext5(3));
		System.out.println(roundToNext5(12));
		System.out.println(roundToNext5(21));
		System.out.println(roundToNext5(30));
		System.out.println(roundToNext5(-2));
		System.out.println(roundToNext5(-5));
	}

	//自答
	public static int roundToNext5(int number) {
		if (number % 5 == 0) {
			return number;
		}

		int n = 0;
		if (number < 0) {
			n = number / 5;
			return 5 * n;
		}
		n = (number / 5) + 1;
		return 5 * n;
	}
	//解答例１
	//	public static int roundToNext5(int number) {
	//	    while (number % 5 != 0) {
	//	      number++;
	//	    }
	//	    return number;
	//	  }
	//解答例２
	//	public static int roundToNext5(int number) {
	//	    return (int) (Math.ceil((float) number / 5) * 5);
	//	  }
}
