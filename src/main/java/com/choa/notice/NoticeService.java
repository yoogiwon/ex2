package com.choa.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.choa.util.MakePage;
import com.choa.util.PageMaker;
import com.choa.util.RowMaker;

@Service // NoticeService noticeService = new noticeService();
public class NoticeService {
	@Inject
	private NoticeDAO noticeDAO;
	
	/*public NoticeService(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}*/

	public List<NoticeDTO> noticeList(int curPage) throws Exception {
		int totalCount = noticeDAO.noticeCount();
		
		PageMaker pageMaker = new PageMaker(curPage);
		MakePage makePage = pageMaker.getMakePage(totalCount);
		
		return noticeDAO.noticeList(pageMaker.getRowMaker());
	}
	
	public NoticeDTO noticeView(int num) throws Exception {
		noticeDAO.noticeHit(num);
		
		return noticeDAO.noticeView(num);
	}
	
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.noticeWrite(noticeDTO);
	}
	
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.noticeUpdate(noticeDTO);
	}
	
	public NoticeDTO noticeUpdateForm(int num) throws Exception {
		return noticeDAO.noticeView(num);
	}
	
	public int noticeDelete(int num) throws Exception {
		return noticeDAO.noticeDelete(num);
	}
}
