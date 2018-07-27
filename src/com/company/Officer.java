package com.company;

public class Officer extends CrewMember{

    private String rank;

    public Officer(String name, int age, String rank) {
        super(name, age);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
