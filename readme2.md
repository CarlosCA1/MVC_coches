```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View

    
    View->>Controller: crearCoche("Seat", "3455CXC")
    Controller->>Model: crearCoche("Seat", "3455CXC")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    activate View
    Controller-->>View: Coche
    deactivate View

```

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View

    
    View->>Controller: subirVelocidad("3455CXC")
    Controller->>Model: subirVelocidad("3455CXC")
    activate Model
    Model-->>Controller: Velocidad
    deactivate Model
    activate View
    Controller-->>View: Velocidad
    deactivate View

```
