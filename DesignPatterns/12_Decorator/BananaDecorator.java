public class BananaDecorator extends Decorator {

	public BananaDecorator(SpongeCake spongeCake) { // コンストラクタで飾り付けの対象を渡す
		super(spongeCake);
	}

	@Override
	public String getName() { // 中身の名前の先頭にバナナを加えたもの
		return "バナナ" + spongeCake.getName();
	}

	@Override
	public int getPrice() { // 中身の価格に300を加えたもの
		return spongeCake.getPrice() + 300;
	}

}
