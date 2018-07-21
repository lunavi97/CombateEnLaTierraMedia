# Combate en la Tierra Media

## Modelando combates en la Tierra Media

Modelaremos el comportamiento de los personajes de la Tierra Media, en su modo más combativo. Todas las unidades comienzan con una salud de 100 puntos.

* El enano ataca (10pts) cada vez con más fuerza (2 x ataques dados). Recibe ataques normalmente. Si descansa, recupera hasta el 25% de su salud inicial.
* El humano ataca (10 pts) cada vez con menos fuerza (-1 x ataques dados), a menos que descanse (recupera la fuerza inicial). Al recibir ataques pierde un poco de fuerza (-1 por ataque recibido).
* El elfo ataca (5pts) con más fuerza cada vez que recibe ataques (+2 ^ ataques recibidos). Si descansa, se calma y se cura completamente, pero sus ataques se debilitan nuevamente.

* El goblin ataca (3pts) débilmente, pero es muy dificil de golpear (1 de cada 10 veces lo golpean). Si descansa, se cura completamente.
* El orco ataca (15pts) con mucha fuerza. Los golpes no le hacen mucho efecto a su salud (1/4 del daño). No le sirve de nada descansar.
* El troll ataca (30pts) con muchísima fuerza, pero 2 de cada 3 veces pifia el golpe. Si descansa, se vuelve de piedra y no puede atacar más. Los golpes no le hacen daño.