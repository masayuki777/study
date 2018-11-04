import framework.*;

public class Underline implements Product {
	private char ulchar;

	public Underline(char ulchar) {
		this.ulchar = ulchar;
	}

	// 1. displayメソッドの実装
	@Override
	public void display(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("\n");
	}

	// 2. createCloneメソッドの実装
	@Override
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
