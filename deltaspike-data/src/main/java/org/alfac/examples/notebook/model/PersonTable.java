package org.alfac.examples.notebook.model;

/**
 * @author ivan.
 */
public final class PersonTable {

    public static final String TABLE_NAME = "person";

    public static final String ID_GENERATOR_NAME = "Person.tableGenerator";

    public static class ColumnName {
        public static final String PERSON_ID = "personid";

        public static final String FIRST_NAME = "firstname";

        public static final String MIDDLE_NAME = "middlename";

        public static final String LAST_NAME = "lastname";

        public static final String BIRTHDAY = "birthday";

        public static final String BIRTH_COUNTRY_ID = "birthcountryid";

        public static final String CREATE_DATE = "createdate";

        public static final String UPDATE_DATE = "updatedate";

        public static final String VERSION = "version";
    }

    public static class ColumnLength {

        public static final int FIRST_NAME = 100;

        public static final int MIDDLE_NAME = 100;

        public static final int LAST_NAME = 100;
    }
}
