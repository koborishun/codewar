package seven;

import java.util.stream.IntStream;

//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//
//Examples:
//
//Input: 42145 Output: 54421
//
//Input: 145263 Output: 654321
//
//Input: 123456789 Output: 987654321
public class DeccendingOrder {
	public static void main(String[] args) {
		System.out.println(sortDesc(51));
	}

	public static int sortDesc(final int num) {
		return Integer.valueOf(IntStream.of(num).sorted().toString());
	}
	//解答例1
	//・String.valueOf(num).chars() 引数numをString型に変換しchars()でchar型のストリームへ変換
	//・mapToObj(i -> String.valueOf(Character.getNumericValue(i))) Streamとなった各iを、getNumericValue()で数字を意味するchar型をそのままの見た目の数値に変換し、再びString型へ
	//・Collectors.joining() ストリームアイテムを1つのStringオブジェクトにする
	//・Streamの終端処理としてのcollect() CollectはStreamのデータを変形などの処理をし、必要なデータ型に変換してくれます。
	//	public static int sortDesc(final int num) {
	//		//Your code
	//		return Integer.parseInt(String.valueOf(num)
	//				.chars()
	//				.mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
	//				.sorted(Comparator.reverseOrder())
	//				.collect(Collectors.joining()));
	//	}
	//解答例2
	//・joinは文字列を連結するときに使用するメソッドで、第一引数をデリミタとし、第二引数を接頭辞として以降指定された接頭辞の終わりまでの文字列が区切られます。
	//例:String sj = String.join("デリミタ", "文字列1", "文字列2", "文字列3");
	//	public static int sortDesc(final int num) {
	//        String[] array = String.valueOf(num).split("");
	//        Arrays.sort(array, Collections.reverseOrder());
	//        return Integer.valueOf(String.join("", array));
	//    }
}
