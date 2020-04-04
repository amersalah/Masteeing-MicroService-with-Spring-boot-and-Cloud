package com.amer.microservices.netflixzuulapigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //define the type of filter pre , post , error
    @Override
    public String filterType() {
        return "pre";
    }

    //define order of the filter cuz it may be many filters like security filter
    @Override
    public int filterOrder() {
        return 1;
    }

    //define to execute or not it may be based on logic from request
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        logger.info("request -> {} request uri -> {}" , request , request.getRequestURI());
        return null;
    }
}
