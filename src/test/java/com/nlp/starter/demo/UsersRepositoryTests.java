package com.nlp.starter.demo;


import com.nlp.starter.demo.entity.Users;
import com.nlp.starter.demo.repository.UsersRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTests {

    @Autowired
    UsersRepository usersRepository;

    @Test
    public void testUserRepository(){
        Users user = Users.builder().name("김승녕").addr("군자동353").det("test").tel("01062705249").build();
        usersRepository.save(user);

        List<Users> usersList = usersRepository.findAll();

        Users sn = usersList.get(0);
        assertThat(sn.getName(), is("김승녕"));
        assertThat(sn.getTel(), is("01062705249"));
    }

    @After
    public void deleteAll(){
        usersRepository.deleteAll();
    }
}
