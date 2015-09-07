package org.alfac.examples.phonebook.model;

/**
 * @author ivan.
 */
public final class UserTable {

    public static final String TABLE_NAME = "user";

    public static final String ID_GENERATOR_NAME = "User.tableGenerator";

    public static class ColumnName {
        public static final String ID = "userid";

        public static final String USER_NAME = "username";

        public static final String PASSWORD = "password";
    }

    public static class ColumnLength {
        public static final int USER_NAME = 200;

        public static final int PASSWORD = 200;
    }

    private UserTable() {
    }
}
