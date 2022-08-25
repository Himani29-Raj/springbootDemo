package io.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Topic_Controller {

@Autowired
    private Topic_Service topic_service;

@RequestMapping("/topics")
public List<Topic> getAllTopics(){
  return topic_service.getAllTopics();
}
@RequestMapping("/topics/{id}")
public Optional<Topic> getTopic(@PathVariable String id){
    return topic_service.getTopic(id);
}
@RequestMapping(method = RequestMethod.POST,value = "/topics")
public  void addTopics(@RequestBody Topic topic){
topic_service.addTopic(topic);
}
@RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
public  void UpdateTopics(@RequestBody Topic topic,@PathVariable String id){
    topic_service.UpdateTopic(id,topic);
}
//@RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
//public void deleteTopic(@PathVariable String id,Topic topic){
//      topic_service.deleteTopic(topic);
//    }
}
