public abstract class SpongeCake {
	public abstract String getName(); // 名前を得る

	public abstract int getPrice(); // 価格を得る

	public void show() { // 名前と価格を表示する
		System.out.println(getName() + ":" + getPrice() + "円");
	}
}
