package com.example.hospital_gateway.filter;

import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class PostFilter  extends ZuulFilter {


    @Override
    public String filterType() {
        return "PostFilter";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletResponse response = currentContext.getResponse();
        log.info(String.format(" response status  %s",response.getStatus()));


        return "null from PostFilter";
    }
}
