# Java TrainStation_System
This project is a Java-based Trip Management System consisting of multiple classes that model a trip, including drivers, passengers, and various operations to manage these entities. The primary classes include `DriverS_2051710528`, `Huaman_2051710528`, `Passengers_2051710528`, `Trip_2051710528`, and utility methods within `MethodAndArray_2051710528`.

## Table of Contents

- [Overview](#overview)
- [Class Details](#class-details)
  - [Huaman_2051710528](#huaman_2051710528)
  - [DriverS_2051710528](#drivers_2051710528)
  - [Passengers_2051710528](#passengers_2051710528)
  - [Trip_2051710528](#trip_2051710528)
  - [MethodAndArray_2051710528](#methodandarray_2051710528)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

The system models a simple trip management scenario where trips have a driver and passengers. It includes functionalities to add, remove, and display trips and passengers, compute the maximum and average number of passengers, and save trip data to a file.

## Class Details

### Huaman_2051710528

The `Huaman_2051710528` class represents a human with common attributes such as name, ID, blood type, and nationality.

#### Attributes
- `String name`
- `String human_ID`
- `String blood_type`
- `String Nationality`

#### Methods
- Constructor with parameters: `Huaman_2051710528(String name, String human_ID, String blood_type, String Nationality)`
- Zero-argument constructor: `Huaman_2051710528()`
- Getters and setters for all attributes
- `toString()`: Returns a string representation of the human.

### DriverS_2051710528

The `DriverS_2051710528` class extends `Huaman_2051710528` and includes additional attributes specific to a driver, such as age and address.

#### Attributes
- `int age_driver`
- `String Address`

#### Methods
- Constructor with parameters: `DriverS_2051710528(int age_driver, String Address, String name, String human_ID, String blood_type, String Nationality)`
- Constructor with fewer parameters: `DriverS_2051710528(int age_driver, String Address)`
- Zero-argument constructor: `DriverS_2051710528()`
- Getters and setters for all attributes
- `toString()`: Returns a string representation of the driver, including the inherited human attributes.

### Passengers_2051710528

The `Passengers_2051710528` class extends `Huaman_2051710528` and includes additional attributes specific to a passenger, such as gender and phone number.

#### Attributes
- `String genders`
- `int phoneNumber`

#### Methods
- Constructor with parameters: `Passengers_2051710528(String genders, int phoneNumber, String name, String human_ID, String blood_type, String Nationality)`
- Zero-argument constructor: `Passengers_2051710528()`
- Getters and setters for all attributes
- `toString()`: Returns a string representation of the passenger, including the inherited human attributes.
- `equals(Object c)`: Compares two passengers based on their human_ID.

### Trip_2051710528

The `Trip_2051710528` class models a trip with attributes like trip number, date, driver, location, and vehicle type. It also manages a list of passengers.

#### Attributes
- `String number_trip`
- `String specific_date_trip`
- `DriverS_2051710528 DRIVER_TRIP`
- `int seats`
- `String location`
- `String type_vehicle`
- `int maxpassengers`
- `ArrayList<Passengers_2051710528> u`

#### Methods
- Constructor with parameters: `Trip_2051710528(String number_trip, String specific_date_trip, DriverS_2051710528 DRIVER_TRIP, int seats, String location, String type_vehicle, int maxpassenger)`
- Zero-argument constructor: `Trip_2051710528()`
- Getters and setters for all attributes
- `addPassenger(Passengers_2051710528 p)`: Adds a passenger to the trip.
- `equals(Trip_2051710528 c)`: Compares two trips based on their trip number.
- `compareTo(Trip_2051710528 o)`: Compares trips for sorting.
- `toString()`: Returns a string representation of the trip, including its passengers.

### MethodAndArray_2051710528

The `MethodAndArray_2051710528` class contains static methods for managing trips and passengers.

#### Methods
- `tripadd(Trip_2051710528 s)`: Adds a trip to the list of trips.
- `addpass(Trip_2051710528 s, Passengers_2051710528 p)`: Adds a passenger to a trip.
- `maxpass()`: Calculates and displays the trip with the maximum passengers.
- `Removepass(Trip_2051710528 s, Passengers_2051710528 t)`: Removes a passenger from a trip.
- `avg(String Specific_date_trip)`: Calculates and displays the average number of passengers for a specific date.
- `display()`: Displays all trips.
- `displayd()`: Returns a sorted list of trips as a `StringBuilder`.
- `savefile()`: Saves trip data to a file.

## Usage

To use this project, follow these steps:

1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Ensure you have the necessary dependencies.
4. Compile and run the `MethodAndArray_2051710528` class to execute the trip management functions.

## Contributing

Contributions are welcome! Please fork this repository and submit pull requests for any features, bug fixes, or enhancements.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
