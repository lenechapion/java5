package java5;

public class main3 {
	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) {
		for (int element : array) { //↑引数に配列型を指定
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		int [] array = {1,2,3};
		printArray(array);  //配列を渡す

	}

}
