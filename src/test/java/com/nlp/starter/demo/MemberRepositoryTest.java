package com.nlp.starter.demo;

import com.nlp.starter.demo.entity.Member;
import com.nlp.starter.demo.entity.MemberRole;
import com.nlp.starter.demo.repository.MemberRepository;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void insertTest(){
        for(int i = 0; i < 100; i ++){
            Member member = new Member();
            member.setUid("user" + i);
            member.setUpw("pwd" + i);
            member.setUemail("hihi@" + i);
            MemberRole role = new MemberRole();
            if( i <= 80){
                role.setRoleName("BASIC");
            }else if(i <= 90){
                role.setRoleName("MANAGER");
            }else{
                role.setRoleName("ADMIN");
            }
            member.setRoles(Arrays.asList(role));
            memberRepository.save(member);
        }
    }

    @Test
    public void testMember(){

    }
}
