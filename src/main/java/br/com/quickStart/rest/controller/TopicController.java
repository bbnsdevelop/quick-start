package br.com.quickStart.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.quickStart.entities.Topic;
import br.com.quickStart.rest.request.TopicRequest;
import br.com.quickStart.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		
		return topicService.getAll();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id) {
		return topicService.getTopic(id);
	}
	
	// aula 19 minuto 4:13
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public ResponseEntity<?> addTopic(@RequestBody TopicRequest topic){
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
