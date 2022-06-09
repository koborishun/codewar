package seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
//
//Write a function which takes a list of strings and returns each line prepended by the correct number.
//
//The numbering starts at 1. The format is n: string. Notice the colon and space in between.
//
//Examples:
//
//number(Arrays.asList()) # => []
//number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
public class Testing123 {
	public static void main(String[] args) {
		System.out.println(number(Arrays.asList("a", "b", "c")));
		System.out.println(number(Arrays.asList("", "", "", "", "")));
	}

	//自答
	public static List<String> number(List<String> lines) {
		// TODO
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= lines.size(); i++) {
			list.add(i + ": " + lines.get(i - 1));
		}
		return list;
	}
	//解答例1
	//	static List<String> number(List<String> lines) {
	//        for(int i= 0; i< lines.size() ; i++) {
	//          lines.set(i,(i+1)+": "+lines.get(i));
	//        }
	//        return lines;
	//    }
}
