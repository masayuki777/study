public class ShortCake extends SpongeCake {

	@Override
	public String getName() { // 親クラスの名前を得るメソッドをオーバーライド
		return "ショートケーキ";
	}

	@Override
	public int getPrice() { // 親クラスの価格を得るメソッドをオーバーライド
		return 500;
	}

}
