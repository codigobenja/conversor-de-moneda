###  Conversor de moneda

 ![](https://i.imgur.com/ahB8LQd.png)

### características:

- Realizado con Open JDK 17.
- Uso de libreria Gson 2.10.

### Descripción del Proyecto:

El Conversor de Divisas es el primer desafío de la ruta backend de ONE. Este proyecto proporciona una herramienta para convertir diferentes divisas utilizando la API ExchangeRate-API. Ofrece una interfaz amigable para que los usuarios seleccionen la moneda base, ingresen la cantidad a convertir y obtengan el valor equivalente en la moneda deseada. Además, permite a los usuarios realizar conversiones entre cualquier par de divisas, incluso si no están disponibles en el menú predeterminado.

### Funcionalidades:

Selección de Moneda Base: Los usuarios pueden elegir entre una variedad de opciones de monedas base disponibles en el menú.
Conversión Personalizada: Además del menú predeterminado, los usuarios pueden ingresar la divisa base y la divisa de destino para realizar conversiones personalizadas.
Registro de Consultas: El programa guarda un archivo JSON que registra las consultas realizadas por los usuarios, proporcionando un historial de las conversiones efectuadas.
Registro de Conversiones: Se genera un archivo de texto (.txt) que contiene las conversiones realizadas junto con las marcas de tiempo correspondientes. Cada archivo lleva el nombre de moneda, seguido de la marca de tiempo de cierre del programa.
Cómo pueden usarlo los usuarios:

Descargue o clone el repositorio del Conversor de Divisas.
Ejecute el programa principal.
Seleccione la moneda base de la lista proporcionada o ingrese las monedas base y de destino personalizadas.
Ingrese la cantidad a convertir.
Obtenga el valor equivalente en la moneda deseada.
Explore el historial de consultas en el archivo JSON generado.
Revise el archivo de registro de conversiones para obtener un seguimiento detallado de las conversiones realizadas.
