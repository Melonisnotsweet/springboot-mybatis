package cn.pqz.springboot.service;

import cn.pqz.springboot.entities.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> getDepartments();
    public Department getDepartment(Integer id);
}
