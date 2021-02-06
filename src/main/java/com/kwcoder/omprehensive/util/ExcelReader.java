package com.kwcoder.omprehensive.util;

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * @author zhinushannan
 * @date 2021/2/5
 * @description
 */
public class ExcelReader<T> {

    public List<T> getStudent(String fileName, Class clazz, Integer rowNum) {
        return EasyExcel.read("src/main/resources/" + fileName)
                .head(clazz)
                .sheet(0)
                .headRowNumber(rowNum)
                .doReadSync();
    }

}
