package cn.itcast.dayweb.demo.demo32Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 文件下载的服务器端
 * */
public class DownloadFileServer {
    public static void main(String[] args) throws IOException {/**/
        //建立服务器SocketServer
        ServerSocket server = new ServerSocket(8899);
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
            try {
                //获取客户端
                Socket accept = server.accept();

                //接收客户端的消息文件名称
                InputStream inputStream = accept.getInputStream();
                String str = "";
                int len = 0;
                byte[] bytes = new byte[1024];
                while ((len = inputStream.read(bytes)) != -1) {
                    str = str + new String(bytes, 0, len);
                }
                System.out.println("=======================");
                String filePath = "D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\" +
                        "itcast\\dayweb\\demo\\demo32Net\\upload";
                File file = new File(filePath + "\\" + str);


                //给客户端发消息把文件发送给客户端
                OutputStream outputStream = accept.getOutputStream();
                //创建本地的输出流
                int lenOutput = 0;
                byte[] bytesOutput = new byte[1024];
                FileInputStream fis = new FileInputStream(file);
                while ((lenOutput = fis.read(bytesOutput)) != -1) {
                    outputStream.write(bytesOutput, 0, lenOutput);
                }
                System.out.println("111111111111111111111111");
                //加上一个文件的结束标志
                accept.shutdownOutput();
                System.out.println("222222222222222222222");
                //关闭资源
                fis.close();
                outputStream.close();
                accept.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         }).start();

        //server.close();
        }

    }
}
