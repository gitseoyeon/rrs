package com.seoyeon.review.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.seoyeon.review.model.QTestEntity;
import com.seoyeon.review.model.TestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class TestRepositoryImpl implements TestRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public List<TestEntity> findAllByNameByQuerydsl(String name) {
        return queryFactory.selectFrom(QTestEntity.testEntity)
                .fetch();
    }
}
