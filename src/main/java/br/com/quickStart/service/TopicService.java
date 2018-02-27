package br.com.quickStart.service;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import br.com.quickStart.entities.Topic;

@Service
public class TopicService {
	
	private static Logger logger = Logger.getLogger(TopicService.class);
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring frameWork", "Spring frameWork description"),
			new Topic("java", "java para web", "Java core description"),
			new Topic("javascript", "java script", "java script para web description")
			);

	public List<Topic> getAll(){
		logger.info("get all topics: " + "url /topics");
		return topics;
	}
	private Topic TopicBydId(String id) {
		
		logger.info("buscar topic pela id: " + id);
		return topics.stream().filter(t -> 
					t.getId().equals(id)).findFirst().get();
	}
	public Topic getTopic(String id) {
		return TopicBydId(id);
	}
}
