package com.sparta.w4.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FanMemoRepository extends JpaRepository<FanMemo, Long> {
    List<FanMemo> findAllByOrderByModifiedAtDesc();
}

