package com.example.controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.ConnectionUtils;

import oracle.jdbc.OracleConnection;

@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DataSource datasource;

    @GetMapping("/ping")
    public ResponseEntity<String> demo() {

        logger.info("----------------{}---------------", logger.getClass().getName());
        System.out.println("+++++++++++++++SystemPrint+++++++++++++++");

        return ResponseEntity.ok("pong");
    }

    @GetMapping("/getConnFromJboss")
    public ResponseEntity<String> getConnectionFromJboss() throws SQLException {
        ConnectionUtils utils = new ConnectionUtils();
        logger.info("Get conneciton from spring datasource:");
        OracleConnection oracleConn = utils.unWrapConnection(datasource.getConnection());

        Context ctx = null;
        DataSource ds = null;
        try {
            ctx = new InitialContext();
            Object datasourceRef = ctx.lookup("java:jboss/hmmsDS");
            ds = (DataSource) datasourceRef;
            if (ds != null) {
                logger.info("Get connection from jboss datasource: ");

                Connection connection = ds.getConnection();
                oracleConn = utils.unWrapConnection(connection);
            }
        } catch (Exception e) {
            // e.printStackTrace();
            logger.error("JNDI {} not found", "java:jboss/hmmsDS");
        } finally {
            if (oracleConn != null) {
                oracleConn.close();
            }
        }
        return ResponseEntity.ok("Success");
    }
}
