interface Foo {// インタフェース
	String methodA(String str);// String型を引数に取り、String型を返す抽象メソッド
}

class FooImple implements Foo {// 実装クラス
	@Override
	public String methodA(String str) {// 抽象メソッドのオーバーライド
		return "Hello " + str;
	}
}

public class Sample4 {// 実行クラス
	public static void main(String[] args) {
		Foo f = new FooImple();// 実装クラスを生成して変数fに代入
		String str = f.methodA("methodA");// メソッドの戻り値を変数strに代入
		System.out.println(str);
	}
}