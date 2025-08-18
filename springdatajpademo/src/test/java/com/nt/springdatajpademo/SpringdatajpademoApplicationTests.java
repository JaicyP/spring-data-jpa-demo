package com.nt.springdatajpademo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.springdatajpademo.entity.Guardian;
import com.nt.springdatajpademo.entity.Student;
import com.nt.springdatajpademo.repository.StudentRepository;

@SpringBootTest
class SpringdatajpademoApplicationTests {
	@Autowired
    private StudentRepository studentRepository;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void saveStudent() {
//	  Student student=Student
//			  .builder()
//			  .firstName("Shivam")
//			  .lastName("Nadar")
//			  .emailId("shivamnadar@example.com")
//			  .guardianName("Nikhil")
//			  .guardianEmail("Nikhil@example.com")
//			  .guardianMobile("9999999999")
//			  .build();
//	 
//      studentRepository.save(student);
	}
	
	@Test
	public void printStudents() {
		List<Student> student=studentRepository.findAll();
		System.out.println(student);
	}
	
	@Test
	public void saveStudentWithGuardian() {
//		Guardian guardian=Guardian.builder()
//				      .email("rajamonypankiraj@example.com")
//				      .name("Pankiraj")
//				      .mobile("9856784590")
//				      .build();
//		Student student=Student.builder()
//				        .emailId("ryanpankiraj@example.com")
//				        .firstName("Ryan")
//				        .lastName("Pankiraj")
//				        .guardian(guardian)
//				        .build();
//		studentRepository.save(student);
//				        
	}
	
	@Test
	public void printStudentByFirstName() {
		List<Student> list=studentRepository.findByFirstName("Jaicy");
		System.out.println(list);
	}
	
	@Test
	public void printStudentByFirstNameContaining() {
		List<Student> list=studentRepository.findByFirstNameContaining("a");
		for(Student s:list) {
			System.out.println();
			System.out.println(s);
			System.out.println();
		}
	}
	
	@Test
	public void printStudentByLastNameNotNull() {
		List<Student> list=studentRepository.findByLastNameNotNull();
		System.out.println(list);
	}
	
	@Test
	public void printStudentByGuardianName() {
		List<Student> list =studentRepository.findByGuardianName("Nikhil");
		System.out.println(list);
	}
	
	@Test
	public void printStudentCount() {
		long num=studentRepository.count();
		System.out.println(num);
	}
	
	
	
	

}
