# Getting Started with Docker

To run the project, it's necessary to have Docker or Docker-Compose installed [Install docker](https://docs.docker.com/engine/install/) , [Install docker-compose](https://docs.docker.com/compose/install/).

## Commands

Open your terminal and go to the project directory, then you should run the nex commands:

First We'll create the image
### `docker build -t poke/info:1.0 . `

Then We'll create the container
### `docker run --name poke-info -p8080:8080 -d poke/info:1.0 `

Runs the app in the development mode.\
Open [http://0.0.0.0:8080/ws/pokeinfo.wsdl](http://0.0.0.0:8080/ws/pokeinfo.wsdl) to view the WSDL in your browser.

if you wanna stop the container you should run
### `docker stop poke-info`

if you wanna remove the container you should run
### `docker rm poke-info`

if you wanna remove the image you should run
### `docker image rm poke/info:1.0`

## Run Directly with your IDE
The project use java 17 you need have your enviroment ready and run directly like a springboot application

Open [http://localhost:8080/ws/pokeinfo.wsdl](http://localhost:8080/ws/pokeinfo.wsdl) to view the WSDL in your browser.

# Consume the resources availables

You can consume every resource with the help of the command curl, Chrome Extension [Wizdler](https://chromewebstore.google.com/detail/wizdler/oebpmncolmhiapingjaagmapififiakb?hl=en-US&utm_source=ext_sidebar) or some UI tool like Postman, Insomnia, etc.

**http://localhost:8080/ws/** or **http://0.0.0.0:8080/ws/**
```
                              POST    abilitiesRequest
                              POST    baseExperienceRequest
                              POST    heldItemsRequest
                              POST    idRequest
                              POST    nameRequest
                              POST    locationAreaEncountersRequest
```

#### POST abilitiesRequest

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <abilitiesRequest xmlns="http://bankaya/pokeinfo">
            <name>[pokemon]</name>
        </abilitiesRequest>
    </Body>
</Envelope>
```

#### POST baseExperienceRequest

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <baseExperienceRequest xmlns="http://bankaya/pokeinfo">
            <name>[pokemon]</name>
        </baseExperienceRequest>
    </Body>
</Envelope>
```

#### POST heldItemsRequest

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <heldItemsRequest xmlns="http://bankaya/pokeinfo">
            <name>[pokemon]</name>
        </heldItemsRequest>
    </Body>
</Envelope>
```

#### POST idRequest

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <idRequest xmlns="http://bankaya/pokeinfo">
            <name>[pokemon]</name>
        </idRequest>
    </Body>
</Envelope>
```

#### POST nameRequest

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <nameRequest xmlns="http://bankaya/pokeinfo">
            <name>[pokemon]</name>
        </nameRequest>
    </Body>
</Envelope>
```

#### POST locationAreaEncountersRequest

```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <locationAreaEncountersRequest xmlns="http://bankaya/pokeinfo">
            <name>[pokemon]</name>
        </locationAreaEncountersRequest>
    </Body>
</Envelope>
```

# Connect to H2DB

Connect to the DB via browser [http://localhost:8080/h2-console](http://localhost:8080/h2-console) or [http://0.0.0.0:8080/h2-console](http://0.0.0.0:8080/h2-console)

Use the JDBC URL **jdbc:h2:mem:pokeinfo**, user **sa** and password **password** to connect.
You can check the history events storage in the DB whit the query
### `select * from event;`
