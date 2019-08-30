package cn.pqz.springboot.entities;

public class Department {

	private String id;
	private String departmentName;

	public Department() {
	}
	
	public Department(String id, String string) {
		this.id = id;
		this.departmentName = string;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
}
