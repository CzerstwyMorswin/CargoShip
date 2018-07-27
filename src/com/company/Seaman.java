package com.company;

public class Seaman extends CrewMember {

    private String jobDescription;

    public Seaman(String name, int age, String jobDescription) {
        super(name, age);
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }
}
