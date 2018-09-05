package com.atguigu.springboot.controller;


import com.atguigu.springboot.bean.Department;
import com.atguigu.springboot.bean.Employee;
import com.atguigu.springboot.mapper.DepartmentMapper;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;

    //http://localhost:8080/dept/1
    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }
    //http://localhost:8080/dept?departmentName=AA
    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

}
