# Scraper

## Overview

The Scraper is a Java application built with the Spring Boot framework. It functions as a tool to monitor the prices of various products across different markets in the United Kingdom. Leveraging web scraping techniques, this application retrieves data from designated sources and provides a convenient REST API for users to query and access the price information.

## Features

- **Scraping Capabilities**: Utilizes web scraping to extract pricing data from specified market websites.
- **Dynamic Monitoring**: Regularly updates and monitors the prices of selected products.
- **REST API**: Provides a set of RESTful endpoints for easy access to price information.

## Installation

1. Clone the repository: `git clone https://github.com/fragaeverton/scraper.git`
2. Navigate to the project directory: `cd scraper`
3. Build the project: `./mvnw clean package`
4. Run the application: `java -jar target/scraper.jar`

## Usage

Once the application is up and running, you can interact with it through its REST API endpoints. Here are some sample API calls:

- **Retrieve all monitored products**: `GET /products`
- **Retrieve all shops**: `GET /shops`
- **Retrieve price data for a specific product**: `GET /products/{productId}/price`
- **Add product** (need the shopId and the product link only): `POST /products/`
