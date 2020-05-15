package com.github.mercy.txlcn.tm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TransactionManagerApplication
 *
 * @author Ryan
 * @version 1.0
 * @date 2020-05-16 00:07
 */
@SpringBootApplication
@EnableTransactionManagerServer
public class TransactionManagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(TransactionManagerApplication.class, args);
    }
}
