# Hotel Management API

This API allows you to manage hotel information including creating, reading, updating, and deleting hotel data.

## Getting Started

To start using the API, navigate to the Swagger UI by opening the following URL in your browser:

[Swagger UI](http://localhost:8080/swagger-ui/index.html#)

## Endpoints

### Create Multiple Hotels

To create multiple hotel records, use the `POST /api/hotels/create/multiple` endpoint. You can test this endpoint using the Swagger UI. 

Here is an example payload to create multiple hotel entries:

```json
[
    {
        "hotelName": "Kathmandu Guest House",
        "location": "Thamel, Kathmandu",
        "contact": "+977 1-4700632",
        "numberOfRooms": 145,
        "rates": 3500.00,
        "rating": 4.2,
        "image": "https://example.com/kathmandu_guest_house.jpg"
    },
    {
        "hotelName": "Hotel Shanker",
        "location": "Lazimpat, Kathmandu",
        "contact": "+977 1-4410151",
        "numberOfRooms": 94,
        "rates": 7500.00,
        "rating": 4.5,
        "image": "https://example.com/hotel_shanker.jpg"
    },
    {
        "hotelName": "Hotel Himalaya",
        "location": "Kumaripati, Lalitpur",
        "contact": "+977 1-5523900",
        "numberOfRooms": 125,
        "rates": 6000.00,
        "rating": 4.3,
        "image": "https://example.com/hotel_himalaya.jpg"
    },
    {
        "hotelName": "Hyatt Regency Kathmandu",
        "location": "Taragaon, Kathmandu",
        "contact": "+977 1-5171234",
        "numberOfRooms": 280,
        "rates": 15000.00,
        "rating": 4.6,
        "image": "https://example.com/hyatt_regency.jpg"
    },
    {
        "hotelName": "Hotel Yak & Yeti",
        "location": "Durbar Marg, Kathmandu",
        "contact": "+977 1-4248999",
        "numberOfRooms": 270,
        "rates": 12000.00,
        "rating": 4.4,
        "image": "https://example.com/hotel_yak_yeti.jpg"
    },
    {
        "hotelName": "Dwarika's Hotel",
        "location": "Battisputali, Kathmandu",
        "contact": "+977 1-4479488",
        "numberOfRooms": 86,
        "rates": 22000.00,
        "rating": 4.8,
        "image": "https://example.com/dwarikas_hotel.jpg"
    },
    {
        "hotelName": "Radisson Hotel Kathmandu",
        "location": "Lazimpat, Kathmandu",
        "contact": "+977 1-4411818",
        "numberOfRooms": 260,
        "rates": 10000.00,
        "rating": 4.5,
        "image": "https://example.com/radisson_hotel.jpg"
    },
    {
        "hotelName": "Hotel Everest",
        "location": "New Baneshwor, Kathmandu",
        "contact": "+977 1-4780100",
        "numberOfRooms": 160,
        "rates": 9000.00,
        "rating": 4.3,
        "image": "https://example.com/hotel_everest.jpg"
    },
    {
        "hotelName": "Gokarna Forest Resort",
        "location": "Gokarna, Kathmandu",
        "contact": "+977 1-4451212",
        "numberOfRooms": 100,
        "rates": 13000.00,
        "rating": 4.7,
        "image": "https://example.com/gokarna_resort.jpg"
    },
    {
        "hotelName": "Hotel Annapurna",
        "location": "Durbar Marg, Kathmandu",
        "contact": "+977 1-4221711",
        "numberOfRooms": 150,
        "rates": 11000.00,
        "rating": 4.4,
        "image": "https://example.com/hotel_annapurna.jpg"
    }
]
```

## Running the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/kirankhanalleo/Hotel-API-with-elastic-search.git
    ```

2. Navigate to the project directory:
    ```bash
    cd Hotel-API-with-elastic-search
    ```

3. Build and run the application:
    ```bash
    mvn spring-boot:run
    ```

4. Open your browser and go to:
    ```
    http://localhost:8080/swagger-ui/index.html#
    ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- Thanks to the Swagger UI team for providing an easy-to-use interface for testing APIs.

---

Feel free to customize this `README.md` further based on your specific needs and any additional features of your API.
