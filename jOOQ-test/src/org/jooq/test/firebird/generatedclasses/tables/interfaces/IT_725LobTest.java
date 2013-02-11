/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_725_LOB_TEST")
public interface IT_725LobTest extends java.io.Serializable {

	/**
	 * Setter for <code>T_725_LOB_TEST.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>T_725_LOB_TEST.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId();

	/**
	 * Setter for <code>T_725_LOB_TEST.LOB</code>. 
	 */
	public void setLob(byte[] value);

	/**
	 * Getter for <code>T_725_LOB_TEST.LOB</code>. 
	 */
	@javax.persistence.Column(name = "LOB", length = 8)
	public byte[] getLob();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_725LobTest
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_725LobTest from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_725LobTest
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_725LobTest> E into(E into);
}
