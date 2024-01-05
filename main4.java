package java5;

public class main4 {
	
	//int型配列を受け取り、
	//配列内の要素全てに１を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
	}
}           // ↑結果をreturnで返していない
	
	public static void main(String[] args) {
		int [] array = {1,2,3} ;
		incArray(array);                 //メソッドの実行
		for(int i : array) {              //arrayの全要素を出力
			System.out.println(i);
		}

	}

}
