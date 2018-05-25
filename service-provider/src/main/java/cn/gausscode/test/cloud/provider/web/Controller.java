/*
 * File: Controller.java
 * Created By: jinlong.hao@gausscode.com
 * Date: 2018-04-25
 */

package cn.gausscode.test.cloud.provider.web;

import cn.gausscode.test.cloud.provider.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@RestController
public class Controller {
    static Logger logger = LoggerFactory.getLogger(Controller.class);

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public Map test(){
        Map map = new HashMap();
        map.put("port", port);
        logger.debug("map", map);
        return map;
    }

    @GetMapping("/health")
    public Map health() {
        Map map = new HashMap();
        map.put("status", "UP");
        return map;
    }


    @GetMapping("/user")
    public List<User> list(){
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User("001", "user01"));
        list.add(new User("002", "user02"));
        list.add(new User("003", "user03"));
        list.add(new User("004", "user04"));
        list.add(new User("005", "user05"));
        list.add(new User("006", "user06"));
        return list;
    }


    @GetMapping("/user/{id}")
    public User get(@PathVariable("id") String id){
        for(User user : list()){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
