package com.saideveloper.SpringbootprojectwithH2Database.service;

import com.saideveloper.SpringbootprojectwithH2Database.Entity.Department;

import java.util.List;
import java.util.Optional;

public interface Departmentservice {

    Department savedept(Department department);

      public  List<Department> fetchalldata();

     public Optional<Department> findById(Long departmentId);

    Department saveorupdate(Department department);

   public Department findByDepartmentName(String departmentName);

   public String deleteById(Long departmentId);

  public  void deleteAll();


    // public Department updatedept(Department department, Long departmentId);
}
