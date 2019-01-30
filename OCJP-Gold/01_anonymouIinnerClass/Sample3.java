interface Foo {// インタフェース
	void methodA();// 抽象メソッド
}

public class Sample3 {
	public static void main(String[] args) {
		new Foo() {// 変数宣言なしで匿名クラスでの実装
			@Override
			public void methodA() {// 抽象メソッドのオーバーライド
				System.out.println("methodA");
			}
		}.methodA();// 実装クラスに対してメソッドの呼び出し
	}
}
