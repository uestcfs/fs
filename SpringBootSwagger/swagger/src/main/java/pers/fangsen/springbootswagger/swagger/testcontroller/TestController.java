package pers.fangsen.springbootswagger.swagger.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping ("/test")
    public void  test() {
        System.out.println("test");
    }
}
