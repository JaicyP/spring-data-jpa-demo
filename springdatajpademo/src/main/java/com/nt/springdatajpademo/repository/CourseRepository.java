package com.nt.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.springdatajpademo.dto.CourseTitleUrlDto;
import com.nt.springdatajpademo.entity.Course;
import com.nt.springdatajpademo.entity.CourseMaterial;

public interface CourseRepository extends JpaRepository<Course,Integer> {
	
	@Query("select c.courseMaterial from Course c where courseId=:id")
	CourseMaterial getCourseMaterialFromCourse(@Param("id") long i);
	
	@Query("select new com.nt.springdatajpademo.dto.CourseTitleUrlDto"
			+ "(c.title,c.courseMaterial.url) from Course c where c.courseId=:id")
	CourseTitleUrlDto getCourseTitleAndUrl(@Param("id") long id);
	
	

}
