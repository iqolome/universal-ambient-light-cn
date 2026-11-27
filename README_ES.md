<img width="1280" height="720" alt="Universal Ambient Light" src="docs/banner.png" />

# Universal Ambient Light

Iluminación ambiental de pantalla para Android. La aplicación captura la pantalla (o filma
el televisor con la cámara del dispositivo), extrae los colores de los bordes y los envía a
una tira LED, un controlador o luces inteligentes. Sin captura también puede ejecutar efectos
de luz. Funciona en Android 8.0 y posteriores, tanto en teléfonos como en Android TV.

[简体中文](README_ZH.md) · [English](README.md) · [日本語](README_JA.md) · [한국어](README_KO.md) · [Русский](README_RU.md) · [Español](README_ES.md) · [Français](README_FR.md) · [Chat de Telegram](https://t.me/vasmarfas_chat) · [Apoyar el proyecto](SUPPORT.md) · [Licencias de terceros](THIRD_PARTY_LICENSES.md)

## Características

- **17 tipos de salidas**: WLED, DDP, E1.31 (sACN), Art-Net, tpm2.net, UDP raw, Open Pixel
  Control, Adalight y otras placas USB, Philips Hue, Nanoleaf, WiZ, Yeelight, LIFX, Govee,
  Zigbee2MQTT, Home Assistant y un servidor Hyperion / HyperHDR.
- **Búsqueda de dispositivos**: encuentra WLED, Hyperion, HyperHDR, puentes Hue, Nanoleaf,
  Home Assistant, WiZ, Yeelight, LIFX, Govee y nodos Art-Net en la red local en unos segundos.
- **Varios controladores a la vez**: junto al controlador principal puedes añadir otros, por
  ejemplo un segundo WLED en la pared o barras a los lados del televisor. Cada uno tiene su
  propia dirección, disposición de LED y parte de la pantalla.
- **Teléfono y Android TV**: diseños separados para pantallas táctiles y navegación con D-pad.
- **Captura con cámara**: filma el televisor con la cámara del dispositivo y corrige la
  perspectiva por cuatro esquinas, para televisores donde la captura de pantalla no está
  disponible.
- **Efectos de luz sin captura**: color sólido, degradado, blanco de cine, arcoíris, fuego,
  vela, aurora y más.
- **Música de color**: el efecto ilumina la tira por frecuencia, graves abajo, agudos arriba,
  desde el micrófono o desde el sonido que el propio dispositivo reproduce.
- **Retraso de iluminación por aplicación**, con ajuste automático: la cámara de un teléfono
  filma el televisor y el resplandor y mide cuánto se adelanta la tira a la imagen de la
  película que se está reproduciendo.
- **Canal de procesamiento ajustable**: calidad de captura, fotogramas por segundo, suavizado
  de color y latencia.
- **Inicio automático** tras el arranque, el sueño del televisor y las actualizaciones de la
  aplicación, **reconexión automática** tras una caída de la conexión.
- **Mando del teléfono**: empareja con el televisor mediante código QR; luego inicia, detén y
  cambia cada ajuste de iluminación del televisor desde el teléfono. El teléfono también
  funciona como mando del televisor con un ratón táctil y un teclado.
- **Copia de seguridad de ajustes**: todos los ajustes van a un archivo y de vuelta; en un
  televisor también a través del mando del teléfono.
- **Temporizador de sueño** que apaga la iluminación tras 15 minutos a 2 horas.
- **Modo de color promedio**: envía un solo color dominante en lugar de toda la tira, para
  dispositivos débiles.
- **Baldosa de Ajustes rápidos** para encender y apagar la luz.

## Controladores compatibles

| Grupo | Salida | Notas |
|---|---|---|
| Tira por la red | WLED | DDP o UDP raw, orden de color, RGBW, límite de brillo |
| | DDP | WLED, ESPixelStick, FPP y otros receptores DDP |
| | E1.31 (sACN) | universo inicial, LED por universo, unicast o multicast |
| | Art-Net | ArtDmx, universo inicial, LED por universo |
| | tpm2.net | paquetes de hasta 490 LED, puerto 65506 |
| | UDP raw | RGB puro en un datagrama, hasta 490 LED |
| | Open Pixel Control | FadeCandy / fcserver sobre TCP |
| Tira por USB | Adalight y kits USB | Ada, LightBerry APA102, AWA (HyperSerial), tpm2, Skydimo, SEDU, KarateLight, AtmoLight, SP616E |
| Luces inteligentes | Philips Hue | a través del puente, emparejado con su botón; un área de entretenimiento recibe un flujo de hasta 25 veces por segundo |
| | Nanoleaf | Light Panels, Canvas, Shapes, Elements, Lines |
| | WiZ, Yeelight, LIFX, Govee | protocolos de red local, sin nube |
| | Zigbee2MQTT | luces Zigbee a través de un broker MQTT |
| | Home Assistant | cualquier entidad light, como salida principal o junto a ella |
| Servidor | Hyperion / HyperHDR | FlatBuffers, prioridad de mensaje |

Las luces y paneles reciben el color de una zona de la pantalla (izquierda, superior, esquinas,
toda la pantalla, etc.) y siguen la imagen a la velocidad que pueden aceptar, no a la tasa de
fotogramas de una tira.

## Requisitos

- Android 8.0 (API 26) o superior.
- Permiso de captura de pantalla (MediaProjection).
- Acceso a la red local (para controladores y luces de red) o compatibilidad con USB Host
  (para Adalight y otras placas USB).

## Instalación

### Desde GitHub Releases
Las últimas versiones (**TV** y **Mobile**) se pueden descargar desde la [página de Releases](https://github.com/vasmarfas/universal-ambient-light/releases).

### [Google Play](https://play.google.com/store/apps/details?id=com.vasmarfas.UniversalAmbientLight)

### [RuStore](https://www.rustore.ru/catalog/app/com.vasmarfas.UniversalAmbientLight)

### Experimental: compatibilidad con cámara USB externa
Hay una compilación experimental con **compatibilidad con cámara USB externa (UVC)** para
configuraciones avanzadas: para dispositivos donde la captura de pantalla es limitada o no es
óptima. Esta versión usa controladores en espacio de usuario y se distribuye fuera de Google
Play.  
**Acceso anticipado para mecenas:** [Boosty — Experimental Build: External USB Camera Support](https://boosty.to/vasmarfas/posts/ba545975-558f-496f-bb3f-d181349f447c)

## Configuración

### 1. Conexión
1. Abre la aplicación y ve a **Settings**, o pulsa **Set up the controller** en la pantalla de
   inicio.
2. La pantalla del controlador enumera lo que encontró en la red. Elige un dispositivo, o
   elige su tipo en la lista de abajo e introduce la dirección a mano. **Check every address**
   escanea toda la subred en busca de WLED e Hyperion que no se anuncian por mDNS; tarda uno
   o dos minutos.
3. Un puente Hue y los paneles Nanoleaf se emparejan con un botón del dispositivo. Las luces
   (Hue, WiZ, Yeelight, LIFX, Govee, Zigbee2MQTT, Home Assistant) se asignan después a zonas
   de la pantalla; **Blink** junto a una luz muestra cuál es. Un puente Hue con un área de
   entretenimiento puede funcionar a través del área, y entonces las zonas no hacen falta.
4. Para un WLED elegido desde la búsqueda, la aplicación lee el número de LED configurado en
   WLED y lo indica si la disposición de LED de la aplicación tiene un número distinto.

### 2. Configuración de LED
- **Configuración de LED por lado**: puedes configurar cada lado por separado:
    - Superior: 60 LED (predeterminado)
    - Derecho: 34 LED (predeterminado)
    - Inferior: 60 LED (predeterminado)
    - Izquierdo: 34 LED (predeterminado)
- **Disposición de LED**: configura la esquina de inicio, la dirección (horario/antihorario) y
  activa o desactiva lados individuales.

### 2.1. Controladores adicionales
**Settings → Additional controllers** añade salidas que funcionan junto con el controlador
principal y muestran la misma imagen. Un controlador aquí se configura igual que el
principal: elige un dispositivo o tipo, introduce la dirección, abre su disposición de LED.

- **Un marco en la pared** es el mismo perímetro con sus propios conteos de LED.
- **Una barra al lado del televisor** es una disposición con un solo lado: establece el conteo
  izquierdo y deja los demás en 0. **Scan depth** define hasta dónde mira dentro de la imagen.
- **Una parte de un borde** se define con márgenes de captura: un margen derecho del 75 % en
  una tira superior deja el cuarto izquierdo del borde superior.
- **Salidas mixtas** también funcionan: Adalight como controlador principal y barras WLED
  junto a él, o una tira más lámparas de Home Assistant. Adalight solo puede ser el
  controlador principal; el USB se abre para él.

El suavizado y el retraso de salida son comunes a todos los controladores, así que las tiras
se mueven juntas. Los ajustes de imagen también son comunes; el brillo de WLED y DDP se
define por controlador. **Show LED layout test** en la disposición de un controlador enciende
solo ese controlador. Un controlador que no puede conectar no detiene a los demás; reintenta
en segundo plano y solo aparece en el registro.

### 3. Ajustes de captura
- **Fuente de captura**: elige entre el modo **Screen** (predeterminado) o **Camera**.
    - *Screen*: captura de pantalla estándar con la API MediaProjection (requiere permiso de
      captura de pantalla).
    - *Camera*: método alternativo con la cámara del dispositivo y corrección de perspectiva.
      Ideal para televisores que no admiten captura de pantalla o para configuraciones con un
      teléfono externo.
- **Tasa de captura (FPS)**: 30 FPS por defecto (opciones: 10, 15, 24, 30, 60).
- **Calidad de captura**:
    - *Low (64px)* — Para dispositivos de gama baja o para reducir la latencia.
    - *Medium (128px)* — Equilibrado (predeterminado, recomendado).
    - *High (256px)* — Solo para dispositivos potentes.
    - *Ultra (512px)* — Máxima calidad para dispositivos de gama alta.
- **Enviar color promedio**: actívalo para el máximo rendimiento (envía un solo color para
  toda la tira).
- **Detección de barras negras**: desactivada por defecto. Actívala para películas con barras
  arriba y abajo o a los lados: los bordes se toman de la imagen, no del borde de la
  pantalla. Un **Black threshold** de 18 sirve para la mayoría de fuentes; si las barras no se
  encuentran, súbelo a 24–30.
- **Ignorar subtítulos en la barra inferior**: una opción de la detección de barras negras,
  desactivada por defecto. La altura de la barra se toma del borde superior, la inferior solo
  se comprueba cerca de las esquinas, y las escenas oscuras mantienen el recorte. Los
  subtítulos sobre la imagen siguen llegando a los LED.

### 3.1. Configuración del modo cámara
Al usar **Camera** como fuente de captura:
1. Concede el permiso de **Camera** cuando se te solicite.
2. Abre **Settings** → **Camera Corner Setup**.
3. Coloca el dispositivo de modo que la cámara vea la pantalla del televisor.
4. Arrastra los cuatro marcadores de esquina (TL, TR, BR, BL) para que coincidan con los
   bordes de la pantalla del televisor.
5. Pulsa **Save** para guardar las posiciones de las esquinas.
6. La aplicación usará estas esquinas para la corrección de perspectiva durante la captura.

**Consejos:**
- Usa la vista previa en vivo de la pantalla principal para calibrar la posición del
  dispositivo antes de iniciar la captura.
- Asegura una buena iluminación para que la cámara vea claramente la pantalla del televisor.
- El ajuste de esquinas ayuda a compensar una colocación no perpendicular de la cámara
  respecto al televisor.

**Find the TV** en Camera Corner Setup intenta colocar las esquinas por ti. Durante cuatro
segundos observa el fotograma, distingue un panel encendido de la habitación por el brillo y
un televisor de una lámpara o una ventana según si la imagen cambia, y luego carga el
resultado en la superposición; no se guarda nada hasta que pulses Save. La tira se mantiene
apagada mientras se mide, de lo contrario su propio resplandor en la pared se interpreta como
parte de la pantalla.

Trátalo como un punto de partida, no como un ajuste terminado: delimita la imagen iluminada y
no el panel en sí, se confunde en una habitación muy luminosa, y las esquinas suelen necesitar
un ajuste manual después. Cuando no encuentra nada indica por qué, y las esquinas guardadas
permanecen intactas; el motivo detallado va a logcat bajo `AutoFrameDetection` y
`CameraEncoder`.

### 3.2. Modo de sueño de la cámara
La captura con cámara no recibe ninguna señal de espera del televisor, así que una pantalla
apagada sigue enviando ruido del sensor a la tira. El grupo de ajustes **Camera Sleep Mode**
(visible solo cuando la fuente de captura es **Camera**) monitoriza el área calibrada de la
pantalla y suspende el canal de captura cuando no hay nada nuevo que mostrar. Desactivado por
defecto.

- **Enable sleep mode**: interruptor principal de la función.
- **Sleep delay (seconds)**: cuánto tiempo debe permanecer en blanco la imagen antes de que
  la tira se apague. Rango: 5–3600 segundos, valor predeterminado 120. Bájalo para una
  respuesta más rápida; súbelo si las escenas oscuras activan el modo de sueño.
- **Blank screen threshold (0–96)**: brillo medio del área monitorizada a partir del cual se
  considera la pantalla en blanco. Predeterminado: 12. Auméntalo si un televisor apagado no
  se detecta.
- **Motion sensitivity threshold (1–64)**: el cambio mínimo de imagen necesario para contar
  como movimiento. Predeterminado: 4. Auméntalo si el ruido del sensor despierta la tira
  repetidamente.
- **Sleep on a static picture**: también suspende la transmisión de fotogramas cuando la
  imagen deja de cambiar (vídeo en pausa, menú estático); la tira conserva sus últimos
  colores. Desactivado por defecto, ya que una escena estática prolongada congelará los
  colores de la tira.

Mientras está en modo de sueño, la cámara permanece vinculada pero se muestrea a 5 Hz sobre
una cuadrícula de luminancia dispersa en lugar de ejecutar el canal completo de corrección de
perspectiva. Para despertar hacen falta dos muestras consecutivas por encima del umbral, así
que un solo fotograma ruidoso no puede hacer parpadear la tira. Los cuatro ajustes se pueden
modificar con la captura en marcha, ya que solo se pueden calibrar frente a una señal en vivo.

### 3.3. Color y brillo
**Color processing** está desactivado por defecto, y la tira recibe los colores de la
pantalla tal cual. El sketch de Adalight y la mayoría de las placas USB los pasan a los LED
sin corrección gamma, así que los tonos medios se ven más brillantes en la tira que en la
pantalla, los colores se ven lavados y las barras negras de un vídeo (el negro allí suele ser
16 de 255) brillan un poco. Para una tira así, empieza con:

- **Color processing**: activado.
- **Gamma R**, **Gamma G**, **Gamma B**: 45 %. La escala está invertida: por debajo del 100 %
  los tonos medios se oscurecen, los colores se enriquecen y el gris oscuro se apaga; el 45 %
  equivale a gamma 2.2.
- **Saturation**: 120–140 %.
- **Brightness**: bájalo aquí o con la constante `BRIGHTNESS` del sketch.

La vista previa bajo los deslizadores muestra el resultado en R, G, B puros y una rampa de
grises. Hyperion hace la corrección gamma por su lado, así que allí el procesamiento de color
suele dejarse tal cual.

### 4. Suavizado
- **Enable Smoothing**: desactivado por defecto. Sin él la tira repite cada fotograma, lo que
  se ve como parpadeo en los cambios de escena; actívalo para películas.
- **Preset**: "Off" por defecto. Al elegir un preajuste se activa o desactiva el suavizado
  solo. "Responsive": transición de 50 ms, 60 Hz. "Balanced": 200 ms, 80 ms de retraso de
  salida, 25 Hz. "Smooth": 500 ms, 200 ms, 20 Hz.
- **Settling Time**: 50 ms por defecto, 0–1000 ms.
- **Output Delay**: 0 ms por defecto, 0–1000 ms. Auméntalo si la tira se adelanta a la imagen
  (**Lighting delay**, sección 7, lo hace por aplicación).
- **Update Frequency**: 60 Hz por defecto (20, 25, 30, 40, 50, 60 Hz).

### 5. Inicio
1. Concede el permiso de **Screen Capture / Casting** cuando se te solicite.
2. Activa el botón para iniciar el capturador.

### 6. Efectos
El botón de paleta en la pantalla de inicio abre los efectos. Un efecto ilumina la tira sin
captura de pantalla: no hay diálogo de permiso, y lo que hay en el televisor no importa.
Estáticos: color sólido, degradado, blanco de cine (temperatura de color; 6500 K es el blanco
de referencia). Animados: arcoíris, ciclo de color, respiración, vela, fuego, aurora, océano,
plasma, cometa. **Layout test** pinta los lados de colores distintos y hace recorrer un punto
blanco desde el primer LED, lo que deja claro un layout de LED incorrecto.

**Color music** toma el sonido del micrófono del dispositivo en el que corre la aplicación, o
de lo que el propio dispositivo reproduce (fuente de sonido: Sound of this device, sin
micrófono). La segunda opción no ve el sonido enviado a un receptor como flujo Dolby o DTS
(passthrough): ese sonido evita Android. El sonido se divide en 16 bandas de frecuencia: los
graves iluminan la parte inferior de la pantalla en rojo, las bandas suben por los lados y
llegan al centro del borde superior en azul. La tira reacciona cuando el sonido supera su
media del último segundo y medio: los golpes y los cambios destellan; un sonido constante
como el ruido de la habitación se atenúa en un par de segundos. Sensitivity define cuán
grande debe ser la subida para iluminar la tira. El sonido se analiza en el dispositivo y no
se graba. Ambas fuentes necesitan el permiso de grabación de audio; el efecto no se ofrece en
el mando del teléfono, porque el permiso tendría que concederse en el televisor.

**Keep on when the TV screen is off** deja el efecto funcionando como luz nocturna mientras el
decodificador del televisor sigue encendido. Algunos televisores cortan la red en espera; la
tira se apaga entonces de todos modos.

### 7. Retraso de iluminación
Los reproductores y las fuentes procesan el vídeo de forma distinta, así que la tira puede
adelantarse a la imagen en una cantidad distinta en cada aplicación. Settings →
**Lighting delay** guarda un retraso para todas las aplicaciones y una lista de aplicaciones
con su propio valor; el televisor cambia a ese valor mientras esa aplicación está en
pantalla. La parte por aplicación necesita acceso de uso, que se concede junto con los
permisos de inicio automático mediante ADB.

**Tune with the camera** se ejecuta desde un teléfono emparejado con el televisor. El
teléfono filma el televisor y el resplandor en la pared durante aproximadamente un minuto,
detecta cambios de escena en ambos y encuentra el desfase entre ellos. La tira se apaga unos
segundos al inicio mientras el teléfono busca la pantalla en el fotograma. Hace falta una
habitación oscura, una escena dinámica y toda la pantalla con algo de pared alrededor en el
encuadre. El resultado viene con una estimación de precisión y se guarda para la aplicación
que se está reproduciendo o para todas las aplicaciones. Una tira que va detrás de la imagen
no se puede corregir con un retraso: baja el suavizado o elige un método de captura más
rápido.

---

### 8. Copia de seguridad de ajustes
**Settings → Save settings to a file** escribe
`Download/universal-ambient-light-<date>-<time>.json`. En Android 8 y 9 se abre el selector
de archivos del sistema. **Restore settings from a file** sustituye todos los ajustes
actuales por los del archivo.

- El archivo contiene todos los ajustes, incluidos los controladores adicionales, y los
  tokens y contraseñas de tus luces en texto plano.
- El emparejamiento con el teléfono, las claves ADB y los permisos del sistema no están en el
  archivo. Se configuran de nuevo tras una reinstalación.
- Un método de captura que esta compilación o este dispositivo no tiene se omite; se
  conserva el actual.
- Android TV puede no tener selector de archivos del sistema; entonces la restauración
  necesita un gestor de archivos. Sin uno, empareja el teléfono y usa los mismos dos
  elementos en sus ajustes: el archivo permanece en el teléfono y los ajustes van al
  televisor.

### Detalles específicos por controlador

#### Hyperion
- **Host/Port**: IP y puerto del servidor (predeterminado `19400`).
- **Priority**: `100` (predeterminado).
- [Hyperion Documentation](https://docs.hyperion-project.org/)

#### WLED
- **Host**: IP del controlador.
- **Port**: `4048` (DDP), `19446` (UDP Raw, entrada Hyperion de WLED) o `21324` (UDP Raw,
  puerto realtime propio de WLED).
- **Protocol**: DDP (preferido).
- **Color Order**: asegúrate de que coincida con tus ajustes de WLED (p. ej., GRB para
  WS2812B).
- **RGBW**: funciona sobre DDP con cualquier longitud de tira, y sobre UDP Raw en el puerto
  `21324` (DRGBW, hasta 367 LED). El puerto `19446` es la entrada Hyperion de WLED: solo RGB
  puro, sin canal blanco, limitado a 490 LED.
  La aplicación extrae el canal blanco ella misma (el componente común a R, G y B se mueve a
  W), así que en WLED el tipo de tira debe ser RGBW y **Calculate white channel from RGB**
  debe estar en `Manual only` o `Dual`. En los modos automáticos WLED descarta el valor
  blanco que recibe y lo vuelve a calcular a partir del RGB ya reducido, que resulta cero: los
  LED blancos se quedan apagados y los colores se ven lavados.
- [WLED Documentation](https://kno.wled.ge/)

#### E1.31 y Art-Net
- **Start universe**: el primer universo de la tira. Una tira más larga que **LEDs per
  universe** continúa en los universos siguientes.
- **LEDs per universe**: 170 llena los 510 canales; pon el valor del receptor si es distinto.
- E1.31 con una dirección vacía se envía como multicast a `239.255.x.y`.

#### tpm2.net, UDP raw, Open Pixel Control
- tpm2.net divide el fotograma en paquetes numerados; el tamaño se define en LED por paquete.
- UDP raw no tiene cabecera alguna, así que toda la tira debe caber en un datagrama (490 LED).
- OPC mantiene una conexión TCP al puerto `7890`; el canal 0 direcciona todos los canales del
  servidor.

#### Philips Hue
- Elige el puente en la búsqueda de dispositivos o introduce su dirección, luego pulsa el
  botón redondo del puente y **Pair** en un plazo de 30 segundos.
- Si la aplicación Hue tiene áreas de entretenimiento, la aplicación ofrece usar una. El
  puente recibe entonces un flujo DTLS en el puerto `2100` hasta 25 veces por segundo, y cada
  luz del área toma el color de su lugar definido en la aplicación Hue: de izquierda a
  derecha, y suelo, nivel del televisor o techo. A través de Hue API v2 una tira de degradado
  se divide en varios canales con sus propios lugares, así que muestra varios colores a lo
  largo; los puentes sin API v2 y diyHue reciben el flujo anterior, donde esa tira es una sola
  luz con un solo color. Un área admite hasta 10 luces. Mientras el flujo está activo, otras
  escenas y automatizaciones del puente no tocan estas luces.
- Los puentes emparejados con la versión 1.x de la aplicación no tienen clave de streaming;
  ese puente hay que emparejarlo de nuevo para usar un área.
- Sin un área, las luces del puente se listan en **Lights and zones**; cada una recibe una
  zona de pantalla. Los colores se convierten a la gama de cada luz. El puente admite unos
  diez comandos por segundo para todas las luces, así que la tasa de actualización se
  reparte entre ellas.

#### Nanoleaf
- Mantén pulsado el botón de encendido del controlador entre 5 y 7 segundos hasta que su luz
  parpadee, luego pulsa **Pair** en un plazo de 30 segundos.
- Cada panel toma el color del lugar que ocupa en la pared, relativo a los demás.

#### WiZ, Yeelight, LIFX, Govee
- Las luces se encuentran en la red local, sin nube y sin cuenta.
- Yeelight necesita **LAN Control** activado en la aplicación Yeelight. La aplicación pone
  cada Yeelight en modo música, lo que elimina el límite de 60 comandos por minuto.
- Govee necesita **LAN Control** activado para el dispositivo en la aplicación Govee Home. La
  API LAN establece un color por dispositivo; los segmentos de una tira no se direccionan por
  separado.

#### Zigbee2MQTT
- La dirección y el puerto (`1883` por defecto) son los del broker MQTT con el que trabaja
  Zigbee2MQTT, por ejemplo el complemento Mosquitto de Home Assistant. Usuario, contraseña y
  tema base (`zigbee2mqtt` por defecto) se definen en los ajustes de conexión.
- La lista de luces proviene del mensaje retenido `zigbee2mqtt/bridge/devices`; solo se
  muestran los dispositivos que exponen una luz. Los colores se publican en
  `zigbee2mqtt/<name>/set`.
- Zigbee es lento para escenas rápidas: unas pocas actualizaciones por segundo por luz es lo
  que la red tolera sin retrasos.

#### Adalight (USB)
- **Baud Rate**: `115200` (predeterminado) o el que coincida con tu firmware. Los firmwares
  HyperSerial suelen ir a `2000000`.
- **Protocol**: ADA (Arduino estándar), LBAPA (APA102), AWA (HyperSerial), tpm2, Skydimo,
  SEDU, KarateLight (8 o 16 canales), AtmoLight (5 canales), SP616E.
- [Adalight Repository](https://github.com/adafruit/Adalight)

##### Sketch de Arduino para Adalight

Hay un sketch de Arduino listo para usar y compatible con la aplicación en
[`adalight-sketch.ino`](adalight-sketch/adalight-sketch.ino).

**Inicio rápido:**

1. **Instala la biblioteca FastLED:**
    - En Arduino IDE: `Tools` → `Manage Libraries` → busca "FastLED" → instala

2. **Configura el sketch:**
    - Abre `adalight-sketch/adalight-sketch.ino`
    - Modifica las constantes al inicio del archivo:
        - `DATA_PIN` — pin de conexión de la tira LED (predeterminado 9 en Uno/Nano, 2 en
          ESP32 y ESP8266)
        - `NUM_LEDS` — número de LED de la tira (¡debe coincidir con los ajustes de la
          aplicación!)
        - `LED_TYPE` — tipo de tira LED (WS2812B, WS2811, SK6812, etc.)
        - `COLOR_ORDER` — orden de color (GRB para WS2812B, RGB para otros)
        - `BRIGHTNESS` — brillo (0-255)

3. **Cableado:**
    - DATA de la tira LED → pin del Arduino (predeterminado 9)
    - VCC de la tira LED → 5V del Arduino (o fuente externa para tiras largas)
    - GND de la tira LED → GND del Arduino
    - **Importante:** para tiras largas (>10 LED), ¡usa una fuente externa de 5V!

4. **Sube el sketch:**
    - Conecta el Arduino al ordenador por USB
    - Selecciona la placa y el puerto en Arduino IDE
    - Sube el sketch

5. **Conecta a Android:**
    - Desconecta el Arduino del ordenador
    - Conecta el Arduino al dispositivo Android con un cable USB OTG
    - En la aplicación, selecciona el tipo de conexión: **Adalight**
    - Establece Baud Rate: **115200**
    - Selecciona el protocolo: **ADA**
    - Asegúrate de que el número de LED en la aplicación coincida con `NUM_LEDS` del sketch

**Ejemplo de cableado WS2812B:**
```
WS2812B DATA → Pin 9 Arduino
WS2812B VCC  → 5V Arduino (or external 5V)
WS2812B GND  → GND Arduino
```

**Para otros tipos de LED:**
- **APA102 (SPI)**: usa la biblioteca FastLED con configuración `APA102` y el protocolo
  **LBAPA** en la aplicación
- **WS2811**: similar a WS2812B, normalmente `COLOR_ORDER = RGB`
- **SK6812**: similar a WS2812B, normalmente `COLOR_ORDER = GRB`

**Solución de problemas:**
- Si los LED no se encienden: comprueba el cableado y asegúrate de que `NUM_LEDS` coincida
  en el sketch y en la aplicación
- Si los colores son incorrectos: cambia `COLOR_ORDER` (prueba RGB, GRB, BRG)
- Si no se reciben datos: comprueba el Baud Rate (debe ser 115200) y asegúrate de que el
  cable USB OTG admita transferencia de datos

## Funciones de Android TV
Esta aplicación está totalmente optimizada para Android TV, incluyendo compatibilidad con
Leanback Launcher y navegación con D-pad. Para facilitar la entrada de texto (direcciones
IP), recomendamos usar la aplicación "Google TV" o "Android TV Remote" en el teléfono.

## Mando del teléfono
La iluminación de un televisor se puede controlar desde un teléfono con la misma aplicación:
encenderla y apagarla y cambiar cualquier ajuste, incluso en medio de una película en otra
aplicación. Color, brillo y disposición de LED se aplican de inmediato; dirección del
controlador, protocolo y suavizado se aplican en un segundo sin reiniciar la captura.

1. En el televisor: pantalla de inicio → **Control from a phone** (o Settings → Remote
   control). La pantalla muestra un código QR, la dirección y el código de emparejamiento.
2. En el teléfono: pantalla de inicio → **TV remote** → **Scan QR code**. Si la cámara no
   puede leerlo, introduce la dirección y el código a mano.
3. El teléfono recuerda el televisor y se reconecta en el siguiente arranque. **Disconnect**
   en la pantalla de inicio vuelve a poner el teléfono en su propia iluminación.

El teléfono y el televisor deben estar en la misma red local. La conexión está cifrada con
AES-256-GCM usando la clave del código QR; **Change the pairing code** en el televisor
desconecta todos los teléfonos. Mientras el acceso está activo, el televisor mantiene un
servicio en segundo plano con una notificación: sin él el teléfono no podría encender la
iluminación cuando la aplicación del televisor está cerrada.

El teléfono también es útil para configurar ADB en el propio televisor: el código de 6
dígitos de Wireless debugging se escribe en el teléfono, y el televisor encuentra solo el
puerto de emparejamiento.

Las esquinas de la cámara se arrastran en el propio televisor; desde el teléfono solo está
disponible la búsqueda automática de pantalla.

**Remote** en la pantalla de inicio del teléfono lo convierte en un mando del televisor:
D-pad, Back, Home, botones de volumen y reproducción, un panel táctil que mueve un cursor en
el televisor (un toque hace clic, dos dedos desplazan), un campo de texto cuya entrada
aparece de inmediato en el televisor, y una lista de aplicaciones del televisor para lanzar.
Botones, ratón y texto pasan por ADB en el televisor; sin ADB solo están disponibles los
botones del sistema, los toques y el texto a través del servicio de accesibilidad
(compilaciones de GitHub y RuStore).

## Inicio automático
**Grab on Boot** (activado por defecto) restablece la iluminación tras el arranque del
televisor, al despertar del sueño o al actualizar la aplicación, si la iluminación estaba
encendida antes. Tras el sueño, un watchdog de alarma del sistema la reinicia, así que
también vuelve en firmwares que descargan las aplicaciones mientras el televisor duerme.

Los métodos de captura sin MediaProjection (Scrcpy/ADB, Screencap, Accessibility, Camera) no
necesitan nada más. MediaProjection en Android 10+ requiere una confirmación en pantalla, y
Android no la mostrará desde segundo plano hasta que la aplicación tenga permisos que solo se
pueden conceder por ADB. Tras emparejar ADB, abre Settings → **Autostart permissions** →
**Grant via ADB**; a partir de entonces la iluminación arranca sin diálogos.

Si el firmware fuerza la detención de la aplicación mientras el televisor duerme, nada puede
traerla de vuelta hasta el siguiente arranque: es una limitación del firmware.

## Control externo (KeyMapper, Tasker, botones del mando)
La aplicación expone una actividad de conmutación transparente que puede usar cualquier
herramienta de automatización capaz de iniciar una actividad — por ejemplo
[KeyMapper](https://github.com/keymapperorg/KeyMapper) para vincular un botón del mando:

- Componente: `com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity`
- Sin una acción conmuta: detiene la luz si está en marcha; en caso contrario la inicia.
- Con la acción `com.vasmarfas.UniversalAmbientLight.action.TURN_ON` solo inicia; con
  `com.vasmarfas.UniversalAmbientLight.action.TURN_OFF` solo detiene.

Prueba desde adb:

```
adb shell am start -n com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity
adb shell am start -a com.vasmarfas.UniversalAmbientLight.action.TURN_OFF
```

El inicio sigue mostrando el diálogo del sistema de captura de pantalla a menos que se
seleccione un método de captura que no necesite MediaProjection (Accessibility, Scrcpy/ADB,
Screencap, Camera).

## Notas importantes

### Usuarios de televisores TCL
En dispositivos TCL, la agresiva optimización de batería del sistema puede matar los
servicios en segundo plano.
**Solución:**
1. Ve a **Settings > Apps > Special App Access > Auto-Start**.
2. Activa Auto-Start para Universal Ambient Light.
3. Como alternativa, revisa la aplicación "Safety Guard" y añade la aplicación a las
   excepciones.

### Fire TV
Si el botón de inicio no hace nada en un Fire TV Stick, concede los permisos de superposición
y de captura de pantalla por adb. En el Stick activa **Developer options > ADB debugging**,
conéctate desde un ordenador con `adb connect <stick-ip>:5555` y ejecuta:

```
adb shell appops set com.vasmarfas.UniversalAmbientLight SYSTEM_ALERT_WINDOW allow
adb shell appops set com.vasmarfas.UniversalAmbientLight PROJECT_MEDIA allow
adb shell am force-stop com.vasmarfas.UniversalAmbientLight
```

Probado en Fire TV Stick HD con Fire OS 7.7.1.6. El método de captura Accessibility necesita
Android 11 y no funciona en Fire OS 7 (Android 9).

### Reproducción de vídeo de alta calidad (4K/HDR)
Los problemas de reproducción con vídeo de alta calidad (2K/4K/HDR) mientras la iluminación
ambiental está activa son una limitación de hardware de muchos televisores. Los procesadores
integrados a menudo no pueden manejar a la vez una decodificación de vídeo pesada y la
captura de pantalla. Es un problema profundo que rara vez se puede corregir por software.

**Si experimentas tartamudeo o retraso en el vídeo:**
1. Baja la calidad de reproducción a 1080p o 720p (según las capacidades de tu televisor).
2. O desactiva por completo la aplicación de iluminación ambiental al ver contenido de alta
   resolución.
3. Puedes probar a ajustar la calidad de captura y los FPS, pero es poco probable que
   resuelva del todo el problema.

**Vista previa negra donde debería estar el vídeo (4K/HDR, HEVC/VP9 — o *todo* el vídeo en
algunos televisores):**
Si la vista previa de Hyperion/WLED/HyperHDR muestra un rectángulo negro donde debería estar
el vídeo —mientras menús, miniaturas, fotos y los colores de prueba de la aplicación se
capturan bien—, **no** es un problema de DRM. En Android el vídeo se dibuja en un **plano de
vídeo por hardware (overlay)** dedicado que compone el hardware de pantalla y evita
SurfaceFlinger; `MediaProjection` solo ve lo que SurfaceFlinger compone, así que la región
del vídeo sale negra sólida. Normalmente esto solo afecta a 4K / HEVC de 10 bits / HDR10 /
Dolby Vision, mientras el 1080p habitual pasa por la pila normal — **pero algunos
dispositivos enrutan _todo_ el vídeo por el overlay** (p. ej. varios modelos Sony), y **en
otros depende del códec más que de la resolución**: en cajas Amlogic la reproducción
HEVC/VP9/AV1 sale negra a cualquier resolución, mientras H.264 (AVC) se captura a la
perfección, porque esos decodificadores entregan fotogramas comprimidos AFBC directamente al
plano de vídeo. Un archivo *local* negro descarta DRM. Es una limitación de la plataforma que
también afecta a todas las demás herramientas de iluminación ambiental en Android (Hyperion
Android, aplicaciones Lightpack, etc.): no hay solución para la ruta estándar de
`MediaProjection`, y los métodos `Scrcpy` / `Screencap` / `ADB` también están detrás de
SurfaceFlinger, así que muestran la misma zona negra.

Soluciones alternativas:
1. **Forzar H.264 (AVC)** si solo HEVC/VP9/AV1 sale negro: en SmartTube elige el flujo AVC en
   lugar de VP9; en Jellyfin desactiva la reproducción directa HEVC/AV1 para el cliente (o
   limita la tasa de bits) para que el servidor transcodifique a H.264.
2. **Baja la reproducción a 1080p** en el reproductor/servidor (Jellyfin → define tasa de
   bits / resolución máxima por dispositivo; Kodi → ajusta los ajustes de reproducción;
   mpv → `--hwdec=no` más `--vo=gpu`). El 1080p casi siempre pasa por la pila de composición
   habitual.
3. **Desactiva la decodificación por hardware** en el reproductor (Jellyfin Android:
   Settings → Player → desactiva "Prefer FMP4" y "Allow background audio playback"; en
   mpv → `--hwdec=no`). La decodificación por software fuerza el fotograma por la ruta de
   composición y restaura la captura.
4. **En dispositivos con root** — prueba el método de captura `Screencap (Root)` o
   `Screencap (Shell)` en Settings → estos pasan por el binario `screencap` en lugar de
   `MediaProjection`, lo que ayuda con algunas restricciones de captura; ten en cuenta que
   `screencap` también lee la salida de SurfaceFlinger, así que **no** recupera un plano de
   vídeo por hardware.
5. **En televisores con SoC MediaTek** el método experimental `MTK THAL Capture` captura
   directamente del motor DIP del fabricante (antes de la composición), y allí el 4K HDR
   funciona — pero requiere root y un chip MTK.

### Contenido protegido por DRM
Las **aplicaciones protegidas por DRM** (como Netflix, Disney+, Amazon Prime Video,
Кинопоиск y servicios de streaming similares) **no funcionarán** con el modo de captura de
pantalla debido a las restricciones de seguridad de Android. Es una limitación fundamental
de la API MediaProjection de Android y no se puede eludir.

**Por qué ocurre:**
- Android bloquea la captura de pantalla de contenido protegido por DRM para prevenir la
  piratería.
- Se aplica a nivel del sistema y las aplicaciones no pueden anularlo.

**Soluciones:**
1. **Usa el modo cámara**: cambia la fuente de captura a **Camera** en los ajustes. Este
   método usa la cámara del dispositivo en lugar de la captura de pantalla, así que funciona
   con contenido protegido por DRM. Tendrás que colocar un teléfono/tablet con la cámara
   orientada a la pantalla del televisor.
2. **Desactiva la iluminación ambiental**: apaga la función de iluminación ambiental al ver
   contenido protegido por DRM.
3. **Usa fuentes sin DRM**: mira contenido de fuentes que no usen protección DRM (archivos
   locales, YouTube, etc.).

**Nota:** el modo cámara requiere una calibración correcta de las posiciones de las esquinas
para una captura de color precisa.


## Licencia
Consulta [LICENSE.txt](LICENSE.txt)

## Contribuir
¡Las contribuciones son bienvenidas! No dudes en enviar Pull Requests o reportar Issues.
