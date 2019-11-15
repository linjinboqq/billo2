package com.mengxuegu.springboot;

import org.apache.tomcat.util.http.MimeHeaders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot12MailApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;


    @Test
    public void simplemail() {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setSubject("放假通知");
        simpleMailMessage.setText("内容");
        simpleMailMessage.setFrom("243536237@qq.com");
        simpleMailMessage.setTo("2361090469@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

    @Test
    public void fuzamail()throws  Exception {
       MimeMessage message =javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message,true);
        mimeMessageHelper.setSubject("放假通知");
        //发送html
        mimeMessageHelper.setText("<h2 style='color:red'>内容<h2>",true);
        //发送附件
        mimeMessageHelper.addAttachment("name.PNG",new File("D:\\"));

        mimeMessageHelper.setFrom("243536237@qq.com");
        mimeMessageHelper.setTo("2361090469@qq.com");
        javaMailSender.send(message);
    }
}
