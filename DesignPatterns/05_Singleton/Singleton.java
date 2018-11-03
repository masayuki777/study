package singleton;

public class Singleton {
	// 1.staticフィールド(クラス変数)としてsingletonを定義
	private static Singleton singleton = new Singleton();

	// 2.privateなコンストラクタ
	private Singleton() {
		System.out.println("インスタンスの生成に成功しました");
	}

	// 3.singletonインスタンスの返却
	public static Singleton getInstance() {
		return singleton;
	}
}
