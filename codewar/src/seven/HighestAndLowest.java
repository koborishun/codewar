package seven;

import java.util.stream.Stream;

//In this little assignment you are given a string of space separated numbers,
//and have to return the highest and lowest number.
public class HighestAndLowest {
	public static void main(String[] args) {
		System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		System.out.println(highAndLow("1 2 3"));
	}

	//解答例1
	//・Stream.of(numbers.split(" "))で引数Stringを" "で分離させてストリーム形成
	//・mapToInt(Integer::parseInt)で上記ストリームをint型にパース
	//・SummaryStatisticsはcount、min、max、、sum averageなどのstatistics情報を計算してくれるクラス。そして、ストリームと一緒に使用できるようにデザイン
	//・varの所はIntSummaryStatics型
	public static String highAndLow(String numbers) {
		var stats = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
		return stats.getMax() + " " + stats.getMin();
	}
}
