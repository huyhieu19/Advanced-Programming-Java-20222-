package BaiTenLop_14_6;

import java.sql.*;

public class SimpleJdbc_sqlServer {
    public static void main(String[] args) {
        // Thông tin kết nối cơ sở dữ liệu
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=plantdb";
        String username = "sa";
        String password = "123456789";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Kết nối tới cơ sở dữ liệu
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Tạo câu truy vấn SQL
            String sqlQuery = "SELECT * FROM AspNetUsers";

            // Tạo đối tượng Statement
            statement = connection.createStatement();

            // Thực thi câu truy vấn
            resultSet = statement.executeQuery(sqlQuery);

            // Xử lý kết quả truy vấn
            while (resultSet.next()) {
                // Đọc dữ liệu từ các cột
                int id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);

                // Thực hiện xử lý dữ liệu
                System.out.println("ID: " + id + ", Name: " + firstName );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng kết nối và giải phóng tài nguyên
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
