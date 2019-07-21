package com.tw.apistackbase.model;
import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CriminalCase {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "caseTime", nullable = false)
    private long caseTime;

    @Column(name = "caseName", nullable = false)
    private String caseName;

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private Procuratorate procuratorate;



    @OneToOne(cascade = CascadeType.ALL)
    private CaseInformation caseInformation;


    public CriminalCase() {
    }

    public CriminalCase(String caseName, long caseTime,CaseInformation caseInformation) {
        this.caseName = caseName;
        this.caseTime = caseTime;
        this.caseInformation=caseInformation;
    }

    public CriminalCase(String caseName, long caseTime, CaseInformation caseInformation, @NotNull Procuratorate procuratorate) {
        this.caseName = caseName;
        this.caseTime = caseTime;
        this.caseInformation = caseInformation;
        this.procuratorate = procuratorate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(long caseTime) {
        this.caseTime = caseTime;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public CaseInformation getCaseInformation() {
        return caseInformation;
    }

    public void setCaseInformation(CaseInformation caseInformation) {
        this.caseInformation = caseInformation;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }

}
