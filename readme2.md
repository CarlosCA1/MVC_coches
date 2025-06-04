## Cambios realizados respecto a lo escrito:
He hecho que los métodos tengan como parámetro la matrícula y he creado un método getLitros para que muestre los litros de gasolina.
En clase coche he inicializado las variables. Además, he realizado el javadoc. La velocidad no se tiene en cuenta, por lo que debe ser siempre la misma para que los métodos tengan sentido, en este caso 20 km/h.



## Diagrama de secuencia:

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View

    
    View->>Controller: crearCoche("Seat", "3455CXC")
    activate View
    activate Controller
    Controller->>Model: crearCoche("Seat", "3455CXC")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller-->>View: Coche
    deactivate Controller
    deactivate View

```

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View

    View->>Controller: subirVelocidad("3455CXC")
    activate View
    activate Controller
    Controller->>Model: subirVelocidad("3455CXC")
    activate Model
    Model-->>Controller: Velocidad
    deactivate Model
    Controller-->>View: Velocidad
    deactivate Controller
    deactivate View
    
```


---
## Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +crearCoche(String, String, String)
          +getCoche(String)
          +subirVelocidad(String)
          +bajarVelocidad(String)
          +getVelocidad(String)
      }
      class View {+menu()}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +subirVelocidad(String)
          +bajarVelocidad(String)
          +getVelocidad(String)
      }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
      
```

---


