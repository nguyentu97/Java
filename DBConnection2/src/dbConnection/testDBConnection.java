package dbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testDBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// Lấy ra đối tượng Connection kết nối vào database.
		Connection conn = DBConnection.getSQLServerConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "select TenK,DiaChi from KHACH";
		try {
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			System.out.println("TenK\t\tDiaChi");
			while (rs.next()) {

				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
