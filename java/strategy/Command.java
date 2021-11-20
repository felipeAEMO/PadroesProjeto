package strategy;

import java.sql.SQLException;
import java.sql.Statement;

public abstract class Command {
	/**
	 * 
	 * @param statement
	 * @param sql
	 * @see SQLException
	 * @return
	 * @exception Command
	 * @throws SQLException
	 * 
	 */
	public abstract String executar(Statement statement, String sql) throws SQLException;
}
