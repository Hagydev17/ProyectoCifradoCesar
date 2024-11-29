<h1>Cifrado César en Java</h1>
<div align="justify">
  Este proyecto implementa el Cifrado César, uno de los métodos más antiguos de cifrado de texto, que desplaza las letras del alfabeto por un número determinado de posiciones. 
  </br>El proyecto ofrece varias opciones para cifrar y descifrar textos tanto desde la consola como desde archivos.

<h3>Funcionalidades</h3>
</br>Cifrado desde la consola: Permite ingresar un texto que se desea cifrar, el código valida si las letras del texto están en un arreglo de caracteres (alfabeto) y posteriormente 
se especifica el número de posiciones para desplazar el alfabeto.
</br>Cifrado desde archivo: Permite leer un archivo de texto y cifrar su contenido.
</br>Descifrado: Permite ingresar un texto cifrado y el número de desplazamiento para descifrarlo.
</br>Generación de archivo con el texto cifrado: Los textos cifrados pueden guardarse en archivos para su posterior uso.

<h3>Requisitos</h3>
Java 8 o superior.
</br>Sistema operativo Windows (aunque el proyecto puede adaptarse a otros sistemas operativos con ajustes en las rutas de los archivos).

<h3>Estructura del Proyecto</h3>
Main: Punto de partida del programa.
</br>CesarEncryptor: Contiene el alfabeto y el método que se ejecuta en el menú.
</br>Menú: Muestra el menú principal, con distintos métodos que se invocan en cada caso.
</br>ValidarAlfabeto: Valida si un texto contiene caracteres permitidos según el alfabeto usado en el cifrado.
</br>DesdeConsola: Gestiona la entrada y salida del texto desde la consola para cifrar, crea un archivo .txt con el texto cifrado.
</br>DesdeArchivo: Permite leer y cifrar desde una carpeta con archivos de texto.
</br>Cifrado: Contiene la logica que hace posible el cifrado del texto.
</br>Descifrado: Contiene la lógica para descifrar textos.
</br>CrearArchivo: Genera un archivo con el texto cifrado.</div>
