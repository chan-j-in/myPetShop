package com.mypetshop.repository;

import com.mypetshop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}
