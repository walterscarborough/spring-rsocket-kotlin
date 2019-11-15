# Spring Rsocket Kotlin

## Setup
```bash
./mvnw clean install
```

## Usage
```bash
# Start the server
./mvnw -pl server spring-boot:run

# Start the client
./mvnw -pl client spring-boot:run

# Use the /chachkies endpoint
curl localhost:9090/chachkies
```
