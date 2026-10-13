package com.example.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.Model.User;
import com.example.Service.UserService;
import java.util.List;
import java.util.ArrayList;

@WebServlet ("/users")
public class UserServlet extends HttpServlet {
    private UserService userService = new UserService();


    @Override 
    public void doPost(HttpServletRequest Request, HttpServletResponse Response) throws java.io.IOException {
        // Handle POST request
        Integer id = Integer.parseInt(Request.getParameter("id"));
        String name = Request.getParameter("name");
        String email = Request.getParameter("email");   
        String mobile = Request.getParameter("mobile");

        if(id == null || name == null || email == null || mobile == null){
            Response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            Response.setContentType("Application/json");
            Response.getWriter().write("{\"error\": \"Missing required parameters\"}");
        }
        User user = new User(id, name, email, mobile);
        User createdUser = userService.addUser(user);
        Response.setContentType("Application/json");
        Response.getWriter().write(userToJson(createdUser));

    }


    @Override 
    public void doGet(HttpServletRequest Request, HttpServletResponse Response) throws java.io.IOException {
        // Handle GET request
        
        String idparam = Request.getParameter("id");
        if (idparam == null) {
            Response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            Response.setContentType("Application/json");
            Response.getWriter().write("{\"error\": \"Missing required parameters\"}");
            return;
        }
        Integer id = Integer.parseInt(idparam);
        User user = userService.getUser(id);
        idparam = Request.getParameter("id");
        if (idparam == null) {
            List<User> allUsers = new ArrayList<>(userService.getAllUsers().values());
            Response.setContentType("Application/json");
            Response.getWriter().write(usersToJson(allUsers));
            return;
        }
        if (user == null) {
            Response.setContentType("Application/json");
            Response.getWriter().write("{\"error\": \"User not found\"}");
            Response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        Response.setContentType("Application/json");
        Response.getWriter().write(userToJson(user));
    }
    
    
    private String userToJson(User user) {
        return "{" +
                "\"id\": " + user.getId() + "," +
                "\"name\": \"" + user.getName() + "\"," +
                "\"email\": \"" + user.getEmail() + "\"," +
                "\"mobile\": \"" + user.getMobile() + "\"" +
                "}";
    }
    private String usersToJson(List<User> users) {
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < users.size(); i++) {
            json.append(userToJson(users.get(i)));
            if (i < users.size() - 1) {
                json.append(",");
            }
        }
        json.append("]");
        return json.toString();
    }
}
