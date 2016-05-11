import java.util.Scanner;
import java.util.Random;

public class Exam {

<<<<<<< HEAD
// int iDummy = 0;
    int count = 0;
=======
	int count= 0;
>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08
	char cDummy = 'a';
	boolean bDummy = false;
	double dDummy = 0.0d;
        int height = 169;
        int weight = 60;
	String nfb = "NotFizzBuzz";
        int x =10;
	int [] iaDummy = new int [0];

	/*
	問1 引数 count を受け取り,0からcountまで1づつ増加して表示する
	メソッド countUp を定義せよ。但しwhileを用いること。
	*/

	void countUp(int count) {
<<<<<<< HEAD
        int i = 0;
        while(i < count + 1) {
            i++;
            System.out.println(i);
            }
            break;
        }
=======
          
>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08
	}

	/*
	問2 引数 count を受け取り,countから0まで1づつ減少して表示する
	メソッド countDown を定義せよ。但しforを用いること。
	*/

	void countDown(int count) {
<<<<<<< HEAD
        for (int i = count; i <= 0; i--) {
            System.out.println(i);
        }
=======
         int v = count;
         for(int i = count; i >0;i--){
          System.out.println(i);
         }

>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08
	}

	/*
	問3 intの引数 x を 受け取り，正であればtrue,負であればfalseを返す
	メソッド positive を定義せよ。
	*/

	boolean positive(int x) {
<<<<<<< HEAD
		    return x > 0;
	}
=======
	  
          if(x>0){
            return true;
          }else {
            return false;
	 }
        }
>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08

	/*
	問4 intの引数 x,y を 受け取り数字が大きい方を返す
	メソッド max を定義せよ。
	*/

<<<<<<< HEAD
	int max(int x,int y) {
        if (x < y) {
            return y;
        }
        return x;
	}

=======
	int max(int x,int y){ 
        System.out.println(Math.max(x,y));  
        }
>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08
	/*
	問5 intの引数 x,y を 受け取り合計を返す
	メソッド sum を定義せよ。
	*/

	int sum(int x,int y) {
<<<<<<< HEAD
        return x + y;
=======
		return x+y;
>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08
	}

	/*
	問6 intの引数 x,y,z を 受け取り doubleで 平均を返す
	メソッド average を定義せよ。
	*/

	double average (int x,int y,int z) {
        int ave = ((x + y + z) / 3);
		return ave;
	}

	/*
	問7 intの引数 score を 受け取り 成績を返す メソッド rank を定義せよ。
	成績は 90以上はA 70以上90未満はB 45以上70未満はC その他はDとする。
	*/

	char rank (int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 70 && score < 90) {
            return 'B';
        } else if (score >= 45 && score < 70) {
            return 'C';
        } else {
            return 'D';
        }
	}

	/*
	問8 intの引数 width,height を 受け取り 四角形の面積を返す
	メソッド getRectAreaを定義せよ
	*/

	int getRectArea (int width, int height) {
        return width * height;
	}

	/*
	問9 三角形の辺の長さ x,y,z を 受け取り 三角形の面積を返す
	メソッド getTriangleAreaを定義せよ
	*/

	double getTriangleArea (int x,int y,int z) {
        if () {
        }
		return dDummy;
	}

	/*
	問10 height(cm),weight(kg)を受け取り そのBMI値を返す
	メソッド calcBMIを定義せよ
	BMI＝体重（kg）÷（身長（m）×身長（m））
	*/

<<<<<<< HEAD
	double calcBMI (int height, int weight) {
        double height = height / 100.0;
        return weight / (height * height / 100);
=======
	double calcBMI (int height,int weight) {
		
          System.out.println(weight /(height * 2));
>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08
	}

	/*
	問11 最小値 min, 最大値 max を受け取りその範囲のランダムな数を返す
	メソッド getRandom を定義せよ。
	*/

	int getRandom (int min,int max) {
          
	}

	/*
	問12 int型の配列arrayを引数でとり，その配列の要素を降順(大きい順)でソートして返す
	メソッド descSortを定義せよ
	*/

	int[] descSort(int[] array) {
		return iaDummy;
	}

	/*
	問13 int型の引数 x を受け取り
	3 で割り切れるならばFizz
	5 で割り切れるなら Buzz
	3 でも 5 でも割り切れる場合は，FizzBuzz
	それ以外は x をStringに変換して返す
	メソッドFizzBuzzを定義せよ
	*/

	String FizzBuzz(int x) {
<<<<<<< HEAD
        if (x % 15 == 0) {
            return "FizzBuzz";
        } else if(x % 3 == 0) {
            return "Fizz";
        } else if(x % 5 == 0) {
            return "Buzz";
        } else {
            String a = String.valuesOf(x);
            return 'a';
        }
	}
=======
	if(x%3 == 0){
        return "Fizz";
        }else if(x%5 == 0){
        return "Buzz";
        }else if(x%3 ==0 && x%5 == 0){
        return "FizzBuzz";}
        else{return nfb;}
        }
>>>>>>> 8b0f694fff640c59fbd6a59b47464c3d9a9eab08

	/*
	問14 掛け算九九表を出力するメソッドTimesTableを作成せよ
	但し 2次元配列 timestable を用いること。
	*/

	void TimesTable(){
		int[][] timestable = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int [i][j] *=
            }
        }
	}

	/*
	問15 自由課題
	自由に Java のプログラミングをせよ，但し説明をつけよ
	*/

	void execute() {

	}

}
