package cn.simplemind.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 直接使用@RestControllerAdvice注解可以捕获@RestController抛出的异常
 * 
 * @author yingdui_wu
 * @date   2018年5月11日 上午8:29:16
 */
@RestControllerAdvice
public class BaseController {
	
	@ExceptionHandler
	private Result<Object> exceptionHandler(Exception e) {
		Result<Object> result = new Result<>(500, e.getMessage());
		return result;
	} 
	
}
