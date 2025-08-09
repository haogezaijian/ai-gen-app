# ai-gen-app - AI 前端代码生成平台

## 项目简介
ai-gen-app 是一款基于 Spring Boot 的 AI 辅助前端代码生成工具，能够根据用户需求描述，自动生成符合规范的前端代码。支持单文件 HTML（内嵌 CSS/JS）和多文件（HTML、CSS、JavaScript 分离）两种输出格式，生成的代码遵循响应式设计原则，无需依赖外部框架。

## 核心功能
- 支持单文件 HTML 生成（CSS 和 JavaScript 内联）
- 支持多文件分离生成（HTML、CSS、JavaScript 独立文件）
- 生成代码具备响应式设计，适配桌面和移动设备
- 纯原生实现，不依赖任何外部框架或库
- 自动填充占位内容（文本使用 Lorem Ipsum，图片使用 picsum.photos）
- 支持代码流式生成和保存功能

## 技术栈
- **后端框架**：Spring Boot 3.5.4
- **开发语言**：Java 21
- **AI 集成**：langchain4j 1.1.0
- **ORM 框架**：MyBatis Flex 1.11.1
- **工具类**：Hutool 5.8.38
- **构建工具**：Maven
- **数据库**：MySQL

## 快速开始

### 环境要求
- Java 21 及以上
- Maven 3.6+
- MySQL 8.0+

### 运行步骤
1. 克隆项目到本地
```shell
git clone https://github.com/haogezaijian/ai-gen-app.git
cd ai-gen-app
```
   
   
### 配置数据库连接（在 application.yml 中修改）

### 启动项目
```shell
mvn spring-boot:run
```