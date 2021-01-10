package cn.fyzzz.panserver.config;

import cn.fyzzz.panserver.model.SysResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fyzzz
 * 2020/4/10 16:48
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    public SysResult errorHandler(Exception e){
        log.error(e.getMessage(),e);
        return SysResult.error(e.getMessage());
    }

}
