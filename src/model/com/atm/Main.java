package model.com.atm;

import com.zaxxer.hikari.HikariDataSource;
import controller.AtmCntrl;

import javax.sql.DataSource;
import java.sql.*;

public class Main {
    private String username;
    private String password;

    public static void main(String[] args) {

        AtmCntrl atmCntrl = new AtmCntrl();

        DataSource dataSource = createDataSource();
        //establish database connection
        //url is always jdbc:
        //followed by the database (MySQL/Postgres/H2)
        //and finally the database connection string. for H2, I'm using mem. mem: is in-memory database.
        // ';' separates optional extensions
        try (Connection dbConnection = dataSource.getConnection())  {
            System.out.println("connection.isValid(0) = " + dbConnection.isValid(0));

            //CRUD

            //select
            PreparedStatement preparedStatement = dbConnection.prepareStatement("select * from USERS where firstName = ?");
            //set string has to include what's already in the database
            preparedStatement.setString(1, "Sarah");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("firstName"));
            }

            //inserts
            PreparedStatement insertPrepareStatement = dbConnection.prepareStatement("insert into USERS (firstName) values (?)");
            insertPrepareStatement.setString(1, "Johnny");
            int insertCount = insertPrepareStatement.executeUpdate();

            System.out.println("insertCount: " + insertCount);

            //updates
            PreparedStatement updatePrepareStatement = dbConnection.prepareStatement("update USERS set name = ? where firstName = ?");
            updatePrepareStatement.setString(1, "John");
            updatePrepareStatement.setString(2, "Johnny");
            int updateCount = updatePrepareStatement.executeUpdate();
            System.out.println("updateCount: " + updateCount);

            //deletes
            PreparedStatement deletePrepareStatement = dbConnection.prepareStatement("delete from USERS where firstName = ?");
            deletePrepareStatement.setString(1, "John");
            int deleteCount = deletePrepareStatement.executeUpdate();
            System.out.println("deleteCount: " + deleteCount);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static DataSource createDataSource() {
        //hikari is used for a db connection pool
        HikariDataSource ds = new HikariDataSource();
        //classpath had to start from 'model' instead of 'classpath:AccountDatabase.sql' since Hirakaricp could not find it
        ds.setJdbcUrl("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:model/resources/AccountDatabase.sql';");
        return ds;
        }
}