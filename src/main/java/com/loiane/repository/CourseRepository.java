package com.loiane.repository;

import com.loiane.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query("UPDATE Course C SET C.name = :NAME, C.category = :CATEGORY WHERE C.id = :ID")
    Course update(@Param("NAME") String name, @Param("CATEGORY") String category, @Param("ID") Long id);
}
