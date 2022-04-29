package seven;

//This time no story, no theory. The examples below show you how to write function accum:
//Examples:
//
//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"
public class Mumbling {
	public static void main(String[] args) {

	}

	//解答例1
	//考え方
	//・文字列は可変のStringBuilderを採用
	//・"A-Bb-Ccc-Dddd"をABCD部と"-"部と"b cc ddd"部にわけて、appendを使って合体させているイメージ
	public static String accum(String s) {
		// your code
		StringBuilder bldr = new StringBuilder();
		int i = 0;
		for (char c : s.toCharArray()) {
			//２周目から-が適用
			if (i > 0) {
				bldr.append('-');
			}
			bldr.append(Character.toUpperCase(c));
			//1周目はi=0だj＝0になるから下記のfor文は無視される
			for (int j = 0; j < i; j++) {
				bldr.append(Character.toLowerCase(c));
			}
			i++;
			//１周目は25,30行目のみ適用
		}
		return bldr.toString();
	}
	//解答例2
	//基本的な考え方は解答例１と似ている
	//	public static String accum(String s) {
	//        s = s.toLowerCase();
	//        StringBuilder builder = new StringBuilder();
	//
	//        for (int i = 0; i < s.length(); i++) {
	//            char ch = s.charAt(i);
	//            builder.append(Character.toUpperCase(ch));
	//１周目は以下のfor文はカウントされない
	//            for (int j = 0; j < i; j++) {
	//                builder.append(ch);
	//            }
	//            builder.append("-");
	//        }
	//	最後飛び出た"-"を消して、String型に
	//        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
	//    }
}
