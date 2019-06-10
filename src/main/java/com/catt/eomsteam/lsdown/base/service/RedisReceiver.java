package com.catt.eomsteam.lsdown.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RedisReceiver {
  private Logger logger = LoggerFactory.getLogger(RedisReceiver.class);
  private int counter = 0;

  public void receiveMessage(String message) {
    counter++;
    logger.info(counter + "消息来了：" + message);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 这里是收到通道的消息之后执行的方法
  }
}
