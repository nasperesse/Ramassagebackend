package cm.ramassage.mv;


import com.sun.istack.internal.logging.Logger;

import javax.servlet.*;
import java.io.IOException;


public class LoginLogoutFilter implements Filter {

    private static final Logger log = Logger.getLogger(LoginLogoutFilter.class);


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
