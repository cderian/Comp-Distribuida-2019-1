Computación Distribuida 2019-1
Práctica 02

312224464 Estrada Gómez César Derian
311175318 Muñiz Patiño Andrea Fernanda
312242930 Rivera González Damián

*** Ejecución ***

Para compilar es necesario escribir en consola:

	javac -cp .:../lib/gs-core-1.3.jar:../lib/gs-ui-1.3.jar:../lib/gs-algo-1.3.jar *.java

Para ejecutar es necesario escribir en consola:

	java -cp .:../lib/gs-core-1.3.jar:../lib/gs-ui-1.3.jar:../lib/gs-algo-1.3.jar Main

*** CDGraph stopAction ***

	Para detener todo el proceso optamos por utilizar el método stop()
	Si bien es una manera insegura de hacerlo, para esta práctica es necesario realizarlo de
esta forma debido a que detiene de manera instantánea todos los nodos y el envío de mensajes.