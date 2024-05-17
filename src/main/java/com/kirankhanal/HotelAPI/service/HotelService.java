package com.kirankhanal.HotelAPI.service;
import com.kirankhanal.HotelAPI.controller.Request.CreateHotelRequest;
import com.kirankhanal.HotelAPI.controller.Request.ViewHotelRequest;
import com.kirankhanal.HotelAPI.controller.Request.ViewOneHotelRequest;
import com.kirankhanal.HotelAPI.entity.Hotel;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    public void createNewHotel(CreateHotelRequest createHotelRequest);
    public void createNewHotels(List<CreateHotelRequest> createHotelRequest);
    public List<ViewHotelRequest> findAllHotels();
    public Optional<ViewOneHotelRequest> findHotelById(Long id);
    public List<Hotel> findHotelByLocation(String location);

    public Hotel updateHotel(Long id, Hotel updatedHotel);

    public void deleteHotelById(Long id);
    @Transactional
    public void deleteAllHotels();
}
