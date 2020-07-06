package com.nlp.starter.demo.repository;

import com.nlp.starter.demo.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
