package com.cafebabe.springframework.jdbc.support;

import com.cafebabe.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;

public class JdbcAccessor implements InitializingBean {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    protected DataSource obtainDataSource() {
        return getDataSource();
    }
    @Override
    public void afterPropertiesSet(){
        if (null == getDataSource()) {
            throw new IllegalArgumentException("Property 'datasource' is required");
        }
    }
}
