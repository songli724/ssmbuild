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

    /**
     * 新增
     * @param books
     * @return
     */
    int addBook(Books books);

    /**
     * 删除
     * @param keyId
     * @return
     */
    int delBook(int keyId);

    /**
     * 修改
     * @param books
     * @return
     */
    int upBook(Books books);

    /**
     * 根据id查询
     * @param keyId
     * @return
     */
    Books queryBook(int keyId);

    /**
     * 查询所有
     * @return
     */
    List<Books> selectBook();
}
