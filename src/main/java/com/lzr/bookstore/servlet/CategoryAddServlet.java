package com.lzr.bookstore.servlet;

import com.lzr.bookstore.entity.Category;
import com.lzr.bookstore.service.CategoryService;
import com.lzr.bookstore.service.impl.CategoryServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addCategory.do")
public class CategoryAddServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryAddServlet.class);
    private CategoryService categoryService = new CategoryServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("收到新增分类的post请求");
        boolean flag = false;
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String status = req.getParameter("status");
        String navable = req.getParameter("navable");
        String sort = req.getParameter("sort");
        // 如果状态为1则赋值为y，反之赋值为n
        status = status.equals("1")?"y":"n";
        navable = navable.equals("1")?"y":"n";
        Category category = new Category();
        category.setName(name);
        category.setStatus(status);
//        category.setNavable(navable);
        category.setSort(sort);
        flag = categoryService.addCategory(category);
        if(flag) {
            LOGGER.debug("新增分类成功");
            resp.sendRedirect("/admin/categoryList.do");
        }
        else {
            resp.sendRedirect("/addCategory.html");
            LOGGER.debug("新增分类失败");
        }
    }
}
