package com.ssafy.mvc.model.dao;

import com.ssafy.mvc.model.dto.Board;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardDao {
    void insertBoard(Board board);
    Board selectBoard(Long id);
    List<Board> selectBoardList(@Param("keyword") String keyword);
    void updateBoard(Board board);
    void deleteBoard(Long id);
}
