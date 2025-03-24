package org.example.parcel.infrastructure.kafka.consumer;

import org.example.parcel.infrastructure.config.KafkaConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ParcelEventConsumer {
	@KafkaListener(topics = KafkaConfig.TOPIC_NAME, groupId = "parcel-group")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}
}
