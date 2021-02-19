package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepo;

    @Override
    public List<Board> list() throws Exception {
        return boardRepo.list();
    }

    @Override
    public void register(Board board) throws Exception {
        boardRepo.create(board);
    }

    @Override
    public Board read(Integer boardNo) throws Exception {
        return boardRepo.read(boardNo);
    }

    @Override
    public void remove(Integer boardNo) throws Exception {
        boardRepo.remove(boardNo);

    }

    @Override
    /* 리무브에서 ㅈㅣ워진 최신화 된 보드 넣기 */
    public void modify(Board board) throws Exception {
        boardRepo.modify(board);
    }
}