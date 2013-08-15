package com.cs2c.dvs.common;

public class Pager{

	private int recordCount;// 总记录数
	private int pageSize = 25;// 每页记录条数
	private int pageCount;// 总页数
	private int pageNum;// 页码
	private String pageMsg;

	private int start;// 當前頁起始位置

	public Pager(int recordCount, int pageNum) {
		this.recordCount = recordCount;
		this.pageNum = pageNum;

		// 计算总页数
		this.pageCount = this.recordCount / this.pageSize;
		if (this.recordCount % this.pageSize != 0) {
			this.pageCount++;
		}

		if (this.pageNum < 1){
			pageMsg="已经到第一页了！";
			this.pageNum = 1;
		}
		if (this.pageNum > this.pageCount){
			pageMsg="已经到最后一页了！";
			this.pageNum = this.pageCount;
		 }
	}

	
	public String getPageMsg() {
		return pageMsg;
	}


	public void setPageMsg(String pageMsg) {
		this.pageMsg = pageMsg;
	}


	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageNum() {
		if(pageNum==0){
			return 1;
		}else{
			return pageNum;
		}
	}

	public void setPageNum(int pageNum) {
		if(pageNum==0){
			this.pageNum=1;
		}else{
			this.pageNum = pageNum;
		}
	}

	public int getStart() {
		if(pageNum==0){
			this.pageNum=1;
		}else{
			this.pageNum = pageNum;
		}
		start = (this.pageNum - 1) * this.pageSize;
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

}
