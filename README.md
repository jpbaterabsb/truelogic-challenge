# Kafka challenge Truelogic

The goal of this challenge is to create a kafka producer and kafka consumer, the kafka producer should must fired by REST endpoint using POST method and payload should have email and name.

## Pré requisitos

- Maven 3+
- Java 8+
- Docker 18.02.0+ 
- Docker Compose

## Preparando ambiente

- Clone this repository.
- Execute `chmod +x ./run.sh` to authorize user execute run.sh file


## Run application

- Execute `./run.sh` to run application.

## Test 
For testing this application you can execute the following command:
```
curl --location --request POST 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Joao Paulo",
    "email": "joao.paulo@truelogic.com"
}'
```

Note: You should have installed the curl.