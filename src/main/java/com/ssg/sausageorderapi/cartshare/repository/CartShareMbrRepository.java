package com.ssg.sausageorderapi.cartshare.repository;

import com.ssg.sausageorderapi.cartshare.entity.CartShare;
import com.ssg.sausageorderapi.cartshare.entity.CartShareMbr;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartShareMbrRepository extends JpaRepository<CartShareMbr, Long> {

    Optional<CartShareMbr> findCartShareMbrByCartShareAndMbrId(CartShare cartShare, Long mbrId);

    List<CartShareMbr> findAllByCartShare(CartShare cartShare);
}
