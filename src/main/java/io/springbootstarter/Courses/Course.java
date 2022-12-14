package io.springbootstarter.Courses;

import io.springbootstarter.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    private  String id;
    private  String name;
    private  String discription;
    @ManyToOne
    private Topic topic;
    public Course(){

    }

    public Course(String id, String name, String discription,String topicId){
        this.id=id;
        this.name=name;
        this.discription=discription;
        this.topic =  new Topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
