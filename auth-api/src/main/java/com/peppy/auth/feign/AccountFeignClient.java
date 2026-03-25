package com.peppy.auth.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * platform模块account服务
 *
 * @author liu.gang
 */
@FeignClient(
        value = "platform-api",
        path = "/platform/account"
)
public interface AccountFeignClient {

    /**
     * 通过账号获取信息
     *
     * @param account 账号
     */
    @GetMapping("/get")
    String getAccount(@RequestParam("account") String account);

    /**
     * 1. httpclient 默认是jdk的http请求
     * 2. 降级
     * 3. 拦截器: 请求拦截器 响应拦截器 异常处理器
     * 4. 父子容器
     * <p>
     * dubbo: openfeign (rpc)
     * zookeeper: nacos (register)
     * gateway
     *
     */
}
