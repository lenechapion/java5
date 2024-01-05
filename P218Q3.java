package java5;

public class P218Q3 {

	public static void main(String[] args) {
	
		String title = "タイトル";
		String address = "qawsde@mail.com";
		String text = "本文";
		email(title, address, text);

	}
	public static void email(String title,String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
}
