package com.qk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO
 *
 * @author SL
 * @date 2021/2/4 1:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private Long bookId;
    private String bookName;
    private int bookCounts;
    private String memo;
}
