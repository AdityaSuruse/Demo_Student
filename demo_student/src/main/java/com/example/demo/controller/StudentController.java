package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Studentt;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	

	@GetMapping("display")
	public List<Studentt> displayStudentts(){
		return ss.display();
	}
	
	@PostMapping("add")
	public void addStudentt(Studentt s) {
		ss.add(s);
	}
	
	
	
	
}
