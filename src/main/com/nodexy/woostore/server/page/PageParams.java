package com.nodexy.woostore.server.page;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PageParams {
	/**
	 * 每页大小条数
	 */
	private int size ;
	/**
	 * 当前页  从0开始
	 */
	private int page ;
	private List<SortParams> sorts = new ArrayList<SortParams>();
	
	public PageParams() {
		super();
		this.size = 50;
		this.page = 0;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = (size < 0 ? 10 : size) ;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = (page < 0 ? 0 : page);
	}
	public List<SortParams> getSorts() {
		return sorts;
	}
	public void setSorts(List<SortParams> sorts) {
		this.sorts = sorts;
	}
	public Pageable toPageable() {
		Pageable pageable = new PageRequest(page, size);
		return pageable;
	}
	@Override
	public String toString() {
		return "PageParams [size=" + size + ", page=" + page + ", sorts="
				+ sorts + "]";
	}
	
}
