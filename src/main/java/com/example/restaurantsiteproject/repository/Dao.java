package com.example.restaurantsiteproject.repository;

import com.example.restaurantsiteproject.logic.Dish;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Dao {
    public List<Dish> getDishes(){
        final String url = "jdbc:postgresql://db:5432/favla";
        final String sql = "SELECT * FROM dishes;";
        final String user = "postgres";
        final String password = "postgres";
        ArrayList<Dish> dishes = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer cost = rs.getInt("cost_uah");
                Integer type = rs.getInt("type_id");
                String description = rs.getString("description");
                String image = rs.getString("image");
                Dish dish = new Dish(id, name, cost, type, description, image);

                dishes.add(dish);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return dishes;
    }
}
