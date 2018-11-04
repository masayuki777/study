import framework.*;

public class Surround implements Product {
	private char srchar;

	public Surround(char srchar) {
		this.srchar = srchar;
	}

	// 1. displayメソッドの実装
	public void display(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(srchar);
		}
		System.out.println("");
		System.out.println(srchar + " " + s + " " + srchar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(srchar);
		}
		System.out.println("\n");
	}

	// 2. createCloneメソッドの実装
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
