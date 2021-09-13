package servlet;

import entity.Garbage;
import utils.MysqlConnection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class GarbageServlet {
    public String checkGarbage(ArrayList list) {
        String name= (String) list.get(0);
        String type=(String) list.get(1);
        System.out.println(name);
        String bt="error";
        try {
            Connection conn= MysqlConnection.getConnection();
            Statement statement=conn.createStatement();
            ResultSet rs=statement.executeQuery("select type from garbage where name ='"+name+"'");
            if (rs.next()){
                bt= rs.getString("type");
                System.out.println(bt);
            }else {
                bt="error";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return bt;
    }
}
