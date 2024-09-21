package com.example.demo.mq;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author F190010
 * @date 2023/1/17
 */
@RestController("/test")
public class MqController {
    @RequestMapping("/test")
    public Object mq() throws IOException, TimeoutException {


        return "hello woeld";
    }
}
