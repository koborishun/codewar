package seven;

//You have to write a function printer_error which given a string will return the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.
//
//The string has a length greater or equal to one and contains only letters from ato z.
//
//Examples:
//
//s="aaabbbbhaijjjm"
//printer_error(s) => "0/14"
//
//s="aaaxbbbbyyhwawiwjjjwwm"
//printer_error(s) => "8/22"
public class PrinterError {
	public static void main(String[] args) {
		System.out.println(printerError("aaabbbbhaijjjm"));
		System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
	}

	public static String printerError(String s) {
		// your code
		int mother = s.length();
		s = s.replaceAll("[a-m]", "");
		int child = s.length();
		return child + "/" + mother;
	}
	//解答例1(自答を簡略化)
	//	public static String printerError(String s) {
	//        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
	//    }
	//	解答例2(Strean使用)
	//	public static String printerError(String s) {
	//        long errs = s.chars().filter( ch -> ch > 'm').count();
	//        return errs+"/"+s.length();
	//    }
}
