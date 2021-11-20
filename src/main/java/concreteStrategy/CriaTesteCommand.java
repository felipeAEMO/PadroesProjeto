package concreteStrategy;

import java.sql.SQLException;
import java.sql.Statement;

import strategy.Command;

public class CriaTesteCommand extends Command {

	/**
	 * @author Felipe Augusto
	 * @param statement
	 * @param sql
	 * @see CriaTesteCommand
	 * @see SQLException
	 * @throws CriaTesteCommand
	 * @exception SQLException
	 * 
	 */
	public String executar(Statement statement, String sql) throws SQLException {
		CriarTabela cria = new CriarTabela();
		return cria.executar(statement, "CREATE TABLE TESTE (ID INT PRIMARY KEY, NAME VARCAHAR(50))");
	}

}
