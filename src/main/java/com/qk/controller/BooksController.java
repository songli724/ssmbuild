package com.qk.controller;

import com.qk.pojo.Books;
import com.qk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：songli
 * @description：
 * @date ： 2021/2/4 13:25
 * 说明：
 * ===================================================================================================================
 * 变更履历：
 * -------------------------------------------------------------------------------------------------------------------
 * 变更编号     变更时间    变更人    变更原因                变更内容
 * <p>
 * -------------------------------------------------------------------------------------------------------------------
 */
@Controller
@RequestMapping("/book")
public class BooksController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    /**
     * 查询所有书籍
     *
     * @return List<Books>
     */
    @GetMapping("/all")
    public String selectBooks(Model model) {
        List<Books> books = bookService.selectBook();
        model.addAttribute("books", books);
        return "allBook";
    }

}
