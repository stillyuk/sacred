package system.secure;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class SecurityFilter implements Filter {
	Logger logger = Logger.getLogger(SecurityFilter.class);
	
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("启动安全检查过滤器...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		if (request instanceof HttpServletRequest) {
			HttpServletRequest req = (HttpServletRequest) request;
			if (req.getSession().getAttribute("user") == null) {
			} else {
				logger.info("通过验证！");
			}
		}
		chain.doFilter(request, response);
	}

	public void destroy() {
		logger.info("关闭安全检查过滤器...");
	}
}
