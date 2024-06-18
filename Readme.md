# Backend Documentation

## Overview

This backend API is developed using Spring Boot and Java 17. It serves as the backend for managing and fetching data related to countries, regions, continents, and languages. The main functionalities include:

- Fetching details of all countries.
- Retrieving languages spoken in a specific country.
- Obtaining country statistics with the maximum GDP per population ratio for each country.

## Services

### CountryService

`CountryService` handles all operations related to country data, including fetching country details, retrieving spoken languages, and obtaining country statistics.

### RegionService

`RegionService` manages operations related to regions, including fetching details of regions and their associated countries.

### ContinentService

`ContinentService` handles operations related to continents, including retrieving details of continents and their associated regions.

### LanguageService

`LanguageService` manages operations related to languages, including fetching details of languages and their association with countries.

## Controllers

### CountryController

`CountryController` manages HTTP requests related to country data. It provides endpoints for fetching country details, retrieving languages spoken in a country, and obtaining country statistics.

### RegionController

`RegionController` handles HTTP requests related to region data. It provides endpoints for fetching region details and their associated countries.

### ContinentController

`ContinentController` manages HTTP requests related to continent data. It provides endpoints for fetching continent details and their associated regions.

### LanguageController

`LanguageController` handles HTTP requests related to language data. It provides endpoints for fetching language details and their association with countries.
