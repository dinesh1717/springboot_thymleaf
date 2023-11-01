package com.thymleaf.thymleaf.controller;


import com.thymleaf.thymleaf.dao.EmployeeRepo;
import com.thymleaf.thymleaf.entity.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;
    @GetMapping("/emp/")
    public String showEmp(Model model)
    {
        List<EmployeeModel>list = employeeRepo.findAll();
        model.addAttribute("list",list);
        return "index";
    }

    @PostMapping("/emp/save/")
    public String saveEmp(EmployeeModel employeeModel)
    {
        employeeRepo.save(employeeModel);
        return "redirect:/emp/";
    }
    @DeleteMapping("/emp/delete/{id}/")
    public String deleteEmp(@PathVariable Long id)
    {
        employeeRepo.deleteById(id);
        return "redirect:/emp/";
    }
}
