package org.safinajaal.Overnet.security;

import com.google.gson.Gson;
import org.safinajaal.Overnet.payload.response.InvalidLoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
//Этот класс ловит ошибку авторизации и выкидывает 401
public class JWTAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
        InvalidLoginResponse loginResponse = new InvalidLoginResponse();
        String jsonLoginResponse = new Gson().toJson(loginResponse);
        httpServletResponse.setContentType(SecurityConstants.CONTENT_TYPE);
        httpServletResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
        httpServletResponse.getWriter().println(jsonLoginResponse);
    }
//    @Override
//    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException authException) throws IOException, ServletException {
//        InvalidLoginResponse loginResponse = new InvalidLoginResponse();
//        String jsonLoginResponse = new Gson().toJson(loginResponse);
//        httpServletResponse.setContentType(SecurityConstants.CONTENT_TYPE);
//        httpServletResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
//        httpServletResponse.getWriter().println(jsonLoginResponse);
//    }


}
