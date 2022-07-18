package com.tan.servcie.impl;

import com.tan.mapper.BlogMapper;
import com.tan.pojo.IndexInfoVO;
import com.tan.servcie.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author TWH
 * @date 2022/7/15 11:00
 */

@Service
public class BlogServiceImpl implements BlogService {
    @Resource
    BlogMapper blogMapper;

    @Override
    public List<IndexInfoVO> getBlogList() {
        return blogMapper.getContent();
    }

    @Override
    public List<String> getTags() {
        return blogMapper.getTags();
    }

    @Override
    public Integer getContentCount() {
        return blogMapper.getContentCount();
    }
}
