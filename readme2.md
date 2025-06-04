## Cambios realizados respecto a lo escrito en papel:
He hecho que los métodos tengan como parámetro la matrícula y he creado un método getLitros para que muestre los litros de gasolina.
En clase coche he inicializado las variables. Además, he realizado el javadoc. La velocidad no se tiene en cuenta, por lo que debe ser siempre la misma para que los métodos tengan sentido, en este caso 20 km/h.

## Explicación del Observer:
Los métodos avanzaCoche() y ponerGasolina() en el Controller llaman a los del Model, y los del Model llaman al método notifyObservers() que llama a la clase del Observer, la cual lanza el aviso en caso de que los litros de gasolina sean menores a 10. Cuando avanzo un kilómetro, en la consola me sale el aviso, ya que los litros de gasolina están inicializados a 10 (también la matrícula y los litros actuales). También sale en caso de que el usuario seleccione poner gasolina y esta sea menor a 10.

Aviso tras avanzar (y que queden menos de 10L):

![imagen](images/avanzaCoche.png)

Aviso tras repostar (y que aún no se llegue a los 10L):
![imagen](images/ponerGasolina.png)

## Diagramas de secuencia:

crearCoche():

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

subirVelocidad():

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

avanzaCoche() con el observer:

```mermaid
sequenceDiagram
   participant View
   participant Controller
   participant ObserverGasolina
   participant Model

   View->>Controller: avanzaCoche("3455CXC")
   activate Controller
   Controller->>Model: avanzaCoche("3455CXC")
   deactivate Controller
   activate Model
   Model->>ObserverGasolina: update()
   deactivate Model
   activate ObserverGasolina
   ObserverGasolina->>View: alarmaRepostar()
   deactivate ObserverGasolina
   activate View
   View->>View: sout()
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


