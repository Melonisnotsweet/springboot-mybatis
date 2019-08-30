package cn.pqz.springboot.service.impl;

import cn.pqz.springboot.dao.EmployeeDao;
import cn.pqz.springboot.entities.Employee;
import cn.pqz.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public Employee getById(Integer id) {
        return employeeDao.getById(id);
    }

    @Override
    public Integer deleteEmployee(Integer id) {
        return employeeDao.deleteEmployee(id);
    }

    @Override
    public Integer addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }
}
