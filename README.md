# lucky-name-service
This service will check if the name selected is lucky based on the name chosen by user and  DOB .

### System Requirement
- service requires java 9 and above 
 
### Pull and the the jar from github
- Step 01: pull the code by git clone https://github.com/agbankar/lucky-name-service.git
- Step 01: Navigate to target directory ./lucky-name-service/target
- Step 02: Open command prompt and Run below 
- **java -jar lucky-name-service-0.0.1-SNAPSHOT.jar**
### Test WIth Swagger UI
- Step 01: Hit  http://localhost:8080/swagger-ui.html from your browser
- Step 02: Click on lucky-name-controller
- Step 03: Click on GET
- Step 04: Click on try it out
- Step 05: Enter the dob e.g. 01/02/2019 and name e.g. ashish and click on execute
### Test With Curl 
- curl -X GET "http://localhost:8080/api/checkLuck?dob=10%2F12%2F2019&name=ashish" -H "accept: */*"
### Test With Request URI
- http://localhost:8080/api/checkLuck?dob=10%2F12%2F2019&name=ashish




