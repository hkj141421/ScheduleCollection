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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by forget on 2019/12/28.
 */
@Configuration
@MapperScan(basePackages = "com.knight.Dao.MusicSite",sqlSessionFactoryRef = "MusicSiteSqlSessionFactory")
public class MusicSiteDataSourceConfig {

    @Bean(name = "MusicSiteDataSource")
    @ConfigurationProperties("spring.datasource.musicsite")
    @Primary
    public DataSource setDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "MusicSiteSqlSessionFactory")
    @Primary
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("MusicSiteDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/com/knight/Mapper/MusicSite/*.xml"));
        return factoryBean.getObject();
    }

    @Bean(name = "MusicSiteSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("MusicSiteSqlSessionFactory") SqlSessionFactory factory) {
        return new SqlSessionTemplate(factory);
    }

}
