package com.company;

public class Main {

    public static void main(String[] args) {

        Account Amr = new Account("211013176" ,"Amr",200  );
        Account Ammar = new Account("2110000","Ammar",150);
        System.out.println(Amr);
        System.out.println(Ammar);

        System.out.println("Amr's Balance after credit: "+Amr.credit(500));

        System.out.println("Ammar's Balance after debit: "+Ammar.debit(50));

        Amr.transferTo(Ammar , 500);
        System.out.println("Ammar's balance after transfer= " + Ammar.getBalance());

    }
}
