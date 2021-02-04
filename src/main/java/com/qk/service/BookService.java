package com.qk.service;

import com.qk.pojo.Books;

import java.util.List;

/**
 * @author ：songli
 * @description：
 * @date ： 2021/2/4 11:46
 * 说明：
 * ===================================================================================================================
 * 变更履历：
 * -------------------------------------------------------------------------------------------------------------------
 * 变更编号     变更时间    变更人    变更原因                变更内容
 * <p>
 * -------------------------------------------------------------------------------------------------------------------
 */
public interface BookService {
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
