# API RESTful Project

Java RESTful API criado como projeto para DIO

## Diagrama de Classes
```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class Account {
    -String icon
    -String description
  }
  User --> Account
  User --> Feature
  User --> Card
  User --> News
```
