# Hotel Management API

This API allows you to manage hotel information, including creating, reading, updating, and deleting hotel data.

## Running the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/kirankhanalleo/Hotel-API-with-elastic-search.git
    ```
2. Create database hotel_api:
   ```sql
   create database hotel_api
   ```
3. Create table hotel:
   ```sql
   create table hotel(
    hotel_id INT AUTO_INCREMENT PRIMARY KEY,
    hotel_name VARCHAR(255),
    location VARCHAR(255),
    contact VARCHAR(255),
    number_of_rooms VARCHAR(255),
    rates DECIMAL,
    rating FLOAT,
    image VARCHAR(255)
    )
   ```
4. Navigate to the project directory:
    ```bash
    cd Hotel-API-with-elastic-search
    ```

5. Build and run the application using Maven:
    ```bash
    mvn spring-boot:run
    ```

## Getting Started

To start using the API, navigate to the Swagger UI by opening the following URL in your browser:

[Swagger UI](http://localhost:8080/swagger-ui/index.html#)

## Endpoints

### Create a New Hotel
**POST /api/hotels/create**

Creates a new hotel record.

- **Request Body:**
  ```json
  {
        "hotelName": "Hotel Annapurna",
        "location": "Durbar Marg, Kathmandu",
        "contact": "+977 1-4221711",
        "numberOfRooms": 150,
        "rates": 11000.00,
        "rating": 4.4,
        "image": "https://example.com/hotel_annapurna.jpg"
    }
  ```
- **Response:**
  - Status: `201 Created`
  - Body: Created hotel details.

### Create Multiple Hotels
**POST /api/hotels/create/multiple**

Creates multiple hotel records.

- **Request Body:**
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
- **Response:**
  - Status: `201 Created`
  - Body: List of created hotel details.

### Update Hotel by ID
**PATCH /api/hotels/update/{id}**

Updates an existing hotel record by its ID.

- **Path Parameter:**
  - `id`: The ID of the hotel to be updated.
- **Request Body:**
  ```json
   {
        "hotelName": "Hotel Yak & Yeti",
        "location": "Durbar Marg, Kathmandu",
        "contact": "+977 1-4248999",
        "numberOfRooms": 270,
        "rates": 12000.00,
        "rating": 4.4,
        "image": "https://example.com/hotel_yak_yeti.jpg"
    }
  ```
- **Response:**
  - Status: `200 OK`
  - Body: Updated hotel details.

### Search for Hotels by Location
**GET /api/hotels/search**

Searches for hotels based on the location.

- **Query Parameter:**
  - `location`: The location to search for hotels.
- **Response:**
  - Status: `200 OK`
  - Body: List of hotels in the specified location.

### Search Hotel using Elastic Search
**GET /api/hotels/search/el**

Searches for hotels using Elastic Search.

- **Query Parameter:**
  - `keyword`: The search keyword.
- **Response:**
  - Status: `200 OK`
  - Body: List of hotels matching the search query.

### Retrieve All Hotels
**GET /api/hotels/find**

Retrieves all hotel records.

- **Response:**
  - Status: `200 OK`
  - Body: List of all hotels.

### Retrieve Hotel by ID
**GET /api/hotels/find/{id}**

Retrieves a hotel record by its ID.

- **Path Parameter:**
  - `id`: The ID of the hotel to be retrieved.
- **Response:**
  - Status: `200 OK`
  - Body: Details of the specified hotel.

### Delete Hotel by ID
**DELETE /api/hotels/delete/{id}**

Deletes a hotel record by its ID.

- **Path Parameter:**
  - `id`: The ID of the hotel to be deleted.
- **Response:**
  - Status: `204 No Content`

### Delete All Hotels
**DELETE /api/hotels/delete/all**

Deletes all hotel records.

- **Response:**
  - Status: `204 No Content`

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- Thanks to the Swagger UI team for providing an easy-to-use interface for testing APIs.

---
