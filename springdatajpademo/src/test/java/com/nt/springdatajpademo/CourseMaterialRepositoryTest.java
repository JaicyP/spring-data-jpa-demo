package com.nt.springdatajpademo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.springdatajpademo.entity.Course;
import com.nt.springdatajpademo.entity.CourseMaterial;
import com.nt.springdatajpademo.repository.CourseMaterialRepository;

@SpringBootTest
public class CourseMaterialRepositoryTest {
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	@Test
	public void registerCourseMaterial() {
		
		Course course=Course.builder()
				      .title("AI")
				      .credit(5)
				      .build();
		CourseMaterial courseMaterial=CourseMaterial.builder()
				                      .url("www.dailybuffer.com")
				                      .course(course)
				                      .build();
		
		courseMaterialRepository.save(courseMaterial);
	}
	
	@Test
	public void printCourseMaterial() {
		
		List<CourseMaterial> cm=courseMaterialRepository.findAll();
		System.out.println(cm);
	}
	
	@Test
	public void printCourse() {
		Course c=courseMaterialRepository.getCourseFromcourseMaterial(2);
		System.out.println("The course is"+c);
	}

}
