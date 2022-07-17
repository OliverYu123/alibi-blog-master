package com.tan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author TWH
 * @date 2022/7/15 10:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexInfoVO {
    private String id;
    private String content;
    private Date createTime;
    private String firstPicture;
    private String title;
    private String managerName;
    private String tagName;
}
