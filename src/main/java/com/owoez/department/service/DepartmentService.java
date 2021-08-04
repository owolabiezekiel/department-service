package com.owoez.department.service;

import com.owoez.department.entity.Department;
import com.owoez.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
  @Autowired
  private DepartmentRepository departmentRepository;

  public Department saveDepartment(Department department) {
    log.info("Inside saveDepartment of departmentService");
    return departmentRepository.save(department);
  }
}
