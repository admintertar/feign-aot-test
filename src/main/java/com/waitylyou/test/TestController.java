package com.waitylyou.test;

import com.waitylyou.test.feign.TestFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    private final TestFeign testFeign;

    public TestController(TestFeign testFeign) {
        this.testFeign = testFeign;
    }

    @GetMapping("/test")
    public String test(){
        return "s";
    }

}
