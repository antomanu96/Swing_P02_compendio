## Swing_P02_compendio

### Descripcion del proyecto

La práctica que debes realizar consiste en crear una interfaz gráfica, que permita gestionar una
plataforma de pisos de alquiler turísticos, siguiendo los estándares básicos de usabilidad. Los
requisitos que debe cumplir se detallan a continuación

### Contenido de la publicacion
- Un directorio llamado desarrollo en el que incluyas el directorio del proyecto de la práctica.
- Un directorio llamado ejecutable donde incluirás el ejecutable de la aplicación.
- Un directorio llamado documentación técnica donde incluirás el javadoc de la aplicación.
- Un directorio llamado documentos donde incluirás el documento sobre usabilidad.


### Desarrollo del proyecto
Crea un proyecto llamado “swing_c_p02_HernandezSanchezAntonioManuel" en Eclipse
1.Crearemos una ventana principal con:
- El tamaño sea la mitad de la resolución de mi pantalla y la ventana se abra justo en la mitad.
- El título “Gestión Apartamentos Turísticos ´El nombre que tu definas´”
- El icono de la ventana el anagrama de la empresa.
- Una barra de menú
- Un botón “Alta Pisos” (Imagen de Nuevo según normas de usabilidad (nemotécnico Alt + A)
en la ventana principal que abrirá la ventana Diálogo en modo modal, al igual que el ítem Altas
Pisos.
- Un botón “Baja Pisos” (Imagen de Eliminar según normas de usabilidad (nemotécnico Alt + B)
en la ventana principal que abrirá un mensaje indicando que no está desarrollada la opción

2.Ventana de dialogo:
- El tamaño de la ventana sea igual a la resolución de la pantalla

- El título “Alta Pisos”.

- Como icono de la ventana el anagrama de la empresa

- Un primer panel con color de fondo y un texto con el nombre de la empresa, con un
determinado estilo y color de fuente para que quede con vistosidad. Defínele un tipo de
borde.
- Para cada panel(JPanel), sus componentes tendrán un color determinado. Por ejemplo; el
panel Datos Personales todos los componentes en Azul, el panel Datos Reserva todos sus
componentes en verde, también incorpora algún borde.

- Un segundo panel que contendrá los componentes necesarios para recoger los siguientes
datos del arrendador:
Nombre, Apellidos, DNI y Teléfono. Con las siguientes restricciones:
El campo teléfono no debe permitir una entrada distinta de 9 dígitos.
El campo DNI no debe permitir una entrada distinta de 8 números y una letra.

- Un tercer panel que contendrá los componentes necesarios para recoger los siguientes datos
del inmueble:
o Dirección, provincia, fecha de alta, fecha final de disponibilidad, numero de
huéspedes, número de dormitorios, numero de baños, número de camas, tipo de
camas, “¿Niños?”, “Extras Niños”, imágenes, “Precio Mínimo”.
 “Provincia”, se podrá seleccionar de una lista de entre todas las provincias de España.
 “Fecha de alta”, se activará por defecto con la fecha actual.
 “Fecha final de disponibilidad”, se activará por defecto con la fecha actual más 1 año.
 “Nº de huéspedes”, se seleccionará de un JSpinner numérico de [0-8].
 “Nº de dormitorios”, se seleccionará de un JSpinner numérico de [0-4].
 “Nº de baños”, se seleccionará de un JSpinner numérico de [0-2].
 “Nº de camas”, se seleccionará de un JSpinner numérico de [0-4].
 “Tipo de camas”.
 Según el número de camas, se ira activando o desactivando, una zona para
elegir el tipo de cama de una lista preparada con las opciones más comunes
(simple, doble, sofá cama).
 “¿Niños?”, es una casilla de verificación
“Extras Niños”, es un panel dentro del este panel y solamente se activarán sus
componentes si activamos la casilla de verificación de ¿Niños? Por defecto estará
desactivado. Los componentes serán:
 “Edad de niños”, un JSpinner con valor mínimo de 0 y máximo de 10.
 “Extras” es un cuadro de texto que cuando reciba el foco presentara el
siguiente contenido:
 Si edad niños es [0-3] --- cuna
 Si edad niños es [4-10]---cama supletoria pequeña
 Un panel Imágenes en el cual se mostrarán tres “imágenes” del piso, tu elijes como
mostrarlas, todas a la vez, pasar de una a otra, etc.
 “Precio Mínimo”, se refiere al precio mínimo al día por el cual se ofertará el piso, dado
el siguiente cuadro de cálculo. Mostrará el resultado al obtener el foco. Cuadro de
cálculo.
Por cama doble_____________________ 20 €
Por sofá cama ______________________ 15 €
Por cama simple ____________________ 15 €
Por baño __________________________ 25 €
Cuna o cama supletoria ______________ 12 €
- Un cuarto panel compuesto por dos paneles tipo ficha (JTabbedPane), en uno se imprimirán
los datos del arrendador y en el otro los datos del inmueble, con un formato especifico.
- Un botón “Imprimir a Documento” (Imagen de Imprimir, según normas de usabilidad), si todos
los datos están cumplimentados correctamente se imprimirán en el panel cuarto.
- Un botón “Nuevo” (Imagen de Nuevo registro, según normas de usabilidad), toda la interface
debe de volver a su estado inicial (al abrirlo por primera vez, los campos en blanco, las
opciones por defecto y el foco en el campo nombre).
- Un botón “Guardar” (Imagen de Guardar, según normas de usabilidad), si la operación es
correcta, es decir, se han rellenado todos los campos obligatorios, debe aparecer el mensaje
“Registro Guardado”.
- Debes de añadir a la interfaz un componente que tu consideres interesante y no se hayan
utilizado, tienes que añadirle un ToolTipText que explique su utilidad. Además, debes de
gestionar un evento sobre él


### Como Ejecutar la aplicación desde el ejecutable

1.Windows
Nos vamos a la carpeta donde se cuentra nuestro archivo jar y hacemos doble para ejecutarlo

2.Linea de comandos
En linea de comandos nos posicionaremos con el comando cd en la carpeta donde se encuentra el jar y pondremos "java -jar nombreArchivoJar"

### Contruido con 
El codigo fue construido con el ide Eclipse

### Versionado 
Versión 1.0

### Autores
Antonio Manuel Hernández Sánchez

### Licencia
Licencia Libre

### Recursos adicionales
[github.com](https://github.com/)

