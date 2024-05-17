package com.kirankhanal.HotelAPI.controller;
import com.kirankhanal.HotelAPI.dto.CreateHotelRequest;
import com.kirankhanal.HotelAPI.dto.ViewHotelRequest;
import com.kirankhanal.HotelAPI.dto.ViewOneHotelRequest;
import com.kirankhanal.HotelAPI.elastic.service.HotelSearchService;
import com.kirankhanal.HotelAPI.model.HotelModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kirankhanal.HotelAPI.entity.Hotel;
import com.kirankhanal.HotelAPI.service.HotelService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/hotels")
@Tag(name="Hotel Controller",description = "Handles endpoints related to hotel management, including creating, updating, deleting, and retrieving hotel information.")
public class HotelController {
    @Autowired
    private HotelService hotelservice;
    @Autowired
    private HotelSearchService hotelSearchService;
    @Operation(
            summary = "Create a new hotel",
            description = "This endpoint adds a new hotel to the database."
    )
    @PostMapping("/create")
    public ResponseEntity<String> createNewHotel(@Valid @RequestBody CreateHotelRequest createHotelRequest) {
        hotelservice.createNewHotel(createHotelRequest);
        return ResponseEntity.status(HttpStatus.OK).body("Hotel created successfully.");
    }
    @Operation(
            summary = "Create multiple hotel",
            description = "This endpoint adds multiple hotels to the database."
    )
    @PostMapping("/create/multiple")
    public ResponseEntity<String> createNewHotels(@Valid @RequestBody List<CreateHotelRequest> createHotelRequest) {
        hotelservice.createNewHotels(createHotelRequest);
        return ResponseEntity.status(HttpStatus.OK).body("Hotels created successfully.");
    }
    @Operation(
            summary = "Retrieve all hotels",
            description = "This endpoint retrieves all hotels stored in the database."
    )
    @GetMapping("/find")
    public ResponseEntity<List<ViewHotelRequest>> findAllHotels(){
        List<ViewHotelRequest> hotels = hotelservice.findAllHotels();
        return new ResponseEntity<>(hotels,HttpStatus.OK);
    }
    @Operation(
            summary = "Retrieve hotel by ID",
            description = "This endpoint fetches a hotel from the database based on its unique identifier."
    )
    @GetMapping("/find/{id}")
    public ResponseEntity<ViewOneHotelRequest> findHotelById(@PathVariable Long id){
        Optional<ViewOneHotelRequest> Hotel=hotelservice.findHotelById(id);
        return Hotel.map(hotel -> new ResponseEntity<>(hotel, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @Operation(
            summary = "Search for hotels by location",
            description = "This endpoint find hotels based on the specified location parameter"
    )
    @GetMapping("/search")
    public ResponseEntity<List<Hotel>> findHotelByLocation(@RequestParam String location){
        List<Hotel> Hotels = new ArrayList<>(hotelservice.findHotelByLocation(location));
        return new ResponseEntity<>(Hotels,HttpStatus.OK);
    }
    @Operation(
            summary = "Update hotel by ID",
            description = "This endpoint updates a hotel from the database based on its unique identifier."
    )
    @PatchMapping("/update/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable Long id, @RequestBody Hotel updatedHotel){
        Hotel updated = hotelservice.updateHotel(id,updatedHotel);
        return new ResponseEntity<>(updated,HttpStatus.OK);
    }
    @Operation(
            summary = "Delete hotel by ID",
            description = "This endpoint deletes a hotel from the database based on its unique identifier."
    )
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteHotelById(@PathVariable Long id){
        hotelservice.deleteHotelById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Hotel with id "+id+" deleted successfully");
    }
    @Operation(
            summary = "Delete all hotels",
            description = "This endpoint deletes all hotels from the database."
    )
    @DeleteMapping("/delete/all")
    public ResponseEntity<String> deleteAllHotel(){
        hotelservice.deleteAllHotels();
        return ResponseEntity.status(HttpStatus.OK).body("All hotels deleted successfully.");
    }
    @Operation(
            summary = "Search Hotel using Elastic Search",
            description = "This endpoint searches hotels using elastic search based on the keyword provided."
    )
    @GetMapping("/search/el")
    public List<HotelModel> searchHotelByKeyword(@RequestParam String keyword){
        return hotelSearchService.searchHotelByKeyword(keyword);
    }
}
