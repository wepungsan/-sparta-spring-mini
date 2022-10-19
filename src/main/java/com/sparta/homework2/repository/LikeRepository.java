package com.sparta.homework2.repository;

import com.sparta.homework2.model.Article;
import com.sparta.homework2.model.Like;
import com.sparta.homework2.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {
//    Optional<Like> findByMemberIdAndAndArticleId(Long memberId, Long articleId);
    boolean existsByMemberIdAndArticleId(Long memberId, Long articleId);
}
