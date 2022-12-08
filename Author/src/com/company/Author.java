package com.company;

public class Author {
    public Author(String name, String email, boolean isMale) {
        this.name = name;
        this.email = email;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isMale=" + isMale +
                '}';
    }

    private String name;

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMale() {
        return isMale;
    }

    private boolean isMale;


}
