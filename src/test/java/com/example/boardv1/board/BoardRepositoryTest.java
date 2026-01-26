package com.example.boardv1.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(BoardRepository.class) // 괄호 안의 클래스도 ioc에 띄운다.
@DataJpaTest // EntityManger가 ioc에 등록된다.
public class BoardRepositoryTest {

    @Autowired // 어노테이션 DI 기법
    private BoardRepository boardRepository;

    @Test
    public void save_test() {
        // given
        Board board = new Board();
        board.setTitle("title7");
        board.setContent("Content7");
        // when
        boardRepository.save(board);
        // eye
    }
}
