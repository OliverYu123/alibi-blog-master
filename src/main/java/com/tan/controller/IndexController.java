package com.tan.controller;

import com.tan.controller.rest.ObjectResponse;
import com.tan.pojo.IndexInfoVO;
import com.tan.servcie.BlogService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author TWH
 * @date 2022/7/15 9:11
 */
@RestController
@Slf4j
public class IndexController {
    @Resource
    BlogService blogService;

    @GetMapping("/getContent")
    @ApiOperation(value = "获取首页文章内容",notes = "进入首页时获取文章内容",httpMethod = "GET",produces= "application/json")
    public ResponseEntity<?> getContent(){
        log.info("获取首页文章内容");
        List<IndexInfoVO> blogList;
        try {
            blogList = blogService.getBlogList();
            log.info("获取到的数据为:{}",blogList);
            return new ResponseEntity<>(new ObjectResponse<>().ok(blogList), HttpStatus.OK);
        } catch (Exception e) {
            log.error("获取文章失败{}",e.getMessage());
            return new ResponseEntity<>(new ObjectResponse<>().fail(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getTags")
    @ApiOperation(value = "获取首页标签",notes = "进入首页时获取标签",httpMethod = "GET",produces= "application/json")
    public ResponseEntity<?> getTags(){
        log.info("获取首页标签");
        List<String> tags;
        try {
            tags = blogService.getTags();
            log.info("{}",tags);
            return new ResponseEntity<>(new ObjectResponse<>().ok(tags),HttpStatus.OK);
        } catch (Exception e) {
           log.error(e.getMessage());
           return new ResponseEntity<>(new ObjectResponse<>().fail(e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getContentCount")
    @ApiOperation(value = "获取文章总数",notes = "进入首页时获取文章总数",httpMethod = "GET",produces = "application/json")
    public Integer getContentCount(){
        log.info("获取文章总数");
        Integer count = 0;
        try {
            count = blogService.getContentCount();
            log.info("获取文章总数为:{}",count);
            return count;
        } catch (Exception e) {
            log.error(e.getMessage());
            return count;
        }
    }
}
