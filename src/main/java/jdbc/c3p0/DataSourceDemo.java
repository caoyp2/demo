package jdbc.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 数据库连接池
 * 1、C3P0：数据库连接池技术
 * 2、Druid: 数据库连接池实现技术，有阿里提供
 */
public class DataSourceDemo {

    public static void main(String[] args) {
        /**
         * c3p0连接池
         */
        DataSource  dataSource = new ComboPooledDataSource();
        Connection  connection = null;
        try {
            connection = dataSource.getConnection();
            String sql = "update account set balance = ? where id = ?";
            connection.prepareStatement(sql);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(2,2);
            preparedStatement.setInt(1,500);
            int i = preparedStatement.executeUpdate();
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
