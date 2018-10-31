public class EmployeeListReverseIterator implements Iterator {
	private EmployeeList employeeList;
	private int index;

	public EmployeeListReverseIterator(EmployeeList employeeList) {
		this.employeeList = employeeList;
		this.index = employeeList.getLength() - 1;
	}

	public boolean hasNext() {
		if (index < employeeList.getLength() && index >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public Object next() {
		Employee employee = employeeList.getEmployeeAt(index);
		index--;
		return employee;
	}
}
