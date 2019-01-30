interface Foo {// インタフェース
	void methodA();// 抽象メソッド
}

public class Sample2 {
	public static void main(String[] args) {
		Foo f = new Foo() {// 変数fに匿名クラスで実装した結果を代入
			@Override
			public void methodA() {// 抽象メソッドのオーバーライド
				System.out.println("methodA");
			}
		};
		f.methodA();// 実装クラスに対してメソッドの呼び出し
	}
}
