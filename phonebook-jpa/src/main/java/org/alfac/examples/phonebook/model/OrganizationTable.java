package org.alfac.examples.phonebook.model;

/**
 * @author ivan.
 */
public final class OrganizationTable {

    public static final String TABLE_NAME = "organization";

    public static final String ID_GENERATOR_NAME = "Organization.tableGenerator";

    public static class ColumnName {
        public static final String ID = "personid";

        public static final String NAME = "firstname";

        public static final String ACRONYM = "middlename";

        public static final String FOUNDATION_DAY = "birthday";
    }

    public static class ColumnLength {

        public static final int NAME = 100;

        public static final int ACRONYM = 30;
    }

    private OrganizationTable() {
    }
}
