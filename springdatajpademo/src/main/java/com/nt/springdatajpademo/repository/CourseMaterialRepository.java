package com.nt.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.springdatajpademo.entity.Course;
import com.nt.springdatajpademo.entity.CourseMaterial;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
	
	@Query("select s.course from CourseMaterial s where s.courseMaterialId=:id")
	Course getCourseFromcourseMaterial(@Param("id") long id);

}
