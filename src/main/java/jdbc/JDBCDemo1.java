package jdbc;


import java.sql.*;

public class JDBCDemo1 {

    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.jdbc.Driver"); jdbc3以后可以省略不写
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8",
                    "root",
                    "123456");
            String sql = "select * from city where id = 2467";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id") + "  " +resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
