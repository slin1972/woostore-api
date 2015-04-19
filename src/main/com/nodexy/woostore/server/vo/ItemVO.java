package com.nodexy.woostore.server.vo;

import java.io.Serializable;

/**
 * 资源 展现模型
 * 
 * @author nodexy
 *
 */
public class ItemVO extends ListItemVO implements Serializable {

	private static final long serialVersionUID = 8786028565903881608L;

	private String screenshot;
	private String lastActionTime;

	public String getScreenshot() {
		return screenshot;
	}

	public void setScreenshot(String screenshot) {
		this.screenshot = screenshot;
	}

	public String getLastActionTime() {
		return lastActionTime;
	}

	public void setLastActionTime(String lastActionTime) {
		this.lastActionTime = lastActionTime;
	}

	@Override
	public String toString() {
		return "ItemVO [screenshot=" + screenshot + ", lastActionTime="
				+ lastActionTime + "] extends " + super.toString();
	}

}
