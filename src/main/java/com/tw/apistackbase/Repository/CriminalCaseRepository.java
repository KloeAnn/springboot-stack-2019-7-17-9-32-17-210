package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface CriminalCaseRepository extends JpaRepository<CriminalCase, Long> {
}
