public class Main {
	public static void main(String[] args) {

		// トラブル解決者の作成
		Responsible employee = new Employee("A社員");
		Responsible chief = new Chief("B課長");
		Responsible manager = new Manager("C部長");
		Responsible president = new President("D社長");

		// 連鎖の形成
		employee.setNext(chief).setNext(manager).setNext(president);

		// さまざまなトラブル発生
		employee.support(new Trouble(1, "顧客クレーム対応", 1));
		employee.support(new Trouble(2, "海外出張対応", 10));
		employee.support(new Trouble(3, "世界平和", 100));
		employee.support(new Trouble(4, "見積作成対応", 5));
		employee.support(new Trouble(5, "経営方針策定対応", 20));

	}
}