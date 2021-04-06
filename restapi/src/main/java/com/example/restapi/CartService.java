package com.example.restapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/*
Service is for DB access -- middle layer (Service Layer)
Provides logic to operate on the data sent to and from the DAO and the client. */
@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public List<CartItem> getCartDetails(){
        return cartRepository.getCartDetails();
    }

    public int addCartDetails(CartItem cartItem){
        return cartRepository.addCardDetails(cartItem);
    }

    public int updateCartDetails(CartItem cartItem){
        return cartRepository.updateCardDetails(cartItem);
    }

    public int deleteCartDetails(int id){
        return cartRepository.deleteCardDetails(id);
    }
}
