package ru.mukhametzyanov;

import java.util.Arrays;

public class ManagmentCompany {
    private String managmentName;
    private String companyAdress;
    private Home[] homeList;

    public ManagmentCompany(String managmentName, String companyAdress) {
        this.managmentName = managmentName;
        this.companyAdress = companyAdress;

    }

    public String getManagmentName() {
        return managmentName;
    }

    public void setManagmentName(String managmentName) {
        this.managmentName = managmentName;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public Home[] getHomeList() {
        return homeList;
    }

    public void setHomeList(Home[] homeList) {
        this.homeList = homeList;
    }

    @Override
    public String toString() {
        return "ManagmentCompany{" +
                "managmentName='" + managmentName + '\'' +
                ", companyAdress='" + companyAdress + '\'' +
                ", homeList=" + Arrays.toString(homeList) +
                '}';
    }
}
