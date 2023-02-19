package com.aishatmoshood.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Bean
    public NewTopic electionTopic(){
        return TopicBuilder.name(topicName)
                .build();
    }

    @Bean
    public NewTopic electionJsonTopic(){
        return TopicBuilder.name("election_json ")
                .build();
    }
}
