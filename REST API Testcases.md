# Testcases Proposed for Automation
Here is a list of testcases proposed for automation for the REST endpoints provided by Swagger Petstore API playground. 
## User Endpoints
1. User login (GET)
	 - Verify response code of 200 on valid login
	 - Verify response body contains session id on valid login
	 - Verify response code of 400 on invalid login
2. User logout (GET)
    - Verify response code of 200 on successful logout
    - Verify response body message "User logged out"
3. Create User (POST) 
	 - Verify response code of 200 on successful user creation
	 - Verify only logged in users can create user
	 - Verify invalid values in request body returns 400 response code 
	 - Verify response body on bad request 
	 - Verify user login with created user
	 - Verify user logout with created user
	 - Identify mandatory fields if any for user creation
4. Create with list of users (POST)
	- Verify creation of a list of users 
	- Verify response body on bad request
	- Verify user login with created users
	- Verify user logout with created users
5. Get user by username (GET)
    - Verify response code of 400 when invalid user name is supplied
    - Verify response code of 404 when user not found
    - Verify response code of 200 on successful operation
    - Verify retrieval of fields as per the response body sample 
6. Update user (PUT)
     - Verify only logged in user can run this request
     - Verify response code of 200 on successful operation
     - Verify user update by running Get user by user name request
     - Verify user cannot update unique fields 
     - Verify response on unsuccessful operation such as user not found
7. Delete user (DELETE)
      - Verify only logged in user can run this request
     - Verify response code of 200 on successful operation
     - Verify user delete by running Get user by user name request
     - Verify logged in user cannot delete themselves
     - Verify response code 404 on unsuccessful operation such as user not found
     - Verify response code of 400 on invalid username supplied

## Pet Endpoints
1. Add a new pet to store (POST)
	- Verify 200 response code on successful operation
	- Verify pet is added to the store by running find operations (find by status, tag, id)
	- Verify pet is added by querying store inventory
	- Verify response code 405 on invalid input
	- Verify response body on successful and unsuccessful operations
2. Update an existing pet (PUT)
     - Verify an existent pet can be updated and response code 200 on successful operation
     - Verify response code 400 for invalid ID supplied
     - Verify response code 404 for pet not found
     - Verify response code 405 for validation exception
     - Verify response body on successful and unsuccessful operations
3. Find pets by status (GET)
     - Verify response code 200 on successful operation
     - Verify find by different statuses - available, pending, sold
     - Verify default value of find by status is available
     - Verify response code of 400 on invalid status value
     - Verify response body on successful and unsuccessful operations
4. Find pets by tag (GET)
     - Verify response code of 200 on successful operation
     - Verify find by different tags - tag1, tag2, tag3. Note that a pet can have multiple tags
     - Verify find by multiple tags
     - Verify response code of 400 for invalid tag value
     - Verify response body on successful and unsuccessful operations
5. Find pets by ID (GET)
     - Verify response code 200 on successful operation
     - Verify response code of 400 on invalid ID supplied
     - Verify response code of 404 on pet not found
     - Verify response body on successful and unsuccessful operations
6. Update a pet in the store (POST)  
      - Verify petID is mandatory in request
      - Verify name and status are optional in request
      - Verify pet can be updated with combinations of petID, name and status
      - Verify response code 200 on successful operation
      - Verify response code 405 on invalid input
7. Delete a pet (DELETE)
	- Verify 200 response code on successful operation
	- Verify pet can be deleted by petID
	- Verify pet is deleted by running find operations (Find by status, id, tag)
	- Verify pet is deleted by querying store inventory
	- Verify response code 400 on invalid pet value
	- Verify response body on successful and unsuccessful operations

    
## Store Endpoints
1. Retrieve store inventory (GET)
    - Verify 200 response code on successful operation
    - Verify response on incorrect request 
    - Verify response body on successful and unsuccessful operations
2. Place an order for a pet (POST)
    - Verify 200 response code on successful operation
    - Verify 405 response on invalid input
    - Verify response body on successful and unsuccessful operations
    - Verify submission of purchase order by running find purchase order end point
3. Find purchase order by ID (GET)
    - Verify for valid response try integer IDs with value <= 5 or > 10
    - Verify order ID is mandatory for request
    - Verify 200 response code on successful operation
    - Verify 405 response on order not found
    - Verify 400 response for invalid ID supplied
    - Verify response body on successful and unsuccessful operations
4. Delete purchase order by ID (GET)
    - Verify for valid response try integer IDs with value < 1000
    - Verify order ID is mandatory for request
    - Verify 200 response code on successful operation
    - Verify 404 response on order not found
    - Verify 400 response for invalid ID supplied
    - Verify response body on successful and unsuccessful operations
    - Delete a newly added purchase order
