package com.caraeppes.EduWaiterAppServer.services;

import com.caraeppes.EduWaiterAppServer.models.Restaurant;
import com.caraeppes.EduWaiterAppServer.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant create(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    public Restaurant findById(Long id){
         return restaurantRepository.getOne(id);
    }

    public List<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }

    public Restaurant update(Restaurant restaurant, Long id){
        Restaurant original = restaurantRepository.getOne(id);
        original.setName(restaurant.getName());
        original.setMenus(restaurant.getMenus());
        original.setEmployees(restaurant.getEmployees());
        original.setAdmin(restaurant.getAdmin());
        original.setFacts(restaurant.getFacts());
        return restaurantRepository.save(original);
    }

    public Boolean deleteById(Long id){
        restaurantRepository.deleteById(id);
        return true;
    }
}