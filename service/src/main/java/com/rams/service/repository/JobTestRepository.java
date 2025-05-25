package com.rams.service.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rams.service.entity.JobTestEntity;
@Repository
public interface JobTestRepository extends JpaRepository<JobTestEntity, Long> {
    List<JobTestEntity> findByStartdateBetween(LocalDate start, LocalDate end);
    
}
