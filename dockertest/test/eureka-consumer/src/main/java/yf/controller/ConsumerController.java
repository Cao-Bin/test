package yf.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oo on 16-7-28.
 */
@RestController
@RefreshScope
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;
    @Autowired
    Environment env;

    @Value("${test:nothing}")
    private String test;


    @ApiOperation(value = "/add",notes = "求和为30")
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(11,22);
    }


    @RequestMapping(value = "/")
    public String test(){
        return test+"\t---\t"+env.getProperty("info.description","info.description");
    }
}
