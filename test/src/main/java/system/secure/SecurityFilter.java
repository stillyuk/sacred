package system.secure;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class SecurityFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("启动安全检查过滤器...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		if (request instanceof HttpServletRequest) {
			HttpServletRequest req = (HttpServletRequest) request;
			if (req.getSession().getAttribute("user") == null) {
				System.out.println("用户未登入！请登入");
			} else {
				System.out.println("通过验证！");
			}
		}
		chain.doFilter(request, response);
	}

	public void destroy() {
		System.out.println("关闭安全检查过滤器...");
	}
}
