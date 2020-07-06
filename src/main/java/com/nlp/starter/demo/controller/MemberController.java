package com.nlp.starter.demo.controller;


import com.nlp.starter.demo.entity.Member;
import com.nlp.starter.demo.entity.MemberRole;
import com.nlp.starter.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/member")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @PostMapping("")
    public String create(Member member){
        MemberRole role = new MemberRole();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        member.setUpw(passwordEncoder.encode(member.getUpw()));
        role.setRoleName("BASIC");
        member.setRoles(Arrays.asList(role));
        memberRepository.save(member);
        return "redirect:/welcome";
    }
}
