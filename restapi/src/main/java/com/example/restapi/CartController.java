package com.example.restapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Main Entry Point for all transactions, needs to be set as a @RestController and needs @RequestMapping to have a url pattern to be matched*/

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    // get method that fetches all details from the cart
    @GetMapping("/get")
    public List<CartItem> getCartDetails(){
        return cartService.getCartDetails();
    }
    /* To add items, we use @RequestBody and pass the argument to the class, POST is to add/set
    items*/
    // get method that fetches all details from the cart
    @PostMapping("/add")
    public int addCartDetails(@RequestBody CartItem cartItem){
        return cartService.addCartDetails(cartItem);
    }
    /* To update items, we use @RequestBody and pass the argument to the class, PUT is to
    modify/alter*/
    // get method that fetches all details from the cart
    @PutMapping("/update")
    public int updateCartDetails(@RequestBody CartItem cartItem){
        return cartService.updateCartDetails(cartItem);
    }
    /* Since the constructor only needs the id to identify the cart item, we can request for the
    id {id} is the pattern that needs to get mapped using @PathVariable, DELETE mapping is used
    delete an id pattern */
    // get method that fetches all details from the cart
    @DeleteMapping("/delete/{id}")
    public int deleteCartDetails(@PathVariable int id){
        return cartService.deleteCartDetails(id);
    }
}
