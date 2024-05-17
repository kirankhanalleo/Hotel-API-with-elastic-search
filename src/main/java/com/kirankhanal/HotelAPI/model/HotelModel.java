package com.kirankhanal.HotelAPI.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "hotels")
public class HotelModel {
    @Id
    private String id;
    private String hotelName;
    private String location;
    private String contact;
    private Integer numberOfRooms;
    private BigDecimal rates;
    private Float rating;
    private String image;
}
