package com.example.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.pool.HikariProxyConnection;

import oracle.jdbc.OracleConnection;

/**
 * ConnectionUtils
 */
public class ConnectionUtils {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public OracleConnection unWrapConnection(Connection conn) throws SQLException {
        OracleConnection oracleConn = null;
        try {
            logger.info(conn.getMetaData().getDriverName());
            if (conn instanceof OracleConnection) {
                Connection connection = conn.getMetaData().getConnection();
                oracleConn = (OracleConnection) connection;
                logger.info("Oracle connection {}", oracleConn.getCatalog());
            } else if (conn instanceof HikariProxyConnection) {
                oracleConn = conn.unwrap(OracleConnection.class);
                logger.info("Oracle connection {}", oracleConn.getCatalog());
            }
            logger.info("Get oracle connection from datasource {}", conn.getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return oracleConn;
    }
}