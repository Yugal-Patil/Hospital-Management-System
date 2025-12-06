package com.hospitalmanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalJpa extends JpaRepository<Hospital, Integer>
{
	
}
