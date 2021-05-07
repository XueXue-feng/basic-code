package cn.itcast.dayweb.demo.demo32Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
 * java.net.ServerSocket此类实现服务器套接字:接收客户端发送的请求和数据，会写客户端的数据
 * ServerSocket(int port)  创建绑定到特定端口的服务器套接字。和操作系统要指定的端口号
 * 服务器端必须明确：必须得直到是哪个客户端请求的数据，所以可以使用accept方法获取客户端对象
 * 成员方法：
 * Socket accept()  侦听并接受到此套接字的连接。
 * close() 关闭此套接字。
 * 步骤：1.创建ServerSocket对象和系统要直指定的端口号
 * 2.使用accept方法获取请求的Socket
 * 3.使用Socket中的InputStream中的read方法的读取客户端输入的数据
 * 4.使用Socket中国的OutputStream中的write方法向客户端会写数据
 * 5.关闭ServerSocket对象close
 * */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        //读取客户端发送的数据
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        System.out.println(new String(bytes,0,inputStream.read(bytes)));

        //回写数据
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write( "我收到了谢谢合作".getBytes(StandardCharsets.UTF_8));
        //关闭流
        accept.close();
        serverSocket.close();


    }

}




