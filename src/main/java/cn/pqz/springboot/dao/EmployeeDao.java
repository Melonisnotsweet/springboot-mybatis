package cn.pqz.springboot.dao;

import java.util.List;
import cn.pqz.springboot.entities.Employee;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface EmployeeDao {
	public List<Employee> getAll();
	public Employee getById(Integer id);
	public Integer deleteEmployee(Integer id);
	public Integer addEmployee(Employee employee);
	public Integer updateEmployee(Employee employee);

}
