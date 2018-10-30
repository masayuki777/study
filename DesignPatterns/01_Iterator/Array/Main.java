public class Main {
	public static void main(String[] args) {
		EmployeeList employeeList = new EmployeeList(4);
		employeeList.appendEmployee(new Employee("Tarou_Tanaka", "C001"));
		employeeList.appendEmployee(new Employee("Hanako_Yamada", "C002"));
		employeeList.appendEmployee(new Employee("Yuuya_Suzuki", "C003"));
		employeeList.appendEmployee(new Employee("Kanako_Satou", "C004"));
		Iterator it = employeeList.iterator();
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			System.out.println(employee.getName() + ":" + employee.getEmployeeCode());
		}
	}
}