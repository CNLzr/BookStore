package com.lzr.bookstore.servlet;

import com.lzr.bookstore.entity.User;
import com.lzr.bookstore.service.UserService;
import com.lzr.bookstore.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRegisterServlet.class);
    UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean flag;
        req.setCharacterEncoding("UTF-8");
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String vcode = req.getParameter("vcode");
        System.out.println(account + "," + password + "," + email + "," + vcode);
        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setEmail(email);

        user.setAvatar("images/avator/user_ico.gif");
        user.setScore(0);
        user.setRegtime(new Date());
        user.setVcode(vcode);
        user.setStatus("n");
        flag = userService.addUser(user);
        if(flag){
            LOGGER.debug("--->注册成功");
            resp.sendRedirect("/index.html");
        }else {
            LOGGER.debug("--->注册失败");
            resp.sendRedirect("/register.html");
        }
    }
}
