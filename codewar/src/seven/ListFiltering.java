package seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
//
//Example
//
//Kata.filterList(Arrays.asList(1, 2, "a", "b")) => Arrays.asList(1,2)
//Kata.filterList(Arrays.asList(1, 2, "a", "b", 0, 15)) => Arrays.asList(1,2,0,15)
//Kata.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)) => Arrays.asList(1, 2, 231)
public class ListFiltering {
	public static void main(String[] args) {
		System.out.println(filterList(Arrays.asList(1, 2, "a", "b")));
		System.out.println(filterList(Arrays.asList(1, 2, "a", "b", 0, 15)));
		System.out.println(filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)));
	}

	public static List<Object> filterList(final List<Object> list) {
		List<Object> newList = new ArrayList<>();
		for (Object object : list) {
			if (object instanceof Integer) {
				newList.add(object);
			}
		}
		return newList;
	}

	//解答例1(stream使用)
	//・filterメソッド　指定された条件で値をフィルターする。
	//・(e -> e instanceof Integer) streamの各要素がInteger型を引き継ぐオブジェクトかどうか？
	//・collect(Collectors.toList())でストリームの処理結果をリストに変換する
	//	public static List filterList(final List<Object> list) {
	//		return list.stream()
	//				.filter(e -> e instanceof Integer)
	//				.collect(Collectors.toList());
	//	}
	//解答例2(stream使用なし)
	//	public static List filterList(final List list) {
	//        List result = new ArrayList();
	//        for (int i = 0; i < list.size(); i++) {
	//            if (list.get(i) instanceof Number) {
	//                result.add(list.get(i));
	//            }
	//        }
	//        return result;
	//    }
}
