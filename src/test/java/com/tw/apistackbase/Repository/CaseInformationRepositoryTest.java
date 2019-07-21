package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.CaseInformation;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class CaseInformationRepositoryTest {

    @Autowired
    CaseInformationRepository caseInformationRepository;

    List<CaseInformation> caseInformationList;

    @Before
    public void setUp() {
        caseInformationList = new ArrayList<>();
        caseInformationList.add(new CaseInformation("objective1", "subjective1"));
        caseInformationList.add(new CaseInformation("objective2", "subjective2"));
        caseInformationList.add(new CaseInformation("objective3", "subjective3"));
        caseInformationRepository.saveAll(caseInformationList);
    }

    @Test
    public void should_return_case_information_when_find_by_id() {
        CaseInformation caseInformation = caseInformationRepository.findById(Long.valueOf(1)).orElse(null);
        Assertions.assertEquals(caseInformation.getId(), 1);
    }

}