package com.example.gradleAdminApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gradleAdminApi.model.entity.GoodsKey;

@Repository
public interface GoodsKeyRepository extends JpaRepository<GoodsKey, Long> {
}
