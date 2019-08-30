package cn.pqz.springboot.dao;

import java.util.List;
import cn.pqz.springboot.entities.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentDao {

	public List<Department> getDepartments();
	public Department getDepartment(Integer id);
}
