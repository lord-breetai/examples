package org.alfac.examples.phonebook.model;

import javax.persistence.*;

/**
 * @author ivan.
 */
@TableGenerator(
        name = UserTable.ID_GENERATOR_NAME,
        pkColumnValue = UserTable.TABLE_NAME,
        table = SequenceTable.TABLE_NAME,
        pkColumnName = SequenceTable.PK_COLUMN_NAME,
        valueColumnName = SequenceTable.VALUE_COLUMN_NAME,
        allocationSize = SequenceTable.ALLOCATION_SIZE)

@Entity
@Table(name = UserTable.TABLE_NAME)
public class User {

    @Id
    @Column(name = UserTable.ColumnName.ID, nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = UserTable.ID_GENERATOR_NAME)
    private Long id;

    @Column(name = UserTable.ColumnName.USER_NAME, length = UserTable.ColumnLength.USER_NAME, nullable = false)
    private String username;

    @Column(name = UserTable.ColumnName.PASSWORD, length = UserTable.ColumnLength.PASSWORD, nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
