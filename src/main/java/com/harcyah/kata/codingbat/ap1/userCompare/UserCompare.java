package com.harcyah.kata.codingbat.ap1.userCompare;

public class UserCompare {

    public int userCompare(String username1, int id1, String username2, int id2) {
        int usernameCompare = username1.compareTo(username2);
        if (usernameCompare < 0) {
            return -1;
        }
        if (usernameCompare > 0) {
            return 1;
        }

        int idCompare = Integer.compare(id1, id2);
        if (idCompare < 0) {
            return -1;
        }
        if (idCompare > 0) {
            return 1;
        }

        return 0;
    }

}
