package io.springbootstarter.Courses;

import io.springbootstarter.topic.Topic;
import io.springbootstarter.topic.Topic_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Course_Controller {

@Autowired
    private Course_Service course_service;

@RequestMapping("/topics/{id}/courses")
public List<Course> getAllCourses(@PathVariable String id){
  return course_service.getAllCourses(id);
}
@RequestMapping("/topics/{id}/courses/{id}")
public Optional<Course> getCourse(@PathVariable String id){
    return course_service.getCourse(id);
}
@RequestMapping(method = RequestMethod.POST,value = "/topics/{topicId}/courses")
public  void addCourse(@RequestBody Course course,@PathVariable String topicId){
    course.setTopic(new Topic(topicId, "", ""));
course_service.addCourse(course);
}
@RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicId}/courses/{id}")
public  void UpdateCourses(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
    course.setTopic(new Topic(topicId, "",""));
    course_service.UpdateCourse(course);
}

//@RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
//public void deleteTopic(@PathVariable String id){
//      course_service.deleteTopic(id);
//    }
}
