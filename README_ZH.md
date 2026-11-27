<img width="1280" height="720" alt="Universal Ambient Light" src="docs/banner.png" />

# 万能氛围灯 (Universal Ambient Light)

适用于 Android 的屏幕氛围灯。应用捕获屏幕（或用设备摄像头拍摄电视），
提取边缘颜色并流式传输到 LED 灯带、控制器或智能灯。
即使不捕获画面，也可以运行灯光效果。支持 Android 8.0 及以上，
可用于手机和 Android TV。

[简体中文](README_ZH.md) · [English](README.md) · [日本語](README_JA.md) · [한국어](README_KO.md) · [Русский](README_RU.md) · [Español](README_ES.md) · [Français](README_FR.md) · [Telegram 群聊](https://t.me/vasmarfas_chat) · [支持项目](SUPPORT.md) · [第三方许可证](THIRD_PARTY_LICENSES.md)

## 功能

- **17 种输出**：WLED、DDP、E1.31 (sACN)、Art-Net、tpm2.net、UDP raw、Open Pixel
  Control、Adalight 及其他 USB 板、Philips Hue、Nanoleaf、WiZ、Yeelight、LIFX、Govee、
  Zigbee2MQTT、Home Assistant，以及 Hyperion / HyperHDR 服务器。
- **设备搜索**：在几秒内找到局域网中的 WLED、Hyperion、HyperHDR、Hue 网桥、Nanoleaf、Home Assistant、
  WiZ、Yeelight、LIFX、Govee 和 Art-Net 节点。
- **同时使用多个控制器**：在主控制器旁可添加其他控制器，例如
  墙上的第二套 WLED，或电视两侧的灯条。每个控制器有自己的地址、LED
  布局以及对应的屏幕区域。
- **手机与 Android TV**：分别为触屏和 D-pad 导航提供独立布局。
- **摄像头捕获**：用设备摄像头拍摄电视，并通过四个角进行透视校正，
  适用于无法进行屏幕捕获的电视。
- **无需捕获的灯光效果**：纯色、渐变、电影白、彩虹、火焰、
  烛光、极光等。
- **彩音（音乐律动）**：效果按频率点亮灯带，低频在底部、高频在
  顶部，声音可来自麦克风，或来自设备自身播放的声音。
- **按应用设置灯光延迟**，并支持自动调校：手机摄像头同时拍摄电视和灯带光效，
  测量灯带相对正在播放的影片超前了多少。
- **可调流水线**：捕获质量、帧率、颜色平滑与延迟。
- **开机自启**（开机后、电视休眠后、应用更新后），以及断线后的 **自动重连**。
- **手机遥控**：通过二维码与电视配对，然后从手机启动、停止并更改电视的每一项灯光
  设置。手机也可作为电视遥控器，带触控板
  鼠标和键盘。
- **设置备份**：全部设置可写入文件再还原；在电视上也可通过手机遥控完成。
- **睡眠定时器**：可在 15 分钟到 2 小时后关闭灯光。
- **平均颜色模式**：发送单一主色而非整条灯带数据，适用于性能较弱的设备。
- **快捷设置磁贴**，用于开关灯光。

## 支持的控制器

| 分组 | 输出 | 说明 |
|---|---|---|
| 网络灯带 | WLED | DDP 或 UDP raw，色序、RGBW、亮度上限 |
| | DDP | WLED、ESPixelStick、FPP 及其他 DDP 接收器 |
| | E1.31 (sACN) | 起始 universe、每 universe LED 数、单播或组播 |
| | Art-Net | ArtDmx、起始 universe、每 universe LED 数 |
| | tpm2.net | 每包最多 490 颗 LED，端口 65506 |
| | UDP raw | 单个数据报中的裸 RGB，最多 490 颗 LED |
| | Open Pixel Control | 通过 TCP 连接 FadeCandy / fcserver |
| USB 灯带 | Adalight 与 USB 套件 | Ada、LightBerry APA102、AWA (HyperSerial)、tpm2、Skydimo、SEDU、KarateLight、AtmoLight、SP616E |
| 智能灯 | Philips Hue | 通过网桥，用按钮配对；娱乐区域可获得最高每秒 25 次的流式更新 |
| | Nanoleaf | Light Panels、Canvas、Shapes、Elements、Lines |
| | WiZ、Yeelight、LIFX、Govee | 本地网络协议，无需云端 |
| | Zigbee2MQTT | 通过 MQTT 代理控制 Zigbee 灯具 |
| | Home Assistant | 任意 light 实体，可作为主输出或附加输出 |
| 服务器 | Hyperion / HyperHDR | FlatBuffers、消息优先级 |

灯具和面板会取屏幕某一区域的颜色（左侧、顶部、角落、整屏等），
并以它们能承受的速率跟随画面，而不是以灯带的帧率更新。

## 系统要求

- Android 8.0 (API 26) 或更高。
- 屏幕捕获权限（MediaProjection）。
- 本地网络访问（用于网络控制器和灯具），或 USB Host 支持（用于 Adalight
  及其他 USB 板）。

## 安装

### 从 GitHub Releases
最新版本（**TV** 与 **Mobile**）可从 [Releases 页面](https://github.com/vasmarfas/universal-ambient-light/releases) 下载。

### [Google Play](https://play.google.com/store/apps/details?id=com.vasmarfas.UniversalAmbientLight)

### [RuStore](https://www.rustore.ru/catalog/app/com.vasmarfas.UniversalAmbientLight)

### 实验性：外接 USB 摄像头支持
提供带有 **外接 USB 摄像头（UVC）支持** 的实验性构建，适用于高级场景——屏幕捕获受限或效果不佳的设备。该版本使用用户态驱动，在 Google Play 之外分发。  
**支持者抢先体验：** [Boosty — Experimental Build: External USB Camera Support](https://boosty.to/vasmarfas/posts/ba545975-558f-496f-bb3f-d181349f447c)

## 配置

### 1. 连接
1. 启动应用并打开 **设置**，或在主屏幕上按 **设置控制器**。
2. 控制器界面会列出在网络中发现的设备。选择一台设备，或在下方列表中选择其类型
   并手动输入地址。**检查所有地址** 会扫描整个
   子网中未通过 mDNS 宣告自身的 WLED 和 Hyperion；大约需要一两分钟。
3. Hue 网桥和 Nanoleaf 面板通过设备上的按钮配对。灯具（Hue、WiZ、
   Yeelight、LIFX、Govee、Zigbee2MQTT、Home Assistant）随后分配到屏幕区域；灯旁的 **闪烁**
   可标示是哪一盏灯。带有娱乐区域的 Hue 网桥也可通过
   该区域工作，此时无需再分配区域。
4. 从搜索中选中的 WLED，应用会读取 WLED 中设置的 LED 数量，若与应用中的
   LED 布局数量不一致会提示。

### 2. LED 配置
- **各边 LED 配置**：可分别配置每一边：
    - 上：60 颗 LED（默认）
    - 右：34 颗 LED（默认）
    - 下：60 颗 LED（默认）
    - 左：34 颗 LED（默认）
- **LED 布局**：配置起始角落、方向（顺时针/逆时针），以及启用/禁用各边。

### 2.1. 附加控制器
**设置 → 附加控制器** 可添加与主控制器一同运行、
显示同一画面的输出。此处的控制器配置方式与主控制器相同：选择设备或
类型、输入地址、打开其 LED 布局。

- **墙上的画框** 是相同周长、但有自己 LED 数量的布局。
- **电视侧面的灯条** 是只有一边的布局：设置左侧数量，其余
  保持为 0。**扫描深度** 决定向画面内看多远。
- **边缘的一部分** 通过捕获边距设置：顶条右侧边距 75% 时，只保留
  顶边上的左四分之一。
- **混合输出** 也可以：Adalight 作主控制器、旁边再加 WLED 灯条，或
  灯带加上 Home Assistant 灯具。Adalight 本身只能作为主控制器，USB 会为其
  打开。

平滑与输出延迟对所有控制器共用，因此灯带会同步运动。画面
设置也是共用的；WLED 和 DDP 的亮度按控制器单独设置。在某控制器布局中的 **显示 LED 布局测试**
只点亮该控制器。无法连接的控制器不会
阻止其他控制器；它会在后台重试，并仅出现在日志中。

### 3. 捕获设置
- **捕获来源**：在 **屏幕**（默认）或 **摄像头** 模式之间选择。
    - *屏幕*：使用 MediaProjection API 的标准屏幕捕获（需要屏幕捕获权限）。
    - *摄像头*：使用设备摄像头并进行透视校正的替代方法。适合不支持屏幕捕获的电视，或外接手机方案。
- **捕获帧率（FPS）**：默认 30 FPS（可选：10、15、24、30、60）。
- **捕获质量**：
    - *低 (64px)* — 适用于低端设备或降低延迟。
    - *中 (128px)* — 均衡（默认，推荐）。
    - *高 (256px)* — 仅适用于性能较强的设备。
    - *超高 (512px)* — 高端设备的最高质量。
- **发送平均颜色**：启用以获得最佳性能（整条灯带只发送单一颜色）。
- **黑边检测**：默认关闭。对上下或两侧有黑边的影片打开：
  边缘取自画面内容，而非屏幕边框。**黑边阈值**
  18 适合大多数片源；若找不到黑边，可提高到 24–30。
- **忽略底部字幕条**：黑边检测的一项选项，默认关闭。条高
  取自上边缘，底部只检查角落附近，暗场场景仍会
  保持裁剪。叠在画面上的字幕仍会传到 LED。

### 3.1. 摄像头模式设置
当捕获来源为 **摄像头** 时：
1. 在提示时授予 **摄像头** 权限。
2. 打开 **设置** → **摄像头角点设置**。
3. 放置设备，使摄像头能看到电视屏幕。
4. 拖动四个角点标记（TL、TR、BR、BL），使其对齐电视屏幕的边缘。
5. 点按 **保存** 以存储角点位置。
6. 应用将在捕获时使用这些角点进行透视校正。

**提示：**
- 在开始捕获前，用主屏幕上的实时预览校准设备位置。
- 保证光线充足，以便摄像头能清晰看到电视屏幕。
- 角点调整有助于补偿摄像头相对电视并非正对的情况。

摄像头角点设置中的 **查找电视** 会尝试自动放置角点。它会用四秒钟
观察画面，通过亮度区分点亮的面板与房间，并通过画面是否变化区分电视与灯或
窗户，然后将结果加载到叠加层——在你按下保存之前不会
写入任何内容。测量时灯带会保持熄灭，否则墙上自身的光效
会被当成屏幕的一部分。

请把它当作起点而非最终设置：它勾勒的是点亮的画面而
非面板本身，在明亮房间中容易混淆，角点之后通常仍需
手动微调。若什么都找不到，会说明原因，已保存的角点保持
不变；详细原因写入 logcat 的 `AutoFrameDetection` 和 `CameraEncoder`。

### 3.2. 摄像头睡眠模式
摄像头捕获不会从电视收到待机信号，因此关机后的屏幕仍会
把传感器噪声流式传输到灯带。**摄像头睡眠模式** 设置组（仅在
捕获来源设为 **摄像头** 时可见）会监视已校准的屏幕区域，并在
没有新内容可显示时暂停捕获流水线。默认关闭。

- **启用睡眠模式**：该功能的总开关。
- **睡眠延迟（秒）**：画面需保持空白多久后灯带才
  关闭。范围：5–3600 秒，默认 120。想更快响应可调低；若暗场
  场景误触发睡眠模式则调高。
- **空白屏幕阈值（0–96）**：监视区域的平均亮度等于或低于此值时，
  视为屏幕空白。默认：12。若关电视后仍检测不到，可提高。
- **运动灵敏度阈值（1–64）**：计为运动所需的最小画面变化。
  默认：4。若传感器噪声反复唤醒灯带，可提高。
- **静态画面时睡眠**：画面停止变化时也暂停帧传输
  （暂停的视频、静态菜单）；灯带保留最后的颜色。默认
  关闭，因为长时间静态场景会冻结灯带颜色。

处于睡眠模式时，摄像头仍保持绑定，但以 5 Hz 在稀疏亮度
网格上采样，而不运行完整的透视校正流水线。唤醒需要连续两次
采样超过阈值，因此单帧噪声不会让灯带闪一下。全部
四项设置可在捕获运行时调整，因为它们只能对照
实时画面进行校准。

### 3.3. 颜色与亮度
**颜色处理** 默认关闭，灯带直接获得屏幕颜色。
Adalight 固件草图和大多数 USB 板会将颜色原样传给 LED，不做伽马校正，因此中间调
在灯带上比在屏幕上看起来更亮，颜色发灰，视频黑边
（那里的黑通常是 255 中的 16）会略微发亮。对这类灯带，建议从以下开始：

- **颜色处理**：开。
- **伽马 R**、**伽马 G**、**伽马 B**：45%。刻度是反的：低于 100% 时中间调变暗，
  颜色更浓，深灰熄灭；45% 等于伽马 2.2。
- **饱和度**：120–140%。
- **亮度**：在此调低，或在草图的 `BRIGHTNESS` 常量中调低。

滑块下方的预览会在纯 R、G、B 和灰色渐变上显示结果。Hyperion 在其侧做伽马
校正，因此通常不必再开颜色处理。

### 4. 平滑
- **启用平滑**：默认关闭。关闭时灯带逐帧跟随，场景切换时看起来像
  闪烁；看电影时建议打开。
- **预设**：默认「关闭」。选择预设会自动开关平滑。「响应」：
  50 ms 过渡，60 Hz。「均衡」：200 ms，80 ms 输出延迟，25 Hz。「平滑」：500 ms，200 ms，
  20 Hz。
- **稳定时间**：默认 50 ms，范围 0–1000 ms。
- **输出延迟**：默认 0 ms，范围 0–1000 ms。若灯带超前于画面则提高
  （**灯光延迟**，第 7 节，可按应用设置）。
- **更新频率**：默认 60 Hz（20、25、30、40、50、60 Hz）。

### 5. 启动
1. 在提示时授予 **屏幕捕获 / 投屏** 权限。
2. 切换按钮以启动捕获器。

### 6. 效果
主屏幕上的调色板按钮打开效果。效果在无需
屏幕捕获的情况下点亮灯带：没有权限对话框，电视上显示什么也无关。静态：纯色、
渐变、电影白（色温，6500 K 为参考白）。动画：
彩虹、色循环、呼吸、烛光、火焰、极光、海洋、等离子、彗星。**布局测试**
用不同颜色绘制各边，并从第一颗 LED 跑一颗白点，使
错误的 LED 布局一目了然。

**彩音（音乐律动）** 从运行应用的设备麦克风取声，或从
设备自身播放的声音取声（声源：本机声音，无需麦克风）。
第二种方式看不到以 Dolby 或 DTS 比特流发送到接收器的声音（直通）：
它会绕过 Android。声音被分成 16 个频段：低频以红色点亮
屏幕底部，频段沿两侧向上，到顶边中部时变为蓝色。
灯带对超过最近一秒半平均值的声响作出反应：
节拍与变化会闪光，像房间噪声这样的稳态声会在几秒内淡出。
灵敏度决定多大的上升会点亮灯带。声音在设备上分析，
不会被录制。两种声源都需要录音权限；该效果不会在
手机遥控中提供，因为权限必须在电视上授予。

**电视屏幕关闭时保持开启** 可在电视盒仍醒着时把效果当作夜灯继续运行。
有些电视在待机时会切断网络，那时灯带仍会变暗。

### 7. 灯光延迟
播放器和片源对视频的处理不同，因此灯带可能在每个应用中
超前画面的程度不同。设置 → **灯光延迟** 保存适用于所有应用的延迟，以及
带有各自数值的应用列表；该应用在前台时，电视会切换到对应值。
按应用的部分需要使用情况访问权限，该权限与自启权限一起
通过 ADB 授予。

**用摄像头调校** 从已与电视配对的手机运行。手机拍摄电视和
墙上光效约一分钟，检测两者中的场景切换并找出其间的
偏移。开始时灯带会熄灭几秒，以便手机在画面中寻找
屏幕。需要暗室、动态场景，以及画面中包含整屏并带有一些周围墙面。
结果带有精度估计，并保存给正在播放的应用
或所有应用。灯带落后于画面时无法用延迟修复：
应降低平滑或选择更快的捕获方法。

---

### 8. 设置备份
**设置 → 将设置保存到文件** 会写入 `Download/universal-ambient-light-<date>-<time>.json`。
在 Android 8 和 9 上会改为打开系统文件选择器。**从文件恢复设置** 会用文件中的设置
替换当前全部设置。

- 文件包含全部设置（含附加控制器），以及灯具的令牌和密码，
  以明文保存。
- 与手机的配对、ADB 密钥和系统权限不在文件中。重装后需重新
  设置。
- 当前构建或设备没有的捕获方法会被跳过，保留当前方法。
- Android TV 可能没有系统文件选择器，此时恢复需要文件管理器。若没有，可配对
  手机并在其设置中使用同样两项：文件留在手机上，设置传到
  电视。

### 控制器特定说明

#### Hyperion
- **主机/端口**：服务器 IP 与端口（默认 `19400`）。
- **优先级**：`100`（默认）。
- [Hyperion 文档](https://docs.hyperion-project.org/)

#### WLED
- **主机**：控制器 IP。
- **端口**：`4048`（DDP）、`19446`（UDP Raw，WLED 的 Hyperion 输入）或 `21324`（UDP Raw，WLED 自有实时端口）。
- **协议**：DDP（推荐）。
- **色序**：确保与 WLED 设置一致（例如 WS2812B 用 GRB）。
- **RGBW**：在任意灯带长度下可通过 DDP 工作，也可在端口 `21324` 上通过 UDP Raw（DRGBW，最多 367 颗 LED）。端口 `19446` 是 WLED 的 Hyperion 输入：仅裸 RGB，无白通道，上限 490 颗 LED。
  应用会自行提取白通道（将 R、G、B 共有的分量移到 W），因此在 WLED 中灯带类型必须为 RGBW，且 **从 RGB 计算白通道** 必须设为 `Manual only` 或 `Dual`。在自动模式下，WLED 会丢弃收到的白色值，并根据已经缩小的 RGB 重新计算，结果为零：白色 LED 保持熄灭，颜色看起来发灰。
- [WLED 文档](https://kno.wled.ge/)

#### E1.31 与 Art-Net
- **起始 universe**：灯带的第一个 universe。比 **每 universe LED 数**
  更长的灯带会延续到后续 universe。
- **每 universe LED 数**：170 填满全部 510 个通道；若接收器不同，请设为其值。
- 地址为空的 E1.31 会以组播发送到 `239.255.x.y`。

#### tpm2.net、UDP raw、Open Pixel Control
- tpm2.net 将帧拆成编号数据包，大小按每包 LED 数设置。
- UDP raw 完全没有头，因此整条灯带必须装进一个数据报（490 颗 LED）。
- OPC 保持到端口 `7890` 的 TCP 连接；通道 0 寻址服务器的每个通道。

#### Philips Hue
- 在设备搜索中选择网桥或输入其地址，然后在 30 秒内按下网桥上的圆形按钮并
  **配对**。
- 若 Hue 应用中有娱乐区域，本应用会提议使用其中一个。网桥随后在端口 `2100` 上获得
  最高每秒 25 次的 DTLS 流，区域中的每盏灯按 Hue 应用中设置的位置取色：
  从左到右，以及地板、电视高度或天花板。通过
  Hue API v2，渐变灯带会被拆成多个带有各自位置的通道，从而沿长度
  显示多种颜色；没有 API v2 的网桥和 diyHue 使用较旧的流，
  这类灯带是一盏灯、一种颜色。一个区域最多容纳 10 盏灯。流开启期间，网桥的其他场景和自动化
  不会触碰这些灯。
- 由应用 1.x 版本配对的网桥没有流式密钥，此类网桥必须重新
  配对才能使用区域。
- 没有区域时，网桥的灯列在 **灯具与区域** 中；每盏灯获得一个
  屏幕区域。颜色会转换到各灯的色域。网桥对所有灯合计大约每秒接受
  十条命令，因此更新速率在灯之间共享。

#### Nanoleaf
- 按住控制器上的电源键 5 到 7 秒，直到指示灯闪烁，然后在
  30 秒内按 **配对**。
- 每个面板取墙上相对其他面板所占位置的颜色。

#### WiZ、Yeelight、LIFX、Govee
- 灯具在本地网络中发现，无需云端和账户。
- Yeelight 需在 Yeelight 应用中启用 **LAN Control**。本应用会将每台 Yeelight
  切换到音乐模式，从而解除每分钟 60 条命令的限制。
- Govee 需在 Govee Home 应用中为该设备启用 **LAN Control**。LAN API 为每台设备设置一种
  颜色，灯带分段无法单独寻址。

#### Zigbee2MQTT
- 地址和端口（默认 `1883`）是 Zigbee2MQTT 所使用的 MQTT 代理的地址和端口，
  例如 Home Assistant 的 Mosquitto 附加组件。登录名、密码和基础主题
  （默认 `zigbee2mqtt`）在连接设置中配置。
- 灯具列表来自保留的 `zigbee2mqtt/bridge/devices` 消息，仅显示暴露
  light 的设备。颜色发布到 `zigbee2mqtt/<name>/set`。
- Zigbee 对快速场景较慢：每盏灯每秒几次更新是网络在
  不延迟情况下可承受的量。

#### Adalight (USB)
- **波特率**：`115200`（默认）或与固件匹配。HyperSerial 固件通常运行在
  `2000000`。
- **协议**：ADA（标准 Arduino）、LBAPA（APA102）、AWA（HyperSerial）、tpm2、Skydimo、
  SEDU、KarateLight（8 或 16 通道）、AtmoLight（5 通道）、SP616E。
- [Adalight 仓库](https://github.com/adafruit/Adalight)

##### 用于 Adalight 的 Arduino 草图

与应用兼容的现成 Arduino 草图位于 [`adalight-sketch.ino`](adalight-sketch/adalight-sketch.ino)。

**快速开始：**

1. **安装 FastLED 库：**
    - 在 Arduino IDE 中：`Tools` → `Manage Libraries` → 搜索 “FastLED” → 安装

2. **配置草图：**
    - 打开 `adalight-sketch/adalight-sketch.ino`
    - 修改文件顶部的常量：
        - `DATA_PIN` — LED 灯带连接引脚（Uno/Nano 默认 9，ESP32 和 ESP8266 默认 2）
        - `NUM_LEDS` — 灯带 LED 数量（必须与应用设置一致！）
        - `LED_TYPE` — LED 灯带类型（WS2812B、WS2811、SK6812 等）
        - `COLOR_ORDER` — 色序（WS2812B 用 GRB，其他多为 RGB）
        - `BRIGHTNESS` — 亮度（0-255）

3. **接线：**
    - LED 灯带 DATA → Arduino 引脚（默认 9）
    - LED 灯带 VCC → Arduino 5V（长灯带请用外部电源）
    - LED 灯带 GND → Arduino GND
    - **重要：** 长灯带（>10 颗）请使用外部 5V 电源！

4. **上传草图：**
    - 通过 USB 将 Arduino 连接到电脑
    - 在 Arduino IDE 中选择开发板和端口
    - 上传草图

5. **连接到 Android：**
    - 断开 Arduino 与电脑的连接
    - 通过 USB OTG 线将 Arduino 连接到 Android 设备
    - 在应用中选择连接类型：**Adalight**
    - 设置波特率：**115200**
    - 选择协议：**ADA**
    - 确保应用中的 LED 数量与草图中的 `NUM_LEDS` 一致

**WS2812B 接线示例：**
```
WS2812B DATA → Pin 9 Arduino
WS2812B VCC  → 5V Arduino (or external 5V)
WS2812B GND  → GND Arduino
```

**其他 LED 类型：**
- **APA102 (SPI)**：在 FastLED 库中使用 `APA102` 配置，并在应用中使用 **LBAPA** 协议
- **WS2811**：类似 WS2812B，通常 `COLOR_ORDER = RGB`
- **SK6812**：类似 WS2812B，通常 `COLOR_ORDER = GRB`

**故障排除：**
- 若 LED 不亮：检查接线，确保草图与应用中的 `NUM_LEDS` 一致
- 若颜色不对：更改 `COLOR_ORDER`（尝试 RGB、GRB、BRG）
- 若收不到数据：检查波特率（应为 115200），确保 USB OTG 线支持数据传输

## Android TV 功能
本应用已针对 Android TV 全面优化，包括对 Leanback Launcher 和 D-pad 导航的支持。为方便输入文本（IP 地址），建议在手机上使用 “Google TV” 或 “Android TV Remote” 应用。

## 手机遥控
电视上的灯光可由运行同一应用的手机控制：开关灯光并更改任意设置，包括在其他应用播放影片的过程中。颜色、亮度和 LED 布局立即生效；控制器地址、协议和平滑在一秒内生效，无需重启捕获。

1. 在电视上：主屏幕 → **用手机控制**（或设置 → 遥控）。屏幕显示二维码、地址和配对码。
2. 在手机上：主屏幕 → **电视遥控** → **扫描二维码**。若摄像头无法识别，可手动输入地址和代码。
3. 手机会记住电视，下次启动时自动重连。主屏幕上的 **断开连接** 会让手机回到自己的灯光控制。

手机与电视必须在同一本地网络。连接使用二维码中的密钥以 AES-256-GCM 加密；电视上的 **更改配对码** 会断开所有手机。访问开启时，电视会保持带通知的后台服务：没有它，电视端应用关闭时手机就无法打开灯光。

手机也便于在电视上设置 ADB：无线调试的 6 位数字代码可在手机上输入，电视会自行查找配对端口。

摄像头角点需在电视本身上拖动；从手机端仅可使用自动屏幕搜索。

手机主屏幕上的 **遥控** 将其变成电视遥控器：D-pad、返回、主页、音量和
播放按钮，可在电视上移动光标的触控板（轻点单击，双指
滚动），输入会立即出现在电视上的文本框，以及可启动的电视应用列表。
按钮、鼠标和文本通过电视上的 ADB 传输；没有 ADB 时，仅系统按钮、
轻点和通过无障碍服务的文本可用（GitHub 与 RuStore 构建）。

## 开机自启
**开机时捕获**（默认开启）会在电视开机、从休眠唤醒或应用更新后恢复灯光，前提是之前灯光是开着的。休眠后由系统闹钟看门狗重启，因此在休眠时卸载应用的固件上也能恢复。

无需 MediaProjection 的捕获方法（Scrcpy/ADB、Screencap、无障碍、摄像头）不需要其他操作。Android 10+ 上的 MediaProjection 需要屏幕上确认，而 Android 不会从后台显示该对话框，除非应用持有只能通过 ADB 授予的权限。配对 ADB 后，打开设置 → **自启权限** → **通过 ADB 授予**；此后灯光启动时不再弹出对话框。

若固件在电视休眠时强制停止应用，在下次开机前无法恢复：这是固件限制。

## 外部控制（KeyMapper、Tasker、遥控按键）
应用暴露了一个透明的切换 activity，任何能启动 activity 的自动化工具都可使用——例如用 [KeyMapper](https://github.com/keymapperorg/KeyMapper) 绑定遥控按键：

- 组件：`com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity`
- 不带 action 时进行切换：若灯光在运行则停止，否则启动。
- 带有 action `com.vasmarfas.UniversalAmbientLight.action.TURN_ON` 时仅启动，带有 `com.vasmarfas.UniversalAmbientLight.action.TURN_OFF` 时仅停止。

用 adb 测试：

```
adb shell am start -n com.vasmarfas.UniversalAmbientLight/com.vasmarfas.UniversalAmbientLight.common.ToggleActivity
adb shell am start -a com.vasmarfas.UniversalAmbientLight.action.TURN_OFF
```

除非选择了不需要 MediaProjection 的捕获方法（无障碍、Scrcpy/ADB、Screencap、摄像头），启动时仍会显示系统屏幕捕获对话框。

## 重要说明

### TCL 电视用户
在 TCL 设备上，激进的系统电池优化可能会杀死后台服务。
**解决办法：**
1. 前往 **设置 > 应用 > 特殊应用访问 > 自启动**。
2. 为 Universal Ambient Light 启用自启动。
3. 或者检查 “安全管家” 应用，并将本应用加入例外。

### Fire TV
若 Fire TV Stick 上的开始按钮无反应，请通过 adb 授予悬浮窗和屏幕捕获权限。在 Stick 上启用 **开发者选项 > ADB 调试**，从电脑用 `adb connect <stick-ip>:5555` 连接并运行：

```
adb shell appops set com.vasmarfas.UniversalAmbientLight SYSTEM_ALERT_WINDOW allow
adb shell appops set com.vasmarfas.UniversalAmbientLight PROJECT_MEDIA allow
adb shell am force-stop com.vasmarfas.UniversalAmbientLight
```

已在 Fire TV Stick HD（Fire OS 7.7.1.6）上测试。无障碍捕获方法需要 Android 11，在 Fire OS 7（Android 9）上不可用。

### 高质量视频播放（4K/HDR）
在氛围灯开启时播放高质量视频（2K/4K/HDR）出现问题，是许多电视的硬件限制。内置处理器往往无法同时处理繁重的视频解码和屏幕捕获。这是深层问题，很少能通过软件彻底解决。

**若遇到视频卡顿或延迟：**
1. 将视频播放质量降低到 1080p 或 720p（取决于电视能力）。
2. 或在观看高分辨率内容时完全关闭氛围灯应用。
3. 可尝试调整捕获质量和 FPS 设置，但不太可能彻底解决问题。

**本应显示视频的位置出现黑色预览（4K/HDR、HEVC/VP9 — 或某些电视上的*所有*视频）：**
若 Hyperion/WLED/HyperHDR 预览中视频应在的位置是黑色矩形——而菜单、缩略图、照片和应用内测试颜色捕获正常——这**不是** DRM 问题。在 Android 上，视频绘制在专用的 **硬件视频平面（overlay）** 上，由显示硬件合成并绕过 SurfaceFlinger；`MediaProjection` 只看到 SurfaceFlinger 合成的内容，因此视频区域变成纯黑。通常这只影响 4K / HEVC 10-bit / HDR10 / Dolby Vision，而普通 1080p 走正常栈——**但有些设备会把_所有_视频都走 overlay**（例如部分索尼型号），**另一些则取决于编解码器而非分辨率**：在 Amlogic 盒子上，HEVC/VP9/AV1 播放在任意分辨率下都会黑屏，而 H.264 (AVC) 捕获完美，因为那些解码器把 AFBC 压缩帧直接交给视频平面。本地文件也黑可排除 DRM。这是平台限制，同样影响所有其他 Android 氛围灯工具（Hyperion Android、Lightpack 应用等）——标准 `MediaProjection` 路径没有修复办法，而 `Scrcpy` / `Screencap` / `ADB` 方法也位于 SurfaceFlinger 之后，因此会显示同样的黑色区域。

变通方法：
1. **强制 H.264 (AVC)**，若只有 HEVC/VP9/AV1 发黑：在 SmartTube 中选择 AVC 流而非 VP9；在 Jellyfin 中为客户端禁用 HEVC/AV1 直通播放（或限制码率），使服务器转码为 H.264。
2. **在播放器/服务器中将播放降到 1080p**（Jellyfin → 按设备设置最大码率/分辨率；Kodi → 调整播放设置；mpv → `--hwdec=no` 加上 `--vo=gpu`）。1080p 几乎总是走常规合成栈。
3. **在播放器中禁用硬件解码**（Jellyfin Android：设置 → 播放器 → 关闭 “Prefer FMP4” 和 “Allow background audio playback”；在 mpv → `--hwdec=no`）。软件解码迫使帧走合成路径，从而恢复捕获。
4. **已 root 的设备** — 尝试设置中的 `Screencap (Root)` 或 `Screencap (Shell)` 捕获方法 → 这些通过 `screencap` 二进制而非 `MediaProjection`，有助于某些捕获限制；注意 `screencap` 也读取 SurfaceFlinger 的输出，因此**不能**恢复硬件视频平面。
5. **在 MediaTek SoC 电视上**，实验性的 `MTK THAL Capture` 方法直接从厂商 DIP 引擎捕获（在合成之前），4K HDR 可用——但同时需要 root 和 MTK 芯片。

### DRM 保护内容
**受 DRM 保护的应用**（如 Netflix、Disney+、Amazon Prime Video、Кинопоиск 及类似流媒体服务）在屏幕捕获模式下**无法工作**，这是由于 Android 的安全限制。这是 Android MediaProjection API 的根本限制，无法绕过。

**原因：**
- Android 阻止捕获受 DRM 保护的内容以防止盗版。
- 这在系统级强制执行，应用无法覆盖。

**解决办法：**
1. **使用摄像头模式**：在设置中将捕获来源切换为 **摄像头**。该方法使用设备摄像头而非屏幕捕获，因此可用于受 DRM 保护的内容。需要将带摄像头的手机/平板正对电视屏幕放置。
2. **关闭氛围灯**：观看受 DRM 保护的内容时关闭氛围灯功能。
3. **使用非 DRM 片源**：观看不使用 DRM 保护的内容（本地文件、YouTube 等）。

**注意：** 摄像头模式需要正确校准角点位置，才能准确捕获颜色。


## 许可证
见 [LICENSE.txt](LICENSE.txt)

## 贡献
欢迎贡献！请随时提交 Pull Request 或报告 Issue。
