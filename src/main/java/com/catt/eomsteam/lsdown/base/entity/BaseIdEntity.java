package com.catt.eomsteam.lsdown.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.stereotype.Repository;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019-05-31
 */
@Repository
public class BaseIdEntity {

  /** id */
  @TableId(type = IdType.ID_WORKER)
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
