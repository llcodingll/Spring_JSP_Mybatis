package com.ssafy.mvc.model.service;

import com.ssafy.mvc.model.dao.BoardDao;
import com.ssafy.mvc.model.dto.Board;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardDao boardDao;

    public BoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public void write(Board board) {
        boardDao.insertBoard(board);
    }

    public List<Board> list(String keyword) {
        return boardDao.selectBoardList(keyword);
    }

    public Board detail(Long id) {
        return boardDao.selectBoard(id);
    }

    public void edit(Board boardDTO) {
        boardDao.updateBoard(boardDTO);
    }

    public void delete(Long id) {
        boardDao.deleteBoard(id);
    }
}
