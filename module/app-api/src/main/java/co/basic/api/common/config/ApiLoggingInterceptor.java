package co.basic.api.common.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


@Component
@Slf4j
public class ApiLoggingInterceptor implements HandlerInterceptor {
    private byte[] rawData;
    private Charset encoding = StandardCharsets.UTF_8;

    public BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.rawData), this.encoding));
    }


    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {
        String uri = req.getRequestURI();
//        String body = IOUtils.toString(req.getReader());
//        log.info("[REQ] url: {}, param: {}", uri , StringUtils.defaultString(req.getQueryString()));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }


}
