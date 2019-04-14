import java.util.Random;

public class RandomNumGenerator extends NumGenerator {
	// 乱数生成機
	private Random random = new Random();
	// 現在の数
	private int number;

	// 数を取得する
	@Override
	public int getNumber() {
		return number;
	}

	// 数を生成する(状態の更新)
	@Override
	public void execute() {
		for (int i = 0; i < 10; i++) {
			// 0～20の範囲で乱数を生成して現在の数の更新
			number = random.nextInt(21);
			System.out.println("ループカウント:" + (i + 1));
			// 数が生成されたことをobserverへ通知
			notifyObservers();
		}
	}
}
