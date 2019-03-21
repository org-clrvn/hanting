package com.sy.hting.ws;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

//1.配置站点
@ServerEndpoint("/ws/test")
@Component
public class MyWebSocketHandler {
	
	
	@OnOpen
	public void onopen(Session session) {
		System.out.println("接收客户端【"+session.getId()+"】连接");
		//启用心跳程序
		new Thread() {
			public void run() {
				while(true) {
					try {
						System.out.println("服务器心跳程序启动");
						session.getBasicRemote().sendText("pong");
						Thread.sleep(15000);
					} catch (Exception e) {
						break;
					}
				}
			}
		}.start();
		
	}
	
	@OnClose
	public void onclose(Session session) {
		System.out.println("客户端【"+session.getId()+"】连接关闭");
	}
	@OnError
	public void onerror(Session session,Throwable e) {
		System.out.println("客户端【"+session.getId()+"】通讯异常");
	}
	
	//这个方法的参数位置不能更改
	@OnMessage
	public void onmessage(String msg,Session session) {
		//发消息
		try {
			if(!"ping".equals(msg)) {
				if("小成".equals(msg)) {
					session.getBasicRemote().sendText("小成需要凤姐");
				}else if("小林".equals(msg)) {
					session.getBasicRemote().sendText("小林需要春哥");
				}
			}
		} catch (IOException e) {
			System.out.println("发送异常");
		}
	}

}
