package com.kirankhanal.HotelAPI.elastic.service;

import com.kirankhanal.HotelAPI.elastic.repository.HotelRepositoryElastic;
import com.kirankhanal.HotelAPI.model.HotelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelSearchService {
    @Autowired
    private HotelRepositoryElastic hotelRepositoryElastic;
    public List<HotelModel> searchHotelByKeyword(String keyword){
        List<HotelModel> hotels = hotelRepositoryElastic.searchByKeyword(keyword)
                .stream()
                .filter(hotel -> hotel.getRating() != null)
                .collect(Collectors.toList());
        hotels.sort(Comparator.comparing(HotelModel::getRating, Comparator.reverseOrder())
                .thenComparing(HotelModel::getNumberOfRooms, Comparator.reverseOrder()));
        return hotels;
    }
}
