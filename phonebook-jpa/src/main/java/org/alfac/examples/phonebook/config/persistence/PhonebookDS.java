package org.alfac.examples.phonebook.config.persistence;

import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.inject.Named;
import javax.sql.DataSource;

/**
 * @author ivan.
 */
@DataSourceDefinition(
        name = "java:app/jdbc/phonebookDS",
        transactional = true,
        url = "jdbc:hsqldb:mem:phonebookDS",
        className = "org.hsqldb.jdbcDriver",
        user = "sa",
        password = ""
)
@Named
public class PhonebookDS {

    @Resource(lookup = "java:app/jdbc/phonebookDS")
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }
}
