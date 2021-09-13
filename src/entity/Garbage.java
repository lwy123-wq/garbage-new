package entity;

import com.opensymphony.xwork2.ActionSupport;
import servlet.GarbageServlet;
import servlet.RegisterServlet;

import java.util.ArrayList;

public class Garbage extends ActionSupport {
    private String name;
    private String type;

    public Garbage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String execute() throws Exception {
       /* HttpServletRequest req = null;
        String un=req.getParameter("username");
        String pw=req.getParameter("password");
        String pw2=req.getParameter("password");*/
        // TODO Auto-generated method stub
        ArrayList<String> userList = new ArrayList<String>();
        userList.add(name);
        userList.add(type);
        GarbageServlet garbageServlet=new GarbageServlet();
        String mark =garbageServlet.checkGarbage(userList);
        if(mark=="可回收垃圾") {
            return "可回收垃圾\n";
        }else if(mark=="厨余垃圾"){
            return "厨余垃圾";
        }else if(mark=="有害垃圾"){
            return "有害垃圾";
        }
        else return "error";
    }
}
