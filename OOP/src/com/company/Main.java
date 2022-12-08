package com.company;

public class Main {

    public static void main(String[] args) {

    User amr = new User();


    amr.setName("Amr");
    amr.setLastName("Elbana");
    amr.setMembership(User.Membership.Gold);
    System.out.println(amr.getName() + " " +  amr.getLastName() + " " + amr.getMembership());


    }
}
