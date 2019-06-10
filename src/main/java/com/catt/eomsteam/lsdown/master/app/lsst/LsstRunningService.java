package com.catt.eomsteam.lsdown.master.app.lsst;

import com.catt.eomsteam.lsdown.base.running.IRunningService;
import org.springframework.stereotype.Component;

@Component
public class LsstRunningService implements IRunningService {
  @Override
  public void start() {
    System.out.println("666");
  }
}
