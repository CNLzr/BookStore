package com.lzr.bookstore.servlet;

import com.lzr.bookstore.entity.Category;
import com.lzr.bookstore.service.CategoryService;
import com.lzr.bookstore.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/admin/categoryList.do")
public class CategoryGetAllServlet extends HttpServlet {
    private CategoryService categoryService = new CategoryServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        List<Category> categories = categoryService.getAll();
        PrintWriter out = resp.getWriter();
        out.print("<table border='1px'>");
        out.print("<tr><td><b>编号</b></td><td><b>名称</b></td><td><b>状态</b></td><td><b>是否为导航</b></td><td><b>顺序</b></td></tr>");
        for(Category category:categories){
            out.print("<tr>");
            out.print("<td>"+category.getId()+"</td>");
            out.print("<td>"+category.getName()+"</td>");
            out.print("<td>"+(category.getStatus().equals("y")?"正常":"停用")+"</td>");
            out.print("<td>"+(category.getNavable().equals("y")?"是":"否")+"</td>");
            out.print("<td>"+category.getSort()+"</td>");
            out.print("</tr>");
        }
        out.print("</table>");
        out.close();
    }
}
