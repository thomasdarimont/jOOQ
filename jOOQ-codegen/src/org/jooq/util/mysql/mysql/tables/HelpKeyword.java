/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;


/**
 * This class is generated by jOOQ.
 *
 * help keywords
 */
public class HelpKeyword extends TableImpl {

	private static final long serialVersionUID = -5637501498101737793L;

	/**
	 * The singleton instance of help_keyword
	 */
	public static final HelpKeyword HELP_KEYWORD = new HelpKeyword();

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> HELP_KEYWORD_ID = new TableFieldImpl<Integer>("help_keyword_id", Integer.class, HELP_KEYWORD);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> NAME = new TableFieldImpl<String>("name", String.class, HELP_KEYWORD);

	/**
	 * No further instances allowed
	 */
	private HelpKeyword() {
		super("help_keyword", Mysql.MYSQL);
	}
}
