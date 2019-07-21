package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CriminalCaseRepository extends JpaRepository<CriminalCase, Long> {
    List<CriminalCase> findAllByOrderByCaseTimeDesc();
    CriminalCase findCriminalCaseById(long id);
    List<CriminalCase> findAllByCaseName(String name);
    CriminalCase deleteById(long id);
}
