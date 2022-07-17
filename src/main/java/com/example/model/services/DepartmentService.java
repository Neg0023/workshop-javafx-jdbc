package com.example.model.services;

import com.example.model.dao.DaoFactory;
import com.example.model.dao.DepartmentDao;
import com.example.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
