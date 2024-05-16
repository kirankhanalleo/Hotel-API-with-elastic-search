package com.kirankhanal.HotelAPI.elastic.service;

import com.kirankhanal.HotelAPI.elastic.repository.HotelRepositoryElastic;
import com.kirankhanal.HotelAPI.model.HotelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class HotelSearchService {
    @Autowired
    private HotelRepositoryElastic hotelRepositoryElastic;
    public List<HotelModel> searchHotelByKeyword(String keyword){
        return hotelRepositoryElastic.searchByKeyword(keyword);
    }
}
