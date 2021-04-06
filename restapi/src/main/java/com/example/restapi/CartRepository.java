package com.example.restapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

/*Needs the @Repository DAO Annotation -- Business Logic
* Exists solely to provide a connection to the Database (Business Layer)*/


@Repository
public class CartRepository {
    /*Autowired grants access to a new instance of the object that it annotates*/
    @Autowired
    JdbcTemplate jdcTemplate;

    public List<CartItem> getCartDetails() {
    // Create a SQL query to retrieve all details from the cart
        return jdcTemplate.query("select * from carts",
                (rs, rowNum) ->
                    new CartItem(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getInt("price")));

    }
    //    Returns the number of records affected
    public int addCardDetails(CartItem cartItem){
        return jdcTemplate.update(" insert into carts (id, name, price) values(?,?,?) ",
                cartItem.getId(), cartItem.getName(), cartItem.getPrice());
    }
    //    Returns the number of records affected
    public int updateCardDetails(CartItem cartItem){
        return jdcTemplate.update(" update carts set name = ? where id = ?",
                cartItem.getName(), cartItem.getId());
    }
    //    Returns the number of records affected
    public int deleteCardDetails(int id){
        return jdcTemplate.update(" delete carts where id = ?", id);
    }
}