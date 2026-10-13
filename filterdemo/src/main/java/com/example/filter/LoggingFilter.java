package com.example.filter;

import org.springframework.stereotype.Component;
import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component 

public class LoggingFilter implements Filter{
    @Override 
    public void doFilter(jakarta.servlet.ServletRequest request,
                        jakarta.servlet.ServletResponse response,
                        jakarta.servlet.FilterChain chain) 
            throws java.io.IOException,jakarta.servlet.ServletException {
                HttpServletRequest httpRequest = (HttpServletRequest) request;  
                HttpServletResponse httpResponse = (HttpServletResponse) response;
                System.out.println("Response Status Code: " 
                                    + httpRequest.getMethod() + " " 
                                    + httpRequest.getRequestURL());
                chain.doFilter(request, response);
                System.out.println("Response Status Code: " 
                                    + httpResponse.getStatus());
    }
}
