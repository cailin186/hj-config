package com.hujiang.hjconfig.api.web.controller.advice;

import com.hujiang.hjconfig.api.constant.MediaTypes;
import com.hujiang.hjconfig.api.util.I18nUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by suncheng on 11/23/15.
 */
@ControllerAdvice(annotations={Controller.class})
public class HJControllerAdvice extends ResponseEntityExceptionHandler{

    @ExceptionHandler({
            IllegalArgumentException.class
    })
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity<String> handleBadParamException(HttpServletRequest request, Throwable ex){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType(MediaTypes.JSON_UTF_8));
        return new ResponseEntity(I18nUtils.getMessage("http.error.500")
        ,headers,HttpStatus.FORBIDDEN);
    }
}
