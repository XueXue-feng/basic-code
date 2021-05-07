package cn.itcast.dayweb.demo.demo32Net;

import java.io.*;
import java.net.Socket;

/*
* 文件上传的客户端
* */
public class UploadFileClient {
    public static void main(String[] args) throws IOException {
        //建立客户端
        Socket client = new Socket("127.0.0.1",8880);

        //给服务器确认连接
        //上传文件
        OutputStream os = client.getOutputStream();
        //上传文件
        BufferedInputStream oos = new BufferedInputStream(new FileInputStream("C:\\Users\\16146\\Pictures\\联想锁屏壁纸\\3456.jpg"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = oos.read(bytes)) != -1){//读取本地文件结束标记是-1，但是不会把结束标记上传到字节流中
            os.write(bytes,0,len);
        }
        //给文件加一个结束标记shutdownOutput() 禁用此套接字的输出流。
        client.shutdownOutput();

        //读取服务器端的消息
        InputStream inputStream = client.getInputStream();
        while((len = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        //关闭资源
        inputStream.close();
        oos.close();
        client.close();
    }
}
