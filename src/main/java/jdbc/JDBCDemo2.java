package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo2 {
    public static void main(String[] args) {

        Connection connection = JDBCUtil.getConnection();
        String sql = "update account set balance = ? where id = ?";
        try {
            //关闭自动提交
            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(2,2);
            preparedStatement.setInt(1,500);
            int i = preparedStatement.executeUpdate();
            connection.commit();
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
    }
}
