# Hotel Management API

This API allows you to manage hotel information, including creating, reading, updating, and deleting hotel data.

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
      "hotelName": "Example Hotel",
      "location": "Example Location",
      "contact": "+1234567890",
      "numberOfRooms": 100,
      "rates": 5000.00,
      "rating": 4.0,
      "image": "https://example.com/hotel.jpg"
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
          "hotelName": "Hotel Name",
          "location": "Hotel Location",
          "contact": "Hotel Contact",
          "numberOfRooms": 100,
          "rates": 5000.00,
          "rating": 4.0,
          "image": "https://example.com/hotel.jpg"
      },
      ...
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
      "hotelName": "Updated Hotel Name",
      "location": "Updated Location",
      "contact": "Updated Contact",
      "numberOfRooms": 120,
      "rates": 5500.00,
      "rating": 4.2,
      "image": "https://example.com/updated_hotel.jpg"
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
  - `query`: The search query.
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

## Running the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/kirankhanalleo/Hotel-API-with-elastic-search.git
    ```

2. Navigate to the project directory:
    ```bash
    cd Hotel-API-with-elastic-search
    ```

3. Build and run the application using Maven:
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
