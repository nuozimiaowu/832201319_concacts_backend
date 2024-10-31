## 项目简介

这是一个基于Spring Boot的联系人管理API，旨在提供基本的CRUD操作，以便用户可以轻松添加、修改、删除和查询联系人信息。项目使用JPA与MySQL数据库进行数据存储和操作。

## 功能特性

- **添加联系人**：支持通过POST请求添加新联系人。
- **修改联系人**：支持通过PUT请求修改现有联系人的信息。
- **删除联系人**：支持通过DELETE请求删除指定联系人。
- **获取所有联系人**：支持通过GET请求获取所有联系人的列表。
- **根据ID获取联系人**：支持通过GET请求根据ID查询特定联系人。

## 技术栈

- **Java**：后端开发语言。
- **Spring Boot**：用于构建RESTful API。
- **Spring Data JPA**：用于数据库操作。
- **MySQL**：关系型数据库管理系统。
- **Maven**：项目管理和构建工具。

## API 端点

| 方法                                                         | 路径                        | 描述             |
| ------------------------------------------------------------ | --------------------------- | ---------------- |
| POST                                                         | `/api/contacts/add`         | 添加联系人       |
| PUT                                                          | `/api/contacts/modify/{id}` | 修改联系人       |
| DELETE                                                       | `/api/contacts/delete/{id}` | 删除联系人       |
| GET                                                          | `/api/contacts/all`         | 获取所有联系人   |
| GET                                                          | `/api/contacts/{id}`        | 根据ID获取联系人 |
| 配置数据库： 在src/main/resources/application.properties文件中配置MySQL数据库连接信息： |                             |                  |
| spring.datasource.url=jdbc:mysql://localhost:3306/<数据库名> |                             |                  |
| spring.datasource.username=<用户名>                          |                             |                  |
| spring.datasource.password=<密码>                            |                             |                  |
| spring.jpa.hibernate.ddl-auto=update                         |                             |                  |

测试API： 使用Postman或任何API测试工具测试API端点
