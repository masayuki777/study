package templateMethod;

public class OperationAManual extends AbstractManual {
	private char ch;

	public OperationAManual(char ch) {
		this.ch = ch;
	}

	@Override
	public void start() {
		System.out.println("<<作業A開始>>");
	}

	@Override
	public void work() {
		System.out.println(ch + "を処理しています");
	}

	@Override
	public void end() {
		System.out.println("<<作業A終了>>");
	}
}
