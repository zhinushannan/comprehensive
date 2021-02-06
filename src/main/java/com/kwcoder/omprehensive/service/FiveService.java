package com.kwcoder.omprehensive.service;

import com.kwcoder.omprehensive.model.Five;

/**
 * @author zhinushannan
 * @date 2021/2/5
 * @description
 */
public class FiveService {

    public String getContent(Five five) {
        return five.getName() + "同学，你的第三项扣分记录如下：" +
                "<br>第三扣分项为：扣分" + five.getScore() + "分，原因是" + five.getReason() +
                "。<br>" +
                "<br>第一扣分项为：宿舍未达标，宿舍成员每人减5分；违反宿舍管理有关规定，每人减1分；夜不归宿者每次减5分；使用违章电器，每次减3分。";
    }

}
