package hello.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hello.mapper.UserRowMapper;
import hello.model.User;

@Repository
public class UserRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        return jdbcTemplate.query("select * from testtable", new UserRowMapper());
    }
}
