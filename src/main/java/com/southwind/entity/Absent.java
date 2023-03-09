package com.southwind.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2022-09-12
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Absent implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Integer buildingId;

    private Integer dormitoryId;

    private Integer studentId;

    private Integer dormitoryAdminId;

    private String createDate;

    private String reason;


}
