package org.safinajaal.Overnet.security;

public class SecurityConstants {

    // Говорим о том, что все связанное с авторизацией находится по этому адресу и дальше
    public static final String SIGN_UP_URLS = "/api/auth/**";

    public static final String SECRET = "SecurityKeyGenJWT";
    public static final String TOKEN_PREFIX = "Bearer "; // Здесь и должен быть пробел в конце стркои
    public static final String HEADER_STRING = "Authorization";
    public static final String CONTENT_TYPE = "application/json";
    public static final long EXPIRATION_TIME = 600_000_000; //100min время действия токена, потом придется снова входить

}
