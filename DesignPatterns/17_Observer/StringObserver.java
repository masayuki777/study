import org.apache.commons.lang3.RandomStringUtils;

public class StringObserver implements Observer {
	@Override
	public void update(NumGenerator generator) {
		System.out.print("StringObserver:");
		// 観察者が持つ乱数を引数として、ランダムなアルファベット文字列を取得して表示
		System.out.println(RandomStringUtils.randomAlphabetic(generator.getNumber()));
		System.out.println("----------------------------------------");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
