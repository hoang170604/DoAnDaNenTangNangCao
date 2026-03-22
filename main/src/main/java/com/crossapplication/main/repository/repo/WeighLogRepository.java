package com.crossapplication.main.repository.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crossapplication.main.entity.WeighLog;

@Repository
public interface WeighLogRepository extends JpaRepository<WeighLog, Integer>{
    
    List<WeighLog> findByUserIdOrderByDateAsc(int userId);

    List<WeighLog> findByUserIdAndDateBetweenOrderByDateAsc(
            int userId,
            LocalDate startDate,
            LocalDate endDate
    );

    WeighLog findByUserIdAndDate(int userId, LocalDate date);

    WeighLog findTopByUserIdOrderByDateDesc(int userId);

    void deleteByUserId(int userId);
}
