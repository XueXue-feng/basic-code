package cn.itcast.dayweb.demo.demo32Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/*
 * 将文件上传到服务器
 * 服务器端
 * */
public class UploadFileServer {
    public static void main(String[] args) throws IOException {
        //建立服务器
        ServerSocket server = new ServerSocket(8880);
        //让服务器一直处于开启状态
        while (true) {

            //使用多线程进行优化
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Socket accept = server.accept();
                        //查看客户端的请求
                        InputStream inputStream = accept.getInputStream();
                        File file = new File("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo32Net\\upload");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        //自定义的命名规则
                        String fileName = System.currentTimeMillis() + "-" + new Random().nextInt(1000) + ".jpg";
                        //FileOutputStream bos = new FileOutputStream("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo32Net\\3456.jpg", true);
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream
                                (file + "\\" + fileName, true));
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = inputStream.read(bytes)) != -1) {//while读取不到结束标记就会进入到死循环中
                            bos.write(bytes, 0, len);
                        }

                        //给客户端发送是否连接的消息，上面是死循环不会执行下面的代码
                        OutputStream outputStream = accept.getOutputStream();
                        outputStream.write("上传成功！！".getBytes(StandardCharsets.UTF_8));

                        outputStream.close();
                        accept.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //server.close();
                }
            }).start();

        }

    }
}

