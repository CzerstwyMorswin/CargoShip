package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShipTest {

    Ship titsnic;
    String name;
    List<CrewMember> listCrewMembers;
    int maximumNumbersOfCrewMembers;
    CrewMember officer;

    @Before
    public void setUp() {
        name = "Titanic";
        listCrewMembers = new ArrayList<>();
        maximumNumbersOfCrewMembers = 30;
        titsnic = new Ship(name, maximumNumbersOfCrewMembers);
        officer = new Officer("Jacek", 5, "Kapitan");
    }

    @Test
    public void getTheCurrentNumberOfCrewMembersReturnProperNumber() {

        titsnic.AddCrewMember(officer);
        assertEquals(titsnic.GetTheCurrentNumberOfCrewMembers(), 1);
    }

    @Test
    public void getNameReturnProperName() {
        assertEquals(titsnic.getName(), name);
    }

    @Test
    public void getListCrewMembersReturnProperStructure() {
        assertEquals(titsnic.getListCrewMembers(), listCrewMembers);
    }

    @Test
    public void getMaximumNumbersOfCrewMembersReturnProperNumber() {
        assertEquals(titsnic.getMaximumNumbersOfCrewMembers(), maximumNumbersOfCrewMembers);
    }

    @Test
    public void getNumberOfSpacesAvaiableReturnProperNumber() {
        titsnic.AddCrewMember(officer);
        assertEquals(titsnic.GetNumberOfSpacesAvaiable(), 29);
    }

    @Test
    public void addCrewMemberAddCrewMember() {
        titsnic.AddCrewMember(officer);
        assertEquals(titsnic.getListCrewMembers().get(0), officer);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeCrewMemberRemoveCrewMember() {
        titsnic.AddCrewMember(officer);
        titsnic.RemoveCrewMember(officer);
        titsnic.getListCrewMembers().get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorThrowsIllegalArgumentExceptionIfMaximumNumbersOfCrewMemberssLessThan0() {
        Ship ship = new Ship(name, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addCrewMemberThrowsIllegalArgumentExceptionIfListOfCrewMembersIsNull() {
        Ship ship = new Ship(name, -1);
    }



}