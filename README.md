# HIS 医疗系统（his-hello）

医疗系统开发实验一：开发环境搭建与 Spring Boot 工程初始化。

## 技术栈

| 组件 | 版本 |
| --- | --- |
| JDK | 17（Microsoft OpenJDK 17.0.21） |
| 构建工具 | Maven 3.10.0（阿里云镜像） |
| 框架 | Spring Boot 3.2.5 |
| 数据库 | MySQL 8.0.44（端口 3306） |
| 版本控制 | Git 2.56 |
| IDE | IntelliJ IDEA 2024.1.2 |

## 目录结构

```
his-hello
├── pom.xml
├── .mvn/jvm.config
├── src
│   ├── main
│   │   ├── java/com/his
│   │   │   ├── HisHelloApplication.java
│   │   │   └── controller/HealthController.java
│   │   └── resources/application.yml
│   └── test/java/com/his/HisHelloApplicationTests.java
└── README.md
```

## 启动方式

```bash
# 方式一：Maven 直接启动
mvn spring-boot:run

# 方式二：打包后运行
mvn clean package
java -jar target/his-hello-1.0-SNAPSHOT.jar
```

## 测试接口

```
GET http://localhost:8080/api/medical/hello
```

预期返回：`Hello，医疗系统初始化成功！`

## 数据库

- 服务：`MySQL80`（随系统自动启动），地址 `localhost:3306`
- 数据库：`his_db`，字符集 `utf8mb4`，排序规则 `utf8mb4_0900_ai_ci`
- 账号：`root`（密码由本地保管，不写入仓库）
- 说明：当前 Hello World 实验未引入数据源；后续实验可直接使用 `his_db`。

## 环境说明

- `JAVA_HOME` 指向 JDK 17；IDEA 项目 SDK 同为 17。
- Maven 用户配置 `~/.m2/settings.xml` 使用阿里云公共仓库镜像。
- 源码、控制台、Maven 构建统一使用 UTF-8 编码。
- MySQL 服务 `MySQL80` 随系统启动，监听 3306 端口。
