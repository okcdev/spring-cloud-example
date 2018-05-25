/*
 * File: User.java
 * Created By: jinlong.hao@gausscode.com
 * Date: 2018-04-25
 */

package cn.gausscode.test.cloud.provider.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class User {
    static Logger logger = LoggerFactory.getLogger(User.class);

    private String id;

    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
