# 使用说明

## 编译代码

使用mvn进行打包
~~~ bash
mvn package
~~~

## 发布

### 配置

修改本机的hostname，实现将service-discovery1、service-discovery2均解析到本机
(127.0.0.1)

~~~
127.0.0.1  localhost service-discovery1 service-discovery2
~~~

### 发布
将service-consumer/discovery/provider编译后的jar包分别发布到deploy对应的目录中

>其中discovery、provider均为两个，用于支持负载均衡和高HA

## 执行

1. 启动两个discovery
2. 启动两个provider
3. 启动consumer

## 访问

1. localhost:8761/8762，是服务的监控地址
2. localhost:8088/test，是服务的测试地址
3. 可测试停止和启动provider和discover，分别进行服务的测试