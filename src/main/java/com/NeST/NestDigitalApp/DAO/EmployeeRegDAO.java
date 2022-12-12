package com.NeST.NestDigitalApp.DAO;

import com.NeST.NestDigitalApp.Model.EmployeeRegModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRegDAO extends CrudRepository<EmployeeRegModel, Integer> {
}
