package ru.mukhametzyanov;

public class Resident extends Person {
    private int personalAccount;

    public Resident(String name, String lastName, Entrance entrance, int flat, Ipoteka ipoteka) {
        super(name, lastName, entrance, flat, ipoteka);
    }

    public int getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(int personalAccount) {
        this.personalAccount = personalAccount;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "personalAccount=" + personalAccount +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", entrance=" + entrance +
                ", flat=" + flat +
                ", ipoteka=" + ipoteka +
                '}';
    }
}
