package com.yifan.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BrowserCommandRunner implements CommandLineRunner {
    @Value("${spring.web.loginurl}")
    private String loginUrl;

    @Value("${spring.web.googleexecute}")
    private String googleExePath;

    @Value("${spring.auto.openurl}")
    private boolean isOpen;

    @Override
    public void run(String... args) throws Exception {
        if (isOpen) {
            String cmd = googleExePath + " " + loginUrl;
            Runtime run = Runtime.getRuntime();
            try {
                run.exec("open http://localhost:8080/swagger-ui.html");
                System.out.println("启动浏览器打开项目成功!");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

    }
}