package cn.pqz.springboot.service;

import cn.pqz.springboot.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public Employee getById(Integer id);
    public Integer deleteEmployee(Integer id);
    public Integer addEmployee(Employee employee);
    public Integer updateEmployee(Employee employee);
}
