package com.sb.SpringBootJune2026.beforespring.repository;


import com.sb.SpringBootJune2026.beforespring.jdbc.JdbcUtil;
import com.sb.SpringBootJune2026.beforespring.model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonJdbcRepository {

    public void savePerson(Person person) {

        String sql =
                "INSERT INTO person(id,name,age,address_id) VALUES(?,?,?,?)";

        try (
                Connection con = JdbcUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, person.getId());
            ps.setString(2, person.getName());
            ps.setInt(3, person.getAge());
            ps.setInt(4, person.getAddressId());

            ps.executeUpdate();

            System.out.println("Person Inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Person getPersonById(int id) {

        String sql =
                "SELECT * FROM person WHERE id=?";

        try (
                Connection con = JdbcUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Person(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getInt("address_id")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}