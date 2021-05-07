package cn.itcast.dayweb.demo.demo32Net;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/*
* 文件下载的客户端
* */
public class DownloadFileClient {
    public static void main(String[] args) throws IOException {
        //建立客户端的Socket类
        Socket client = new Socket("127.0.0.1",8899);
        //向服务器发送消息
        String fileName = "1620306839406-79.jpg";
        OutputStream os = client.getOutputStream();
        os.write(fileName.getBytes(StandardCharsets.UTF_8));
        client.shutdownOutput();
        System.out.println(fileName);

        //读取服务器的消息下载文件
        InputStream inputStream = client.getInputStream();
        //文件下载的位置
        File file = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\" +
                "itcast\\dayweb\\demo\\demo32Net\\Download");
        if(!file.exists()){
            file.mkdirs();
        }
        //给下载的文件重新命名
        String fileNameNew = System.currentTimeMillis()  + "-" + new Random().nextInt(10000) + ".jpg";
        //建立一个本地输入流把网络流的文件保存到本地
        FileOutputStream fos = new FileOutputStream(file + "\\" +fileNameNew,true);
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = inputStream.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        System.out.println("2222222222222222222");
        //关闭资源
        fos.close();
        inputStream.close();
        client.close();

    }
}
