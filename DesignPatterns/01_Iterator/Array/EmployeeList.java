public class EmployeeList implements Aggregate {
	private Employee[] employees;
	private int last = 0;

	public EmployeeList(int maxsize) {
		this.employees = new Employee[maxsize];
	}

	public Employee getEmployeeAt(int index) {
		return employees[index];
	}

	public void appendEmployee(Employee employee) {
		this.employees[last] = employee;
		last++;
	}

	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		return new EmployeeListIterator(this);
	}
}
