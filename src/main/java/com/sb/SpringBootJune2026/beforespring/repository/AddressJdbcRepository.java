package com.sb.SpringBootJune2026.beforespring.repository;


import com.sb.SpringBootJune2026.beforespring.jdbc.JdbcUtil;
import com.sb.SpringBootJune2026.beforespring.model.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressJdbcRepository {

    public void saveAddress(Address address) {

        String sql =
                "INSERT INTO address(id,city, state) VALUES (?,?, ?)";

        try (
                Connection con = JdbcUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, address.getId());
            ps.setString(2, address.getCity());
            ps.setString(3, address.getState());

            int rows = ps.executeUpdate();

            System.out.println(rows + " Address inserted"
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Address getAddressById(int id) {
        String sql =
                "SELECT * FROM address WHERE id = ?";

        try (
                Connection con = JdbcUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Address address = new Address();

                address.setId(rs.getInt("id"));
                address.setCity(rs.getString("city"));
                address.setState(rs.getString("state"));

                return address;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}