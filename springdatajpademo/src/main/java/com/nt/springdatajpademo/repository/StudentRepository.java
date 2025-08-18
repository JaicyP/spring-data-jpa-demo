package com.nt.springdatajpademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.springdatajpademo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
	
	List<Student> findByFirstName(String firstName);
	
	List<Student> findByFirstNameContaining(String name);
	
	List<Student> findByLastNameNotNull();
	
	List<Student> findByGuardianName(String guardianName);
}
