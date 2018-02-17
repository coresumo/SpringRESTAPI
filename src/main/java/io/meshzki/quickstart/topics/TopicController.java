package io.meshzki.quickstart.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private Topicservice topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> alltopic() {
		
		return topicservice.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}
	
	@RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicservice.updateTopic(id, topic);
	}
	
	@RequestMapping(method=org.springframework.web.bind.annotation.RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicservice.deleteTopic(id);
	}
	
	
	
	
	
	
	
	
	
}
