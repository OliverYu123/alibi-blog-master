package com.tan.servcie;

import com.tan.pojo.IndexInfoVO;

import java.util.List;

/**
 * @author TWH
 * @date 2022/7/12 12:33
 */
public interface BlogService {
    /**
     * 查询首页文章内容
     * @return 文章数据列表
     */
    List<IndexInfoVO> getBlogList();

    /**
     * 查询首页标签
     * @return 标签数据列表
     */
    List<String> getTags();

    /**
     * 查询文章总篇数
     * */
    Integer getContentCount();
}
