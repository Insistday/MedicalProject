package cn.ekgc.witmed.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>基础控制层类</b>
 * <p>
 *  *     基础控制层类依赖注入了如下属性：<br/>
 *  *     1、HttpServletRequest<br/>
 *  *     2、HttpServletResponse<br/>
 *  *     3、HttpSession<br/>
 *  *     本项目所有功能控制层类都必须继承于基础控制层类。
 *  * </p>
 * @author Administrator
 * @date 2022/8/26 0026
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
