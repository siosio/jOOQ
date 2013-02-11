/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_785")
public interface IT_785 extends java.io.Serializable {

	/**
	 * Setter for <code>T_785.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>T_785.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", length = 4)
	public java.lang.Integer getId();

	/**
	 * Setter for <code>T_785.NAME</code>. 
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>T_785.NAME</code>. 
	 */
	@javax.persistence.Column(name = "NAME", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getName();

	/**
	 * Setter for <code>T_785.VALUE</code>. 
	 */
	public void setValue(java.lang.String value);

	/**
	 * Getter for <code>T_785.VALUE</code>. 
	 */
	@javax.persistence.Column(name = "VALUE", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getValue();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_785
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_785 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_785
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_785> E into(E into);
}
