package com.spring.websocket.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * <p>项目名称：spring-websocket</p>
 * <p>类名：com.spring.websocket.ws.WebSocketConfig</p>
 * <p>创建时间: 2022-11-07 13:38 </p>
 * <p>修改时间: 2022-11-07 13:38 </p>
 *
 * @author zhang.taowei
 * @version 1.0.0
 */
@Configuration
public class WebSocketConfig {

    /**
     * 	注入ServerEndpointExporter，
     * 	这个bean会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
