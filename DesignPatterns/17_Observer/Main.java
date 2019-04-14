public class Main {
	public static void main(String[] args) {
		// 具体的な観察対象の生成
		NumGenerator generator = new RandomNumGenerator();
		// 具体的な観察対象に具体的な観察者を登録
		generator.addObserver(new DigitObserver());
		generator.addObserver(new StringObserver());
		// 数の生成(状態の更新)
		generator.execute();
	}
}