package seven;

import java.util.ArrayList;

//There is a bus moving in the city, and it takes and drop some people in each bus stop.
//
//You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
//
//Your task is to return number of people who are still in the bus after the last bus station (after the last array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are probably sleeping there :D
//
//Take a look on the test cases.
//
//Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return integer can't be negative.
//
//The second value in the first integer array is 0, since the bus is empty in the first bus stop.
public class NumberOfPeopleInTheBus {
	public static void main(String[] args) {
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[] { 10, 0 });
		list.add(new int[] { 3, 5 });
		list.add(new int[] { 2, 5 });
		System.out.println(countPassengers(list));
	}

	public static int countPassengers(ArrayList<int[]> stops) {
		//Code here!
		int passenger = 0;
		for (int i = 0; i < stops.size(); i++) {
			passenger += stops.get(i)[0] - stops.get(i)[1];
		}
		return passenger;
	}
	//解答例1
	//・mapToInt() 中間処理　要深掘り
	//	public static int countPassengers(ArrayList<int[]> stops) {
	//	    return stops.stream()
	//	                .mapToInt(x -> x[0] - x[1])
	//	                .sum();
	//	  }
}
