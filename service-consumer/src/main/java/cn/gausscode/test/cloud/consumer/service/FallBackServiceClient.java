/*
 * File: FallBackServiceClient.java
 * Created By: jinlong.hao@gausscode.com
 * Date: 2018-04-25
 */

package cn.gausscode.test.cloud.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author jinlong.hao
 */
@Component
public class FallBackServiceClient implements ServiceClient {
    static Logger logger = LoggerFactory.getLogger(FallBackServiceClient.class);

    @Override
    public String test() {
        return "fallback";
    }

    @Override
    public String list() {
        return "{}";
    }

    @Override
    public String get(String id) {
        return "[]";
    }
}
