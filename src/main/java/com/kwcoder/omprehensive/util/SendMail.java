package com.kwcoder.omprehensive.util;

import com.sun.net.ssl.internal.ssl.Provider;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.Security;
import java.util.Properties;

/**
 * @author zhinushannan
 * @date 2021/2/5
 * @description
 */
public class SendMail {


    public String sendMail(String address, String subject, String content) {
        try {
            // 设置SSL连接、邮件环境
            Security.addProvider(new Provider());
            final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
            Properties props = System.getProperties();
//            props.setProperty("mail.smtp.host", "smtp.qq.com");
            props.setProperty("mail.smtp.host", "smtp.126.com");
            props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.setProperty("mail.smtp.socketFactory.fallback", "false");
            props.setProperty("mail.smtp.port", "465");
            props.setProperty("mail.smtp.socketFactory.port", "465");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication("1377875184@qq.com", "uawaaiagshspgaif"); // 账户 授权码
                    return new PasswordAuthentication("example@XXX.com", "pwd"); // 账户 授权码
                }
            });

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("example@XXX.com"));
            message.setRecipients(Message.RecipientType.TO, address);
            message.setSubject(subject);
            message.setContent(content, "text/html;charset=UTF-8");
            message.saveChanges();
            Transport.send(message);
            return "200 预发送给" + address + "的邮件，标题为" + subject + "，内容为" + content + "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "400 预发送给" + address + "的邮件，标题为" + subject + "，内容为" + content + "未发送成功";
        }
    }
}
