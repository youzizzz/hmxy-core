package com.hmxy.http;

import java.util.List;

/**
 * @discripeion:
 * @author: liangj
 * @date: 2018/11/6 14:01
 */
public class PageUtils {

    public static <E> PageInfo<E> convertPage(com.github.pagehelper.Page<E> page){
        PageInfo<E> resultPage = new PageInfo<E>();
        setPageProp(page, resultPage);
        resultPage.setData(page.getResult());
        return resultPage;
    }

    public static <E> PageInfo<E> convertPage(com.github.pagehelper.Page page, List<E> list){
        PageInfo<E> resultPage = new PageInfo<E>();
        setPageProp(page, resultPage);
        resultPage.setData(list);
        return resultPage;
    }

    private static void setPageProp(com.github.pagehelper.Page page, PageInfo resultPage) {
        resultPage.setPageNum(page.getPageNum());
        resultPage.setPageSize(page.getPageSize());
//        resultPage.setTotalPage(page.getPages());
        resultPage.setCount(new Long(page.getTotal()).intValue());
    }

}