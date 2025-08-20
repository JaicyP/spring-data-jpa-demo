package com.nt.springdatajpademo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.springdatajpademo.dto.CourseTitleUrlDto;
import com.nt.springdatajpademo.entity.Course;
import com.nt.springdatajpademo.entity.CourseMaterial;
import com.nt.springdatajpademo.repository.CourseRepository;

@SpringBootTest
public class CourseRepositoryTest{
	@Autowired
	private CourseRepository courseRepository;
	
	@Test
	public void printCourseMaterial() {
		
		CourseMaterial cm=courseRepository.getCourseMaterialFromCourse(1);
		System.out.println("The courseMaterial is"+cm);
	}
	
	@Test
	public void printAllCourses() {
		List<Course> courses=courseRepository.findAll();
		for(Course c:courses) {
			System.out.println(c);
		}
	}
	
	@Test
	public void printCourseTitleUrl() {
		CourseTitleUrlDto ctud=courseRepository.getCourseTitleAndUrl(1);
		System.out.println(ctud);
	}

}
