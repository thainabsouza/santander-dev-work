#  Dev week 2024
Java Restful API criada pada Dev Week

## Diagrama  de classes 
```mermaid
classDiagram
    class User {
        String name
        -Account account
        -Feature[] reatures
        -Card card
        -News[] news
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

    class News {
        -String icons
        -String description
    }

    User "1"*--"1" Account
    User "1"*-- "N" Feature 
    User "1"*--"1"  Card 
    User "1"*-- "N" News 
 ```
