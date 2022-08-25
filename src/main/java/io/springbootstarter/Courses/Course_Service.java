package io.springbootstarter.Courses;

import io.springbootstarter.topic.Topic;
import io.springbootstarter.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class Course_Service {

    @Autowired
    private CourseRepository courseRepository;

//    private List<Course> courses = new ArrayList<Course>(Arrays.asList(
//                new Course("spring","Spring Framework","Spring Framework Discription"),
//                new Course("java","Core Java","Core Java Discription"),
//                new Course("JavaScript","JavaScript","JavaScript Discription")
//        ));

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }
    public Optional<Course>getCourse(String id){
       return courseRepository.findById(id);

    }
    public void addCourse(Course course){
    courseRepository.save(course);
    }
    public void UpdateCourse(Course course){
        courseRepository.save(course);
    }

//    public void deleteTopic(String id) {
//        courseRepository.delete(id);
//    }
}
