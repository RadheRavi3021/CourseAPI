package com.example.api.DAO;

import com.example.api.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
    // Entity and Entity Type (Primary key)
}
