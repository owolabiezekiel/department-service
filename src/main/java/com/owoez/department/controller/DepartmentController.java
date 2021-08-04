package com.owoez.department.controller;

import com.owoez.department.entity.Department;
import com.owoez.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
  @Autowired
  private DepartmentService departmentService;

  @PostMapping("/")
  public Department saveDepartment(@RequestBody Department department){
    log.info("Inside saveDepartment method of Department Controller");
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/{id}")
  public Department getDepartmentById(@PathVariable("id") Long id){
    log.info("Inside getDepartmentById method of department controller");
    return departmentService.getDepartmentById(id);
  }
}
