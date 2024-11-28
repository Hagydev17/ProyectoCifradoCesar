Cifrado César en Java
Este proyecto implementa el Cifrado César, uno de los métodos más antiguos de cifrado de texto, que desplaza las letras del alfabeto por un número determinado de posiciones. 
El proyecto ofrece varias opciones para cifrar y descifrar textos tanto desde la consola como desde archivos.

Funcionalidades
Cifrado desde la consola: Permite ingresar un texto que se desea cifrar, el código valida si las letras del texto están en un arreglo de caracteres (alfabeto) y posteriormente 
se especifica el número de posiciones para desplazar el alfabeto.
Cifrado desde archivo: Permite leer un archivo de texto y cifrar su contenido.
Descifrado: Permite ingresar un texto cifrado y el número de desplazamiento para descifrarlo.
Generación de archivo con el texto cifrado: Los textos cifrados pueden guardarse en archivos para su posterior uso.

Requisitos
Java 8 o superior
Sistema operativo Windows (aunque el proyecto puede adaptarse a otros sistemas operativos con ajustes en las rutas de los archivos).

Estructura del Proyecto
Main: Punto de partida del programa.
CesarEncryptor: Contiene el alfabeto y el método que se ejecuta en el menú.
Menú: Muestra el menú principal, con distintos métodos que se invocan en cada caso.
ValidarAlfabeto: Valida si un texto contiene caracteres permitidos según el alfabeto usado en el cifrado.
DesdeConsola: Gestiona la entrada y salida del texto desde la consola para cifrar, crea un archivo .txt con el texto cifrado.
DesdeArchivo: Permite leer y cifrar desde una carpeta con archivos de texto.
Cifrado: Contiene la logica que hace posible el cifrado del texto.
Descifrado: Contiene la lógica para descifrar textos.
CrearArchivo: Genera un archivo con el texto cifrado.
