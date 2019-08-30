package cn.pqz.springboot.service.impl;

import cn.pqz.springboot.dao.DepartmentDao;
import cn.pqz.springboot.entities.Department;
import cn.pqz.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public List<Department> getDepartments() {
        return departmentDao.getDepartments();
    }

    @Override
    public Department getDepartment(Integer id) {
        return departmentDao.getDepartment(id);
    }
}
