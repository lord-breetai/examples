package org.alfac.examples.notebook.model;

import org.apache.deltaspike.data.api.audit.CreatedOn;
import org.apache.deltaspike.data.api.audit.ModifiedOn;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ivan.
 */
@TableGenerator(
        name = PersonTable.ID_GENERATOR_NAME,
        pkColumnValue = PersonTable.TABLE_NAME,
        table = SequenceTable.TABLE_NAME,
        pkColumnName = SequenceTable.PK_COLUMN_NAME,
        valueColumnName = SequenceTable.VALUE_COLUMN_NAME,
        allocationSize = SequenceTable.ALLOCATION_SIZE)
@Entity
@Table(name = PersonTable.TABLE_NAME)
public class Person {

    @Id
    @Column(name = PersonTable.ColumnName.PERSON_ID, nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = PersonTable.ID_GENERATOR_NAME)
    private Long id;

    @Column(name = PersonTable.ColumnName.FIRST_NAME, length = PersonTable.ColumnLength.FIRST_NAME, nullable = false)
    private String firstName;

    @Column(name = PersonTable.ColumnName.MIDDLE_NAME, length = PersonTable.ColumnLength.MIDDLE_NAME)
    private String middleName;

    @Column(name = PersonTable.ColumnName.LAST_NAME, length = PersonTable.ColumnLength.LAST_NAME, nullable = false)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = PersonTable.ColumnName.BIRTHDAY)
    private Date birthday;

    @CreatedOn
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = PersonTable.ColumnName.CREATE_DATE, nullable = false, insertable = true, updatable = false)
    private Date createDate;

    @ModifiedOn
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = PersonTable.ColumnName.UPDATE_DATE)
    private Date updateDate;

    @Version
    @Column(name = PersonTable.ColumnName.VERSION, nullable = false)
    private Long version;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
