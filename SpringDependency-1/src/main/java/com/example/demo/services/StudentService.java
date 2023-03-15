package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
         
	
	void add( Student student );

    void delete( Student student );

    List<Student> all();

    Student findById( String id );
}
