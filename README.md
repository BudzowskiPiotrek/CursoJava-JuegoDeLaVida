 Juego de la Vida de Conway—Edición Simplificada.
 
 El juego de la vida es un autómata celular ideado por el matemático John Horton Conway en 1970. Aunque
 normalmente se juega en una cuadrícula bidimensional, tu versión será una simplificación lineal en una
 dimensión (una fila de células).
 
 Reglas Simplificadas:
 · Cadacelda puede vivir o morir en cada turno.
 · Cadacelda tiene dos vecinas adyacentes (excepto en los extremos).
 · Una celda vive en el siguiente turno si exactamente una de sus dos vecinas está viva. De lo
 contrario, muere o sigue muerta.
 
 Requisitos del Programa:
 
 Inicialización:
 · Empiezacon una fila de 10 celdas.
 · Laconfiguración inicial de las células vivas/muertas debe ser ingresada por el usuario como una
 serie de 10 enteros (1 para viva y 0 para muerta).
 
 Simulación:
 · Elprograma debe ejecutar 10 turnos de la simulación.
 · Encadaturno, calcula el nuevo estado de cada celda basado en el estado actual de sus vecinas.
 · Imprime el estado de la fila después de cada turno.
 
 Finalización:
 · Al final de los 10 turnos, el programa debe mostrar el estado final de la cuadrícula.
 
 Desafíos adicionales:
 
 Implementar un menú que permita elegir el modo de juego:
 · Modobásico el descrito anteriormente.
 · Modoaleatorio donde las células se van a dar valor (0 o 1) de forma aleatoria.
 · Modopersonalizado donde el usuario elija el numero de rondas que desea jugar.
 · Modoavanzado implementa una regla donde las celdas de los extremos se consideren vecinas.
 
 Puntuaciones:
 · Desarrollar el modo básico completo y sin errores serán 5 puntos.
 · Desarrollar el menu 1 punto
 · Desarrollar el modo aleatorio para las celulas 1 punto
 · Desarrollar el modo personalizado en el tamaño de las rondas 1punto.
 · Desarrollar el método avanzado 2 puntos
