/*
 * File: ServiceClient.java
 * Created By: jinlong.hao@gausscode.com
 * Date: 2018-04-25
 */
package cn.gausscode.test.cloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jinlong.hao
 */
@FeignClient(value = "SERVICE-PROVIDER", fallback = FallBackServiceClient.class)
public interface ServiceClient {

    @GetMapping(value = "/test")
    public String test();

    @GetMapping(value = "/user")
    public String list();

    @GetMapping(value = "/user/{id}")
    public String get(@PathVariable("id") String id);
}


