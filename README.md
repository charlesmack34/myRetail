**Introduction**

This is a Spring Boot RESTful service demonstrating the myRetail RESTful service case study

**Starting the service**

Before starting the service we need to first create the data store we're going to use within the service to store the prices for each product.

 - Execute the scripts below on a Postgres server (In the order listed; scripts located main/resources/db):
    1) CREATE_PRODUCT_PRICE.sql
    2) INSERT_PRODUCT_PRICE.sql
    
   You can execute the SELECT query in this file (SELECT_PRODUCT_PRICE.sql) to verify the scripts ran successfully. 
   
 - Next, we will open the project in any IDE that supports Spring Boot applications and we'll start the service.
 
 - Once the service has started, please open the Postman collection (located testIntegration/myRetail.postman_collection), proceed to open in Postman. If you don't have Postman is can be downloaded here: https://www.getpostman.com/apps
 
 - There are two sample requests (1 - GET, 1 - PUT) located within the myRetail postman collection that can be executed against the service. Feel free to change the path variables and request data for the GET and PUT request.  
 
 - The default Spring Boot security can be turned on by removing "exclude = {SecurityAutoConfiguration.class}" from MyRetailServiceApplication class and "spring.security.ignored=/**" from application.properties. This will require you to add Authorization to your request. You can find the password for the authorization provided in the console log during the service startup. The username is Spring Boot default "user".
 
Any further questions, please feel free to ask.
