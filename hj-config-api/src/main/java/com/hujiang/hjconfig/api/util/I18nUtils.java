package com.hujiang.hjconfig.api.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by suncheng on 11/23/15.
 */
@Component
public abstract class I18nUtils{
    private static final  Logger logger = LoggerFactory.getLogger(I18nUtils.class);
    public static String getMessage(String code){
        String message = StringUtils.EMPTY;
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        if(req != null){
            WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
            try{
                message = applicationContext.getMessage(code,null,req.getLocale());
            }catch(NoSuchMessageException exception){
                logger.warn(exception.getMessage());
            }finally {
                return message;
            }
        }
        return message;
    }
}
