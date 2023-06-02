package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.entities.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	private JdbcTemplate jdbcTemplate;
	
    @Autowired
    public void ExampleDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public List<User> getAllUsers() {
        String query = "SELECT * FROM users";
        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
            User user = new User();
            user.setId(resultSet.getLong("id"));
            user.setName(resultSet.getString("name"));
            user.setEmail(resultSet.getString("email"));
            // Mappez les autres colonnes de la table à l'objet User
            return user;
        });
    }
    


}
