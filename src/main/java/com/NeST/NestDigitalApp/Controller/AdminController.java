package com.NeST.NestDigitalApp.Controller;

import com.NeST.NestDigitalApp.DAO.EmployeeRegDAO;
import com.NeST.NestDigitalApp.DAO.SecurityGuardDAO;
import com.NeST.NestDigitalApp.Model.EmployeeRegModel;
import com.NeST.NestDigitalApp.Model.SecurityGuardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AdminController {

    @Autowired
    public EmployeeRegDAO eDAO;
//    -------------------------------Employee registration--------------------------------------
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeReg", consumes = "application/json", produces = "application/json")
    HashMap<String, String> EmployeeReg(@RequestBody EmployeeRegModel e){
        HashMap<String, String> map = new HashMap<>();
        eDAO.save(e);
        map.put("status","success");
        return map;

    }
//    ------------------------------Security Guard Registration----------------------------------
    @Autowired
    public SecurityGuardDAO sDAO;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityReg", consumes = "application/json", produces = "application/json")
    HashMap<String, String> SecurityGuardReg(@RequestBody SecurityGuardModel s) {
        HashMap<String, String> map = new HashMap<>();
        sDAO.save(s);
        map.put("status", "success");
        return map;
    }

}


