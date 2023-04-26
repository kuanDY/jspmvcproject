package com.playdata.service;

import com.playdata.dao.BoardDao;
import com.playdata.dto.BoardDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BoardService {
    //Business service object역할

    /**
     * 테이블에서 모든 데이터를 조회
     * @param req
     * @return List<dto>를 반환
     */
    public List<BoardDto> getBoards(HttpServletRequest req){
        BoardDao boardDao = new BoardDao();
        return boardDao.selectAll(req);
    }

}
