package com.playdata.dao;

import com.playdata.dto.BoardDto;
import com.playdata.util.DBUtil;
import com.playdata.util.jdbcServletContextDbutil;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    //DAO(Data Access Object) 데이터베이스와 상호작용하는 담당객체

    /**
     * 테이블에서 모든 데이터를 조회
     * @param req
     * @return List<BoardDto>를 반환
     */
    public List<BoardDto>selectAll(HttpServletRequest req) {
        Connection conn = (Connection) req.getServletContext().getAttribute("conn");
        List<BoardDto>boardList = new ArrayList<>();  //리스트생성

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM board ORDER BY id DESC");
            while (rs.next()){
                BoardDto boardDto = new BoardDto(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("author"),
                        rs.getString("created_at")

                );
                boardList.add(boardDto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return boardList;
    }

}
