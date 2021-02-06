package com.kwcoder.omprehensive;

import com.kwcoder.omprehensive.model.Five;
import com.kwcoder.omprehensive.model.Score;
import com.kwcoder.omprehensive.service.FiveService;
import com.kwcoder.omprehensive.service.ScoreService;
import com.kwcoder.omprehensive.util.ExcelReader;
import com.kwcoder.omprehensive.util.SendMail;

import java.util.List;

/**
 * @author zhinushannan
 * @date 2021/2/5
 * @description
 */
public class Omprehensive {

    static ScoreService scoreService = new ScoreService();

    static FiveService fiveService = new FiveService();

//    final static String filePath = "2020-2021-1学期成绩.xlsx";

//    final static String filePath = "第五扣分项.xlsx";

    final static String filePath = "第三扣分项.xlsx";

    public static void main(String[] args) {
        List<Five> objects = new ExcelReader<Five>().getStudent(filePath, Five.class, 1);
        for (Five object : objects) {
            String s = new SendMail().sendMail(object.getEmail(), "第三扣分项", fiveService.getContent(object));
            System.out.println(s);
        }
//        String s = new SendMail().sendMail(objects.get(31).getEmail(), "第三扣分项", fiveService.getContent(objects.get(31)));
//        System.out.println(s);

    }

}
