package com.knight.Config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by forget on 2019/12/28.
 */
@Configuration
@MapperScan(basePackages = "com.knight.Dao.Schedule",sqlSessionFactoryRef = "ScheduleSqlSessionFactory" )
public class ScheduleDataSourceConfig {

    @Bean(name="ScheduleDataSource")
    @ConfigurationProperties("spring.datasource.schedule")
    public DataSource setDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name="ScheduleSqlSessionFactory")
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("ScheduleDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/com/knight/Mapper/Schedule/*.xml"));
        return factory.getObject();
    }
    @Bean(name = "ScheduleSqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("ScheduleSqlSessionFactory") SqlSessionFactory factory){
        return new SqlSessionTemplate(factory);
    }
}
