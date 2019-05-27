package com.assignment2.group4.Controller;


import com.assignment2.group4.DAO.PatientDAO;
import com.assignment2.group4.Entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    PatientDAO patientDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String doGet(){
        return "index.html";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String doPost(){
        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet(Model model){
        List<Patient> list = patientDAO.getAllPatient();
        model.addAttribute("list", list);
        return "Patient.html";
    }
}
