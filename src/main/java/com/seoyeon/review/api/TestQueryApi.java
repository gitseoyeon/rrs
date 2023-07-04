package com.seoyeon.review.api;

import com.seoyeon.review.model.TestEntity;
import com.seoyeon.review.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestQueryApi {
    private final TestService testService;

    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa(@RequestParam("name") String name){
        return testService.findAllByNameByJPA("seoyeon");
    }

    @GetMapping("/test/query/querydsl")
    public List<TestEntity> queryQuerydsl(){
        return testService.findAllByNameByQuerydsl("seoyeon");
    }
}
