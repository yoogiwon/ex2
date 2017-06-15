package com.choa.util;

public class MakePage {
	private int curBlock;
	private int totalBlock;
	private int startNum;
	private int lastNum;
	
	public void makePage(int totalCount, int curPage, int perPage, int perBlock) {
		// 1. totalPage
		int totalPage = 0;
		
		if(totalCount%perPage==0) {
			totalPage = totalCount/perPage;
		} else {
			totalPage = totalCount/perPage + 1;
		}
		
		// 2. totalBlock
		if(totalPage%perBlock==0) {
			totalBlock = totalPage/perBlock;
		} else {
			totalBlock = totalPage/perBlock + 1;
		}
		
		// 3. curBlock
		if(curPage%perBlock==0) {
			curBlock = curPage/perBlock;
		} else {
			curBlock = curPage/perBlock + 1;
		}
		
		// 4. startNum, lastNum
		startNum = (curBlock - 1) * perBlock + 1;
		lastNum = curBlock * perBlock;
		
		if(curBlock==totalBlock) {
			lastNum = totalPage;
		}
	}
	
	public int getCurBlock() {
		return curBlock;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public int getStartNum() {
		return startNum;
	}
	public int getLastNum() {
		return lastNum;
	}
}
