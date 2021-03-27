package com.sda.orders.orders.controller;
import com.sda.orders.orders.Service.StudentList;
import com.sda.orders.orders.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class HelloWorldController {

    StudentList studentList=new StudentList();
    private static Logger LOG = LoggerFactory
            .getLogger(HelloWorldController.class);

    @GetMapping("student")
    public List<Student> getStudent() {


//        return Student.builder()
//                .name("Brand")
//                .surname("test")
//                .birthDate(new Date())
//                .email("test@gmail.com").build();
        return studentList.studentList();
    }


    @GetMapping("receivePayment")
    public Integer getMessagge(@RequestParam Integer number1,@RequestParam Integer number2){
        return number1+ number2;
    }

}
