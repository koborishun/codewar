package seven;

//Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//Examples
//
//Maskify.Maskify("4556364607935616"); // should return "############5616"
//Maskify.Maskify("64607935616");      // should return "#######5616"
//Maskify.Maskify("1");                // should return "1"
//Maskify.Maskify("");                 // should return ""
//
//// "What was the name of your first pet?"
//Maskify.Maskify("Skippy");                                   // should return "##ippy"
//Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
public class CreditCardMask {
	public static void main(String[] args) {
		System.out.println(maskify("4556364607935616"));
		System.out.println(maskify("64607935616"));
		System.out.println(maskify("1"));
		System.out.println(maskify(""));
	}

	public static String maskify(String str) {
		if (str.length() < 5) {
			return str;
		}
		String str1 = str.substring(0, str.length() - 4);
		String str2 = str.substring(str.length() - 4, str.length());
		//上記String str2 = str.substring(str.length() - 4);でも可

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			sb.append("#");
		}
		return sb.toString() + str2;
	}
	//解答例1(自答に似ている)
	//	public static String maskify(String str) {
	//        if (str.length() <= 4) return str;
	//        String result = "";
	//        for (int i = 0; i < str.length()-4; i++) {
	//            result += "#";
	//        }
	//        return result + str.substring(str.length()-4);
	//    }
	//解答例2
	//・末尾４桁以外を#に変える
	//	public static String maskify(String str) {
	//        return str.replaceAll(".(?=.{4})", "#");
	//    }
}
