package com.focustech.cookinglove.base;

import java.io.Serializable;

public class Page implements Serializable{
	
	/**每页显示数量*/
	private int pageSize=10;
	/**当前页*/
	private int currentPage=1;
	/**总记录数*/
	private int totalRows=0;
	/**每页开始记录数*/
	private int pageStartRow=0;
	/**每页结束记录数*/
	private int pageEndRow=0;
	/**是否分页*/
	private boolean pagination=false;
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPages() {
		return (int) ((totalRows/pageSize)+0.5);
	}
	
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getPageStartRow() {
		return (currentPage-1)*pageSize;
	}
	public int getPageEndRow() {
		return (currentPage-1)*pageSize;
	}
	
	public boolean isPagination() {
		return pagination;
	}
	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	
}
