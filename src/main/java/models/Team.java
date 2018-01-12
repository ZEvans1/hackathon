package models;

import java.util.ArrayList;

public class Team {
    private String name;
    private String description;
    private String member;
    private String newMember;
    private ArrayList<String> memberList;
    private static ArrayList<Team> instances = new ArrayList<>();



    public Team(String name, String description, String member, ArrayList<String> memberList) {
        this.name = name;
        this.description = description;
        this.member = member;
        this.memberList = memberList;
        memberList.add(member);
        instances.add(this);

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

    public String getNewMember() {
        return newMember;
    }

    public ArrayList<String> getMemberList() {
        return memberList;
    }

    public static ArrayList<Team> getAll() {
        return instances;
    }
}
