package com.cafebabe.springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * sql行转换
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws SQLException;
}
