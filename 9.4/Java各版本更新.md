## 一、Java各版本更新

#### Java SE 1.0

1996-01-23 Oak(橡树)

​    初代版本，伟大的一个里程碑，但是是纯解释运行，使用外挂JIT，性能比较差，运行速度慢。

​    此版本包括两个部分：运行环境（即Java Runtime Environment, JRE）和开发环境（Java Development Kit，JDK）。运行环境包括核心API、集成API、用户界面API、发布技术、Java虚拟机（Java Virtual Machine，JVM）五个部分；其中开发环境包括编译Java程序的编译器（javac 命令）。

----

#### Java SE 1.1

1997-02-19

​    该版本增加了JIT（Just In Time，即时编译）编译器，相对于传统编译器，它会将经常用到的指令保存到内存中，当下次调用的时候不需要重新编译了，此方式让JDK在效率上有了较大优势。

此外还引入新特性：

- JAR - jar包
- JDBC (Java Database Connectivity）- 数据库连接规范
- 内部类（Inner Class）
- Java Beans
- RMI（Remote Method Invocation）- 远程调用
- 反射 （Reflection）

---

#### Java SE 1.2

1998-12-08 Playground(操场)

​    JDK1.2是一个里程碑式的重要版本，Sun在这个版本中把Java技术体系拆分为三个方向，分别是面向桌面应用开发的J2SE（Java 2 Platform，Standard Edition）、面向企业级开发的J2EE（Java 2 Platform，Enterprise Edition）和面向手机等移动终端开发的J2ME（Java 2 Platform，Micro Edition）。

​    在语言和API层面上，Java添加了strictfp关键字，Java类库添加了现在Java编码之中极为常用的一系列Collections集合类等。

​    JDK1.2 Solaris Exact VM，附带JIT解释器，提升GC性能，精准内存管理(Accurate Memory Management)，数据类型敏感等特性。但其生命周期很短暂，很快被Hotspot取代。

此外还引入新特性：

- 集合框架

- 字符串常量做内存映射
- JIT编译器 (Just In Time)
- 对打包Java文件数字签名
- 控制授权访问系统资源的策略工具
- JFC(Java Foundation Classes) Swing 1.0, 拖放和Java2D类库
- Java插件
- JDBC可滚动结果集，BLOB、CLOB、批量更新和用户自定义类型
- Applet中添加声音支持

----

#### Java SE 1.3

2000-05-08 Kestrel(红隼)

​    该版本的改进主要体现在Java类库上（如数学运算和新的Timer API等），JNDI服务从JDK 1.3开始被作为一项平台级服务提供（以前JNDI仅仅是一项扩展服务），使用CORBA IIOP来实现RMI的通信协议等。JDK1.3 对Java的各个方面都做了大量优化和增强。

​    Hotspot 做为默认虚拟机发布。

引入的新特性包括：

- 数学运算
- Timer API（时间）
- Java Sound API（声音）
- CORBA IIOP实现RMI的通信协议
- Java 2D新特性
- JAR文件索引

---

#### Java SE 1.4

2002-02-13 Merlin(隼)

​    此版本是JDK历史上最为成熟的版本。此时Compaq、Fujitsu、SAS、Symbian、IBM等公司的参与，使JDK1.4成为发展最快的一个JDK版本。JDK1.4已经可以使用Java实现大多数的应用。

​    在此期间，Java语言在企业应用领域大放异彩，涌现大量基于Java语言的开源框架：Struts、WebWork、Hibernate、Spring等；大量企业应用服务器也开始涌现：WebLogic、WebSphere、JBoss等。

​    Classic VM退出历史舞台。

引入的新特性包括：

- XML处理
- Java打印服务
- 日志API（Logging）
- Java Web Start
- JDBC 3.0 API
- 断言机制
- 参数API (Preferences)
- 链式异常处理
- 支持IPV6
- 正则表达（Regular）
- image I/O API
- NIO（高级流）

---

#### Java SE 5

2004-09-30 Tiger(老虎)

​    万众期待的版本，同时，Sun将JDK1.5改为Java 5.0，J2EE、J2SE和J2ME也相应的改为Java SE、Java ME、Java EE。增加了泛型、增强for循环、可变数量的形参、注解（Annotations）、自动拆箱和装箱等功能；发布新的企业级平台规范，如通过注释等新特性来简化EJB的复杂性，并推出EJB3.0规范，还推出了自己的MVC框架规范：JSF。

​	JDK 5在Java语法易用性上做出了非常大的改进。如：自动装箱、泛型、动态注解、枚举、可变长参数、遍历循环（foreach循环）等语法特性都是在JDK 5中加入的。在虚拟机和API层面上，这个版本改进了Java的内存模型（Java Memory Model，JMM）、提供了java.util.concurrent并发包等。另外，JDK 5是官方声明可以支持Windows 9x操作系统的最后一个JDK版本。

引入的新特性包括：

- 泛型（Generic）

- For-Each循环
- 自动装箱与拆箱
- 类安全枚举 (Enum)
- 可变参数（Varargs）
- 静态导入（import static）
- 元数据注解（Annotation）
- 内省（Introspect）
- 内存模型（JMM）
- 并发包（java.util.concurrent）

---

#### Java SE 6

2006-12-11 Mustang(野马)

​    该版本引入了一个支持脚本引擎的新框架、UI的增强、对WebService支持的增强（JAX-WS2.0和JAXB2.0）、一系列新的安全相关的增强、JDBC4.0、Compiler API、通用的Annotations支持。且对Java虚拟机内部做了大量改进，包括锁与同步、垃圾收集、类加载等方面的实现都有相当多的改动。

​    提供初步的动态语言支持（通过内置Mozilla JavaScript Rhino引擎实现）、提供编译期注解处理器和微型HTTP服务器API，等等。

引入的新特性包括：

- 命名方式变动

- 脚本语言支持
- 编译API和微型HTTP服务器API
- 锁与同步
- 垃圾收集
- 类加载
- JDBC 4.0（jdbc高级）
- Java Compiler （Java™ 编程语言编译器的接口）
- 可插拔注解
- Native PKI（公钥基础设）
- Java GSS （通用安全服务）
- Kerberos （ 一种安全认证的系统）
- LDAP （LDAP ）
- Web Services （web服务即xml传输）
- JTable的排序和过滤
- 嵌入式数据库 Derby

---

#### Java SE 7

2011-07-28 Dolphin(海豚)

​    Oracle收购Sun公司后，随即宣布大幅裁剪了JDK 7预定目标，以保证JDK 7的正式版能够于2011年7月28日准时发布。

​    该版本引入了二进制整数、支持字符串的switch语句、菱形语法、多异常捕捉、自动关闭资源的try语句等新特性。提供新的G1收集器（G1在发布时依然处于Experimental状态，直至2012年4月的Update 4中才正式商用）、加强对非Java语言的调用支持（JSR-292，这项特性在到JDK 11还有改动）、可并行的类加载架构等。

引入的新特性包括：

- switch 语句支持 String 字符串

- 泛型对象类型推断 - 调用泛型类的构造方法时，可以省去泛型参数，编译器会自动判断。
- catch 多个异常捕获 - 多个异常通过使用 “|”操作符分隔
- 支持动态语言
- 改进泛型类型可变参数
- 语法上支持集合而不一定是数组
- 新增获取环境信息的工具方法
- boolean类型反转：空指针安全，参与位运算
- 两个char之间的equals方法
- 安全的加减乘除
- Java集合（Collections）增强 - map集合支持并发请求
- 引入Java NIO.2开发包
- 数值可以加下划线用作分隔符
- null值得自动处理
- 简化了可变参数方法的调用
- 提供GI收集器
- 加强对非Java语言的调用支持（JSR-292,升级类加载架构）

---

#### Java SE 8（LTS）目前企业主流JDK版本

2014-03-18 

​    该版本带来了全新的Lambda表达式，函数式接口、Lambda 表达式、集合的流式操作、注解的更新、安全性的增强、IO\NIO 的改进、完善的全球化功能等。

引入的新特性包括：

- Lambda表达式

- 改进的类型推断
- Java类型的注释
- 重复注释
- 方法参数反射
- TLS 1.1和TLS 1.2默认启用（单项认证）
- 有限的doPrivileged
- 基于密码加密的更强算法
- JSSE服务器中的SSL / TLS服务器名称指示（SNI）扩展支持
- 支持AEAD算法
- KeyStore增强功能
- SHA-224消息摘要
- 对NSA Suite B加密的增强支持
- 对于高熵随机数生成更好的支持
- 新PKIXRevocationChecker类
- 适用于Windows的64位PKCS11
- Kerberos中的新rcache类型5重放缓存
- 协议转换和约束委派的Kerberos 5
- 默认情况下禁用弱加密
- GSS-API / Kerberos 5机制的未绑定SASL
- 用于多个主机名的SASL服务
- JNI桥接到Mac OS X上的本机JGSS
- 在SunJSSE提供程序中支持更强大的临时DH密钥
- 支持JSSE中的密码套件首选项自定义
- 全新的JavaFX
- Java工具的操作增强
- Unicode增强功能，包括对Unicode 6.2.0的支持
- 采用Unicode CLDR数据和java.locale.providers系统属性
- 新日历和区域设置API
- 引入新的Date Time API
- Nashorn JavaScript引擎
- 并行阵列排序
- 标准编码和解码Base64
- 无符号算术支持
- 新的并发
- Java XML技术增强功能
- 虚拟机操作增强

---

#### Java SE 9

2017-09-22

​    JDK 9带着Jigsaw最终发布了，除了Jigsaw外，JDK 9还增强了若干工具（JS Shell、JLink、JHSDB等），整顿了HotSpot各个模块各自为战的日志系统，支持HTTP 2客户端API等91个JEP。

​    JDK 9 提供了超过 150 项新功能特性，包括备受期待的模块化系统、可交互的 REPL 工具：jshell，JDK 编译工具，Java 公共 API 和私有代码，以及安全增强、扩展提升、性能管理改善等。可以说 JDK 9 是一个庞大的系统工程，完全做了一个整体改变。

引入的新特性包括：

- 平台级modularity（原名：Jigsaw） 模块化系统

- Java 的 REPL 工具： jShell 命令
- 多版本兼容 jar 包（这个在处理向下兼容方面，非常好用）
- 语法改进：接口的私有方法
- 语法改进：UnderScore（下划线）使用的限制
- 底层结构：String 存储结构变更（这个很重要）
- 集合工厂方法：快速创建只读集合
- 增强的 Stream API
- 全新的 HTTP 客户端 API
- 其它特性

---

#### Java SE 10

2018-03-20

​    该版本的主要研发目标是内部重构，诸如统一源仓库、统一垃圾收集器接口、统一即时编译器接口（JVMCI在JDK 9已经有了，这里是引入新的Graal即时编译器）等，这些都将会是对未来Java发展大有裨益的改进，但对普通用户来说JDK 10的新特性就显得乏善可陈，毕竟它只包含了12个JEP，而且其中只有本地类型推断这一个编码端可见的改进。

Java 10 的 12 项关键新特性：

- JEP 286: 局部变量的类型推断。该特性在社区讨论了很久并做了调查，可查看 JEP 286 调查结果

- JEP 296: 将 JDK 的多个代码仓库合并到一个储存库中
- JEP 304: 垃圾收集器接口。通过引入一个干净的垃圾收集器（GC）接口，改善不同垃圾收集器的源码隔离性。
- JEP 307: 向 G1 引入并行 Full GC
- JEP 310: 应用类数据共享。为改善启动和占用空间，在现有的类数据共享（“CDS”）功能上再次拓展，以允许应用类放置在共享存档中
- JEP 312: 线程局部管控。允许停止单个线程，而不是只能启用或停止所有线程
- JEP 313: 移除 Native-Header Generation Tool (javah)
- JEP 314: 额外的 Unicode 语言标签扩展。包括：cu (货币类型)、fw (每周第一天为星期几)、rg (区域覆盖)、tz (时区) 等
- JEP 316: 在备用内存设备上分配堆内存。允许 HotSpot 虚拟机在备用内存设备上分配 Java 对象堆
- JEP 317: 基于 Java 的 JIT 编译器（试验版本）
- JEP 319: 根证书。开源 Java SE Root CA 程序中的根证书
- JEP 322: 基于时间的版本发布模式。“Feature releases” 版本将包含新特性，“Update releases” 版本仅修复 Bug

---

#### Java SE 11（LTS）

2018-09-25

​    该版本有ZGC这样的革命性的垃圾收集器出现，也有把JDK 10中的类型推断加入Lambda语法这种可见的改进。InfoQ：Java 11 正式发布，新特性解读

Java 11 的 17 项关键新特性（JEP）：

- 181 嵌套类可见性控制
- 309 动态文件常量
- 315 改进 Aarch64 Intrinsics
- 318 Epsilon–一个无操作的垃圾收集器
- 320 删除 Java EE 和 CORBA 模块
- 321 HttpClient
- 323 用于 Lambda 参数的局部变量语法
- 324 Curve25519 和 Curve448 算法的密钥协议
- 327 Unicode 10
- 328 Flight Recorder(飞行记录器)
- 329 haCha20 和 Poly1305 加密算法支持
- 330 Launch Single-File Source-Code Programs（启动单一文件的源代码程序）
- 331 低开销的 Heap Profiling
- 332 TLS 1.3支持
- 333 ZGC: A Scalable Low-Latency Garbage Collector（可伸缩低延迟垃圾收集器）
- 335 弃用 Nashorn JavaScript 引擎
- 336 弃用 Pack200 工具和 API

#### Java SE 12

2019-03-19

​    只包含8个JEP，其中主要有Switch表达式、Java微测试套件（JMH）等新功能，最引人注目的特性无疑是加入了由RedHat领导开发的Shen-andoah垃圾收集器。Shenandoah作为首个由非Oracle开发的垃圾收集器，目标又与Oracle在JDK 11中发布的ZGC几乎完全一致，两者天生就存在竞争。

Java 12 的 8 项关键新特性（JEP）：

- 189: Shenandoah: A Low-Pause-Time Garbage Collector (Experimental) ：新增一个名为 Shenandoah 的垃圾回收器，它通过在 Java 线程运行的同时进行疏散 (evacuation) 工作来减少停顿时间。
- 230: Microbenchmark Suite：新增一套微基准测试，使开发者能够基于现有的 Java Microbenchmark Harness（JMH）轻松测试 JDK 的性能，并创建新的基准测试。
- 325: Switch Expressions (Preview) ：对 switch 语句进行扩展，使其可以用作语句或表达式，简化日常代码。
- 334: JVM Constants API ：引入一个 API 来对关键类文件 (key class-file) 和运行时工件的名义描述（nominal descriptions）进行建模，特别是那些可从常量池加载的常量。
- 340: One AArch64 Port, Not Two ：删除与 arm64 端口相关的所有源码，保留 32 位 ARM 移植和 64 位 aarch64 移植。
- 341: Default CDS Archives ：默认生成类数据共享（CDS）存档。
- 344: Abortable Mixed Collections for G1 ：当 G1 垃圾回收器的回收超过暂停目标，则能中止垃圾回收过程。
- 346: Promptly Return Unused Committed Memory from G1 ：改进 G1 垃圾回收器，以便在空闲时自动将 Java 堆内存返回给操作系统。

---

#### Java SE 13

2019-09-17

​    该版本通过改善Java SE平台和JDK的性能，稳定性和安全性来提高开发人员的生产力。这次的JDK13包含了5个JEP(Java Enhancement Proposals)和一个Unicode 12.1的支持总共6大主要新特性。

JDK13的六大重要特性：

- 支持Unicode 12.1

- 动态CDS归档（Dynamic CDS Archiving）
- java.net.Socket和java.net.ServerSocket API的重新实现
- ZGC的增强
- 文本块（预览语言功能）
- switch表达式（预览语言功能）

---

#### Java SE 14

2020-03-17

JDK 14 中新增了以下16个新特性：

- 305: instanceof的模式匹配 (预览)
- 343: 打包工具 (Incubator)
- 345: G1的NUMA内存分配优化
- 349: JFR事件流
- 352: 非原子性的字节缓冲区映射
- 358: 友好的空指针异常
- 359: Records (预览)
- 361: Switch 表达式 (标准)
- 362: 弃用Solaris和SPARC端口
- 363: 移除 CMS （Concurrent Mark Sweep）垃圾收集器
- 364: macOS 系统上的ZGC
- 365: Windows系统上的ZGC
- 366: 弃用ParallelScavenge + SerialOld GC组合
- 367: 移除Pack200 Tools和API
- 368: 文本块 (第二个预览版)
- 370: 外部存储器API (Incubator)

---

#### Java SE 15

2020-09-15

Java15主要有以下几个特性：

- 339    Edwards-Curve Digital Signature Algorithm (EdDSA)    蒙哥马利与扭曲爱德华曲线签名算法
- 360    Sealed Classes (Preview)    密封类(预览)
- 371    Hidden Classes    隐藏类
- 372    Remove the Nashorn JavaScript Engine    移除nasorn JavaScript引擎
- 373    Reimplement the Legacy DatagramSocket API    重新实现旧的DatagramSocket API
- 374    Disable and Deprecate Biased Locking    禁用和弃用偏置锁
- 375    Pattern Matching for instanceof (Second Preview)    模式匹配的instanceof(第二次预览)
- 377    ZGC: A Scalable Low-Latency Garbage Collector    ZGC:一个可扩展的低延迟垃圾收集器
- 378    Text Blocks    文本块
- 379    Shenandoah: A Low-Pause-Time Garbage Collector    Shenandoah:低暂停时间垃圾收集器
- 381    Remove the Solaris and SPARC Ports    移除Solaris和SPARC端口
- 383    Foreign-Memory Access API (Second Incubator)    外部内存访问API(第二个孵化器)
- 384    Records (Second Preview)    记录(第二次预览)
- 385    Deprecate RMI Activation for Removal    建议移除RMI激活

---

#### Java SE 16

2021-03-16

​    JDK16为我们带来了17个方面的提升，包括了新的语言特性、新的工具、内存管理的提升等方面。

JDK16的新特性：

- 内存管理的提升
- 新的打包工具
- UNIX-Domain Socket channels
- Value-based Classes的警告
- Encapsulating JDK Internals by default
- 提供了 C++ 14语言特性
- 其他的一些预览版本的新特性

---

#### Java SE 17（LTS）

2021-09-14

​    继JDK11发布3年以来的又一个长支持（LTS）的版本，其带来了14项JEP（JDK增强建议）更新，包括10个新功能以及2个功能的删除和2个功能的弃用。Spring Boot 3.0 最低只支持JDK 17，已经不再向下兼容，这就意味着未来很多的开发者必定逐步从JDK8 转到JDK17。

Java 17新特性：

- 306：恢复始终严格的浮点语义
- 356：增强型伪随机数发生器
- 382：新的 macOS 渲染管道
- 391：macOS/AArch64 端口
- 398：弃用即将删除的 Applet API
- 403：强封装JDK的内部API
- 406：Switch模式匹配（预览）
- 407：删除 RMI 激活
- 409：密封类
- 410：删除实验性 AOT 和 JIT 编译器
- 411：弃用即将删除安全管理器
- 412：外部函数和内存 API（孵化器）
- 414：Vector API（第二次进行特性孵化）
- 415：特定于上下文的反序列化过滤器

---

#### Java SE 18

2022-03-22

JDK18带来的9个新特性：

- 400：默认 UTF-8 字符编码
- 408：简单的 Web 服务器
- 413：Javadoc 中支持代码片段
- 416：使用方法句柄重新实现反射核心功能
- 417：Vector API（三次孵化）
- 418：互联网地址解析 SPI
- 419：Foreign Function & Memory API (第二次孵化）
- 420：switch 表达式（二次孵化）
- 421：弃用删除相关

---

#### Java SE 19

2022-09-20

​    该版本共有7个新特性，4个预览版特性 + 2个处于孵化阶段特性 + 1个新特性。

JDK19带来的7个新特性：

- 405: Record Patterns (Preview) - Record模式（预览）
- 422: Linux/RISC-V Port - Linux/RISC-V移植
- 424: Foreign Function & Memory API (Preview) - 外部函数和内存API（预览）
- 425: Virtual Threads (Preview) - 虚拟线程（预览）
- 426: Vector API (Fourth Incubator) - 向量API（第4次孵化）
- 427: Pattern Matching for switch (Third Preview) - switch模式匹配（第3次预览）
- 428: Structured Concurrency (Incubator) - 结构化并发（孵化）

---

#### Java SE 20

2023-03-21

JDK20新特性：

- 429   Scoped Values (Incubator) 作用域值 Scoped Value（孵化器）
- 432   Record Patterns (Second Preview) Record 模式（第二预览版）
- 433   Pattern Matching for switch (Fourth Preview) switch 模式匹配（第四预览版）
- 434   Foreign Function & Memory API (Second Preview) 外部函数内存 API（第2版）
- 436   Virtual Threads (Second Preview) 虚拟线程（第二个预览版）
- 437   Structured Concurrency (Second Incubator) 结构化并发（第二个孵化器版本）
- 438   Vector API (Fifth Incubator) Vector API（第五个孵化器版本）

## 二、重要版本更新详解

#### 1.JDK9新特性——私有接口方法

​        2017年9月21日，JDK9正式发布。JDK9提供了超过150项新功能特性，包括备受期待的模块化系统、可交互REPL工具、jshell、JDK编译工具、公共API和接口私有代码、以及安全增强、扩展提升、性能管理改善等。可以说JDK9是一个庞大的系统工程，完全做了一个整体改变。

 私有接口方法：

​    在JDK8之前，接口可以有常量变量和抽象方法，不能在接口中提供方法实现。

​    JDK9不仅像JDK8一样支持接口默认方法，同时还支持私有方法新特性。

​    通过接口私有方法，可以进一步增强接口的灵活性。

```java
package com.iflytek.jdk9;
//私有接口方法
public interface Sample01 {
    //在真正项目开发中，IP地址等信息要动态获得。
    //IP变化，要执行某个命令获取新的IP地址。
    //动态行为，变量无法实现，最好封装成方法。
    //String ip = "192.168.1.30"; 
    default void showInfo(){
        System.out.println("基本信息");
        System.out.println("IP地址:" + getIp());
    }

default void showDetail(){
    System.out.println("详细信息");
    System.out.println("IP地址:"+ getIp());
  }

//私有接口方法为 默认接口方法服务。
private String getIp(){
    return "192.168.1.30";
   }
}
```

#### 2. JDK9新特性——通过try块自动关闭资源

Try自动关闭IO流。

```java
 	final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	 try(br){

		System.out.println(br.readLine());

	}catch(Exception e){

		e.printStackTrace();

}
```

​    没有此新特性之前，释放资源的代码 比主体代码还多，明显不适宜。

```java
package com.iflytek.jdk9;

import java.io.*;
//通过try块自动关闭资源
public class Sample02 {
    public static void main(String[] args) throws FileNotFoundException {
        File source = new File("d:/demo.jpg");
        File target = new File("d:/demo1.jpg");
        //通过try块自动关闭资源
        try (InputStream fis = new FileInputStream(source);
             OutputStream fos = new FileOutputStream(target);){
            byte[] bs = new byte[1024];
            int len;
            //利用read方法循环读取的字节数据，并进行处理
            while((len = fis.read(bs)) != -1){
                System.out.println(len);
                //将读取到到字节数组写入到输出流
                fos.write(bs,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

#### 3.JDK10新特性——var动态类型推断

 	2018年3月21日，JDK10正式发布。JDK9与JDK10都不是长期支持版本（LTS），JDK11是长期支持版本。

​    JDK10新增了109个新特性，与开发相关的关键特性有两个：局部变量类型推断、不可变集合。

​	局部变量类型推断：

```java
	var list=new ArrayList<String>();

	list.add("zhangsan");

	var map=new HashMap<String,String>();

   map.put("a","a");
```

  示例代码

```java
package com.iflytek.jdk10;

import java.util.ArrayList;

//var动态类型推断
public class Sample03 {
    public static void main(String[] args) {
        var str = new String("a");
        var str1 = "a";
        System.out.println(str instanceof String);
        System.out.println(str1 instanceof String);
        var list = new ArrayList<String>();
        list.add("abc");
        //list.add(321);
        //var l = 100l; //var在直接赋值数据类型时返回对应数据类型
        var l = Long.valueOf(100l); //要返回包装类型对象要用valueOf方法
        System.out.println(l instanceof Long);

       var b = Boolean.valueOf(true);
       System.out.println(b instanceof Boolean);
}
```

不可变集合：List.copyOf（提高数据安全性）

```java
package com.iflytek.jdk10;

import java.util.ArrayList;
import java.util.List;

//不可变集合
public class Sample04 {
    public static void main(String[] args) {
        final var list = new ArrayList<String>();
        list.add("ABC");
        list.add("BCD");
        list.add("EFG");
        //List.copyOf创建不可变集合
        List<String> copyList = List.copyOf(list);
        copyList.add("A"); //会抛出不可操作异常

	}

}
```

#### 4.Java11 新的String方法：

```java
package com.iflytek.jdk11;

//新的String方法
public class Sample05 {
    public static void main(String[] args) {
        String str = "    www.imooc.com ";
        boolean isblank = str.isBlank();  //判断字符串是空白,可以都是空格,长度不为0
        System.out.println(str + "是否空白:" + isblank);
        boolean isempty = str.isEmpty();  //判断字符串是否为空,长度=0
        System.out.println(str + "是否为空:" + isempty);
        String result1 = str.strip();    //去掉首尾空白（包括全角空格），trim()只能去掉半角空格
        System.out.println(str + "去除首尾空白:" + result1.length());
        String result2 = str.stripTrailing();  //去除尾部空白
        System.out.println(str + "去除尾部空白:" + result2.length());
        String result3 = str.stripLeading();  //去除首部空白
        System.out.println(str + "去除首部空白:" + result3.length());
        String copyStr = str.repeat(2);  //复制几遍字符串
        System.out.println(str + "复制两次:" + copyStr);
        long lineCount = copyStr.lines().count();  //行数统计
        System.out.println(str + "行数:" + lineCount);//

	}

}
```

#### 5.JDK12-14新特性

2019年3月19日JDK12诞生了，短期支持版本，日常项目中不建议使用它。但是它推出了一个非常重要的，影响到Java整个体系的语法规则，增强的Switch分支语法。

示例代码

```java
package com.iflytek.jdk12;

import java.util.Random;
//新版swith语法
public class Sample06 {
    public void oldSwitch(){
        int day = new Random().nextInt(7);
        int result = 0;
        switch (day) {
            case 0:
            case 1:
            case 2:
                result = 88;
                break;
            case 3:
                result = 99;
                break;
            case 4:
            case 5:
                result = 101;
                break;
            case 6:
                result = 120;
                break;
            default:
                result = -1;
        }
        System.out.println(result);
    }

public void newSwitch(){
    int day = new Random().nextInt(7);
    int result = switch (day){
        case 0,1,2 -> 88;
        case 3 -> 99;
        case 4,5 -> 101;
        case 6 -> 120;
        default -> -1;
    };
    System.out.println(result);
	}
public static void main(String[] args) {
    new Sample06().newSwitch();
	}

}

```

#### 6.JDK13新特性——文本块特性

 JDK13 2019年9月17日发布的，短暂的版本，有了一个千呼万唤很多的年的特性，文本块特性。对我们日常开发有非常大的帮助。

​	

```java
String html="""
			abc
			def
			ghi	
			""";
```

