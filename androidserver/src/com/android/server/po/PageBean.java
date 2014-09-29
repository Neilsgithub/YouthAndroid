package com.android.server.po;

import java.util.List;

public class PageBean {
	private List list;//Ҫ���ص�ĳһҳ�ļ�¼�б�
	private int allRow;//�ܼ�¼��
	private int totalPage;//��ҳ��
	private int currentPage;//��ǰҳ
	private int pageSize;//ÿҳ��¼��
	private boolean isFirstPage;//�Ƿ�Ϊ��һҳ
	private boolean isLastPage;//�Ƿ�Ϊ���һҳ
	private boolean hasPreviousPage;//�Ƿ���ǰһҳ
	private boolean hasNextPage;//�Ƿ�����һ
	
	public void init(){
		this.isFirstPage = isFirstPage();
		this.isLastPage = isLastPage();
		this.hasPreviousPage = isHasNextPage();
		this.hasNextPage = isHasNextPage();
	}
	
	public boolean isFirstPage(){
		return currentPage==1;	
	}
	
	public boolean isLastPage(){
		return currentPage==totalPage;
	}
	
	public boolean isHasPreviousPage(){
		return currentPage!=1;
		
	}
	public boolean isHasNextPage(){
		return currentPage!=totalPage;
	}
	public static int countTotalPage(final int pageSize,final int allRow){
		int totalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize+1;
		return totalPage;
	}
	
	public static int countOffset(final int pageSize,final int currentPage){
		final int offset = pageSize*(currentPage-1);
		return offset;
	}
	
	
	public static int countCurrentPage(int page){
		final int curPage = (page==0?1:page);
		return curPage;
	}
	
	
	
	
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getAllRow() {
		return allRow;
	}
	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}





}