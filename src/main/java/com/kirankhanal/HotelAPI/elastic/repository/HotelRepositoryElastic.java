package com.kirankhanal.HotelAPI.elastic.repository;

import com.kirankhanal.HotelAPI.model.HotelModel;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepositoryElastic extends ElasticsearchRepository<HotelModel, String> {
    @Query("{\"multi_match\": {\"query\": \"?0\", \"fields\": [\"hotelName\", \"location\", \"contact\"]}}")
    List<HotelModel> searchByKeyword(String keyword);
}