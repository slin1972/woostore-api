package com.nodexy.woostore.server.page;

public class SortParams {
	private String direction;
	
	private String property ;

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "SortParams [direction=" + direction + ", property=" + property
				+ "]";
	}
	
}
