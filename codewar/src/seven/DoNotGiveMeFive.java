package seven;

//Don't give me five!
//
//In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. The start and the end number are both inclusive!
//
//Examples:
//
//1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
//4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
//The result may contain fives. ;-)
//The start number will always be smaller than the end number. Both numbers can be also negative!
//
//I'm very curious for your solutions and the way you solve it. Maybe someone of you will find an easy pure mathematics solution.
//
//Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//I have also created other katas. Take a look if you enjoyed this kata!

public class DoNotGiveMeFive {
	public static void main(String[] args) {
		System.out.println(dontGiveMeFive(1, 9));
		System.out.println(dontGiveMeFive(4, 17));
	}

	//	自答
	public static int dontGiveMeFive(int start, int end) {
		//5がつく数字をNG
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (!(String.valueOf(i).indexOf('5') != -1)) {
				count++;
			}
		}
		return count;
	}

	//解答例1
	//・contains()を使いたいために(""+i)でiをstring化している
	//	public static int dontGiveMeFive(int start, int end) {
	//		int count = 0;
	//		for (int i = start; i <= end; i++) {
	//			if (!("" + i).contains("5")) {
	//				count++;
	//			}
	//		}
	//		return count;
	//	}

	//解答例2
	//・indexOf()...ある文字列の中で指定した文字列が最初に出現する位置を返す。指定した文字列が出現しない場合は-1を返す。
	//	public static int dontGiveMeFive(int start, int end) {
	//		int result = 0;
	//		for (int i = start; i <= end; i++) {
	//			if (String.valueOf(i).indexOf('5') == -1)
	//				result++;
	//		}
	//		return result;
	//	}
}
