package com.cs2c.dvs.timer;

import com.cs2c.dvs.common.HtmlBean;
import com.cs2c.dvs.common.RssBean;

public abstract class QuartzJob {
	private RssBean rssBean;
	private HtmlBean htmlBean;

	public RssBean getRssBean() {
		return rssBean;
	}

	public void setRssBean(RssBean rssBean) {
		this.rssBean = rssBean;
	}

	public HtmlBean getHtmlBean() {
		System.out.println(htmlBean);
		return htmlBean;
	}

	public void setHtmlBean(HtmlBean htmlBean) {
		this.htmlBean = htmlBean;
	}

	public abstract void work();

	
}
