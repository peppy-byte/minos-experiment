package com.peppy.auth.controller;

import com.peppy.auth.feign.AccountFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录接口
 *
 * @author liu.gang
 */
@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    /**
     * account服务
     */
    private final AccountFeignClient accountService;

    /**
     * 通过账号获取信息
     *
     * @param account 账号
     */
    @GetMapping("/get")
    public String getAccount(@RequestParam("account") String account) {
        return accountService.getAccount(account);
    }
}
