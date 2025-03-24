package org.example.parcel.infrastructure.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@EnableKafka
@Configuration
public class KafkaConfig {

	public static final String TOPIC_NAME = "parcel-events";

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name(TOPIC_NAME)
			.partitions(3)
			.replicas(1)
			.build();
	}
}


