package com.catt.eomsteam.lsdown.master.app.lsst;

import com.catt.eomsteam.lsdown.base.running.RunningService;
import org.springframework.stereotype.Component;

@Component
public class LsstRunningService implements RunningService {
  @Override
  public void start() {
    System.out.println("666");
  }
}
