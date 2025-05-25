package com.rams.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rams.service.entity.UserTestEntity;
@Repository
public interface UserTestRepository extends JpaRepository<UserTestEntity,Long> {

}
