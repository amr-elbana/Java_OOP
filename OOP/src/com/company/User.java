package com.company;

public class User {


    public User(String name, String lastName, String membership) {
        this.name = name;
        this.lastName = lastName;
        this.membership = membership;
    }

    String name;
    String lastName;
    String membership;


/*    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
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

    public void setMembership(Membership membership){
            this.membership=membership.name();
    }
    public enum Membership {
        Bronze , Silver , Gold;
    }
*/
}
