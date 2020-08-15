package com.yichen.springcloudeurekaprovide8001;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Map<String, Object>>   getPersonList() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from person");
        return maps;
    }
}
