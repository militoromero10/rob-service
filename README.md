# SpringApp AWS

## Maven commands
> Generated documentation
* `mvn clean package`
> Built app-shaded.jar and ready to deploy it as aws lambda
* `mvn clean package shade:shade`

## Deployed
> Locally, you can find rob service under
* http://localhost:8080

### Sample Request
> POST http://localhost:8080/rob \
--header 'Content-Type: application/json' \
--data '{
"money" : [5, 5, 10, 100, 10, 5]
}'

### Documentation 
> It can be found under 
* rob-service/target/generated-docs/index.html
