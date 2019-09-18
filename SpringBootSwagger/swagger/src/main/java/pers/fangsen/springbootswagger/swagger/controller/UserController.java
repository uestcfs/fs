package pers.fangsen.springbootswagger.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import pers.fangsen.springbootswagger.swagger.model.User;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口", description = "提供用户相关的REST API")
public class UserController {

    @ApiOperation("新增用户接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation("查询用户接口")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("更新用户接口")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return false;
    }

    @ApiIgnore
    @ApiOperation("删除用户接口")
    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
