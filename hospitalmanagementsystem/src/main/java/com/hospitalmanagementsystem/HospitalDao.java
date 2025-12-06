package com.hospitalmanagementsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalDao 
{
	@Autowired
	HospitalJpa jpa;
	
	public Hospital saveHospital(Hospital h)
	{
		return jpa.save(h);
	}
	
	public List<Hospital> FindAll()
	{
		return jpa.findAll();
	}
	
	public Hospital FindById(int id)
	{
		return jpa.findById(id).orElse(null);
	}
	
	public boolean Remove(int id)
	{
		if (jpa.existsById(id))
		{
			return true;
		}
		
		return false;
	}
}
