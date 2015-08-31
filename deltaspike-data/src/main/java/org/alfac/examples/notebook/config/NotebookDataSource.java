package org.alfac.examples.notebook.config;

import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.inject.Named;
import javax.sql.DataSource;

/**
 * @author ivan.
 */
@DataSourceDefinition(
        name = "java:app/jdbc/notebookDS",
        transactional = true,
        url = "jdbc:hsqldb:mem:notebookDS",
        className = "org.hsqldb.jdbcDriver",
        user = "sa",
        password = ""
)
@Named
public class NotebookDataSource {

    @Resource(lookup = "java:app/jdbc/notebookDS")
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }
}
