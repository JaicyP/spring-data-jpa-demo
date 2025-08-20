package com.nt.springdatajpademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.springdatajpademo.entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student,Long> {
	
	List<Student> findByFirstName(String firstName);
	
	List<Student> findByFirstNameContaining(String name);
	
	List<Student> findByLastNameNotNull();
	
	List<Student> findByGuardianName(String guardianName);
	
	@Query("select s from Student s where s.emailId=?1")
	Student getStudentByEmail(String emailId);
	
	@Query("select s.firstName from Student s where s.emailId=?1")
	String getStudentNameByEmail(String emailId);
	
	@Query(value="select first_name from student where email_id=?1",nativeQuery=true)
	String getStudentNameByEmailNative(String emailId);
	
	@Query(value="select first_name from student where email_id=:email",nativeQuery=true)
	String getStudentNameByEmailNativeNamedQuery(@Param("email") String emailId);
	
	@Transactional
	@Modifying
	@Query(value="update student set first_name='Jane' where student_id=:studentId",nativeQuery=true)
	int updateStudent(int studentId);
}
