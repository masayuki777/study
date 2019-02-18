public class Employee extends Responsible {

	private int limitLevel = 1; // このレベル以下なら解決できる

	public Employee(String name) { // コンストラクタ
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) { // 解決用メソッド
		if (trouble.getLevel() <= limitLevel) {
			return true;
		} else {
			return false;
		}
	}

}