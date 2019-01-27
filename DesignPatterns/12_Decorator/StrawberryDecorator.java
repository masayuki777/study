public class StrawberryDecorator extends Decorator {

	public StrawberryDecorator(SpongeCake spongeCake) { // コンストラクタで飾り付けの対象を渡す
		super(spongeCake);
	}

	@Override
	public String getName() { // 中身の名前の先頭にイチゴを加えたもの
		return "イチゴ" + spongeCake.getName();
	}

	@Override
	public int getPrice() { // 中身の価格に100を加えたもの
		return spongeCake.getPrice() + 100;
	}

}
