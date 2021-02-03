package com.qk.dao;

import com.qk.pojo.Books;

import java.util.List;

/**
 * TODO
 *
 * @author SL
 * @date 2021/2/4 1:06
 */
public interface BookMapper {
    int addBook(Books books);

    int delBook(int keyId);

    int upBook(Books books);

    Books queryBook(int keyId);

    List<Books> selectBook();
}
