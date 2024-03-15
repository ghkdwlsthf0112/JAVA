package database.model;

public class Employee {
	// DB부터 null이 나올수 있으므로 
	//
	Integer employee_id;
	String first_name;
	String last_name;
	String email;
	String phone_number;

	public Employee(
			Integer employee_id,
			String first_name,
			String last_name,
			String email,
			String phone_number) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", "first_name", "last_name");
	}
}
