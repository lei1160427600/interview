package com.example.interview.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xiaolei
 * @Title: TestInterceptor
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/1022:11
 */
@Slf4j
public class TestInterceptor implements HandlerInterceptor {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info(this.getClass().getName() + "<------>preHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info(this.getClass().getName() + "<------>afterCompletion");
        HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info(this.getClass().getName() + "<------>preHandle");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
