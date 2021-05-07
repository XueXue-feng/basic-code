package cn.itcast.dayweb.demo.demo33Web;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
 * 创建BS版本的服务器
 * http://127.0.0.1:8080/day04-code/src/cn/itcast/dayweb/demo/demo33Web/web/index.html
 * */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket server = new ServerSocket(8080);
        //让服务器一直处于监听状态
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                    Socket accept = server.accept();
                    //获取到网络字节输入流InputStream
                    InputStream inputStream = accept.getInputStream();
                    //使用网络字节输入流InputStream中的read方法读取客户端的请求
                        /*byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = inputStream.read(bytes)) != -1){
                            System.out.println(new String(bytes,0,len));
                        }*/

                    //使用BufferedReader的nextLine方法读取一整行
                    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                    String[] s = br.readLine().split(" ");
                    String substring = s[1].substring(1);
                    //得到了day04-code/src/cn/itcast/dayweb/demo/demo33Web/web/index.html
                    //使用本地文件输入流找到index.html
                    FileInputStream fis = new FileInputStream(substring);
                    OutputStream outputStream = accept.getOutputStream();
                    // 写入HTTP协议响应头,固定写法
                    outputStream.write("HTTP/1.1 200 OK\r\n".getBytes(StandardCharsets.UTF_8));
                    outputStream.write("Content‐Type:text/html\r\n".getBytes(StandardCharsets.UTF_8));
                    // 必须要写入空行,否则浏览器不解析
                    outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = fis.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, len);
                    }

                    outputStream.close();
                    fis.close();
                    br.close();
                    accept.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();

        }

        //server.close();

    }
}
