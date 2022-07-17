package com.tan.mapper;

import com.tan.pojo.IndexInfoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TWH
 * @date 2022/7/12 12:33
 */
@Repository
public interface BlogMapper {
    /**
     * 查询文章内容
     * @return 文章列表
     */
    List<IndexInfoVO> getContent();
    /**
     * 查询首页标签
     * @return 标签数据列表
     */
    List<String> getTags();
    /**
     * 查询文章总篇数
     * @return 文章总数
     */
    Integer getContentCount();
}
