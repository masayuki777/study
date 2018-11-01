package templateMethod;

public class OperationBManual extends AbstractManual {
	private String string;

	public OperationBManual(String string) {
		this.string = string;
	}

	@Override
	public void start() {
		System.out.println("**作業B開始**");
	}

	@Override
	public void work() {
		System.out.println(string + "を処理しています");
	}

	@Override
	public void end() {
		System.out.println("**作業B終了**");
	}
}
