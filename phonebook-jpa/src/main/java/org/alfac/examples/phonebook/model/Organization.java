package org.alfac.examples.phonebook.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ivan.
 */
@TableGenerator(
        name = OrganizationTable.ID_GENERATOR_NAME,
        pkColumnValue = OrganizationTable.TABLE_NAME,
        table = SequenceTable.TABLE_NAME,
        pkColumnName = SequenceTable.PK_COLUMN_NAME,
        valueColumnName = SequenceTable.VALUE_COLUMN_NAME,
        allocationSize = SequenceTable.ALLOCATION_SIZE)
@Entity
@Table(name = OrganizationTable.TABLE_NAME)
public class Organization {

    @Id
    @Column(name = OrganizationTable.ColumnName.ID, nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = OrganizationTable.ID_GENERATOR_NAME)
    private Long id;

    @Column(name = OrganizationTable.ColumnName.NAME, length = OrganizationTable.ColumnLength.NAME, nullable = false)
    private String name;

    @Column(name = OrganizationTable.ColumnName.ACRONYM, length = OrganizationTable.ColumnLength.ACRONYM, nullable = true)
    private String acronym;

    @Temporal(TemporalType.DATE)
    @Column(name = OrganizationTable.ColumnName.FOUNDATION_DAY)
    private Date foundationDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public Date getFoundationDay() {
        return foundationDay;
    }

    public void setFoundationDay(Date foundationDay) {
        this.foundationDay = foundationDay;
    }
}
