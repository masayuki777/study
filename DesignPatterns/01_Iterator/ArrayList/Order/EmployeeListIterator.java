public class EmployeeListIterator implements Iterator {
	private EmployeeList employeeList;
	private int index;

	public EmployeeListIterator(EmployeeList employeeList) {
		this.employeeList = employeeList;
		this.index = 0;
	}

	public boolean hasNext() {
		if (index < employeeList.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	public Object next() {
		Employee employee = employeeList.getEmployeeAt(index);
		index++;
		return employee;
	}
}
