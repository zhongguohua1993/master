package com.catt.eomsteam.lsdown.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@EnableScheduling
@Service
public class TestSenderService {
  @Autowired private StringRedisTemplate stringRedisTemplate;

  // 向redis消息队列index通道发布消息
  @Scheduled(fixedRate = 3000)
  public void sendMessage() {
    stringRedisTemplate.convertAndSend("index", String.valueOf(Math.random()));
  }
}
