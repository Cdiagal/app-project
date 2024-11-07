<div align="justify">

  
# App-proyect "TaskYourself"

## **Descrición**

TaskYourself es una aplicación intuitiva y eficiente diseñada para ayudar a los usuarios a gestionar sus tareas diarias. Permite varias opciones al usuario como crear, modificar, organizar y hacer seguimiento de todas las tareas en una lista. Con una interfaz limpia y sencilla, se busca que no resulte aburrida interactuar con la App y al mismo tiempo, que el usuario no necesite demasiados pasos para cualquiera de las opciones que se ofrecen sobre las tareas.Por otra parte, para darle seguimiento a las tareas, TalkYourself tiene un sistema de notificaciones integrado para ayudar al usuario a cumplir con los propósitos, generando productividad en sus quehaceres. 

---

## **Elementos del diagrama de Casos de uso**
| Elemento                            | Descripción     
|---|---|
| **Actor: Usuario**                          | El usuario crea y gestiona sus tareas.|
| **Actor: Sistema**                          | Guarda todos los datos y las tareas.|
| **Caso de Uso: Crear tarea**                | El usuario crea una o varias tarea. |
| **Caso de Uso: Modificar tarea**            | Permite al Usuario modificar una o varias tareas.|
| **Caso de Uso: Eliminar tarea**             | El ususario puede eliminar una o varias tareas|
| **Caso de Uso: Marcador**                   | El ususario puede marcar tareas completadas o pendientes.|
| **Caso de Uso: Recordatorio**               | El usuario puede configurar un nuevo recordatorio.|
| **Caso de Uso: Notificación**               | El sistema envía una notificación al usuario.                                                    |

---

## **Relaciones entre los elementos**

| Elemento                            | Descripción                                                                                       |
|-------------------------------------|---------------------------------------------------------------------------------------------------|
| **Usuario → Crea tarea**     | Asociación: El usuario interactua con el sistema para crear la tarea.                                    |
| **Usuario → Modifica tarea** | Asociación: El usuario interactua con el sistema para modificar la tarea.                                |
| **Usuario → Eliminar tarea** | Asociación: El usuario interactua con el sistema para eliminar la tarea.                                 |
| **Usuario → Marcar tarea**   | Asociación: El usuario interactua con el sistema para marcar la tarea completada o pendiente.            |
| **Usuario → Recordatorio**   | Asociación: El usuario interactua con el sistema para configurar un recordatorio.                        |
| **Sistema → Notifica**       | Inclusión: Se activa una notificación cuando el usuario modifica o crea un recordatorio.                 |


---

## **Definición de actores y Operaciones**

### **Actores**

| **Actores** | **Definición** |
|-------------|-----------------------------------------------------------------------|
| **Usuario** | Persona que utiliza la aplicación para gestionar sus tareas diarias.|
| **Sistema** | Almacena datos de las tareas y envía notificaciones. |
| **Administrador** | Responsable de la administración general de la app. |

---

### **Operaciones**

| **Actores** | **Operaciones**|
|-------------|---------------------------------------------|
| → **Usuario** | - **Crear tarea**: permite al usuario crear una nueva tarea personalizada con diferentes atributos. <br> - **Modificar una tarea:** permite al usuario interactuar con la tarea para editar los atributos configurados, añadirle o quitarle. <br> - **Eliminar tarea:** permite al usuario eliminar una o varias tareas de la lista. <br> - **Marcar tarea:** permite al usuario tareas pendientes o completadas, ayudando a organizar las tareas. <br> - **Configurar recordatorio:** permite al usuario activar o modificar recordatorios sobre tareas de la lista. <br>|
|||
| → **Administrador**| - **Gestionar usuarios:** Permite al aministrador editar, crear, eliminar o bloquear cuentas de usuarios. <br> - **Ver estadísticas y datos:** permite al administrador hacer un estudio de uso y comportamientos de los usuarios con la app. <br> - **Configuración del sistema:** permite al administrador gestionar y hacer configuraciones avanzadas y necesarias del sistema. <br> - **Gestionar permisos:** permite al administrador hacer uso de la política de la app, bloqueando o desbloqueando opciones. <br> - **Seguimiento de seguridad:** el administrador actúa haciendo un seguimiento de las opciones de la app y el comportamiento de uso, pudiendo detectar o reparar riesgos de seguridad. |
|  |   |
| → **Sistema** | - **Almacena datos:** almacena toda la información de datos, actividad y detalles de todo el movimiento que se registra en la app. <br> - **Actualizar las tareas:** actualiza en todo momento las tareas de los usuarios. <br> - **Sincroniza datos:** el sistema detecta modificaciones o creaciones y automáticamente sincroniza toda la información. <br> - **Estadísticas:** genera estadísticas a partir de la información almacenada del usuario. <br> - **Envía notificaciones:** envía notificaciones personalizadas a los usuarios.  | 
|||






</div>
