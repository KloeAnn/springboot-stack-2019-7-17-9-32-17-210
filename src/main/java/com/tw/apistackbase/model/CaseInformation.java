package com.tw.apistackbase.model;


import javax.persistence.*;

@Entity
public class CaseInformation {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "objectiveDescript", nullable = false)
    private String objectiveDescript;

    @Column(name = "subjectiveDescript", nullable = false)
    private String subjectiveDescript;

    public CaseInformation() {
    }

    public CaseInformation(String objectiveDescript, String subjectiveDescript) {
        this.objectiveDescript = objectiveDescript;
        this.subjectiveDescript = subjectiveDescript;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObjectiveDescrip() {
        return objectiveDescript;
    }

    public void setObjectiveDescript(String objectiveDescript) {
        this.objectiveDescript = objectiveDescript;
    }

    public String getSubjectiveDescript() {
        return subjectiveDescript;
    }

    public void setSubjectiveDescript(String subjectiveDescript) {
        this.subjectiveDescript = subjectiveDescript;
    }
}
