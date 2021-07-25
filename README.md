# Scrabble

Este proyecto trata sobre un lenguaje simplificado de programación inspirado en Scratch.

El siguiente código muestra la implementación de este lenguaje de programación simple con sus propios tipos y con operaciones básicas.

### *Consideraciones*

Como consideraciones a tener en cuenta para este proyecto es que no se consideran los complementos de 2 en el caso de las operaciones entre tipos binarios, además incluye en su implementación una forma de controlar la memoria del programa almacenando variables una sola vez y reutilizando las ya creadas. <br/> <br/>
En el caso del **MVC** (modelo vista controlador) para el **modelo**, se implementan los tipos especiales de Scrabble (Bool Float, Binary, Int y string). Para el caso del **Controlador** las operaciones se cuenta con una forma de representarlas mediante el uso de árboles de sintaxis abstracta de forma de que se puede representar cualquier cálculo de forma exacta. Finalmente Para la **Vista** se crea un interfaz la cual cuenta con un ejecutable el cual despliega una calculadora que funciona mediante arboles de sintaxis abatracta para ir representanndo las distintas operacioens que se le entregan.


### *Modo de uso*

* Ejecutamos el archivo __Scrabble.java__ en el directorio `src/main/java/cl/uchile/dcc/scrabble/gui/Vista` , y se nos presentará la siguiente ventana.<br/> <br/>
![image](https://user-images.githubusercontent.com/81189568/126917498-a7d0f465-8e3a-4318-bd88-40b2d8dade67.png)



* Para crear una variable hay que _*siempre*_ indicar el tipo correspondiente de esta usando los botones: `INT`, `FLOAT`, `BOOL`, `STRING` y `BINARY`.<br/> <br/>
  ![image](https://user-images.githubusercontent.com/81189568/126917509-687306dc-d5e6-497f-bdc7-45c6e6fb002d.png)

* Al apretar el botón de tipo, si escribe el número y/o valor y finalmente _*siempre*_ declare el fin de la una variable apretando el botón `END`. Al apretar `END` en la segunda variable se ajustará la expresión a una forma más visible.<br/> <br/>
  ![image](https://user-images.githubusercontent.com/81189568/126917513-f17ac11c-0f1d-4b30-a135-6a3130c85f2c.png)
  ![image](https://user-images.githubusercontent.com/81189568/126917517-a26e74b0-5cec-4107-b3e0-b3ae5b056173.png)
#
* Luego si tienes un conjunto de operaciones básicas puedes obtener el resultado de la operación con el botón `=` o volver a mostrar las operaciones de forma más visible con el botón `VIEW`.<br/> <br/>
  ![image](https://user-images.githubusercontent.com/81189568/126917528-d6bdc212-4922-4087-a8f6-c0f4649ee7cf.png)
  ![image](https://user-images.githubusercontent.com/81189568/126917529-45a92135-192c-46ad-b85e-62ec3e620791.png)


### Otras Consideraciones:
* Para Transformar una expresión a otro tipo existen los botones `toString`,`toBinary`,`toInt` y `toFloat`.
  <br/> <br/>
  __ADVERTENCIA__ :Se necesita *al menos* una operación existente para realizar una transformación.
  <br/> <br/>
* Las operaciones __siempre se operan entre 2 variables__.
  <br/> <br/>

* En caso de cometer algún error, la calculadora lo mostrará en pantalla. Para seguir utilizando debe usar el botón `BORRAR` el cual reiniciará la calculadora.









![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

Interactive graphic programming language heavily inspired by
[Scratch](https://scratch.mit.edu).
This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/),
and aims purely to be used with the purpose of teaching in the context of the course
_CC3002 Metodologías de Diseño y programación_ of the
[_Computer Sciences Department (DCC)_](https://www.dcc.uchile.cl) of the
_University of Chile_.
