# conversoDeMoneda
## Descripción del proyecto

El presente repositorio es el resultado de la aplicación práctica de conceptos fundamentales de Java orientada a objetos adquiridos en __Oracle Next Education__ en su ***octava generación***.

El objetivo de este desafío es crear una aplicación que permita a los usuarios convertir monedas de todo el mundo mediante el uso de APIs.

<img src="/Users/susanmarilinayuquemartinez/Documents/intellJ/imagen.png" width="400"/>

![image alt](https://github.com/Susanayuque/challenge-amigo-secreto/blob/d7f6171506fdaa2e1adb0d7255e286d50c6fa10f/imagenWeb.png)

## Funcionalidades

Los pasos que se siguieron para desarrollar este proyecto fueron los siguientes:

+ __Crear el record Moneda:__ Mediante esta clase inmutable se representara los atributos que se requieren para realizar las conversiones que se obtendran desde los APIs.

+ __Consultar moneda:__ Esta clase representa el proceso de obtener los datos desde una API para su posterior uso. Mediante el uso del link sugerido por la API, HttpClient, HttpRequest y HttpResponse se obtiene un json que luego se convierte en un gson.

+ __Conversor de moneda:__ En esta clase se convierte las monedas desde los datos obtenidos en la clase consultar moneda. Para lograrlo, se definen variables como: __"monedaBase, monedaTarget y la cantidad"__ que se desea convertir.

+ __Principal:__ Al hacer clic en ícono Play __"icono aqui"__, se muestra una lista de opciones de conversión de monedas que se debe escoger para continuar. Luego el sistema solicita la cantidad que se desea convertir. El resultado que se obtine es el tipo de cambio solicitado.


>[!NOTE]
> La opcion "8- Convertir otra moneda" se añade para ampliar el rango de monedas a convertir.

## Autores del proyecto

- Susan Ayuque

>[!IMPORTANT]
>Puedes encontrar este proyecto en el siguiente link: <https://susanayuque.github.io/challenge-amigo-secreto/> .
