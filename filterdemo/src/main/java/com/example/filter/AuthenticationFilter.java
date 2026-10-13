package com.example.filter;
import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFilter implements Filter {

    @Override 
    public void doFilter(jakarta.servlet.ServletRequest request,
                        jakarta.servlet.ServletResponse response,
                        jakarta.servlet.FilterChain chain) 
            throws java.io.IOException,jakarta.servlet.ServletException {
            
                HttpServletRequest httpRequest = (HttpServletRequest) request;
                HttpServletResponse httpResponse = (HttpServletResponse) response;

                String token = httpRequest.getHeader("token");
                if(token == null || !token.equals("12345")){
                    httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
                    return;
                }
                chain.doFilter(request, response);
    }
    
}
