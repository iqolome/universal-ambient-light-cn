<img width="1280" height="720" alt="Universal Ambient Light" src="docs/banner.png" />

# Universal Ambient Light

Éclairage d’ambiance pour Android. L’application capture l’écran (ou filme le téléviseur avec
la caméra de l’appareil), extrait les couleurs des bords et les envoie à une bande LED, un
contrôleur ou des lampes connectées. Sans capture, elle peut aussi faire tourner des effets
lumineux. Fonctionne sur Android 8.0 et versions ultérieures, sur les téléphones comme sur
Android TV.

[简体中文](README_ZH.md) · [English](README.md) · [日本語](README_JA.md) · [한국어](README_KO.md) · [Русский](README_RU.md) · [Español](README_ES.md) · [Français](README_FR.md) · [Chat Telegram](https://t.me/vasmarfas_chat) · [Soutenir le projet](SUPPORT.md) · [Licences tierces](THIRD_PARTY_LICENSES.md)

## Fonctionnalités

- **17 types de sorties** : WLED, DDP, E1.31 (sACN), Art-Net, tpm2.net, UDP raw, Open Pixel
  Control, Adalight et autres cartes USB, Philips Hue, Nanoleaf, WiZ, Yeelight, LIFX, Govee,
  Zigbee2MQTT, Home Assistant et un serveur Hyperion / HyperHDR.
- **Recherche d’appareils** : trouve WLED, Hyperion, HyperHDR, les ponts Hue, Nanoleaf, Home Assistant,
  WiZ, Yeelight, LIFX, Govee et les nœuds Art-Net sur le réseau local en quelques secondes.
- **Plusieurs contrôleurs à la fois** : en plus du contrôleur principal, vous pouvez en ajouter d’autres, par exemple
  un second WLED au mur ou des barres sur les côtés du téléviseur. Chacun a sa propre adresse, sa
  disposition LED et sa partie de l’écran.
- **Téléphone et Android TV** : interfaces distinctes pour les écrans tactiles et la navigation au D-pad.
- **Capture par caméra** : filme le téléviseur avec la caméra de l’appareil et corrige la perspective
  par quatre coins, pour les téléviseurs où la capture d’écran n’est pas disponible.
- **Effets lumineux sans capture** : couleur unie, dégradé, blanc cinéma, arc-en-ciel, feu,
  bougie, aurore et plus encore.
- **Musique en couleurs** : l’effet éclaire la bande selon les fréquences, les basses en bas, les aigus
  en haut, depuis le microphone ou depuis le son que l’appareil lui-même diffuse.
- **Délai d’éclairage par application**, avec réglage automatique : la caméra d’un téléphone filme le téléviseur et la lueur
  et mesure de combien la bande est en avance sur l’image du film en cours.
- **Pipeline réglable** : qualité de capture, fréquence d’images, lissage des couleurs et latence.
- **Démarrage automatique** après le démarrage, la mise en veille du téléviseur et les mises à jour de l’application, **reconnexion automatique** après une coupure de connexion.
- **Télécommande téléphone** : associez-vous au téléviseur par QR code, puis démarrez, arrêtez et modifiez chaque
  réglage d’éclairage du téléviseur depuis le téléphone. Le téléphone fonctionne aussi comme télécommande TV avec un pavé tactile
  souris et un clavier.
- **Sauvegarde des réglages** : tous les réglages vont dans un fichier et en reviennent, sur un téléviseur aussi via la télécommande téléphone.
- **Minuteur de sommeil** qui éteint l’éclairage après 15 minutes à 2 heures.
- **Mode couleur moyenne** : envoie une seule couleur dominante au lieu d’une bande complète, pour les appareils faibles.
- **Tuile Paramètres rapides** pour allumer et éteindre la lumière.

## Contrôleurs pris en charge

| Groupe | Sortie | Notes |
|---|---|---|
| Bande sur le réseau | WLED | DDP ou UDP raw, ordre des couleurs, RGBW, limite de luminosité |
| | DDP | WLED, ESPixelStick, FPP et autres récepteurs DDP |
| | E1.31 (sACN) | univers de départ, LED par univers, unicast ou multicast |
| | Art-Net | ArtDmx, univers de départ, LED par univers |
| | tpm2.net | paquets jusqu’à 490 LED, port 65506 |
| | UDP raw | RGB brut dans un datagramme, jusqu’à 490 LED |
| | Open Pixel Control | FadeCandy / fcserver sur TCP |
| Bande sur USB | Adalight et kits USB | Ada, LightBerry APA102, AWA (HyperSerial), tpm2, Skydimo, SEDU, KarateLight, AtmoLight, SP616E |
| Lampes connectées | Philips Hue | via le pont, appairé avec son bouton ; une zone divertissement reçoit un flux jusqu’à 25 fois par seconde |
| | Nanoleaf | Light Panels, Canvas, Shapes, Elements, Lines |
| | WiZ, Yeelight, LIFX, Govee | protocoles réseau local, sans cloud |
| | Zigbee2MQTT | lampes Zigbee via un broker MQTT |
| | Home Assistant | toute entité light, comme sortie principale ou en complément |
| Serveur | Hyperion / HyperHDR | FlatBuffers, priorité des messages |

Les lampes et panneaux reçoivent la couleur d’une zone d’écran (gauche, haut, coins, tout l’écran et
ainsi de suite) et suivent l’image au rythme qu’ils peuvent accepter, pas à la fréquence d’images d’une bande.

## Prérequis

- Android 8.0 (API 26) ou supérieur.
- Autorisation de capture d’écran (MediaProjection).
- Accès au réseau local (pour les contrôleurs et lampes réseau) ou prise en charge USB Host (pour Adalight
  et les autres cartes USB).

## Installation

### Depuis les GitHub Releases
Les dernières versions (**TV** et **Mobile**) peuvent être téléchargées depuis la [page Releases](https://github.com/vasmarfas/universal-ambient-light/releases).

### [Google Play](https://play.google.com/store/apps/details?id=com.vasmarfas.UniversalAmbientLight)

### [RuStore](https://www.rustore.ru/catalog/app/com.vasmarfas.UniversalAmbientLight)

### Expérimental : prise en charge des caméras USB externes
Une version expérimentale avec **prise en charge des caméras USB externes (UVC)** est disponible pour les configurations avancées — pour les appareils où la capture d’écran est limitée ou peu optimale. Cette version utilise des pilotes en espace utilisateur et est distribuée en dehors de Google Play.  
**Accès anticipé pour les soutiens :** [Boosty — Experimental Build: External USB Camera Support](https://boosty.to/vasmarfas/posts/ba545975-558f-496f-bb3f-d181349f447c)

## Configuration

### 1. Connexion
1. Lancez l’application et ouvrez **Paramètres**, ou appuyez sur **Configurer le contrôleur** sur l’écran d’accueil.
2. L’écran du contrôleur liste ce qu’il a trouvé sur le réseau. Choisissez un appareil, ou choisissez son type
   dans la liste ci-dessous et saisissez l’adresse à la main. **Vérifier toutes les adresses** parcourt tout le
   sous-réseau à la recherche de WLED et Hyperion qui ne s’annoncent pas via mDNS ; cela prend une minute
   ou deux.
3. Un pont Hue et des panneaux Nanoleaf s’appairent avec un bouton sur l’appareil. Les lampes (Hue, WiZ,
   Yeelight, LIFX, Govee, Zigbee2MQTT, Home Assistant) sont ensuite assignées à des zones d’écran ; **Clignoter**
   à côté d’une lampe indique laquelle c’est. Un pont Hue avec une zone divertissement peut fonctionner via
   la zone à la place, alors les zones ne sont pas nécessaires.
4. Pour un WLED choisi dans la recherche, l’application lit le nombre de LED défini dans WLED et le signale si la
   disposition LED de l’application a un nombre différent.

### 2. Configuration des LED
- **Configuration des LED par côté** : vous pouvez configurer chaque côté séparément :
    - Haut : 60 LED (par défaut)
    - Droite : 34 LED (par défaut)
    - Bas : 60 LED (par défaut)
    - Gauche : 34 LED (par défaut)
- **Disposition des LED** : configurez le coin de départ, le sens (horaire/antihoraire), et activez/désactivez les côtés individuellement.

### 2.1. Contrôleurs supplémentaires
**Paramètres → Contrôleurs supplémentaires** ajoute des sorties qui fonctionnent avec le contrôleur principal et
affichent la même image. Un contrôleur ici se configure comme le principal : choisissez un appareil ou
un type, saisissez l’adresse, ouvrez sa disposition LED.

- **Un cadre au mur** est le même périmètre avec ses propres nombres de LED.
- **Une barre sur le côté du téléviseur** est une disposition avec un seul côté : définissez le nombre à gauche et laissez les
  autres à 0. **Profondeur de balayage** définit jusqu’où elle regarde dans l’image.
- **Une partie d’un bord** se règle avec les marges de capture : une marge droite de 75 % sur une bande du haut laisse
  le quart gauche du bord supérieur.
- **Les sorties mixtes** fonctionnent aussi : Adalight comme contrôleur principal et des barres WLED à côté, ou une
  bande plus des lampes Home Assistant. Adalight lui-même ne peut être que le contrôleur principal, l’USB est ouvert
  pour lui.

Le lissage et le délai de sortie sont communs à tous les contrôleurs, pour que les bandes bougent ensemble. Les réglages
d’image sont communs aussi, la luminosité de WLED et DDP se règle par contrôleur. **Afficher le test de disposition LED** dans
la disposition d’un contrôleur n’allume que ce contrôleur. Un contrôleur qui ne peut pas se connecter n’arrête
pas les autres ; il réessaie en arrière-plan et n’apparaît que dans le journal.

### 3. Réglages de capture
- **Source de capture** : choisissez entre le mode **Écran** (par défaut) ou **Caméra**.
    - *Écran* : capture d’écran standard via l’API MediaProjection (nécessite l’autorisation de capture d’écran).
    - *Caméra* : méthode alternative utilisant la caméra de l’appareil avec correction de perspective. Idéale pour les téléviseurs qui ne prennent pas en charge la capture d’écran ou pour des configurations avec un téléphone externe.
- **Fréquence de capture (FPS)** : 30 FPS par défaut (options : 10, 15, 24, 30, 60).
- **Qualité de capture** :
    - *Faible (64px)* — Pour les appareils d’entrée de gamme ou pour réduire la latence.
    - *Moyenne (128px)* — Équilibrée (par défaut, recommandée).
    - *Élevée (256px)* — Pour les appareils puissants uniquement.
    - *Ultra (512px)* — Qualité maximale pour les appareils haut de gamme.
- **Envoyer la couleur moyenne** : activez pour des performances maximales (envoie une seule couleur pour toute la bande).
- **Détection des barres noires** : désactivée par défaut. Activez-la pour les films avec des barres en haut et en bas ou
  sur les côtés : les bords sont pris dans l’image, pas depuis le bord de l’écran. **Seuil de noir**
  18 convient à la plupart des sources ; si les barres ne sont pas trouvées, montez-le à 24–30.
- **Ignorer les sous-titres dans la barre du bas** : une option de la détection des barres noires, désactivée par défaut. La hauteur
  de la barre vient du bord supérieur, le bas n’est vérifié que près des coins, et les scènes sombres conservent
  le recadrage. Les sous-titres sur l’image atteignent toujours les LED.

### 3.1. Configuration du mode Caméra
Lorsque vous utilisez **Caméra** comme source de capture :
1. Accordez l’autorisation **Caméra** lorsqu’elle est demandée.
2. Ouvrez **Paramètres** → **Réglage des coins de la caméra**.
3. Positionnez votre appareil pour que la caméra voie l’écran du téléviseur.
4. Faites glisser les quatre marqueurs de coins (TL, TR, BR, BL) pour correspondre aux bords de l’écran du téléviseur.
5. Appuyez sur **Enregistrer** pour stocker les positions des coins.
6. L’application utilisera ces coins pour la correction de perspective pendant la capture.

**Conseils :**
- Utilisez l’aperçu en direct sur l’écran principal pour calibrer la position de votre appareil avant de démarrer la capture.
- Assurez un bon éclairage pour que la caméra voie clairement l’écran du téléviseur.
- Le réglage des coins aide à compenser un placement non carré de la caméra par rapport au téléviseur.

**Trouver le téléviseur** dans Réglage des coins de la caméra tente de placer les coins pour vous. Pendant quatre secondes, il
observe l’image, distinguant un panneau allumé de la pièce par la luminosité et un téléviseur d’une lampe ou d’une
fenêtre selon que l’image change, puis charge le résultat dans la superposition — rien n’est
enregistré tant que vous n’appuyez pas sur Enregistrer. La bande est maintenue éteinte pendant la mesure, sinon sa propre lueur sur
le mur serait lue comme une partie de l’écran.

Traitez-le comme un point de départ plutôt qu’un réglage fini : il délimite l’image allumée et
pas le panneau lui-même, se perd dans une pièce très éclairée, et les coins ont généralement besoin
d’être ajustés à la main ensuite. Quand il ne trouve rien, il dit pourquoi, et les coins enregistrés restent
intacts ; la raison détaillée va dans logcat sous `AutoFrameDetection` et `CameraEncoder`.

### 3.2. Mode sommeil caméra
La capture par caméra ne reçoit aucun signal de veille du téléviseur, donc un écran éteint continue
d’envoyer le bruit du capteur à la bande. Le groupe de réglages **Mode sommeil caméra** (visible uniquement
lorsque la source de capture est définie sur **Caméra**) surveille la zone d’écran calibrée et
suspend le pipeline de capture dès qu’il n’y a plus rien de nouveau à afficher. Désactivé par défaut.

- **Activer le mode sommeil** : interrupteur principal de la fonctionnalité.
- **Délai de sommeil (secondes)** : durée pendant laquelle l’image doit rester vide avant que la bande
  s’éteigne. Plage : 5–3600 secondes, défaut 120. Baissez-le pour une réponse plus rapide ; augmentez-le si les scènes
  sombres déclenchent le mode sommeil.
- **Seuil d’écran vide (0–96)** : luminosité moyenne de la zone surveillée à laquelle ou en dessous de laquelle
  l’écran est considéré comme vide. Défaut : 12. Augmentez-le si un téléviseur éteint n’est pas
  détecté.
- **Seuil de sensibilité au mouvement (1–64)** : le changement d’image minimal requis pour compter comme
  mouvement. Défaut : 4. Augmentez-le si le bruit du capteur réveille sans cesse la bande.
- **Sommeil sur une image statique** : suspend aussi la transmission des images lorsque l’image cesse
  de changer (vidéo en pause, menu statique) ; la bande conserve ses dernières couleurs. Désactivé par
  défaut, car une scène statique prolongée figera les couleurs de la bande.

En mode sommeil, la caméra reste liée mais est échantillonnée à 5 Hz sur une grille de luminance
éparse au lieu d’exécuter le pipeline complet de correction de perspective. Le réveil exige deux
échantillons consécutifs au-dessus du seuil, pour qu’une seule image bruitée ne puisse pas faire clignoter la bande. Les
quatre réglages peuvent être ajustés pendant que la capture tourne, car ils ne peuvent être calibrés
que sur un flux en direct.

### 3.3. Couleur et luminosité
Le **traitement des couleurs** est désactivé par défaut, et la bande reçoit les couleurs de l’écran telles quelles. Le
sketch Adalight et la plupart des cartes USB les passent aux LED sans correction gamma, donc les tons moyens
paraissent plus clairs sur la bande que sur l’écran, les couleurs sont délavées, et les barres noires d’une vidéo
(le noir y est souvent 16 sur 255) brillent légèrement. Pour une telle bande, commencez par :

- **Traitement des couleurs** : activé.
- **Gamma R**, **Gamma G**, **Gamma B** : 45 %. L’échelle est inversée : en dessous de 100 %, les tons moyens s’assombrissent,
  les couleurs s’enrichissent et le gris foncé s’éteint ; 45 % équivaut à un gamma 2.2.
- **Saturation** : 120–140 %.
- **Luminosité** : baissez-la ici ou avec la constante `BRIGHTNESS` dans le sketch.

L’aperçu sous les curseurs montre le résultat sur du R, G, B purs et une rampe de gris. Hyperion fait la correction
gamma de son côté, donc le traitement des couleurs y est généralement laissé tel quel.

### 4. Lissage
- **Activer le lissage** : désactivé par défaut. Sans lui, la bande répète chaque image, ce qui donne l’impression
  de scintillement lors des changements de scène ; activez-le pour les films.
- **Préréglage** : « Désactivé » par défaut. Choisir un préréglage active ou désactive le lissage tout seul. « Réactif » :
  transition de 50 ms, 60 Hz. « Équilibré » : 200 ms, délai de sortie de 80 ms, 25 Hz. « Fluide » : 500 ms, 200 ms,
  20 Hz.
- **Temps de stabilisation** : 50 ms par défaut, 0–1000 ms.
- **Délai de sortie** : 0 ms par défaut, 0–1000 ms. Augmentez-le si la bande est en avance sur l’image
  (**Délai d’éclairage**, section 7, le fait par application).
- **Fréquence de mise à jour** : 60 Hz par défaut (20, 25, 30, 40, 50, 60 Hz).

### 5. Lancement
1. Accordez l’autorisation **Capture / diffusion d’écran** lorsqu’elle est demandée.
2. Basculez le bouton pour démarrer le grabber.

### 6. Effets
Le bouton palette sur l’écran d’accueil ouvre les effets. Un effet éclaire la bande sans
capture d’écran : pas de dialogue d’autorisation, et ce qui est sur le téléviseur n’a pas d’importance. Statiques : couleur
unie, dégradé, blanc cinéma (température de couleur, 6500 K est le blanc de référence). Animés :
arc-en-ciel, cycle de couleurs, respiration, bougie, feu, aurore, océan, plasma, comète. **Test de disposition**
peint les côtés en couleurs différentes et fait courir un point blanc depuis la première LED, ce qui rend
évidente une mauvaise disposition LED.

**Musique en couleurs** prend le son du microphone de l’appareil sur lequel tourne l’application, ou de
ce que l’appareil lui-même diffuse (Source sonore : Son de cet appareil, aucun microphone nécessaire). La
seconde option ne voit pas le son envoyé à un récepteur en flux Dolby ou DTS (passthrough) :
il contourne Android. Le son est découpé en 16 bandes de fréquences : les basses éclairent le
bas de l’écran en rouge, les bandes montent sur les côtés et atteignent le milieu du bord supérieur
en bleu. La bande réagit au son qui monte au-dessus de sa moyenne de la dernière seconde et demie :
les battements et changements flashent, un son constant comme le bruit de la pièce s’estompe en quelques secondes.
La sensibilité définit à quel point une montée éclaire la bande. Le son est analysé sur l’appareil et n’est
pas enregistré. Les deux sources nécessitent l’autorisation d’enregistrement audio ; l’effet n’est pas proposé dans
la télécommande téléphone, car l’autorisation devrait être accordée sur le téléviseur.

**Garder allumé quand l’écran du téléviseur est éteint** laisse l’effet tourner comme une veilleuse pendant que le boîtier
TV reste actif. Certains téléviseurs coupent le réseau en veille, la bande s’éteint alors de toute façon.

### 7. Délai d’éclairage
Les lecteurs et sources traitent la vidéo différemment, donc la bande peut être en avance sur l’image d’une
quantité différente dans chaque application. Paramètres → **Délai d’éclairage** contient un délai pour toutes les applications et
une liste d’applications avec leur propre valeur ; le téléviseur bascule dessus pendant que cette application est à l’écran. La
partie par application nécessite l’accès aux usages, accordé avec les autorisations de démarrage automatique
via ADB.

**Régler avec la caméra** s’exécute depuis un téléphone associé au téléviseur. Le téléphone filme le téléviseur et la
lueur sur le mur pendant environ une minute, détecte les changements de scène dans les deux et trouve le décalage
entre eux. La bande s’éteint quelques secondes au début pendant que le téléphone cherche
l’écran dans le cadre. Il faut une pièce sombre, une scène dynamique et tout l’écran avec un peu de mur
autour dans le cadre. Le résultat vient avec une estimation de précision et est enregistré pour l’application
qui lit ou pour toutes les applications. Une bande en retard sur l’image ne peut pas être corrigée par un
délai : baissez le lissage ou choisissez une méthode de capture plus rapide.

---

### 8. Sauvegarde des réglages
**Paramètres → Enregistrer les réglages dans un fichier** écrit `Download/universal-ambient-light-<date>-<time>.json`.
Sur Android 8 et 9, le sélecteur de fichiers système s’ouvre à la place. **Restaurer les réglages depuis un fichier** remplace
tous les réglages actuels par ceux du fichier.

- Le fichier contient tous les réglages, contrôleurs supplémentaires inclus, et les jetons et mots de passe de
  vos lampes en texte clair.
- L’appairage avec le téléphone, les clés ADB et les autorisations système ne sont pas dans le fichier. Ils se configurent à nouveau
  après une réinstallation.
- Une méthode de capture que cette version ou cet appareil n’a pas est ignorée, la méthode actuelle reste.
- Android TV peut n’avoir aucun sélecteur de fichiers système, alors la restauration nécessite un gestionnaire de fichiers. Sans, associez
  le téléphone et utilisez les deux mêmes éléments dans ses paramètres : le fichier reste sur le téléphone, les réglages vont
  au téléviseur.

### Détails spécifiques aux contrôleurs

#### Hyperion
- **Hôte/Port** : IP et port du serveur (`19400` par défaut).
- **Priorité** : `100` (par défaut).
- [Documentation Hyperion](https://docs.hyperion-project.org/)

#### WLED
- **Hôte** : IP du contrôleur.
- **Port** : `4048` (DDP), `19446` (UDP Raw, entrée Hyperion de WLED) ou `21324` (UDP Raw, port temps réel propre de WLED).
- **Protocole** : DDP (préféré).
- **Ordre des couleurs** : assurez-vous qu’il correspond à vos réglages WLED (par ex. GRB pour WS2812B).
- **RGBW** : fonctionne en DDP à n’importe quelle longueur de bande, et en UDP Raw sur le port `21324` (DRGBW, jusqu’à 367 LED). Le port `19446` est l’entrée Hyperion de WLED : RGB brut uniquement, sans canal blanc, plafonné à 490 LED.
  L’application extrait elle-même le canal blanc (la composante commune à R, G et B est déplacée vers W), donc dans WLED le type de bande doit être RGBW et **Calculate white channel from RGB** doit être défini sur `Manual only` ou `Dual`. Dans les modes automatiques, WLED ignore la valeur de blanc reçue et la recalcule à partir du RGB déjà réduit, ce qui donne zéro : les LED blanches restent éteintes et les couleurs paraissent délavées.
- [Documentation WLED](https://kno.wled.ge/)

#### E1.31 et Art-Net
- **Univers de départ** : le premier univers de la bande. Une bande plus longue que **LED par
  univers** continue dans les univers suivants.
- **LED par univers** : 170 remplit les 510 canaux ; définissez la valeur du récepteur si elle diffère.
- E1.31 avec une adresse vide est envoyé en multicast vers `239.255.x.y`.

#### tpm2.net, UDP raw, Open Pixel Control
- tpm2.net découpe l’image en paquets numérotés, la taille est définie en LED par paquet.
- UDP raw n’a aucun en-tête, donc toute la bande doit tenir dans un datagramme (490 LED).
- OPC maintient une connexion TCP au port `7890` ; le canal 0 adresse chaque canal du serveur.

#### Philips Hue
- Choisissez le pont dans la recherche d’appareils ou saisissez son adresse, puis appuyez sur le bouton rond du
  pont et **Appairer** dans les 30 secondes.
- Si l’application Hue a des zones divertissement, l’application propose d’en utiliser une. Le pont reçoit alors un
  flux DTLS sur le port `2100` jusqu’à 25 fois par seconde, et chaque lampe de la zone prend la
  couleur de sa place définie dans l’application Hue : de gauche à droite, et sol, niveau TV ou plafond. Via
  Hue API v2, une bande dégradée est découpée en plusieurs canaux avec leurs propres places, donc elle
  affiche plusieurs couleurs sur sa longueur ; les ponts sans API v2 et diyHue reçoivent l’ancien flux,
  où une telle bande est une seule lampe avec une seule couleur. Une zone contient jusqu’à 10 lampes. Pendant que le flux est actif, les autres scènes et automatisations du pont
  ne touchent pas ces lampes.
- Les ponts appairés par la version 1.x de l’application n’ont pas de clé de streaming ; un tel pont doit être
  appairé à nouveau pour utiliser une zone.
- Sans zone, les lampes du pont sont listées dans **Lampes et zones** ; chacune reçoit une
  zone d’écran. Les couleurs sont converties vers le gamut de chaque lampe. Le pont accepte environ dix
  commandes par seconde pour toutes les lampes, donc le taux de mise à jour est partagé entre elles.

#### Nanoleaf
- Maintenez le bouton d’alimentation du contrôleur pendant 5 à 7 secondes jusqu’à ce que sa lumière clignote, puis
  appuyez sur **Appairer** dans les 30 secondes.
- Chaque panneau prend la couleur de la place qu’il occupe au mur, par rapport aux autres.

#### WiZ, Yeelight, LIFX, Govee
- Les lampes sont trouvées sur le réseau local, sans cloud et sans compte.
- Yeelight nécessite **LAN Control** activé dans l’application Yeelight. L’application passe chaque Yeelight
  en mode musique, ce qui lève la limite de 60 commandes par minute.
- Govee nécessite **LAN Control** activé pour l’appareil dans l’application Govee Home. L’API LAN définit une
  couleur par appareil, les segments d’une bande ne sont pas adressés séparément.

#### Zigbee2MQTT
- L’adresse et le port (`1883` par défaut) sont ceux du broker MQTT avec lequel Zigbee2MQTT travaille,
  par exemple le module complémentaire Mosquitto de Home Assistant. Identifiant, mot de passe et sujet de base
  (`zigbee2mqtt` par défaut) se définissent dans les réglages de connexion.
- La liste des lampes vient du message retenu `zigbee2mqtt/bridge/devices`, seuls les appareils
  qui exposent une lumière sont affichés. Les couleurs sont publiées sur `zigbee2mqtt/<name>/set`.
- Zigbee est lent pour les scènes rapides : quelques mises à jour par seconde par lampe, c’est ce que le réseau accepte
  sans retards.

#### Adalight (USB)
- **Débit en bauds** : `115200` (par défaut) ou correspondant à votre firmware. Les firmwares HyperSerial tournent généralement
  à `2000000`.
- **Protocole** : ADA (Arduino standard), LBAPA (APA102), AWA (HyperSerial), tpm2, Skydimo,
  SEDU, KarateLight (8 ou 16 canaux), AtmoLight (5 canaux), SP616E.
- [Dépôt Adalight](https://github.com/adafruit/Adalight)

##### Sketch Arduino pour Adalight

Un sketch Arduino prêt à l’emploi compatible avec l’application est disponible dans [`adalight-sketch.ino`](adalight-sketch/adalight-sketch.ino).

**Démarrage rapide :**

1. **Installer la bibliothèque FastLED :**
    - Dans l’IDE Arduino : `Tools` → `Manage Libraries` → rechercher « FastLED » → installer

2. **Configurer le sketch :**
    - Ouvrez `adalight-sketch/adalight-sketch.ino`
    - Modifiez les constantes en haut du fichier :
        - `DATA_PIN` — broche de connexion de la bande LED (défaut 9 sur Uno/Nano, 2 sur ESP32 et ESP8266)
        - `NUM_LEDS` — nombre de LED dans la bande (doit correspondre aux réglages de l’application !)
        - `LED_TYPE` — type de bande LED (WS2812B, WS2811, SK6812, etc.)
        - `COLOR_ORDER` — ordre des couleurs (GRB pour WS2812B, RGB pour les autres)
        - `BRIGHTNESS` — luminosité (0-255)

3. **Câblage :**
    - LED strip DATA → broche Arduino (défaut 9)
    - LED strip VCC → 5V Arduino (ou alimentation externe pour les longues bandes)
    - LED strip GND → GND Arduino
    - **Important :** pour les longues bandes (>10 LED), utilisez une alimentation externe 5V !

4. **Téléverser le sketch :**
    - Connectez l’Arduino à l’ordinateur via USB
    - Sélectionnez la carte et le port dans l’IDE Arduino
    - Téléversez le sketch

5. **Connecter à Android :**
    - Déconnectez l’Arduino de l’ordinateur
    - Connectez l’Arduino à l’appareil Android via un câble USB OTG
    - Dans l’application, sélectionnez le type de connexion : **Adalight**
    - Définissez le débit en bauds : **115200**
    - Sélectionnez le protocole : **ADA**
    - Assurez-vous que le nombre de LED dans l’application correspond à `NUM_LEDS` dans le sketch

**Exemple de câblage WS2812B :**
```
WS2812B DATA → Pin 9 Arduino
WS2812B VCC  → 5V Arduino (or external 5V)
WS2812B GND  → GND Arduino
```

**Pour d’autres types de LED :**
- **APA102 (SPI)** : utilisez la bibliothèque FastLED avec la configuration `APA102` et le protocole **LBAPA** dans l’application
- **WS2811** : similaire à WS2812B, généralement `COLOR_ORDER = RGB`
- **SK6812** : similaire à WS2812B, généralement `COLOR_ORDER = GRB`

**Dépannage :**
- Si les LED ne s’allument pas : vérifiez le câblage, assurez-vous que `NUM_LEDS` correspond dans le sketch et l’application
- Si les couleurs sont incorrectes : changez `COLOR_ORDER` (essayez RGB, GRB, BRG)
- Si aucune donnée n’est reçue : vérifiez le débit en bauds (doit être 115200), assurez-vous que le câble USB OTG prend en charge le transfert de données

## Fonctionnalités Android TV
Cette application est entièrement optimisée pour Android TV, y compris la prise en charge du Leanback Launcher et de la navigation au D-pad. Pour une saisie de texte plus facile (adresses IP), nous recommandons d’utiliser l’application « Google TV » ou « Android TV Remote » sur votre téléphone.

## Télécommande téléphone
L’éclairage d’un téléviseur peut être contrôlé depuis un téléphone exécutant la même application : allumez-le et éteignez-le et changez n’importe quel réglage, y compris au milieu d’un film dans une autre application. Couleur, luminosité et disposition LED s’appliquent immédiatement ; adresse du contrôleur, protocole et lissage s’appliquent en moins d’une seconde sans redémarrer la capture.

1. Sur le téléviseur : écran d’accueil → **Contrôler depuis un téléphone** (ou Paramètres → Télécommande). L’écran affiche un QR code, l’adresse et le code d’appairage.
2. Sur le téléphone : écran d’accueil → **Télécommande TV** → **Scanner le QR code**. Si la caméra ne peut pas le lire, saisissez l’adresse et le code manuellement.
3. Le téléphone mémorise le téléviseur et se reconnecte au prochain lancement. **Déconnecter** sur l’écran d’accueil ramène le téléphone à son propre éclairage.

Le téléphone et le téléviseur doivent être sur le même réseau local. La connexion est chiffrée en AES-256-GCM avec la clé du QR code ; **Changer le code d’appairage** sur le téléviseur déconnecte tous les téléphones. Tant que l’accès est actif, le téléviseur maintient un service en arrière-plan avec une notification : sans elle, le téléphone ne pourrait pas allumer l’éclairage lorsque l’application sur le téléviseur est fermée.

Le téléphone est aussi pratique pour configurer ADB sur le téléviseur lui-même : le code à 6 chiffres du débogage sans fil est saisi sur le téléphone, et le téléviseur trouve le port d’appairage tout seul.

Les coins de la caméra se déplacent sur le téléviseur lui-même ; depuis le téléphone, seule la recherche automatique d’écran est disponible.

**Télécommande** sur l’écran d’accueil du téléphone en fait une télécommande TV : D-pad, Retour, Accueil, volume et
boutons de lecture, un pavé tactile qui déplace un curseur sur le téléviseur (un appui clique, deux doigts
font défiler), un champ de texte dont la saisie apparaît immédiatement sur le téléviseur, et une liste d’applications TV à
lancer. Boutons, souris et texte passent par ADB sur le téléviseur ; sans ADB, seuls les boutons système,
les appuis et le texte via le service d’accessibilité sont disponibles (versions GitHub et RuStore).

## Démarrage automatique
**Capturer au démarrage** (activé par défaut) ramène l’éclairage après le démarrage du téléviseur, le réveil de la veille ou la mise à jour de l’application, si l’éclairage était allumé auparavant. Après la veille, une alarme système de surveillance le redémarre, donc il revient aussi sur les firmwares qui déchargent les applications pendant que le téléviseur dort.

Les méthodes de capture sans MediaProjection (Scrcpy/ADB, Screencap, Accessibility, Camera) n’ont besoin de rien d’autre. MediaProjection sur Android 10+ exige une confirmation à l’écran, et Android ne l’affichera pas depuis l’arrière-plan tant que l’application ne détient pas des autorisations qui ne peuvent être accordées que via ADB. Après l’appairage ADB, ouvrez Paramètres → **Autorisations de démarrage automatique** → **Accorder via ADB** ; dès lors, l’éclairage démarre sans dialogues.

Si le firmware force l’arrêt de l’application pendant que le téléviseur dort, rien ne peut la ramener avant le prochain démarrage : c’est une limitation du firmware.

## Contrôle externe (KeyMapper, Tasker, boutons de télécommande)
L’application expose une activité de bascule transparente que tout outil d’automatisation capable de démarrer une activité peut utiliser — par exemple [KeyMapper](https://github.com/keymapperorg/KeyMapper) pour lier un bouton de télécommande :

- Composant : `com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity`
- Sans action, elle bascule : arrête la lumière si elle tourne, sinon la démarre.
- Avec l’action `com.vasmarfas.UniversalAmbientLight.action.TURN_ON` elle démarre uniquement, avec `com.vasmarfas.UniversalAmbientLight.action.TURN_OFF` elle arrête uniquement.

Test depuis adb :

```
adb shell am start -n com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity
adb shell am start -a com.vasmarfas.UniversalAmbientLight.action.TURN_OFF
```

Le démarrage affiche toujours le dialogue système de capture d’écran sauf si une méthode de capture qui n’a pas besoin de MediaProjection est sélectionnée (Accessibility, Scrcpy/ADB, Screencap, Camera).

## Notes importantes

### Utilisateurs de téléviseurs TCL
Sur les appareils TCL, l’optimisation agressive de la batterie système peut tuer les services en arrière-plan.
**Solution :**
1. Allez dans **Paramètres > Applications > Accès spéciaux aux applications > Démarrage automatique**.
2. Activez le démarrage automatique pour Universal Ambient Light.
3. Sinon, vérifiez l’application « Safety Guard » et ajoutez l’application aux exceptions.

### Fire TV
Si le bouton de démarrage ne fait rien sur un Fire TV Stick, accordez les autorisations de superposition et de capture d’écran via adb. Sur le Stick, activez **Options pour les développeurs > Débogage ADB**, connectez-vous depuis un ordinateur avec `adb connect <stick-ip>:5555` et exécutez :

```
adb shell appops set com.vasmarfas.UniversalAmbientLight SYSTEM_ALERT_WINDOW allow
adb shell appops set com.vasmarfas.UniversalAmbientLight PROJECT_MEDIA allow
adb shell am force-stop com.vasmarfas.UniversalAmbientLight
```

Testé sur Fire TV Stick HD avec Fire OS 7.7.1.6. La méthode de capture Accessibility nécessite Android 11 et ne fonctionne pas sur Fire OS 7 (Android 9).

### Lecture vidéo haute qualité (4K/HDR)
Les problèmes de lecture avec la vidéo haute qualité (2K/4K/HDR) pendant que l’éclairage d’ambiance est actif sont une limitation matérielle de nombreux téléviseurs. Les processeurs intégrés ne peuvent souvent pas gérer simultanément un décodage vidéo lourd et la capture d’écran. C’est un problème profondément ancré qui se corrige rarement via le logiciel.

**Si vous constatez des saccades ou du lag vidéo :**
1. Baissez la qualité de lecture vidéo à 1080p ou 720p (selon les capacités de votre téléviseur).
2. Ou désactivez complètement l’application d’éclairage d’ambiance pendant le visionnage de contenu haute résolution.
3. Vous pouvez essayer d’ajuster la qualité de capture et les réglages FPS, mais il est peu probable que cela résolve pleinement le problème.

**Aperçu noir là où la vidéo devrait être (4K/HDR, HEVC/VP9 — ou *toute* vidéo sur certains téléviseurs) :**
Si votre aperçu Hyperion/WLED/HyperHDR montre un rectangle noir là où la vidéo devrait être — alors que les menus, miniatures, photos et les couleurs de test dans l’application se capturent correctement — ce n’est **pas** un problème DRM. Sur Android, la vidéo est dessinée sur un **plan vidéo matériel dédié (overlay)** composé par le matériel d’affichage et qui contourne SurfaceFlinger ; `MediaProjection` ne voit que ce que SurfaceFlinger compose, donc la région vidéo sort entièrement noire. Habituellement, cela n’affecte que le 4K / HEVC 10 bits / HDR10 / Dolby Vision tandis que le 1080p classique passe par la pile normale — **mais certains appareils routent _toute_ la vidéo via l’overlay** (par ex. plusieurs modèles Sony), et **sur d’autres cela dépend du codec plutôt que de la résolution** : sur les boîtiers Amlogic, la lecture HEVC/VP9/AV1 sort noire à n’importe quelle résolution tandis que le H.264 (AVC) se capture parfaitement, car ces décodeurs envoient des images compressées AFBC directement au plan vidéo. Un fichier *local* noir exclut le DRM. C’est une limitation de plateforme qui affecte aussi tous les autres outils d’éclairage d’ambiance Android (Hyperion Android, applications Lightpack, etc.) — il n’y a pas de correctif pour le chemin `MediaProjection` standard, et les méthodes `Scrcpy` / `Screencap` / `ADB` sont aussi derrière SurfaceFlinger, donc elles montrent la même zone noire.

Contournements :
1. **Forcer le H.264 (AVC)** si seul HEVC/VP9/AV1 devient noir : dans SmartTube, choisissez le flux AVC au lieu de VP9 ; dans Jellyfin, désactivez la lecture directe HEVC/AV1 pour le client (ou plafonnez le débit) pour que le serveur transcode en H.264.
2. **Baisser la lecture à 1080p** dans le lecteur/serveur (Jellyfin → définir le débit / la résolution max par appareil ; Kodi → ajuster les réglages de lecture ; mpv → `--hwdec=no` plus `--vo=gpu`). Le 1080p passe presque toujours par la pile de composition normale.
3. **Désactiver le décodage matériel** dans le lecteur (Jellyfin Android : Paramètres → Lecteur → désactiver « Prefer FMP4 » et « Allow background audio playback » ; dans mpv → `--hwdec=no`). Le décodage logiciel force l’image à passer par le chemin de composition, restaurant la capture.
4. **Pour les appareils rootés** — essayez la méthode de capture `Screencap (Root)` ou `Screencap (Shell)` dans Paramètres → celles-ci passent par le binaire `screencap` au lieu de `MediaProjection`, ce qui aide avec certaines restrictions de capture ; notez que `screencap` lit aussi la sortie de SurfaceFlinger, donc il ne **récupère pas** un plan vidéo matériel.
5. **Sur les téléviseurs SoC MediaTek**, la méthode expérimentale `MTK THAL Capture` capture directement depuis le moteur DIP du fabricant (avant composition), et le 4K HDR y fonctionne — mais nécessite à la fois le root et une puce MTK.

### Contenu protégé par DRM
Les **applications protégées par DRM** (telles que Netflix, Disney+, Amazon Prime Video, Кинопоиск et services de streaming similaires) **ne fonctionneront pas** avec le mode de capture d’écran en raison des restrictions de sécurité d’Android. C’est une limitation fondamentale de l’API MediaProjection d’Android et elle ne peut pas être contournée.

**Pourquoi cela se produit :**
- Android bloque la capture d’écran du contenu protégé par DRM pour prévenir le piratage.
- Cela est appliqué au niveau système et ne peut pas être outrepassé par les applications.

**Solutions :**
1. **Utiliser le mode Caméra** : passez à la source de capture **Caméra** dans les paramètres. Cette méthode utilise la caméra de l’appareil au lieu de la capture d’écran, donc elle fonctionne avec le contenu protégé par DRM. Vous devrez positionner un téléphone/tablette avec la caméra face à l’écran du téléviseur.
2. **Désactiver l’éclairage d’ambiance** : éteignez la fonctionnalité d’éclairage d’ambiance pendant le visionnage de contenu protégé par DRM.
3. **Utiliser des sources sans DRM** : regardez du contenu provenant de sources qui n’utilisent pas la protection DRM (fichiers locaux, YouTube, etc.).

**Note :** le mode Caméra nécessite un calibrage correct des positions des coins pour une capture de couleurs précise.


## Licence
Voir [LICENSE.txt](LICENSE.txt)

## Contribuer
Les contributions sont les bienvenues ! N’hésitez pas à soumettre des Pull Requests ou à signaler des Issues.
