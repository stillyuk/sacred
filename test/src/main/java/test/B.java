package test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class B implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("..." + String.class.getClassLoader() + "...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {

	}

	public void destroy() {

	}
}
