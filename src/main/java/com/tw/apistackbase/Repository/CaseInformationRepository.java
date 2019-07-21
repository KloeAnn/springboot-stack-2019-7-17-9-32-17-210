package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.CaseInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CaseInformationRepository extends JpaRepository<CaseInformation,Long> {

}
