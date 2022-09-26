package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content); // 두개가 일치를 한다면 list를 검색해서 가져오기

    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);
}
