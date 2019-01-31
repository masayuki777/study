interface Foo {// インタフェース
	String methodA(String str);// String型を引数に取り、String型を返す抽象メソッド
}

public class Sample6 {// 実行クラス
	public static void main(String[] args) {
		String str = new Foo() {// 実装クラスを生成するが変数に代入せず、メソッドの実行結果を変数strに代入
			@Override
			public String methodA(String str) {// 抽象メソッドのオーバーライド
				return "Hello " + str;
			}
		}.methodA("methodA");// 生成したインスタンスに対してメソッドの呼び出し
		System.out.println(str);
	}
}