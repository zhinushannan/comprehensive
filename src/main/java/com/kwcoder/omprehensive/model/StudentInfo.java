package com.kwcoder.omprehensive.model;

import lombok.Data;

/**
 * @author zhinushannan
 * @date 2021/2/5
 * @description 注：属性命名必须满足小驼峰，否则easyexcel将无法正常解析属性
 */
@Data
public class StudentInfo {

    private String no;

    private String sno;

    private String name;

    private String mail;

}
