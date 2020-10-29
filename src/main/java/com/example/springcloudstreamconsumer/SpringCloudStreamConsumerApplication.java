package com.example.springcloudstreamconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudStreamConsumerApplication {

private Logger logger= LoggerFactory.getLogger(SpringCloudStreamConsumerApplication.class);

@StreamListener("input")
public void ConsumeMessage(Book book)
{
    logger.info("consume Payload "+book);
}


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
    }

}
