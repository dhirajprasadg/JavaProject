package corejava.jdbc;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlCon {

	public static void main(String[] args) throws Exception {

		System.out.println(" -----JDBC--------------");

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/newdb", "root", "password");

		Statement stm = con.createStatement();

		stm.executeUpdate("delete from emp99 where id=3");
		// stm.executeUpdate("insert into emp99 values(6,'Irfan',50000,'AST')");

		ResultSet rs = stm.executeQuery("Select * from emp99");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
					+ rs.getString(3) + "  " + rs.getString(4));

		}
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);

		ResultSet rs1 = stm.executeQuery("Select * from emp99");

		rs1.absolute(9);

		System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
				+ rs.getString(3) + "  " + rs.getString(4));

		con.close();
		System.out.println(con.isClosed());
	}

}
