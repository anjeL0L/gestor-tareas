# Gestor de tareas v1.01

## Integrantes
- [Angel Merancia]
- [Askahira Yescas]


## Descripción
Aplicación Java de consola para administrar tareas personales. Permite registrar, listar y marcar tareas como completadas utilizando almacenamiento en memoria y manejo de colecciones.

## Requisitos
- Java JDK (versión 17 o superior recomendada)
- Git
- IntelliJ IDEA

## Instalación y ejecución
1. Clonar el repositorio en tu máquina local: `git clone [URL_DEL_REPOSITORIO]`
2. Abrir la carpeta clonada desde IntelliJ IDEA.
3. Esperar a que Gradle sincronice las dependencias y construya el proyecto.
4. Ejecutar el método `main` dentro del archivo `src/main/java/org/example/Main.java`.

## Funcionalidades y responsables
- **Registrar tarea:** [Angel] (Rama: `feature/registrar-tarea`)
- **Listar tareas:** [Askahira] (Rama: `feature/listar-tareas`)
- **Completar tarea:** [Askahira] (Rama: `feature/completar-tarea`)

## Estructura del proyecto
El proyecto fue construido como un proyecto Java utilizando Gradle. La estructura principal separa el código fuente en `src/main/java/org/example/` e incluye el `gradle-wrapper.jar` para asegurar la correcta ejecución en diferentes entornos sin configuraciones adicionales.

## Flujo de colaboración
Se utilizó un flujo de desarrollo basado en ramas (Branching Workflow). Cada integrante implementó su funcionalidad en una rama aislada a partir de `main`. La integración del código se realizó exclusivamente a través de Pull Requests en GitHub, requiriendo la revisión y aprobación de al menos un compañero antes de fusionar (merge) los cambios.

## Pruebas
Las pruebas se realizaron de forma manual ejecutando la aplicación de consola. Se validó la captura correcta de datos, la iteración e impresión del `ArrayList` y el manejo de excepciones mediante bloques `try-catch` para evitar que el programa terminara inesperadamente al ingresar opciones inválidas en el menú.

## Resolución de Conflicto Controlado
**Origen:** Dos integrantes crearon ramas diferentes (`conflicto-A` y `conflicto-B`) a partir de la misma versión de `main` y modificaron intencionalmente la línea 1 de este archivo `README.md` al mismo tiempo. Al intentar integrar el segundo Pull Request, GitHub detectó el conflicto.
**Resolución:** El conflicto se resolvió localmente. Se actualizó la rama conflictiva haciendo un `pull` de `main`. Posteriormente, se utilizó el editor de conflictos nativo de IntelliJ IDEA para comparar ambas versiones y seleccionar el título final del documento. Se guardaron los cambios y se finalizó el merge.

---

## Preguntas de reflexión

**1. ¿Qué diferencia existe entre Git y GitHub?**
Git es el sistema de control de versiones local que se instala en la computadora para rastrear el historial de cambios en el código. GitHub es un servicio en la nube que aloja los repositorios de Git, proporcionando una interfaz gráfica y herramientas (como Pull Requests) para facilitar la colaboración en equipo[cite: 6].

**2. ¿Por qué conviene revisar git diff antes de hacer commit?**
Para verificar línea por línea qué se ha modificado, agregado o eliminado. Esto evita incluir por accidente archivos basura, contraseñas, o errores tipográficos, asegurando que el commit solo contenga los cambios deseados[cite: 6].

**3. ¿Cuál es la diferencia entre commit y push?**
El `commit` guarda un punto de control de los archivos de manera local en tu computadora. El `push` toma esos commits locales y los sube/sincroniza con el repositorio remoto (en GitHub) para que el resto del equipo pueda verlos[cite: 6].

**4. ¿Qué función tiene .gitignore y qué limitación presenta?**
Su función es indicarle a Git qué archivos o carpetas debe ignorar (como carpetas de compilación `build/`, configuraciones del IDE `.idea/` o archivos con secretos)[cite: 3]. Su principal limitación es que no elimina del repositorio los archivos que ya estaban siendo rastreados por Git antes de ser agregados al `.gitignore`; para solucionar eso, se debe usar un comando adicional (`git rm --cached`)[cite: 4, 6].

**5. ¿Por qué se versiona el Gradle Wrapper?**
Se versiona (específicamente `gradle-wrapper.jar` y sus propiedades) para garantizar la reproducibilidad del proyecto. Permite que cualquier otra persona que clone el repositorio pueda compilarlo y ejecutarlo usando la versión exacta de Gradle con la que fue creado, sin necesidad de instalar Gradle manualmente en su computadora[cite: 4, 6].

**6. ¿Cómo ayuda el README a que otra persona reproduzca el proyecto?**
Actúa como la puerta de entrada y el manual de