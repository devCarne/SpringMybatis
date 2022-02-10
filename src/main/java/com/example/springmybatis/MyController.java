package com.example.springmybatis;

import com.example.springmybatis.dto.SimpleBbsDTO;
import com.example.springmybatis.jdbc.IMyUserDAO;
import com.example.springmybatis.service.SimperBbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @Autowired
    private IMyUserDAO dao;

    @Autowired
    private SimperBbsService service;

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
        model.addAttribute("list", service.getList());
        return "list";
    }

    @RequestMapping("/view")
    public String view(HttpServletRequest req, Model model) {
        String id = req.getParameter("id");
        model.addAttribute("dto", service.view(id));
        return "view";
    }

    @RequestMapping("/writeForm")
    public String writeForm() {
        return "writeForm";
    }

    @RequestMapping("/write")
    public String write(HttpServletRequest req) {
        service.write(
                req.getParameter("writer"),
                req.getParameter("title"),
                req.getParameter("content")
        );
        return "redirect:list";
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest req) {
        service.delete(req.getParameter("id"));
        return "redirect:list";
    }

    @RequestMapping("/updateForm")
    public String updateForm(HttpServletRequest req, Model model) {
        model.addAttribute("dto", service.view(req.getParameter("id")));
        return "modifyForm";
    }

    @RequestMapping("/update")
    public String update(HttpServletRequest req) {
        service.update(new SimpleBbsDTO(
                Integer.parseInt(req.getParameter("id")),
                req.getParameter("writer"),
                req.getParameter("title"),
                req.getParameter("content"))
        );
        return "redirect:list";
    }
}
