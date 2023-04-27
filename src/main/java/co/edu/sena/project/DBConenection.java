package co.edu.sena.project;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConenection {
    private static final String URL =
            "jdbc:mysql://aws.connect.psdb.cloud/basedatos?sslMode=VERIFY_IDENTITY";
    private static final String USER = "j921ixw6k0afkyh5gkxv";
    private static final String PASS = "pscale_pw_THHYW8PbEVCsRi7XSc217inecBqvr55yKZZDGhYcCop";

    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
        }
      return  pool;

    } //Get para conectar la basa de datos
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
    }

