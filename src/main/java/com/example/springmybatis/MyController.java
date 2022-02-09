package com.example.springmybatis;

import com.example.springmybatis.dao.ISimpleBbsDAO;
import com.example.springmybatis.jdbc.IMyUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @Autowired
    private IMyUserDAO dao;

    @Autowired
    private ISimpleBbsDAO bbsDAO;

    @RequestMapping("/")
    public String root() throws Exception {
        return "redirect:list";
    }

    @GetMapping("/user")
    public String userListPage(Model model) {
        model.addAttribute("users", dao.getList());
        return "userList";
    }

    @RequestMapping("/list")
    public String bbsList(Model model) {
        model.addAttribute("list", bbsDAO.getList());
        return "list";
    }

    @RequestMapping("/view")
    public String view(HttpServletRequest req, Model model) {
        String id = req.getParameter("id");
        model.addAttribute("dto", bbsDAO.view(id));
        return "view";
    }

    @RequestMapping("/writeForm")
    public String writeForm() {
        return "writeForm";
    }

    @RequestMapping("/write")
    public String write(HttpServletRequest req) {
        bbsDAO.write(
                req.getParameter("writer"),
                req.getParameter("title"),
                req.getParameter("content")
        );
        return "redirect:list";
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest req) {
        bbsDAO.delete(req.getParameter("id"));
        return "redirect:list";
    }
}
