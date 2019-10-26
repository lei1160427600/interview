package com.example.interview.filter;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author xiaolei
 * @Title: FilterTest1
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/923:41
 */
@Slf4j
@WebFilter(filterName = "filter1",urlPatterns = "/test/*")
public class FilterTest1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("\n do filter1");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
