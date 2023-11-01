## Design


# Clases

## Model
- `Json Manager`:
  - Agarrar los archivos de la carpeta `data` y cargar las diferentes tarjetas o guardarlas.
    - Load:
    - Save:
  - dirPath: `string` FINAL

- `XML Manager`:
  - Guardar los archivos en un XML format.
    - Save:
- dirPath: `string` FINAL
  
- `CSV Manager`:
  - Guardar los archivos en un CSV format.
    - Save:
  - dirPath: `string` FINAL
  
-  `Card`
   - Manejar mejor la informacion de las tarjetas
   - Usuario: `string`
   - ID: `int`
   - publicKey: `string`
   - Monto: `Double`
   - Coutas: `int`
   - NumeroDeTarjeta: `int` 16 digitos
   - FechaDeVencimiento: `int` 4 digitos
   - CodigoCVV: `int` 3 digitos

## Controller
-`Card Filter`:
    - Filtrar las tarjetas por diferentes criterios (Visa, Master, American) y llamar a las diferentes funciones dependiendo la tarjeta.
   - VISA: `int` = 4
   - Master: `int` = 5
   - American: `int` = 3
     - Filter: 
- `Process Manager`:
   -`VISA Process` :
       - Encriptar las tarjetas VISA y prepararlas para ser guardadas en un archivo.
     
   - `Master Process` :
       - Encriptar las tarjetas Master y prepararlas para ser guardadas en un archivo.

   - `American Process`:
       - Encriptar las tarjetas American y prepararlas para ser guardadas en un archivo.
- `Ecryption`:
   - Encriptar las tarjetas con un algoritmo de encriptacion.
     - Emperador:
     - MD5:

- `App`:
    - Correr la aplicacion
      - Main: Correr la aplicacion


# Interfaces

## Controller
-`FILES`:
    - Save:

**NOTE**: Pls LEAN lo que dice las instrucciones. :D
