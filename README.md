# SpringApp AWS

## Maven commands
> Generated documentation
* `mvn clean package`
> Built app-shaded.jar and ready to deploy it as aws lambda
* `mvn clean package shade:shade`

## Deployed
> Locally, you can find rob service under
* http://localhost:8080
> AWS deploy
* https://d3tik7rsg5.execute-api.us-east-2.amazonaws.com/api

### Sample Request
#### Local sample
> POST http://localhost:8080/rob \
--header 'Content-Type: application/json' \
--data '{
"money" : [2,7,9,3,1]
}'
#### AWS sample
> curl --location 'https://d3tik7rsg5.execute-api.us-east-2.amazonaws.com/api/rob' \
--header 'Content-Type: application/json' \
--data '{
"money": [2,7,9,3,1]
}' 

### Documentation 
> It can be found under 
* rob-service/target/generated-docs/index.html
