package com.ayshriv.redis_server.rest;

import com.ayshriv.redis_server.binding.Country;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@RestController
public class CountryRestController {

    private HashOperations<String, Integer, Country> objectHashOperations =null;

    public CountryRestController(RedisTemplate<String, Country> rt)
    {
         this.objectHashOperations = rt.opsForHash();
    }

    @PostMapping("/country")
    public String addCountry(@RequestBody Country country)
    {
        objectHashOperations.put("COUNTRIES",country.getSno(), country);
        return "Country added successfully";
    }

    @GetMapping("/countries")
    public Collection<Country> getCountries()
    {
        Map<Integer, Country> countries = objectHashOperations.entries("COUNTRIES");
        Collection<Country> values = countries.values();
        return values;
    }

    @GetMapping("/country/{sno}")
    public Country getCountry(@PathVariable("sno") Integer sno)
    {
        return objectHashOperations.get("COUNTRIES", sno);
    }

    @DeleteMapping("/country/{sno}")
    public String deleteCountry(@PathVariable("sno") Integer sno)
    {
        objectHashOperations.delete("COUNTRIES",sno);
        return "Country deleted successfully";
    }

    @PutMapping("/country")
    public String updateCountry(@RequestBody Country country) {
        objectHashOperations.put("COUNTRIES", country.getSno(), country);
        return "Country updated successfully";
    }
}
