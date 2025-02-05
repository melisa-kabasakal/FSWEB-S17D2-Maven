package com.workintech.s17d2.model;

public class SeniorDeveloper extends Developer{
    public SeniorDeveloper(int id, String name, Double salary) {
        super(id, name, salary, Experience.SENIOR);
    }
}
