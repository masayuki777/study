public class Client {
	public static void main(String[] args) {
		Management m1 = new ManagerProxy("A案件");
		System.out.println("プロジェクトRvを開始します。");
		System.out.println("Rv中のプロジェクトは" + m1.getReviewProjectName() + "です。");
		m1.setReviewProjectName("B案件");
		System.out.println("Rv中のプロジェクトは" + m1.getReviewProjectName() + "です。");
		m1.printReviewResult();

		Management m2 = new ManagerProxy();
		System.out.println("プロジェクトRvを開始します。");
		System.out.println("Rv中のプロジェクトは" + m2.getReviewProjectName() + "です。");
		m2.setReviewProjectName("C案件");
		System.out.println("Rv中のプロジェクトは" + m2.getReviewProjectName() + "です。");
		m2.printReviewResult();
	}
}
