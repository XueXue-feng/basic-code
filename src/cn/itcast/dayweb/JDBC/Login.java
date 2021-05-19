package cn.itcast.dayweb.JDBC;

import cn.itcast.dayweb.utils.JDBCUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.JDBC
 * @ClassName: Login
 * @Author: XueXue-Li
 * @Description: 登录案例的练习
 * @Date: 2021/5/16 15:07
 * @Version: 1.0
 */
public class Login {
    private static User user;//用于接受用户名和密码

    public static void main(String[] args) {
        Preparedlogin();
    }

    public static User getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        user = new User(name, password);
        return user;
    }

    /**
     * 使用PreparedStatement对象优化sql
     */
    public static void Preparedlogin() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //获取数据库的连接
            connection = JDBCUtil.getConnection();
            //获取执行SQL对象
            //statement = connection.createStatement();
            //根据用户名查询密码
            String sql = "SELECT * FROM USER WHERE NAME = '?'";
            String sql2 = "SELECT * FROM USER WHERE NAME = ? AND PASSWORD = ?";
            preparedStatement = connection.prepareStatement(sql2);
            //先获取键盘输入的用户名和密码root
            User user = getUser();
            String name = user.getName();
            String password = user.getPassword();
            //给?赋值
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("登录成功！");
            } else {
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String passwordSql = resultSet.getString("password");
                    if (passwordSql.equals(password)) {
                        System.out.println("登录成功！");
                        break;
                    } else {
                        System.out.println("登录失败");
                    }
                }
                System.out.println("登录失败");
            }
            //释放资源
            JDBCUtil.close(resultSet, preparedStatement, connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        public static void login(){
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                //获取数据库的连接
                connection = JDBCUtil.getConnection();
                //获取执行SQL对象
                statement = connection.createStatement();
                //先获取键盘输入的用户名和密码root
                User user = getUser();
                String name = user.getName();
                String password = user.getPassword();
                //根据用户名查询密码
                String sql = "SELECT * FROM USER WHERE NAME = '" + name + "'";
                String sql2 = "SELECT * FROM USER WHERE NAME = '" + name + "' AND PASSWORD = '" + password + "'";
                System.out.println(sql2);
                resultSet = statement.executeQuery(sql2);
                if (resultSet.next()) {
                    System.out.println("登录成功！");
                } else {
                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
                        String passwordSql = resultSet.getString("password");
                        if (passwordSql.equals(password)) {
                            System.out.println("登录成功！");
                            break;
                        } else {
                            System.out.println("登录失败");
                        }
                    }
                }


                //释放资源
                JDBCUtil.close(resultSet, statement, connection);

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

    }
