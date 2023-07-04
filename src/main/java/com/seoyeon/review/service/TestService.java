package com.seoyeon.review.service;

import com.seoyeon.review.model.TestEntity;
import com.seoyeon.review.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor // lombok을 이용해서 직접 생성자를 만들어줌
@Service
public class TestService {
    private final TestRepository testRepository;

    public void create(String name, Integer age){
        TestEntity testEntity = new TestEntity(name, age);
        testRepository.save(testEntity);
    }

    public void update(Long id, String name, Integer age){
        TestEntity testEntity = testRepository.findById(id).orElseThrow(); // 이전에 저장한 데이터
        testEntity.changeNameAndAge(name, age); // 이름과 나이를 바꿔주는 메서드
        testRepository.save(testEntity);
    }

    public void delete(Long id){
        TestEntity testEntity = testRepository.findById(id).get();
        testRepository.delete(testEntity);
    }

    public List<TestEntity> findAllByNameByJPA(String name){
        return testRepository.findAllByName(name);
    }

    public List<TestEntity> findAllByNameByQuerydsl(String name){
        return testRepository.findAllByNameByQuerydsl(name);
    }
}
