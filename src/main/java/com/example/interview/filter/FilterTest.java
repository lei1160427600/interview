package com.example.interview.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author xiaolei
 * @Title: FilterTest
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/923:20
 */
public class FilterTest implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("he filter 进入Filter过滤器。。");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
