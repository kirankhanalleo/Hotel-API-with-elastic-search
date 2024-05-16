package com.kirankhanal.HotelAPI.elastic.service;

import com.kirankhanal.HotelAPI.elastic.repository.HotelRepositoryElastic;
import com.kirankhanal.HotelAPI.entities.Hotel;
import com.kirankhanal.HotelAPI.model.HotelModel;
import com.kirankhanal.HotelAPI.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SyncService {
    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    private HotelRepositoryElastic hotelRepositoryElastic;
    @Scheduled(fixedRate = 60000)
    public void syncData(){
        List<Hotel> hotels = hotelRepository.findAll();
        List<HotelModel> hotelModels = hotels.stream()
                .map(hotel->new HotelModel(
                        hotel.getHotelID().toString(),
                        hotel.getHotelName(),
                        hotel.getLocation(),
                        hotel.getContact(),
                        hotel.getNumberOfRooms(),
                        hotel.getRates()
                )).collect(Collectors.toList());
        hotelRepositoryElastic.saveAll(hotelModels);
    }
}
