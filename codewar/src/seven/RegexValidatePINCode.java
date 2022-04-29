package seven;

//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//If the function is passed a valid PIN string, return true, else return false.
//
//Examples (Input --> Output)
//
//"1234"   -->  true
//"12345"  -->  false
//"a234"   -->  false
public class RegexValidatePINCode {
	public static void main(String[] args) {
		System.out.println(validatePin("1234"));
		System.out.println(validatePin("0000"));
		System.out.println(validatePin("1111"));
		System.out.println(validatePin("123456"));
		System.out.println(validatePin("098765"));
		System.out.println(validatePin("a234"));
	}

	public static boolean validatePin(String pin) {
		// Your code here...
		char[] array = pin.toCharArray();
		//引数pinが数字かどうか？数字じゃないならfalseを返す
		for (char c : array) {
			if (Character.isDigit(c)) {
				continue;
			}
			return false;
		}
		//引数pinが4桁、もしくは6桁かを判断。どちらかに当てはまる場合true、それ以外false
		if (array.length == 4 || array.length == 6) {
			return true;
		}
		return false;
	}
	//解答例1
	//・String.matches 正規表現で真偽値を返す
	//・\dは[0-9]と同じ。半角数値(0～9)にマッチする。\でエスケープしている
	//	public static boolean validatePin(String pin) {
	//	    return pin.matches("\\d{4}|\\d{6}");
	//	  }
	//解答例2
	//	public static boolean validatePin(String pin) {
	//	    return pin.matches("[0-9]{4}|[0-9]{6}");
	//	  }

}
