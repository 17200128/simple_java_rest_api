package com.ibsu.demo.Controlers;



import com.ibsu.demo.DTO.AddEditDepartment;
import com.ibsu.demo.Services.DepartmentService;
import com.ibsu.demo.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public List<Department> getAllDepartments() {
        return departmentService.getall();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public Department getDepartment(@PathVariable Long id) {
        return departmentService.getOne(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    public Department addDepartment(@RequestBody AddEditDepartment addEditDepartment) {
        return departmentService.addDepartment(addEditDepartment);
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    public Department editDepartment(@RequestBody AddEditDepartment addEditDepartment) throws Exception {
        return departmentService.editDepartment(addEditDepartment);
    }
}
