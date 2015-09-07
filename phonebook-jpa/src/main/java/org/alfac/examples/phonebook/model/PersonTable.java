package org.alfac.examples.phonebook.model;

/**
 * @author ivan.
 */
public final class PersonTable {

    public static final String TABLE_NAME = "person";

    public static final String ID_GENERATOR_NAME = "Person.tableGenerator";

    public static class ColumnName {
        public static final String ID = "personid";

        public static final String FIRST_NAME = "firstname";

        public static final String MIDDLE_NAME = "middlename";

        public static final String LAST_NAME = "lastname";

        public static final String BIRTHDAY = "birthday";
    }

    public static class ColumnLength {

        public static final int FIRST_NAME = 100;

        public static final int MIDDLE_NAME = 100;

        public static final int LAST_NAME = 100;
    }

    private PersonTable() {
    }
}
