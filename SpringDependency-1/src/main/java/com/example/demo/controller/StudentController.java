package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {

	private final StudentService studentService;
	
	 public StudentController( @Autowired StudentService studentService )
	    {
	        this.studentService = studentService;
	       
	        studentService.add(new Student("5171", 1, "SaiKiran", "Sitha", "India", "Chaman", new Date(2000, 3, 29)));
	    }

	 @GetMapping( "/student/{id}" )
	    Student findById( @PathVariable( "id" ) String id )
	    {
	        return studentService.findById( id );
	    }
	    
	   
	    @GetMapping("/map")
	    public List<Student> getAllStudents() {
	        System.out.println("Using map configuration");
	        return studentService.all();
	    }
}
