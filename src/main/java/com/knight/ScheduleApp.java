package com.knight;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class ScheduleApp
{
    public static void main( String[] args ) throws InterruptedException, SQLException, IOException, XMLParserException, InvalidConfigurationException {
        SpringApplication.run(ScheduleApp.class,args);
//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
//        //指向逆向工程配置文件，只需要把下面这个文件改为你自己写的配置文件即可
//        File configFile = new File("E:\\Code\\ScheduleCollection\\src\\main\\resources\\MybatisGenerator.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate(null);
    }

}
