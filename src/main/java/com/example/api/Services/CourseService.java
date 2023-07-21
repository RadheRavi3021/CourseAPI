package com.example.api.Services;

import com.example.api.Entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();
    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    void deleteCourse(long parseLong);
}
