package ru.mukhametzyanov;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Resident resident = new Resident("Петр", "Петров", Entrance.FIRST, 1,Ipoteka.VTB);
        Resident resident1 = new Resident("Василий", "Васильев", Entrance.FIRST, 2,Ipoteka.SBERBANK);
        Resident resident2 = new Resident("Алексей", "Алексеев", Entrance.SECOND, 1,Ipoteka.SBERBANK);
        Resident resident3 = new Resident("Иван", "Иванов", Entrance.SECOND, 2,Ipoteka.VTB);
        resident.setPersonalAccount(1);
        resident1.setPersonalAccount(12);
        resident2.setPersonalAccount(123);
        resident3.setPersonalAccount(1234);


        Home home = new Home(10, "Королева");
        Home home1 = new Home(20, "Комарова");


        home.setResidentList(new Resident[]{resident, resident1});
        home1.setResidentList(new Resident[]{resident2, resident3});

        ManagmentCompany MC = new ManagmentCompany("Сувар", "ул. Гоголя 1");
        MC.setHomeList(new Home[]{home, home1});

        System.out.println(resident);
        System.out.println(home);
        System.out.println(MC);

        System.out.println("Введие новый номер Личного счета: ");
        Scanner scanner = new Scanner(System.in);
        int pA;
        pA = scanner.nextInt();
        if (pA >0){
        resident.setPersonalAccount(pA);}

        System.out.println(resident);

    }
}
