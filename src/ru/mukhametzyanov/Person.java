package ru.mukhametzyanov;

public class Person {
    protected String name;
    protected String lastName;
    protected Entrance entrance;
    protected int flat;
    protected Ipoteka ipoteka;

    public Person() {
    }

    public Person(String name, String lastName, Entrance entrance, int flat, Ipoteka ipoteka) {
        this.name = name;
        this.lastName = lastName;
        this.entrance = entrance;
        this.flat = flat;
        this.ipoteka = ipoteka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Entrance getEntrance() {
        return entrance;
    }

    public void setEntrance(Entrance entrance) {
        this.entrance = entrance;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public Ipoteka getIpoteka() {
        return ipoteka;
    }

    public void setIpoteka(Ipoteka ipoteka) {
        this.ipoteka = ipoteka;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", entrance=" + entrance +
                ", flat=" + flat +
                ", ipoteka=" + ipoteka +
                '}';
    }
}
