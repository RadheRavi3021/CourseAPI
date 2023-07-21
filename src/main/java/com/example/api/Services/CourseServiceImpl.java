package com.example.api.Services;

import com.example.api.DAO.CourseDao;
import com.example.api.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

//    List<Course> list;

    @Autowired
    private CourseDao courseDao;
    public CourseServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(145,"Java","Spring"));
//        list.add(new Course(146,"C++","DSA"));
    }

    @Override
    public List<Course> getCourses() {
//        return list;

        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

//        Course course = null;
//        for (Course c:list) {
//            if(c.getId() == courseId){
//                course = c;
//                break;
//            }
//        }
//        return course;

       return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;

       return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(
//                e -> {
//                    if (e.getId() == course.getId()){
//                        e.setTitle(course.getTitle());
//                        e.setDescription(course.getDescription());
//                    }
//                }
//        );
//        return course;

        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(long parseLong) {
//        list = this.list.stream().filter(e -> e.getId() != parseLong)
//                .collect(Collectors.toList());

        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }
}
