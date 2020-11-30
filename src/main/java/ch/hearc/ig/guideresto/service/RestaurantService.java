package ch.hearc.ig.guideresto.service;

import ch.hearc.ig.guideresto.business.*;

import java.util.Collections;
import java.util.Set;

public class RestaurantService {


    public City insertCity(String cityZipCode, String cityName) {
        return null;
    }

    public BasicEvaluation insertBasicEvaluation(BasicEvaluation basicEvaluation) {
        return null;
    }

    public Set<Restaurant> researchAllRestaurants() {
        return Collections.emptySet();
    }

    public Restaurant researchById(Integer restaurantId) {
        return null;
    }

    public Set<Restaurant> researchByName(String name) {
        return Collections.emptySet();
    }

    public Set<Restaurant> researchByCity(String cityName) {
        return Collections.emptySet();
    }

    public Set<City> researchAllCities() {
        return Collections.emptySet();
    }

    public Set<RestaurantType> researchAllRestaurantTypes() {
        return Collections.emptySet();
    }

    public Restaurant insertRestaurant(Restaurant restaurant) {
        return null;
    }

    public Set<EvaluationCriteria> researchAllEvaluationCritierias() {
        return Collections.emptySet();
    }

    public CompleteEvaluation insertCompleteEvaluation(CompleteEvaluation completeEvaluation) {
        return null;
    }

    public Restaurant updateRestaurant(Restaurant restaurant) {
        return null;
    }

    public void deleteRestaurant(Restaurant restaurant) {
    }

    public Set<Restaurant> researchByType(RestaurantType type) {
        return Collections.emptySet();
    }
}
