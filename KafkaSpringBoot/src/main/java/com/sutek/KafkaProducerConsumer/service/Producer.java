package com.sutek.KafkaProducerConsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	public static final String topic = "mytopic";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void publishToTopic(String message) {
		System.out.println("Published to topic " + this.topic);
		this.kafkaTemplate.send(topic, message);
	}
}
