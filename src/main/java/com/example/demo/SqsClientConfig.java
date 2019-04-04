package com.example.demo;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SqsClientConfig {

    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(final AmazonSQSAsync sqsClient) {
        return new QueueMessagingTemplate(sqsClient);
    }

}
