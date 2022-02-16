package com.example.demo;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listeners {

  @JmsListener(destination = "topic1", containerFactory = "pubSubFactory", subscription = "demo-topic1")
  public void addresses(Message message) {
  }

  @JmsListener(destination = "topic2", containerFactory = "pubSubFactory", subscription = "demo-topic2")
  public void persons(Message message) {
  }

}
