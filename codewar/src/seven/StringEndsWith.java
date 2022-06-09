package seven;

//Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
//
//Examples:
//
//solution('abc', 'bc') // returns true
//solution('abc', 'd')
public class StringEndsWith {
	public static void main(String[] args) {
		System.out.println(solution("abc", "bc"));
		System.out.println(solution("abc", "d"));
	}

	//自答
	public static boolean solution(String str, String ending) {
		if (str.length() < ending.length()) {
			return false;
		}
		String matubi = str.substring((str.length() - ending.length()), str.length());
		if (matubi.equals(ending)) {
			return true;
		}
		return false;
	}
	//解答例1
	//    public static boolean solution(String str, String ending) {
	//        return str.endsWith(ending);
	//      }
}
