package com.galoiszhou.springclould.controller;

import com.galoiszhou.springclould.entity.User;
import com.galoiszhou.springclould.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户详情", notes = "用户详情")
    @GetMapping("/{username}")
    public User getUer(@PathVariable("username") String username) {
        return userService.findUserByName(username);
    }
}
