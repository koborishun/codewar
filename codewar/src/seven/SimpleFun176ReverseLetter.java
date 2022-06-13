package seven;

//Task
//
//Given a string str, reverse it omitting all non-alphabetic characters.
//
//Example
//
//For str = "krishan", the output should be "nahsirk".
//
//For str = "ultr53o?n", the output should be "nortlu".
//
//Input/Output
//
//[input] string str
//A string consists of lowercase latin letters, digits and symbols.
//
//[output] a string
public class SimpleFun176ReverseLetter {
	public static void main(String[] args) {
		System.out.println(reverseLetter("krishan"));
		System.out.println(reverseLetter("ultr53o?n"));
	}

	public static String reverseLetter(final String str) {
		return new StringBuilder(str).reverse().toString().replaceAll("[^a-zA-Z]", "");
	}
	//    解答例1
	//    public static String reverseLetter(final String s) {
	//        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();　　[^a-zA-Z]...アルファベット以外、という意味
	//    }
	//    解答例２
	//    public static String reverseLetter(final String str) {
	//        String someString = "";
	//        for (int i = 0; i < str.length(); i++) {
	//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	//                someString = str.charAt(i) + someString;
	//            }
	//        }
	//        return someString;
	//    }
}
