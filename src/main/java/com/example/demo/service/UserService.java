package com.example.demo.service;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    @PersistenceContext
    private EntityManager em;




//    public UserService(UsersRepository usersRepository){
//        this.usersRepository = usersRepository;
//    }

    public void createUsers(Users users) {
        usersRepository.save(users);
    }

    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    public Users findById(Long userId){
        return usersRepository.findById(userId).orElse(null);
    }

    public List<Users> findAllByName(String name){
        return usersRepository.findAllByName(name);
    }

    public Users getUserByEmail(String email) {
        return usersRepository.findUsersByEmail(email);
    }

    public Users getUserByPhone(String phone) {return usersRepository.findUsersByPhone(phone); }

    public void postUser(Users user) {
        em.persist(user);
    }



}
