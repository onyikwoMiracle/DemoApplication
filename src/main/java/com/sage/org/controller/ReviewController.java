package com.sage.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewController {
	
	@GetMapping("/get")
	@ResponseBody
	public String getStudents() {
		return "GET request was sent";
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addStudents() {
		return "POST request was sent";
	}
	
	@PutMapping("/update")
	@ResponseBody
	public String updateStudents(@RequestParam("id") Long stud_id, @RequestParam("name") String stud_name) {
		return "PUT request was sent for id: " + stud_id + "and name: " + stud_name;
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public String deleteStudents(@PathVariable("id") Long stud_id) {
		return "DELETE request was sent for id: " + stud_id;
	}
	
}
