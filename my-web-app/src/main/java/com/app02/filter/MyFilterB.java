package com.app02.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "MyFilterB", urlPatterns = "/SomeServlet")
public class MyFilterB implements Filter {

    private FilterConfig config;

    public void init(FilterConfig config) throws ServletException {
        this.config=config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("MyFilterB. @Before");
        chain.doFilter(req, resp);
        System.out.println("MyFilterB. @After");
    }

    public void destroy() {
    }

}