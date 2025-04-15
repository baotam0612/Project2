package com.javaweb.repository.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<BuildingEntity> findAll(BuildingSearchBuilder buildingSearchBuilder) {
        String sql = "FROM BuildingEntity b";
        Query query = entityManager.createQuery(sql, BuildingEntity.class);
        return query.getResultList();
    }
}
