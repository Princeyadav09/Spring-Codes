package com.database;

import com.generatedclass.User;

import java.util.ArrayList;
import java.util.List;

public class TempDB {

    public static List<User> getUserFromTempDb() {
        return new ArrayList<User>() {
            {
                add(User.newBuilder().setName("prince").setEmail("princekumaryadav09@gmail.com").build());
            }
        };
    }
}
