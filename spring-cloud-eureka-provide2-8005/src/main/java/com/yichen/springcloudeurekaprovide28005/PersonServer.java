package com.yichen.springcloudeurekaprovide28005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServer {

    @Autowired
    PersonDao personDao;


    public Object getPersonList() {
        return  personDao.getPersonList();
    }
}
