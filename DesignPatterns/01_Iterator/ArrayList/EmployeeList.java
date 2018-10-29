import java.util.ArrayList;

public class EmployeeList implements Aggregate {
	private ArrayList<Employee> employees;

	public EmployeeList(int initialsize) {
		this.employees = new ArrayList<>(initialsize);
	}

	public Employee getEmployeeAt(int index) {
		return (Employee) employees.get(index);
	}

	public void appendEmployee(Employee employee) {
		employees.add(employee);
	}

	public int getLength() {
		return employees.size();
	}

	public Iterator iterator() {
		return new EmployeeListIterator(this);
	}
}
