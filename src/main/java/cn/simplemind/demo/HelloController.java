package cn.simplemind.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private Source source;
	
	@RequestMapping("hello")
	public Object hello() {
		return "Hello springboot";
	}
	
	@RequestMapping("getResource")
	public Result<Source> getResource() {
		Source source = new Source();
		BeanUtils.copyProperties(this.source, source);
		return new Result<Source>(source);
	}
	
	@RequestMapping("throwException")
	public Result<String> throwException() {
		throw new NullPointerException();
	}
}
