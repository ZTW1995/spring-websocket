package com.spring.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * <p>项目名称：spring-websocket</p>
 * <p>类名：com.spring.websocket.App</p>
 * <p>创建时间: 2022-11-07 10:29 </p>
 * <p>修改时间: 2022-11-07 10:29 </p>
 *
 * @author zhang.taowei
 * @version 1.0.0
 */
@SpringBootApplication
@EnableWebSocket
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
