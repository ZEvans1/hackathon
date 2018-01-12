package models;

import java.util.ArrayList;

public class Team {
    private String name;
    private String description;
    private String member;
    private ArrayList<String> memberList;
    private static ArrayList<Team> instances = new ArrayList<>();



    public Team(String name, String description, String member) {
        this.name = name;
        this.description = description;
        this.member = member;
        //this.memberList.add(this.member);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMember() {
        return member;
    }

    public static ArrayList<Team> getAll() {
        return instances;
    }
}
