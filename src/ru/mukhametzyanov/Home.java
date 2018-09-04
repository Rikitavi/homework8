package ru.mukhametzyanov;

import java.util.Arrays;

public class Home {
    private int homeNumber;
    private String homeAddress;
    private Resident[] residentList;

    public Home(int homeNumber, String homeAddress) {
        this.homeNumber = homeNumber;
        this.homeAddress = homeAddress;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Resident[] getResidentList() {
        return residentList;
    }

    public void setResidentList(Resident[] residentList) {
        this.residentList = residentList;
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeNumber=" + homeNumber +
                ", homeAddress='" + homeAddress + '\'' +
                ", residentList=" + Arrays.toString(residentList) +
                '}';
    }
}
