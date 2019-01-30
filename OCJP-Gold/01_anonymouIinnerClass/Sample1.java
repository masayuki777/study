interface Foo {// インタフェース
	void methodA();// 抽象メソッド
}

class FooImple implements Foo {// 実装クラス
	@Override
	public void methodA() {// 抽象メソッドのオーバーライド
		System.out.println("methodA");
	}
}

public class Sample1 {
	public static void main(String[] args) {

		Foo f = new FooImple();// 実装クラスを生成
		f.methodA();// 実装クラスに対してメソッドの呼び出し

		new FooImple().methodA();// メソッドの呼び出しだけならば変数への代入は不要
	}
}
