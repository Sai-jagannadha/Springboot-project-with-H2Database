package com.saideveloper.SpringbootprojectwithH2Database.service;

import com.saideveloper.SpringbootprojectwithH2Database.Entity.Department;
import com.saideveloper.SpringbootprojectwithH2Database.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class Departmentserviceimpl implements  Departmentservice{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department savedept(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchalldata() {

        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findById(Long departmentId) {
        return  departmentRepository.findById(departmentId);
    }

    @Override
    public Department saveorupdate(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findByDepartmentName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }

    @Override
    public String deleteById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
        return "deleted successfully";
    }

    @Override
    public void deleteAll() {
        departmentRepository.deleteAll();
    }

    /* @Override
    public Department updatedept(Department department, Long departmentId) {
       Department dept= departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName()))
        {dept.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode()))
        {dept.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress()))
        {dept.setDepartmentAddress(department.getDepartmentAddress());
        }
        return  departmentRepository.save(dept);
    }
*/

}
