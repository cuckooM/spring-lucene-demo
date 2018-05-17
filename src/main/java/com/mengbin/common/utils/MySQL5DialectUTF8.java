package com.mengbin.common.utils;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * 数据库配置
 * @author mengbin
 */
public class MySQL5DialectUTF8 extends MySQL5InnoDBDialect {

    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}