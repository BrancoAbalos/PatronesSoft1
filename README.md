# PatronesSoft1

Los cambios aplicados referente al codigo inicial son los siguientes:

1- Los atributos de la clase Cliente se cambiaron de visibilidad, pasaron de public a private para proteger su exposicion.

2- Se separo la funcion de pagar explicitamente de la clase Hotel y ahora esta a cargo la clase Cajero, la clase
Hotel llama a la clase Cajero por lo que tiene una dependencia
