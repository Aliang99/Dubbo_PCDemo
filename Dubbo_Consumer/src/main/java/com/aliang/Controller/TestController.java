package com.aliang.Controller;

import com.aliang.Service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("t1")
    @ResponseBody
    public String Test(String name){
        String result = testService.test(name);
        System.out.println(result);
        return result;
    }
}
