package seven;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//Examples
//
//"This is an example!" ==> "sihT si na !elpmaxe"
//"double  spaces"      ==> "elbuod  secaps"
public class ReverseWords {
	public static void main(String[] args) {
		System.out.println(reverseWords("This is an example!"));
	}

	//自答
	public static String reverseWords(final String original) {
		// Have at it
		String[] array = original.split(" ");
		if (array.length == 0) {
			return original;
		}
		for (int i = 0; i < array.length; i++) {
			StringBuilder sb = new StringBuilder(array[i]);
			array[i] = sb.reverse().toString();
		}
		return String.join(" ", array);
		//1." "で分割 2.分割したそれぞれの要素を反転 3.再び
	}

	//解答例1
	//・joinメソッド　文字列を連結するときに使用するメソッド
	//   String.join(a,b) a...何で文字列を連結するか b...何を連結するか(文字列、配列)
	//	public static String reverseWords(final String original)　{
	//        String[] array = original.split(" ");
	//
	//        if(array.length == 0) {
	//             return original;
	//        }
	//
	//        int i = 0;
	//        for(String string : array){
	//            array[i] = new StringBuilder(string).reverse().toString();
	//            i++;
	//        }
	//
	//        return String.join(" ",array);
	//      }
}
