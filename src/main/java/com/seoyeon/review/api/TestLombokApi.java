package com.seoyeon.review.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLombokApi {
    @GetMapping("/test/lombok")
    public TestLombokResponseBody testLombok(){
        return new TestLombokResponseBody("kim", 20);
    }

    @Getter
    @AllArgsConstructor // 생성자 만들 필요 없어짐
    public static class TestLombokResponseBody {
        String name;
        Integer age;
    }
}
