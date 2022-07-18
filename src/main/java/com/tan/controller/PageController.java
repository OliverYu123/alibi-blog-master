package com.tan.controller;

import com.tan.common.ReturnPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author TWH
 * @date 2022/7/12 9:08
 */
@Controller
public class PageController {

    @GetMapping("/index")
    public String index(){
        return ReturnPage.INDEX;
    }

    
    @GetMapping("/login")
    public String login(){
        return ReturnPage.LOGIN;
    }
}
