package yf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oo on 16-7-28.
 */
@RestController
@RefreshScope
public class BusController {

    @Value("${test:nothing}")
    private String test;

    @RequestMapping(value = "/")
    public String test(){
        return test;
    }
}
