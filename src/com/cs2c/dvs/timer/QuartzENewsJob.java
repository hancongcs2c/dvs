package com.cs2c.dvs.timer;

/**
 * 新闻栏目定时器任务
 * 
 * @author 
 * 
 */
public class QuartzENewsJob extends QuartzJob {

	@Override
	public void work() {

		// 调用RssBean解析出每个新闻的link
		try {
			super.getRssBean().rss_EucalyptusNews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
