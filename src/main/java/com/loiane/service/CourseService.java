package com.loiane.service;

import java.util.List;

import com.loiane.model.Course;
import com.loiane.repository.CourseRepository;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

}
