package myjava;

public class Kadai1{
	 
	public static void main(String[] arg){

		//各教科の最高得点、最高得点者、平均点を算出。まず最高得点を算出するコードを書く。
		//↓生徒の各教科の点数と教科数で配列を整理する。
		int[][] Students = {{92,89,98,99},{78,79,94,86},{95,98,100,87}};
		String[] name = {"A","B","C"}; //配列maxStudentsは、文字データで三人の生徒のため、それぞれのデータを配列。
		// String[] subjects = {"英語","国語","数学","理科","全教科"};

		int testNumber = Students[0].length; //testNumber変数にStudents変数の教科数を取得し、代入。
		
		int[] maxScores= new int[testNumber]; //定義した変数testNumber（教科数）分のmaxScoreの配列に配置する
		
		String[] maxStudents = new String[testNumber];//各教科ごとに最高得点者を決まるため、教科数を配列する。

		double[] numAverage = new double[testNumber];//各教科ごとの平均点を算出するnumAverageを変数に定義。

		int []total_Score = new int[Students.length];
		
		
		for(int i = 0; i < testNumber; i++){
			int maxScore = Students[0][i];
			maxStudents[i] = name[0]; 
			int ave = 0;


			for(int j = 0; j < Students.length; j++){
				ave += Students[j][i];
				total_Score[j] += Students[j][i];

				if(maxScore < Students[j][i]){
					maxScore = Students[j][i];
					maxStudents[i] = name[j];
				}
				
			
			numAverage[i] = (double)ave /Students.length;
			maxScores[i] = maxScore;
			

			}
		}
		
		for(int k = 0; k <testNumber	;k++){
			System.out.println("------------------------------------------------");
			System.out.println("教科" + (k + 1) + "は" + maxScores[k] + "点です。");
			System.out.println("");
			System.out.println("最高得点者は" + maxStudents[k] + "です。");
			System.out.println("");
			System.out.println("平均点は" + numAverage[k] + "です");
			System.out.println("");
		}
		System.out.println("------------------------------------------------");
		for(int s = 0; s<Students.length;s++){
			System.out.println(total_Score[s]);
		}

		
		
	}
}