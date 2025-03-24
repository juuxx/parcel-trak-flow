package org.example.parcel.infrastructure.kafka.producer;

import org.example.parcel.infrastructure.config.KafkaConfig;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ParcelEventProducer {
	private final KafkaTemplate<String, String> kafkaTemplate;

	public void send(String key, String message) {
		kafkaTemplate.send(KafkaConfig.TOPIC_NAME, key, message);
	}
}
