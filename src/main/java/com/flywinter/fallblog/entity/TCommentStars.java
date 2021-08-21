package com.flywinter.fallblog.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxkfall
 * @since 2021-08-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TCommentStars extends Model<TCommentStars> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String commentId;

    private String email;

    private String ip;

    /**
     * 1状态,1为可用,0为不可用
     */
    private Integer status;

    private Long version;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
