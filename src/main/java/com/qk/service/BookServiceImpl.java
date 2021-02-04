package com.qk.service;

import com.qk.dao.BookMapper;
import com.qk.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：songli
 * @description：
 * @date ： 2021/2/4 11:47
 * 说明：
 * ===================================================================================================================
 * 变更履历：
 * -------------------------------------------------------------------------------------------------------------------
 * 变更编号     变更时间    变更人    变更原因                变更内容
 * <p>
 * -------------------------------------------------------------------------------------------------------------------
 */
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {

        return bookMapper.addBook(books);
    }

    @Override
    public int delBook(int keyId) {
        return bookMapper.delBook(keyId);
    }

    @Override
    public int upBook(Books books) {
        return bookMapper.upBook(books);
    }

    @Override
    public Books queryBook(int keyId) {
        return bookMapper.queryBook(keyId);
    }

    @Override
    public List<Books> selectBook() {
        return bookMapper.selectBook();
    }
}
