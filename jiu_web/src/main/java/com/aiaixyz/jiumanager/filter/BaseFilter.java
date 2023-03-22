package com.aiaixyz.jiumanager.filter;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;

/*
 * @author:Ran
 * @since:JDK 1.8
 * @Date:2023/2/22
 */
public abstract class BaseFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
