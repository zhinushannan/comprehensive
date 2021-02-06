package com.kwcoder.omprehensive.service;

import com.kwcoder.omprehensive.model.Score;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhinushannan
 * @date 2021/2/5
 * @description
 */
public class ScoreService {

    final Integer fileScore = 60;

    public String getContent(Score score) {


        List<String> fail = new ArrayList<String>();
        if (score.getInternet1() < fileScore) {
            fail.add("网络选修课1：" + score.getInternet1());
        }
        if (score.getInternet2() < fileScore) {
            fail.add("网络选修课2：" + score.getInternet2());
        }
        if (score.getPython() < fileScore) {
            fail.add("python程序设计：" + score.getPython());
        }
        if (score.getPsychology() < fileScore) {
            fail.add("大学生心理健康教育：" + score.getPsychology());
        }
        if (score.getEnglish() < fileScore) {
            fail.add("大学英语C：" + score.getEnglish());
        }
        if (score.getProbability() < fileScore) {
            fail.add("概率论与数理统计：" + score.getProbability());
        }
        if (score.getAlgorithm1() < fileScore) {
            fail.add("数据结构与算法（Java）：" + score.getAlgorithm1());
        }
        if (score.getAlgorithm2() < fileScore) {
            fail.add("数据结构与算法课程设计：" + score.getAlgorithm2());
        }
        if (score.getSql() < fileScore) {
            fail.add("数据库系统原理：" + score.getSql());
        }
        if (score.getPe() < fileScore) {
            fail.add("体育C：" + score.getPe());
        }
        if (score.getStatistics() < fileScore) {
            fail.add("统计学原理与统计实务：" + score.getStatistics());
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (fail.size() == 0) {
            stringBuilder.append("无");
        } else {
            for (String str : fail) {
                stringBuilder.append(str).append("\n");
            }
        }


        return score.getName() + "，你的成绩如下：" +
                "<br>网络选修课1：" + score.getInternet1() +
                "<br>网络选修课2：" + score.getInternet2() +
                "<br>python程序设计：" + score.getPython() +
                "<br>大学生心理健康教育：" + score.getPsychology() +
                "<br>大学英语C：" + score.getEnglish() +
                "<br>概率论与数理统计：" + score.getProbability() +
                "<br>数据结构与算法（Java）：" + score.getAlgorithm1() +
                "<br>数据结构与算法课程设计：" + score.getAlgorithm2() +
                "<br>数据库系统原理：" + score.getSql() +
                "<br>体育C：" + score.getPe() +
                "<br>统计学原理与统计实务：" + score.getStatistics() +
                "<br>您的总分是：" + score.getCount() +
                "<br><br>您的不及格科目是：" + stringBuilder +
                "<br>请核对您的成绩，如有误错误请及时联系班长！";
    }

}
