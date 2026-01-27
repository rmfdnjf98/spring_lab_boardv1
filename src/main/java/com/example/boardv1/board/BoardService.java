package com.example.boardv1.board;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // -> 생성자 주입
@Service // Ioc 컨테이너에 등록
public class BoardService {

    private final BoardRepository boardRepository; // service 가 의존하는 repository

    public List<Board> 게시글목록() {
        return boardRepository.findAll();
    }

    public Board 상세보기(int id) {
        return boardRepository.findById(id);
    }

    @Transactional // update, delete 할 때 붙이기!!!!
    public void 게시물수정(int id, String title, String content) {
        Board board = boardRepository.findById(id);
        board.setTitle(title);
        board.setContent(content);
    }

}
