package pl.sdacademy.java7krkr;

import java.util.Date;

public class Guest extends User {
   private Date loginTime;

    public Date getLoginTime() {
        return loginTime;
    }

    @Override
    void printMyRole() {
        System.out.println("jestem gposciem");

    }
}
