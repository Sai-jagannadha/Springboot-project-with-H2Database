package com.saideveloper.SpringbootprojectwithH2Database.controller;

import com.saideveloper.SpringbootprojectwithH2Database.Entity.Department;
import com.saideveloper.SpringbootprojectwithH2Database.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    private Departmentservice departmentservice;

    @PostMapping("/savedept")
    public Department savedepartment(@RequestBody Department department) {
        return departmentservice.savedept(department);
    }

    @GetMapping("/get")
    public List<Department> getdepet() {
        return departmentservice.fetchalldata();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Department> getByDepartmentId(@PathVariable("id") Long departmentId) {
        return departmentservice.findById(departmentId);
    }
    /*@PutMapping("/updatedept/{id}")
    public Department updatedept(@RequestBody Department department, @PathVariable("id") Long departmentId){
        return departmentservice.updatedept(department,departmentId);
*/
    @PutMapping("/saveorupdate")
 public Department saveorupdate(@RequestBody Department department){
     return departmentservice.saveorupdate(department);
    }
    @GetMapping("/findByname/{departmentName}")
    public Department findByName( @PathVariable("departmentName") String  departmentName){
       return departmentservice.findByDepartmentName(departmentName);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Long departmentId){
        return departmentservice.deleteById(departmentId);
    }
    @DeleteMapping("/deleteAll")
    public String deleteall(){
      departmentservice.deleteAll();
      return "deleted all successfully";
    }
    }
