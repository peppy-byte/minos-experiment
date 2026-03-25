package com.peppy.platform.rbac;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账号控制器
 *
 * @author liu.gang
 */
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    /**
     * 通过账号获取信息
     *
     * @param account 账号
     */
    @GetMapping("/get")
    public String getAccount(@RequestParam("account") String account) {
        return "hello: ".concat(account);
    }
}
