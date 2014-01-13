package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

@SuppressWarnings("serial")
public class MyTag extends BodyTagSupport {
	@Override
	public int doStartTag() throws JspException {
		try {
			this.pageContext.getOut().write(" test11 ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	@Override
	public int doEndTag() throws JspException {
		try {
			this.pageContext.getOut().write(" test22 ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_AGAIN;
	}
	public void doInitBody() throws JspException {
		try {
			this.pageContext.getOut().write(" test3 ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
