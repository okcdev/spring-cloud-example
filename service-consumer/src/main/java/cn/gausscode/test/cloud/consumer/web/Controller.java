/*
 * File: Controller.java
 * Created By: jinlong.hao@gausscode.com
 * Date: 2018-04-25
 */

package cn.gausscode.test.cloud.consumer.web;

import cn.gausscode.test.cloud.consumer.service.ServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@RestController
public class Controller {
    static Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    ServiceClient serviceClient;

    @GetMapping("/test")
    public String test(){
        return serviceClient.test();
    }

    @GetMapping("/health")
    public Map health() {
        Map map = new HashMap();
        map.put("status", "UP");
        return map;
    }
    @GetMapping("/user")
    public String list(){
        return serviceClient.list();
    }

    @GetMapping("/user/{id}")
    public String get(@PathVariable("id") String id){
        return serviceClient.get(id);
    }
}
