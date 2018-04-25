package com.example.controllers;

import groovy.sql.Sql;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by weidaogang on 18/4/25.
 */
@Controller
public class HomeController {
    Logger logger= LoggerFactory.getLogger(HomeController.class);
    @Autowired
    DataSource dataSource;

//    @RequestMapping("/3")
//    String index(Model model) throws SQLException {
//
//        Sql sql=new Sql(dataSource);
//        logger.info("dataSource:${((HikariDataSource)dataSource).jdbcUrl}");
//        Map map=new HashMap<>();
//        Map ret=sql.firstRow("select * from user_info;");
//        logger.info("map:${ret}");
//        map.putAll(ret);
//        model.addAttribute("user",map);
//
//        return "index";
//    }
    @RequestMapping("/users3")
    String index2(Model model) throws SQLException {

        Sql sql=new Sql(dataSource);
        logger.info("dataSource:${((HikariDataSource)dataSource).jdbcUrl}");
        Map map=new HashMap<>();
        Map ret=sql.firstRow("select * from user_info;");
        logger.info("map:${ret}");
        map.putAll(ret);
        model.addAttribute("user",map);

        return "index";
    }
}
