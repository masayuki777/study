package templateMethod;

public class Main {
	public static void main(String[] args) {
		AbstractManual d1 = new OperationAManual('F');
		AbstractManual d2 = new OperationBManual("HelloWorld");
		d1.operation();
		d2.operation();
	}
}
