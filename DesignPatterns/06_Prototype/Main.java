import framework.*;

public class Main {
	public static void main(String[] args) {
		// 準備
		Client manager = new Client();
		Underline ul1 = new Underline('-');
		Underline ul2 = new Underline('~');
		Surround sr1 = new Surround('#');
		Surround sr2 = new Surround('@');
		manager.register("underLine text1", ul1);
		manager.register("underLine text2", ul2);
		manager.register("surround text1", sr1);
		manager.register("surround text2", sr2);

		// 生成
		Product p1 = manager.create("underLine text1");
		p1.display("Hello, world.");
		Product p2 = manager.create("underLine text2");
		p2.display("Hello, world.");
		Product p3 = manager.create("surround text1");
		p3.display("Hello, world.");
		Product p4 = manager.create("surround text2");
		p4.display("Hello, world.");
	}
}
