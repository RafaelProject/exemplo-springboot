package br.com.portoinvestimento.portoinvestimento.domain;

import java.util.List;

public class ResponseGet {
	
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<ListGet> data;
	
	public int getPer_page() {
		return per_page;
	}
	
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public List<ListGet> getData() {
		return data;
	}

	public void setData(List<ListGet> data) {
		this.data = data;
	}
}