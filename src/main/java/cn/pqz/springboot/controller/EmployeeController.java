package cn.pqz.springboot.controller;

import cn.pqz.springboot.entities.Department;
import cn.pqz.springboot.entities.Employee;
import cn.pqz.springboot.service.DepartmentService;
import cn.pqz.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/emps")
    public String list(Model model)
    {
        List<Employee> employees=employeeService.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
    //来到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model)
    {
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    @PostMapping("/emp")
    public String addPage(Employee employee)
    {
        employeeService.addEmployee(employee);
        return "redirect:/emps";
    }
    @GetMapping("/emp{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model)
    {
        Employee employee=employeeService.getById(id);
        model.addAttribute("emp",employee);
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    @PutMapping("/emp")
    public String updateEmployee(Employee employee)
    {

        employeeService.updateEmployee(employee);
        return "redirect:/emps";
    }
    //员工删除
    @DeleteMapping("/emp{id}")
    public String deleteEmployee(@PathVariable("id") Integer id)
    {
        employeeService.deleteEmployee(id);
        return "redirect:/emps";
    }
}
