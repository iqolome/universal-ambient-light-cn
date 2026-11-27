<img width="1280" height="720" alt="Universal Ambient Light" src="docs/banner.png" />

# Universal Ambient Light

Android용 화면 앰비언트 조명. 앱이 화면을 캡처하거나(또는 기기 카메라로 TV를
촬영하고), 가장자리 색상을 추출해 LED 스트립, 컨트롤러 또는 스마트 조명으로
전송합니다. 캡처 없이도 조명 효과를 실행할 수 있습니다. Android 8.0 이상에서
휴대폰과 Android TV 모두에서 동작합니다.

[简体中文](README_ZH.md) · [English](README.md) · [日本語](README_JA.md) · [한국어](README_KO.md) · [Русский](README_RU.md) · [Español](README_ES.md) · [Français](README_FR.md) · [Telegram 채팅](https://t.me/vasmarfas_chat) · [프로젝트 지원](SUPPORT.md) · [서드파티 라이선스](THIRD_PARTY_LICENSES.md)

## 기능

- **17가지 출력**: WLED, DDP, E1.31 (sACN), Art-Net, tpm2.net, UDP raw, Open Pixel
  Control, Adalight 및 기타 USB 보드, Philips Hue, Nanoleaf, WiZ, Yeelight, LIFX, Govee,
  Zigbee2MQTT, Home Assistant, Hyperion / HyperHDR 서버.
- **기기 검색**: 로컬 네트워크에서 WLED, Hyperion, HyperHDR, Hue 브리지, Nanoleaf, Home Assistant,
  WiZ, Yeelight, LIFX, Govee, Art-Net 노드를 수초 안에 찾습니다.
- **여러 컨트롤러 동시 사용**: 메인 컨트롤러 옆에 다른 컨트롤러를 추가할 수 있습니다. 예를 들어
  벽의 두 번째 WLED나 TV 측면 바. 각각 고유 주소, LED 레이아웃, 화면 영역을 가집니다.
- **휴대폰과 Android TV**: 터치스크린과 D-pad 탐색용 별도 레이아웃.
- **카메라 캡처**: 기기 카메라로 TV를 촬영하고 네 모서리로 원근을 보정합니다.
  화면 캡처를 사용할 수 없는 TV용입니다.
- **캡처 없는 조명 효과**: 단색, 그라데이션, 영화 화이트, 무지개, 불꽃,
  촛불, 오로라 등.
- **컬러 뮤직**: 주파수에 따라 스트립을 켭니다. 저음은 아래, 고음은 위.
  마이크 또는 기기 자체에서 재생하는 소리에서 가져옵니다.
- **앱별 조명 지연** 및 자동 조정: 휴대폰 카메라가 TV와 빛을 촬영해
  재생 중인 영화에서 스트립이 화면보다 얼마나 앞서는지를 측정합니다.
- **조정 가능한 파이프라인**: 캡처 품질, 프레임 레이트, 색상 스무딩, 지연.
- 부팅, TV 절전, 앱 업데이트 후 **자동 시작**, 연결 끊김 후 **자동 재연결**.
- **휴대폰 리모컨**: QR 코드로 TV와 페어링한 뒤, 휴대폰에서 TV의 조명을
  시작·중지하고 모든 설정을 변경합니다. 휴대폰은 터치패드 마우스와 키보드가 있는
  TV 리모컨으로도 동작합니다.
- **설정 백업**: 모든 설정을 파일로 저장하고 복원합니다. TV에서는 휴대폰 리모컨으로도 가능합니다.
- **절전 타이머**: 15분에서 2시간 후 조명을 끕니다.
- **평균 색상 모드**: 전체 스트립 대신 하나의 대표 색상을 전송합니다. 저사양 기기용.
- **빠른 설정 타일**로 조명을 켜고 끌 수 있습니다.

## 지원 컨트롤러

| 그룹 | 출력 | 참고 |
|---|---|---|
| 네트워크 스트립 | WLED | DDP 또는 UDP raw, 색상 순서, RGBW, 밝기 제한 |
| | DDP | WLED, ESPixelStick, FPP 및 기타 DDP 수신기 |
| | E1.31 (sACN) | 시작 유니버스, 유니버스당 LED, 유니캐스트 또는 멀티캐스트 |
| | Art-Net | ArtDmx, 시작 유니버스, 유니버스당 LED |
| | tpm2.net | 최대 490 LED 패킷, 포트 65506 |
| | UDP raw | 하나의 데이터그램에 순수 RGB, 최대 490 LED |
| | Open Pixel Control | FadeCandy / fcserver over TCP |
| USB 스트립 | Adalight 및 USB 키트 | Ada, LightBerry APA102, AWA (HyperSerial), tpm2, Skydimo, SEDU, KarateLight, AtmoLight, SP616E |
| 스마트 조명 | Philips Hue | 브리지를 통해, 버튼으로 페어링; 엔터테인먼트 영역은 초당 최대 25회 스트림 |
| | Nanoleaf | Light Panels, Canvas, Shapes, Elements, Lines |
| | WiZ, Yeelight, LIFX, Govee | 로컬 네트워크 프로토콜, 클라우드 없음 |
| | Zigbee2MQTT | MQTT 브로커를 통한 Zigbee 조명 |
| | Home Assistant | 모든 light 엔티티, 메인 출력 또는 옆에 추가 |
| 서버 | Hyperion / HyperHDR | FlatBuffers, 메시지 우선순위 |

조명과 패널은 화면 영역(왼쪽, 위, 모서리, 전체 화면 등)의 색상을 받아
스트립의 프레임 레이트가 아니라 처리할 수 있는 속도로 화면을 따릅니다.

## 요구 사항

- Android 8.0 (API 26) 이상.
- 화면 캡처 권한 (MediaProjection).
- 로컬 네트워크 접근(네트워크 컨트롤러 및 조명용) 또는 USB Host 지원(Adalight
  및 기타 USB 보드용).

## 설치

### GitHub Releases에서
최신 버전(**TV** 및 **Mobile**)은 [Releases Page](https://github.com/vasmarfas/universal-ambient-light/releases)에서 다운로드할 수 있습니다.

### [Google Play](https://play.google.com/store/apps/details?id=com.vasmarfas.UniversalAmbientLight)

### [RuStore](https://www.rustore.ru/catalog/app/com.vasmarfas.UniversalAmbientLight)

### 실험적: 외부 USB 카메라 지원
고급 설정용 **외부 USB 카메라(UVC) 지원**이 포함된 실험 빌드가 있습니다 — 화면 캡처가 제한되거나 최적이 아닌 기기용입니다. 이 버전은 유저스페이스 드라이버를 사용하며 Google Play 외부에서 배포됩니다.  
**후원자 조기 이용:** [Boosty — Experimental Build: External USB Camera Support](https://boosty.to/vasmarfas/posts/ba545975-558f-496f-bb3f-d181349f447c)

## 구성

### 1. 연결
1. 앱을 실행하고 **Settings**를 열거나, 홈 화면에서 **Set up the controller**를 누르세요.
2. 컨트롤러 화면에 네트워크에서 찾은 장치가 나열됩니다. 기기를 선택하거나, 아래 목록에서
   유형을 고른 뒤 주소를 직접 입력하세요. **Check every address**는 mDNS로
   자신을 알리지 않는 WLED와 Hyperion까지 전체 서브넷을 스캔합니다. 1~2분 정도
   걸립니다.
3. Hue 브리지와 Nanoleaf 패널은 기기의 버튼으로 페어링합니다. 조명(Hue, WiZ,
   Yeelight, LIFX, Govee, Zigbee2MQTT, Home Assistant)은 이후 화면 영역에 할당합니다. 조명 옆의 **Blink**로
   어느 조명인지 확인할 수 있습니다. 엔터테인먼트 영역이 있는 Hue 브리지는
   영역으로 동작할 수 있으며, 그때는 영역 할당이 필요 없습니다.
4. 검색에서 고른 WLED의 경우 앱이 WLED에 설정된 LED 개수를 읽고, 앱의 LED
   레이아웃 개수가 다르면 알려 줍니다.

### 2. LED 구성
- **면별 LED 구성**: 각 면을 따로 설정할 수 있습니다:
    - Top: 60 LEDs (기본값)
    - Right: 34 LEDs (기본값)
    - Bottom: 60 LEDs (기본값)
    - Left: 34 LEDs (기본값)
- **LED 레이아웃**: 시작 모서리, 방향(시계/반시계), 각 면 활성/비활성을 설정합니다.

### 2.1. 추가 컨트롤러
**Settings → Additional controllers**에서 메인 컨트롤러와 함께 동작하며
같은 화면을 보여주는 출력을 추가합니다. 여기의 컨트롤러는 메인과 같은 방식으로 설정합니다: 기기 또는
유형 선택, 주소 입력, LED 레이아웃 열기.

- **벽면 프레임**은 자체 LED 개수를 가진 동일한 둘레입니다.
- **TV 측면 바**는 한쪽만 있는 레이아웃입니다: 왼쪽 개수를 설정하고
  나머지는 0으로 둡니다. **Scan depth**는 화면을 얼마나 깊이 볼지 정합니다.
- **가장자리의 일부**는 캡처 마진으로 설정합니다: 상단 스트립에서 오른쪽 마진 75%면
  상단 가장자리의 왼쪽 1/4만 남습니다.
- **혼합 출력**도 가능합니다: Adalight를 메인으로 하고 옆에 WLED 바를 두거나,
  스트립과 Home Assistant 램프를 함께. Adalight 자체는 메인 컨트롤러만 될 수 있으며, USB는
  이를 위해 열립니다.

스무딩과 출력 지연은 모든 컨트롤러에 공통이므로 스트립이 함께 움직입니다. 화면
설정도 공통이며, WLED와 DDP의 밝기는 컨트롤러별로 설정합니다. 컨트롤러 레이아웃의 **Show LED layout test**는
해당 컨트롤러만 켭니다. 연결할 수 없는 컨트롤러는
다른 것을 멈추지 않으며, 백그라운드에서 재시도하고 로그만 남깁니다.

### 3. 캡처 설정
- **Capture Source**: **Screen**(기본값) 또는 **Camera** 모드를 선택합니다.
    - *Screen*: MediaProjection API를 사용하는 표준 화면 캡처(화면 캡처 권한 필요).
    - *Camera*: 원근 보정이 있는 기기 카메라를 쓰는 대안 방법. 화면 캡처를 지원하지 않는 TV나 외부 휴대폰 설정에 적합합니다.
- **Capture Rate (FPS)**: 기본 30 FPS (옵션: 10, 15, 24, 30, 60).
- **Capture Quality**:
    - *Low (64px)* — 저사양 기기용 또는 지연 감소용.
    - *Medium (128px)* — 균형 (기본값, 권장).
    - *High (256px)* — 고성능 기기 전용.
    - *Ultra (512px)* — 하이엔드 기기용 최대 품질.
- **Send Average Color**: 최대 성능을 위해 활성화(전체 스트립에 단일 색상 전송).
- **Black bar detection**: 기본 꺼짐. 위아래 또는 측면에 바가 있는 영화에서
  켭니다: 가장자리는 화면 테두리가 아니라 화면 내용에서 가져옵니다. **Black threshold**
  18은 대부분의 소스에 맞습니다. 바를 찾지 못하면 24–30으로 올리세요.
- **Ignore subtitles in the bottom bar**: 블랙 바 감지 옵션, 기본 꺼짐. 바
  높이는 상단 가장자리에서 오고, 하단은 모서리 근처만 확인하며, 어두운 장면에서도
  크롭을 유지합니다. 화면 위 자막은 여전히 LED에 도달합니다.

### 3.1. 카메라 모드 설정
캡처 소스로 **Camera**를 사용할 때:
1. 요청이 나오면 **Camera** 권한을 허용하세요.
2. **Settings** → **Camera Corner Setup**을 엽니다.
3. 카메라가 TV 화면을 볼 수 있도록 기기를 배치하세요.
4. 네 모서리 마커(TL, TR, BR, BL)를 TV 화면 가장자리에 맞게 드래그하세요.
5. **Save**를 눌러 모서리 위치를 저장하세요.
6. 앱은 캡처 중 원근 보정에 이 모서리를 사용합니다.

**팁:**
- 캡처를 시작하기 전에 메인 화면의 라이브 미리보기로 기기 위치를 맞추세요.
- 카메라가 TV 화면을 또렷이 볼 수 있도록 조명을 확보하세요.
- 모서리 조정은 TV에 대한 비스듬한 카메라 배치를 보정합니다.

Camera Corner Setup의 **Find the TV**는 모서리를 자동으로 배치하려 합니다. 4초 동안
프레임을 관찰하며, 밝기로 켜진 패널과 방을 구분하고, 화면이 변하는지로
TV와 램프·창을 구분한 뒤 결과를 오버레이에 불러옵니다 — Save를 누르기 전까지
저장되지 않습니다. 측정 중 스트립은 어둡게 유지됩니다. 그렇지 않으면 벽의 빛
자체가 화면의 일부로 읽힙니다.

완성된 설정이 아니라 시작점으로 보세요: 패널 자체가 아니라 켜진 화면을 잡고,
밝은 방에서는 헷갈리며, 보통 모서리를 손으로
조금 더 맞춰야 합니다. 아무것도 찾지 못하면 이유를 알리고, 저장된 모서리는
그대로 둡니다. 자세한 이유는 logcat의 `AutoFrameDetection`과 `CameraEncoder`에 남습니다.

### 3.2. 카메라 절전 모드
카메라 캡처는 TV에서 대기 신호를 받지 않으므로, 꺼진 화면이 센서
노이즈를 계속 스트립으로 보냅니다. **Camera Sleep Mode** 설정 그룹(캡처 소스가
**Camera**일 때만 표시)은 보정된 화면 영역을 감시하고
표시할 새 내용이 없으면 캡처 파이프라인을 일시 중지합니다. 기본 비활성.

- **Enable sleep mode**: 기능 마스터 스위치.
- **Sleep delay (seconds)**: 화면이 비어 있어야 스트립이 꺼지기까지의
  시간. 범위: 5–3600초, 기본 120. 더 빠른 반응을 원하면 낮추고, 어두운
  장면이 절전을 트리거하면 올리세요.
- **Blank screen threshold (0–96)**: 감시 영역의 평균 밝기가 이 값 이하면
  빈 화면으로 간주합니다. 기본: 12. 꺼진 TV가 감지되지 않으면
  올리세요.
- **Motion sensitivity threshold (1–64)**: 움직임으로 인정하는 최소 화면
  변화. 기본: 4. 센서 노이즈가 스트립을 반복해 깨우면 올리세요.
- **Sleep on a static picture**: 화면이 변하지 않을 때(일시정지 영상, 정적 메뉴)도
  프레임 전송을 중지합니다. 스트립은 마지막 색상을 유지합니다. 기본
  비활성. 긴 정적 장면이 스트립 색상을 고정하기 때문입니다.

절전 모드에서는 카메라가 연결된 채로 전체 원근 보정 파이프라인 대신
희소 휘도 그리드에서 5 Hz로 샘플링합니다. 깨어나려면 임계값 이상의
연속 두 샘플이 필요하므로, 한 번의 노이즈 프레임이 스트립을 깜빡이지 않습니다. 네
설정 모두 캡처 실행 중에 조정할 수 있습니다. 라이브 피드에 맞춰야만
보정할 수 있기 때문입니다.

### 3.3. 색상과 밝기
**Color processing**은 기본 꺼짐이며, 스트립은 화면 색상을 그대로 받습니다.
Adalight 스케치와 대부분의 USB 보드는 감마 보정 없이 LED로 전달하므로, 중간톤이
화면보다 스트립에서 더 밝게 보이고, 색이 바래며, 영상의 블랙 바
(거기서 검정은 종종 255 중 16)가 살짝 빛납니다. 그런 스트립은 다음으로 시작하세요:

- **Color processing**: 켜기.
- **Gamma R**, **Gamma G**, **Gamma B**: 45%. 스케일은 반전됩니다: 100% 미만이면 중간톤이 어두워지고,
  색이 진해지며 어두운 회색이 사라집니다. 45%는 감마 2.2와 같습니다.
- **Saturation**: 120–140%.
- **Brightness**: 여기서 낮추거나 스케치의 `BRIGHTNESS` 상수로 낮추세요.

슬라이더 아래 미리보기는 순수 R, G, B와 회색 램프의 결과를 보여 줍니다. Hyperion은 자체에서 감마
보정을 하므로, 보통 색상 처리는 그대로 둡니다.

### 4. 스무딩
- **Enable Smoothing**: 기본 꺼짐. 끄면 스트립이 매 프레임을 그대로 따라가며, 장면 전환에서
  깜빡임처럼 보입니다. 영화에는 켜세요.
- **Preset**: 기본 "Off". 프리셋을 고르면 스무딩이 자동으로 켜지거나 꺼집니다. "Responsive":
  전환 50 ms, 60 Hz. "Balanced": 200 ms, 출력 지연 80 ms, 25 Hz. "Smooth": 500 ms, 200 ms,
  20 Hz.
- **Settling Time**: 기본 50 ms, 0–1000 ms.
- **Output Delay**: 기본 0 ms, 0–1000 ms. 스트립이 화면보다 앞서면 올리세요
  (**Lighting delay**, 7절은 앱별로 합니다).
- **Update Frequency**: 기본 60 Hz (20, 25, 30, 40, 50, 60 Hz).

### 5. 실행
1. 요청이 나오면 **Screen Capture / Casting** 권한을 허용하세요.
2. 버튼을 토글해 그래버를 시작하세요.

### 6. 효과
홈 화면의 팔레트 버튼으로 효과를 엽니다. 효과는 화면 캡처 없이 스트립을 켭니다:
권한 대화상자가 없고, TV에 무엇이 보이는지도 상관없습니다. 정적: 단색,
그라데이션, 영화 화이트(색온도, 6500 K가 기준 화이트). 애니메이션:
무지개, 컬러 사이클, 호흡, 촛불, 불꽃, 오로라, 오션, 플라즈마, 혜성. **Layout test**는
면을 서로 다른 색으로 칠하고 첫 LED부터 흰 점을 돌리므로
잘못된 LED 레이아웃이 바로 드러납니다.

**Color music**은 앱이 실행 중인 기기의 마이크 소리, 또는
기기 자체가 재생하는 소리(Sound source: Sound of this device, 마이크 불필요)를 사용합니다.
두 번째 옵션은 Dolby 또는 DTS 비트스트림(passthrough)으로 리시버에 보낸 소리는 보지 못합니다:
Android를 우회하기 때문입니다. 소리는 16개 주파수 밴드로 나뉩니다: 저음은
화면 하단을 빨갛게 켜고, 밴드는 측면을 따라 올라가 상단 가장자리 중앙에
파랑으로 도달합니다. 스트립은 지난 1.5초 평균보다 커진 소리에 반응합니다:
비트와 변화가 깜빡이고, 방 소음 같은 일정한 소리는 몇 초 안에 사라집니다.
Sensitivity는 얼마나 큰 상승이 스트립을 켤지 정합니다. 소리는 기기에서 분석되며
녹음되지 않습니다. 두 소스 모두 오디오 녹음 권한이 필요합니다. 효과는
휴대폰 리모컨에서는 제공되지 않습니다. 권한을 TV에서 허용해야 하기 때문입니다.

**Keep on when the TV screen is off**는 TV 박스가 깨어 있는 동안 효과를 야간등으로
계속 둡니다. 일부 TV는 대기 모드에서 네트워크를 끊고, 그때는 스트립이 어쨌든 꺼집니다.

### 7. 조명 지연
플레이어와 소스가 영상을 다르게 처리하므로, 스트립이 화면보다 앞서는
양이 앱마다 다를 수 있습니다. Settings → **Lighting delay**에는 모든 앱용 지연과
자체 값을 가진 앱 목록이 있습니다. TV는 해당 앱이 화면에 있을 때 그 값으로 전환합니다.
앱별 부분은 사용 기록 접근이 필요하며, 자동 시작 권한과 함께
ADB로 부여합니다.

**Tune with the camera**는 TV와 페어링된 휴대폰에서 실행합니다. 휴대폰이 약 1분 동안
TV와 벽의 빛을 촬영하고, 둘의 장면 전환을 감지해 그 사이
지연을 찾습니다. 시작 시 휴대폰이 프레임에서 화면을 찾는 동안 스트립이
몇 초 동안 어두워집니다. 어두운 방, 역동적인 장면, 프레임에 화면 전체와
주변 벽이 필요합니다. 결과는 정확도 추정과 함께 제공되며, 재생 중인 앱
또는 모든 앱에 저장됩니다. 화면보다 뒤처진 스트립은 지연으로
고칠 수 없습니다: 스무딩을 낮추거나 더 빠른 캡처 방법을 고르세요.

---

### 8. 설정 백업
**Settings → Save settings to a file**은 `Download/universal-ambient-light-<date>-<time>.json`을 씁니다.
Android 8과 9에서는 시스템 파일 선택기가 대신 열립니다. **Restore settings from a file**은
현재 설정을 모두 파일의 것으로 바꿉니다.

- 파일에는 추가 컨트롤러를 포함한 모든 설정과, 조명의 토큰·비밀번호가
  평문으로 들어 있습니다.
- 휴대폰 페어링, ADB 키, 시스템 권한은 파일에 없습니다. 재설치 후
  다시 설정합니다.
- 이 빌드나 기기에 없는 캡처 방법은 건너뛰고, 현재 방법을 유지합니다.
- Android TV에는 시스템 파일 선택기가 없을 수 있으며, 그때 복원에는 파일 관리자가 필요합니다. 없으면
  휴대폰을 페어링하고 설정에서 같은 두 항목을 사용하세요: 파일은 휴대폰에 두고, 설정은
  TV로 갑니다.

### 컨트롤러별 세부 사항

#### Hyperion
- **Host/Port**: 서버 IP와 포트(기본 `19400`).
- **Priority**: `100` (기본값).
- [Hyperion Documentation](https://docs.hyperion-project.org/)

#### WLED
- **Host**: 컨트롤러 IP.
- **Port**: `4048` (DDP), `19446` (UDP Raw, WLED의 Hyperion 입력) 또는 `21324` (UDP Raw, WLED 자체 실시간 포트).
- **Protocol**: DDP (권장).
- **Color Order**: WLED 설정과 일치해야 합니다(예: WS2812B용 GRB).
- **RGBW**: DDP에서는 스트립 길이에 관계없이 동작하고, UDP Raw에서는 포트 `21324`(DRGBW, 최대 367 LED)에서 동작합니다. 포트 `19446`은 WLED의 Hyperion 입력입니다: 순수 RGB만, 화이트 채널 없음, 최대 490 LED.
  앱이 화이트 채널을 자체 추출합니다(R, G, B에 공통인 성분을 W로 옮김). 따라서 WLED에서 스트립 유형은 RGBW여야 하고 **Calculate white channel from RGB**는 `Manual only` 또는 `Dual`이어야 합니다. 자동 모드에서는 WLED가 받은 화이트 값을 버리고 이미 줄어든 RGB에서 다시 계산해 0이 됩니다: 화이트 LED는 어둡고 색이 바래 보입니다.
- [WLED Documentation](https://kno.wled.ge/)

#### E1.31 및 Art-Net
- **Start universe**: 스트립의 첫 유니버스. **LEDs per
  universe**보다 긴 스트립은 다음 유니버스로 이어집니다.
- **LEDs per universe**: 170은 510 채널을 모두 채웁니다. 수신기 값이 다르면 그 값을 설정하세요.
- 주소가 비어 있는 E1.31은 `239.255.x.y`로 멀티캐스트 전송됩니다.

#### tpm2.net, UDP raw, Open Pixel Control
- tpm2.net은 프레임을 번호 있는 패킷으로 나누며, 크기는 패킷당 LED로 설정합니다.
- UDP raw는 헤더가 전혀 없으므로 전체 스트립이 하나의 데이터그램에 들어가야 합니다(490 LED).
- OPC는 포트 `7890`에 TCP 연결을 유지합니다. 채널 0은 서버의 모든 채널을 지정합니다.

#### Philips Hue
- 기기 검색에서 브리지를 고르거나 주소를 입력한 뒤, 브리지의 둥근 버튼을 누르고
  30초 안에 **Pair**를 누르세요.
- Hue 앱에 엔터테인먼트 영역이 있으면 앱이 하나를 쓰자고 제안합니다. 브리지는
  포트 `2100`에서 초당 최대 25회의 DTLS 스트림을 받고, 영역의 각 조명은
  Hue 앱에서 설정한 위치의 색을 받습니다: 왼쪽에서 오른쪽, 그리고 바닥, TV 높이 또는 천장. Hue API v2를 통해
  그라데이션 라이트스트립은 자체 위치를 가진 여러 채널로 나뉘어
  길이를 따라 여러 색을 보여 줍니다. API v2가 없는 브리지와 diyHue는 이전 스트림을 받아
  그런 스트립이 한 색의 한 조명이 됩니다. 영역은 최대 10개 조명을 담습니다. 스트림이 켜져 있는 동안 브리지의 다른 장면과 자동화는
  이 조명을 건드리지 않습니다.
- 앱 1.x 버전으로 페어링된 브리지는 스트리밍 키가 없으므로, 영역을
  쓰려면 다시 페어링해야 합니다.
- 영역이 없으면 브리지의 조명이 **Lights and zones**에 나열되며, 각각
  화면 영역을 받습니다. 색상은 각 조명의 색 영역으로 변환됩니다. 브리지는 모든 조명에
  초당 약 10개 명령을 받으므로, 업데이트 속도가 조명 간에 공유됩니다.

#### Nanoleaf
- 컨트롤러의 전원 버튼을 5~7초 눌러 표시등이 깜빡일 때까지 기다린 뒤,
  30초 안에 **Pair**를 누르세요.
- 각 패널은 다른 패널에 상대적인 벽 위 위치의 색을 받습니다.

#### WiZ, Yeelight, LIFX, Govee
- 조명은 로컬 네트워크에서 찾으며, 클라우드와 계정이 필요 없습니다.
- Yeelight는 Yeelight 앱에서 **LAN Control**을 켜야 합니다. 앱은 모든 Yeelight를
  music 모드로 전환해 분당 60명령 제한을 해제합니다.
- Govee는 Govee Home 앱에서 기기의 **LAN Control**을 켜야 합니다. LAN API는
  기기당 한 색만 설정하며, 스트립 세그먼트는 따로 지정되지 않습니다.

#### Zigbee2MQTT
- 주소와 포트(기본 `1883`)는 Zigbee2MQTT가 사용하는 MQTT 브로커의 것이며,
  예를 들어 Home Assistant의 Mosquitto 애드온입니다. 로그인, 비밀번호, 기본 토픽
  (기본 `zigbee2mqtt`)은 연결 설정에서 정합니다.
- 조명 목록은 유지된 `zigbee2mqtt/bridge/devices` 메시지에서 오며, light를
  노출하는 기기만 표시됩니다. 색상은 `zigbee2mqtt/<name>/set`으로 게시됩니다.
- Zigbee는 빠른 장면에 느립니다: 조명당 초당 몇 번 업데이트가
  지연 없이 네트워크가 감당하는 수준입니다.

#### Adalight (USB)
- **Baud Rate**: `115200`(기본값) 또는 펌웨어에 맞추세요. HyperSerial 펌웨어는 보통
  `2000000`에서 동작합니다.
- **Protocol**: ADA (Standard Arduino), LBAPA (APA102), AWA (HyperSerial), tpm2, Skydimo,
  SEDU, KarateLight (8 또는 16 채널), AtmoLight (5 채널), SP616E.
- [Adalight Repository](https://github.com/adafruit/Adalight)

##### Adalight용 Arduino 스케치

앱과 호환되는 바로 쓸 수 있는 Arduino 스케치가 [`adalight-sketch.ino`](adalight-sketch/adalight-sketch.ino)에 있습니다.

**빠른 시작:**

1. **FastLED 라이브러리 설치:**
    - Arduino IDE에서: `Tools` → `Manage Libraries` → "FastLED" 검색 → 설치

2. **스케치 구성:**
    - `adalight-sketch/adalight-sketch.ino`를 엽니다
    - 파일 상단의 상수를 수정합니다:
        - `DATA_PIN` — LED 스트립 연결 핀(Uno/Nano 기본 9, ESP32 및 ESP8266은 2)
        - `NUM_LEDS` — 스트립의 LED 개수(앱 설정과 일치해야 함!)
        - `LED_TYPE` — LED 스트립 유형(WS2812B, WS2811, SK6812 등)
        - `COLOR_ORDER` — 색상 순서(WS2812B는 GRB, 기타는 RGB)
        - `BRIGHTNESS` — 밝기(0-255)

3. **배선:**
    - LED strip DATA → Arduino 핀(기본 9)
    - LED strip VCC → 5V Arduino(긴 스트립은 외부 전원)
    - LED strip GND → GND Arduino
    - **중요:** 긴 스트립(>10 leds)에는 외부 5V 전원을 사용하세요!

4. **스케치 업로드:**
    - USB로 Arduino를 컴퓨터에 연결
    - Arduino IDE에서 보드와 포트 선택
    - 스케치 업로드

5. **Android에 연결:**
    - Arduino를 컴퓨터에서 분리
    - USB OTG 케이블로 Arduino를 Android 기기에 연결
    - 앱에서 연결 유형 선택: **Adalight**
    - Baud Rate 설정: **115200**
    - 프로토콜 선택: **ADA**
    - 앱의 LED 개수가 스케치의 `NUM_LEDS`와 일치하는지 확인

**WS2812B 배선 예:**
```
WS2812B DATA → Pin 9 Arduino
WS2812B VCC  → 5V Arduino (or external 5V)
WS2812B GND  → GND Arduino
```

**다른 LED 유형:**
- **APA102 (SPI)**: FastLED 라이브러리에서 `APA102` 구성과 앱의 **LBAPA** 프로토콜 사용
- **WS2811**: WS2812B와 유사, 보통 `COLOR_ORDER = RGB`
- **SK6812**: WS2812B와 유사, 보통 `COLOR_ORDER = GRB`

**문제 해결:**
- LED가 켜지지 않으면: 배선을 확인하고, 스케치와 앱의 `NUM_LEDS`가 일치하는지 확인
- 색이 틀리면: `COLOR_ORDER` 변경(RGB, GRB, BRG 시도)
- 데이터가 없으면: Baud Rate 확인(115200이어야 함), USB OTG 케이블이 데이터 전송을 지원하는지 확인

## Android TV 기능
이 앱은 Leanback Launcher와 D-pad 탐색을 포함해 Android TV에 완전히 최적화되어 있습니다. 텍스트 입력(IP 주소)을 쉽게 하려면 휴대폰의 "Google TV" 또는 "Android TV Remote" 앱을 권장합니다.

## 휴대폰 리모컨
같은 앱을 실행하는 휴대폰에서 TV의 조명을 제어할 수 있습니다: 켜고 끄고, 다른 앱으로 영화 시청 중에도 모든 설정을 변경합니다. 색상, 밝기, LED 레이아웃은 즉시 적용되고, 컨트롤러 주소, 프로토콜, 스무딩은 캡처를 다시 시작하지 않고 1초 안에 적용됩니다.

1. TV에서: 홈 화면 → **Control from a phone**(또는 Settings → Remote control). 화면에 QR 코드, 주소, 페어링 코드가 표시됩니다.
2. 휴대폰에서: 홈 화면 → **TV remote** → **Scan QR code**. 카메라가 읽지 못하면 주소와 코드를 직접 입력하세요.
3. 휴대폰이 TV를 기억하고 다음 실행 시 다시 연결합니다. 홈 화면의 **Disconnect**는 휴대폰을 자체 조명으로 되돌립니다.

휴대폰과 TV는 같은 로컬 네트워크에 있어야 합니다. 연결은 QR 코드의 키로 AES-256-GCM 암호화됩니다. TV의 **Change the pairing code**는 모든 휴대폰 연결을 끊습니다. 접근이 켜져 있는 동안 TV는 알림이 있는 백그라운드 서비스를 유지합니다: 없으면 TV에서 앱이 닫혀 있을 때 휴대폰이 조명을 켤 수 없습니다.

휴대폰은 TV에서 ADB를 설정할 때도 편리합니다: Wireless debugging의 6자리 코드를 휴대폰에 입력하면, TV가 페어링 포트를 스스로 찾습니다.

카메라 모서리는 TV 자체에서 드래그합니다. 휴대폰에서는 자동 화면 검색만 가능합니다.

휴대폰 홈 화면의 **Remote**는 TV 리모컨으로 만듭니다: D-pad, Back, Home, 볼륨 및
재생 버튼, TV에서 커서를 움직이는 터치패드(탭은 클릭, 두 손가락은
스크롤), 입력이 TV에 바로 나타나는 텍스트 필드, 실행할
TV 앱 목록. 버튼, 마우스, 텍스트는 TV의 ADB를 거칩니다. ADB가 없으면 시스템 버튼,
탭, 접근성 서비스를 통한 텍스트만 가능합니다(GitHub 및 RuStore 빌드).

## 자동 시작
**Grab on Boot**(기본 켜짐)는 TV가 부팅하거나, 절전에서 깨어나거나, 앱이 업데이트된 뒤, 이전에 조명이 켜져 있었다면 조명을 다시 켭니다. 절전 후에는 시스템 알람 워치독이 다시 시작하므로, TV 절전 중 앱을 언로드하는 펌웨어에서도 돌아옵니다.

MediaProjection이 없는 캡처 방법(Scrcpy/ADB, Screencap, Accessibility, Camera)은 더 이상 필요 없습니다. Android 10+의 MediaProjection은 화면 확인이 필요하며, 앱이 ADB로만 부여할 수 있는 권한을 보유하기 전에는 Android가 백그라운드에서 이를 표시하지 않습니다. ADB 페어링 후 Settings → **Autostart permissions** → **Grant via ADB**를 여세요. 이후부터 조명은 대화상자 없이 시작됩니다.

펌웨어가 TV 절전 중 앱을 강제 종료하면, 다음 부팅까지 아무것도 되돌릴 수 없습니다: 펌웨어 제한입니다.

## 외부 제어 (KeyMapper, Tasker, 리모컨 버튼)
앱은 활동을 시작할 수 있는 모든 자동화 도구가 사용할 수 있는 투명 토글 활동을 제공합니다 — 예를 들어 [KeyMapper](https://github.com/keymapperorg/KeyMapper)로 리모컨 버튼을 바인딩:

- Component: `com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity`
- 액션이 없으면 토글합니다: 실행 중이면 끄고, 아니면 켭니다.
- 액션 `com.vasmarfas.UniversalAmbientLight.action.TURN_ON`은 켜기만, `com.vasmarfas.UniversalAmbientLight.action.TURN_OFF`는 끄기만 합니다.

adb에서 테스트:

```
adb shell am start -n com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity
adb shell am start -a com.vasmarfas.UniversalAmbientLight.action.TURN_OFF
```

MediaProjection이 필요 없는 캡처 방법(Accessibility, Scrcpy/ADB, Screencap, Camera)을 선택하지 않으면, 시작 시 여전히 시스템 화면 캡처 대화상자가 표시됩니다.

## 중요 참고

### TCL TV 사용자
TCL 기기에서는 공격적인 시스템 배터리 최적화가 백그라운드 서비스를 종료할 수 있습니다.
**해결 방법:**
1. **Settings > Apps > Special App Access > Auto-Start**로 이동하세요.
2. Universal Ambient Light의 Auto-Start를 켜세요.
3. 또는 "Safety Guard" 앱을 확인하고 앱을 예외에 추가하세요.

### Fire TV
Fire TV Stick에서 시작 버튼이 동작하지 않으면, adb로 오버레이와 화면 캡처 권한을 부여하세요. Stick에서 **Developer options > ADB debugging**을 켜고, 컴퓨터에서 `adb connect <stick-ip>:5555`로 연결한 뒤 실행하세요:

```
adb shell appops set com.vasmarfas.UniversalAmbientLight SYSTEM_ALERT_WINDOW allow
adb shell appops set com.vasmarfas.UniversalAmbientLight PROJECT_MEDIA allow
adb shell am force-stop com.vasmarfas.UniversalAmbientLight
```

Fire TV Stick HD, Fire OS 7.7.1.6에서 테스트했습니다. Accessibility 캡처 방법은 Android 11이 필요하며 Fire OS 7(Android 9)에서는 동작하지 않습니다.

### 고품질 영상 재생 (4K/HDR)
앰비언트 조명이 켜진 상태에서 고품질 영상(2K/4K/HDR) 재생 문제는 많은 TV의 하드웨어 제한입니다. 내장 프로세서는 종종 무거운 영상 디코딩과 화면 캡처를 동시에 처리하지 못합니다. 소프트웨어로는 거의 고칠 수 없는 근본적인 문제입니다.

**영상 끊김이나 지연이 있으면:**
1. 영상 재생 품질을 1080p 또는 720p로 낮추세요(TV 성능에 따라).
2. 또는 고해상도 콘텐츠 시청 중 앰비언트 조명 앱을 완전히 끄세요.
3. 캡처 품질과 FPS 설정을 조정해 볼 수 있지만, 문제를 완전히 해결하기는 어렵습니다.

**영상이 있어야 할 곳이 검은 미리보기(4K/HDR, HEVC/VP9 — 또는 일부 TV에서는 *모든* 영상):**
Hyperion/WLED/HyperHDR 미리보기에서 메뉴, 썸네일, 사진, 앱 내 테스트 색은 잘 캡처되는데 영상 자리만 검은 사각형이면 — 이는 **DRM 문제가 아닙니다**. Android에서 영상은 디스플레이 하드웨어가 합성하고 SurfaceFlinger를 우회하는 전용 **하드웨어 비디오 플레인(오버레이)**에 그려집니다. `MediaProjection`은 SurfaceFlinger가 합성하는 것만 보므로, 영상 영역이 완전 검정으로 나옵니다. 보통 4K / HEVC 10-bit / HDR10 / Dolby Vision만 해당하고 일반 1080p는 일반 스택을 거칩니다 — **하지만 일부 기기는 _모든_ 영상을 오버레이로 보냅니다**(예: 여러 Sony 모델). **다른 기기에서는 해상도보다 코덱에 따라 달라집니다**: Amlogic 박스에서는 HEVC/VP9/AV1 재생이 어떤 해상도에서도 검게 나오고 H.264(AVC)는 완벽히 캡처됩니다. 해당 디코더가 AFBC 압축 프레임을 비디오 플레인으로 바로 넘기기 때문입니다. *로컬* 파일이 검으면 DRM을 배제합니다. 이는 Hyperion Android, Lightpack 앱 등 다른 모든 Android 앰비언트 조명 도구에도 영향을 주는 플랫폼 제한입니다 — 표준 `MediaProjection` 경로에는 수정이 없고, `Scrcpy` / `Screencap` / `ADB` 방법도 SurfaceFlinger 뒤에 있어 같은 검은 영역을 보여 줍니다.

해결 방법:
1. **H.264 (AVC) 강제**: HEVC/VP9/AV1만 검으면 SmartTube에서 VP9 대신 AVC 스트림을 고르고, Jellyfin에서는 클라이언트의 HEVC/AV1 직접 재생을 끄거나(또는 비트레이트 제한) 서버가 H.264로 트랜스코딩하게 하세요.
2. **재생을 1080p로 낮추기**: 플레이어/서버에서(Jellyfin → 기기별 최대 비트레이트/해상도 설정; Kodi → 재생 설정 조정; mpv → `--hwdec=no`와 `--vo=gpu`). 1080p는 거의 항상 일반 합성 스택을 거칩니다.
3. **플레이어에서 하드웨어 디코딩 끄기**(Jellyfin Android: Settings → Player → "Prefer FMP4"와 "Allow background audio playback" 끄기; mpv → `--hwdec=no`). 소프트웨어 디코드는 프레임을 합성 경로로 보내 캡처를 복원합니다.
4. **루팅된 기기** — Settings에서 `Screencap (Root)` 또는 `Screencap (Shell)` 캡처 방법을 시도하세요 → `MediaProjection` 대신 `screencap` 바이너리를 거치며 일부 캡처 제한에 도움이 됩니다. 다만 `screencap`도 SurfaceFlinger 출력을 읽으므로 하드웨어 비디오 플레인은 **복구하지 않습니다**.
5. **MediaTek SoC TV**에서는 실험적 `MTK THAL Capture` 방법이 벤더 DIP 엔진에서(합성 전) 직접 캡처하며 4K HDR이 동작합니다 — 루트와 MTK 칩이 모두 필요합니다.

### DRM 보호 콘텐츠
**DRM 보호 앱**(Netflix, Disney+, Amazon Prime Video, Кинопоиск 및 유사 스트리밍 서비스)은 Android 보안 제한으로 화면 캡처 모드에서 **동작하지 않습니다**. 이는 Android MediaProjection API의 근본 제한이며 우회할 수 없습니다.

**이유:**
- Android는 불법 복제를 막기 위해 DRM 보호 콘텐츠의 화면 캡처를 차단합니다.
- 시스템 수준에서 강제되며 앱이 재정의할 수 없습니다.

**해결 방법:**
1. **카메라 모드 사용**: 설정에서 캡처 소스를 **Camera**로 전환하세요. 화면 캡처 대신 기기 카메라를 쓰므로 DRM 보호 콘텐츠에서도 동작합니다. TV 화면을 향한 휴대폰/태블릿이 필요합니다.
2. **앰비언트 조명 끄기**: DRM 보호 콘텐츠 시청 중 앰비언트 조명 기능을 끄세요.
3. **비 DRM 소스 사용**: DRM 보호를 쓰지 않는 소스의 콘텐츠를 시청하세요(로컬 파일, YouTube 등).

**참고:** 카메라 모드는 정확한 색상 캡처를 위해 모서리 위치를 제대로 보정해야 합니다.


## 라이선스
[LICENSE.txt](LICENSE.txt)를 참조하세요

## 기여
기여를 환영합니다! Pull Request를 제출하거나 Issue를 보고해 주세요.
