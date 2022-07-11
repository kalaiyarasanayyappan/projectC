package com.chainsys.application.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.application.model.Employee;
import com.chainsys.application.model.EmployeeDao;

@RestController
public class Service {

@RequestMapping("/getEmployee")
public  String  getData(@RequestParam(name = "id") String id) {
    int empId = Integer.parseInt(id);
    Employee emp = EmployeeDao.getEmployeeById(empId);
        return   emp.getFirst_name()+", " + emp.getLast_name()+", " + emp.getJob_id()+", " + emp.getSalary()+", "
                + emp.getHire_date()+", " + emp.getEmail() ;
    }
}
