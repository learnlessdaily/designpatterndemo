package com.rolex.desingpatterndemo.builder;

import com.rolex.desingpatterndemo.builder.model.Employee;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BuilderService {

    public List<Employee> getEmployess(){
        Employee.Builder employee1 = new Employee.Builder();
        Employee e1 = employee1.setAge(25).setDepartment("MCA").setName("SACHIN").build();
        Employee e2 = employee1.setAge(35).setDepartment("BCA").setName("DRAVID").build();
        List<Employee> list = new LinkedList<>();
        list.add(e1);
        list.add(e2);
        return  list;

    }
}
