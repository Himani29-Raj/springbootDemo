package io.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class Topic_Service {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("spring","Spring Framework","Spring Framework Discription"),
                new Topic("java","Core Java","Core Java Discription"),
                new Topic("JavaScript","JavaScript","JavaScript Discription")
        ));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public Optional<Topic>getTopic(String id){
       return topicRepository.findById(id);

    }
    public void addTopic(Topic topic){
    topicRepository.save(topic);
    }
    public void UpdateTopic(String id,Topic topic){
        topicRepository.save(topic);
    }
//    public void deleteTopic(Topic topic) {
//        topicRepository.delete(topic);
//    }
}
