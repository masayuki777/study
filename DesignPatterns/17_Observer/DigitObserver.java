public class DigitObserver implements Observer {
	@Override
	public void update(NumGenerator generator) {
		// 観察者が持つ乱数を取得して表示
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
