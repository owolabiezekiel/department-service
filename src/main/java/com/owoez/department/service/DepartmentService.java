package com.owoez.department.service;

import com.owoez.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
  @Autowired
  private DepartmentRepository departmentRepository;

}
