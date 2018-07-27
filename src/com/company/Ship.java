package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ship {

    private String name;
    private List<CrewMember> listCrewMembers;
    private final int maximumNumbersOfCrewMembers;

    public Ship(String name, int maximumNumbersOfCrewMembers) {
        if(maximumNumbersOfCrewMembers < 0)
        {
            throw new IllegalArgumentException("wincyj");
        }
        this.name = name;
        this.maximumNumbersOfCrewMembers = maximumNumbersOfCrewMembers;
        listCrewMembers = new ArrayList<>();
    }

    public int GetTheCurrentNumberOfCrewMembers()
    {
        return listCrewMembers.size();
    }

    public String getName() {
        return name;
    }

    public List<CrewMember> getListCrewMembers() {
        return Collections.unmodifiableList(listCrewMembers);
    }

    public int getMaximumNumbersOfCrewMembers() {
        return maximumNumbersOfCrewMembers;
    }

    public int GetNumberOfSpacesAvaiable()
    {
        return maximumNumbersOfCrewMembers - GetTheCurrentNumberOfCrewMembers();
    }

    public void AddCrewMember(CrewMember crewMember)
    {
        if(crewMember.equals(null))
        {
            throw new IllegalArgumentException("Cannot add null values");
        }
        if(GetNumberOfSpacesAvaiable() <= 0)
        {
            throw new IllegalArgumentException("No space available");
        }
        listCrewMembers.add(crewMember);
    }

    public void RemoveCrewMember(CrewMember crewMember)
    {
        if(crewMember.equals(null))
        {
            throw new IllegalArgumentException("Cannot remove null values");
        }
        if(listCrewMembers.isEmpty()) {
            throw new RuntimeException("List of members is empty");
        }
        boolean removeSuccessful = listCrewMembers.remove(crewMember);
        if(!removeSuccessful)
        {
            throw new RuntimeException("List dont contain choosen crew member, remove unsuccessful");
        }
    }





}
