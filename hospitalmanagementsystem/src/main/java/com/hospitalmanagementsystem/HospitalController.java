package com.hospitalmanagementsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController 
{
	@Autowired
	HospitalDao dao;
	
	@PostMapping("/save")
	public Hospital SAVE(@RequestBody Hospital h)
	{
		return dao.saveHospital(h);
	}
	
	@GetMapping("/findAll")
	public List<Hospital> Find()
	{
		return dao.FindAll();
	}
	
	@GetMapping("/findid/{id}")
	public Hospital FindId(@PathVariable int id)
	{
		return dao.FindById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteId(@PathVariable int id)
	{
		if (dao.Remove(id))
		{
			return "Hospital With" + id + "is Deleted";
		}
		
		return "Hospital With" + id + "is Not Found";
	}
}
