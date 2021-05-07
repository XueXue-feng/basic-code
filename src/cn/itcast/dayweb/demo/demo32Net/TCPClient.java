package cn.itcast.dayweb.demo.demo32Net;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
* TCP通信的客户端，向服务器发送数据，读写服务器会写的数据
* java.net.Socket:此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
* 套接字:IP地址和端口号
* Socket(String host, int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
* host：服务器的IP地址
* port：服务器的端口号
* 成员方法： InputStream getInputStream() 返回此套接字的输入流。
* OutputStream getOutputStream() 返回此套接字的输出流。
* close() 关闭此套接字。
* 实现步骤：1.创建一个客户端对象，构造方法中绑定服务器的IP地址和端口号
* 2.使用Socket方法中的getOutputStream()获取网络字节输出流对向
* 3.使用OutputStream中的write方法给服务器发生数据
* 4.getInputStream中的方法获取网络输入流的对象InputStream
* 5.使用InputStream中的read方法读取网络输入流会写的数据。
* 6.释放资源socket.close()
* PS：客户端和服务器端交互必须使用Socket中提供的网络流不能使用自己创建的流对象
* 2.当我们创建Socket对象的时候就会去请求服务器和服务器经过三次握手建立连接
* 如果服务器没有启动，就会抛出异常；ConnectException
* 如果服务器已经启动，那么就会建立连接进行交互
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        //向服务器发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好服务器".getBytes(StandardCharsets.UTF_8));
        //接收服务器端的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        System.out.println(new String(bytes,0,inputStream.read(bytes)));


        socket.close();
    }
}
