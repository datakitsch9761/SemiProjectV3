package joseph.spring.mvc.service;

import joseph.spring.mvc.vo.Board;

import java.util.List;

public interface BoardService {

    boolean newBoard(Board b);
    boolean modifyBoard(Board b);
    boolean removeBoard(String bdno);

    //목록보기
    List<Board> readBoard(String cp);
    List<Board> readBoard(String cp,String ftype, String fkey);

    //상세보기
    Board readOneBoard(String bdno);

    int countBoard();
    int countBoard(String ftype, String fkey);
    boolean viewCountBoard(String bdno);
}
