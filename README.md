# MavenTutorial

## 1. 创建 Java SE 工程 (即 Java 普通工程)
```
➜  javase-project-01 git:(main) ✗ tree -L 3
.
├── pom.xml
└── src
    ├── main
    │   ├── java (存放java源代码)
    │   └── resources (存放配置文件)
    └── test
        └── java
```


## Java EE 工程, 即 Java Web 工程
### 1. 手动创建 Java SE 工程，然后转换为 Java EE 工程
1. 创建一个 Java SE Maven 工程
2. 补全文件结构
    ```
    ➜  project-02-javaee git:(main) ✗ tree -L 5
    .
    ├── pom.xml
    └── src
        ├── main
        │   ├── java
        │   │    └── com
        │   │        └── ylqi007
        │   ├── resources
        │   └── webapp (要补全的部分: webapp, WEB-INF, web.xml)
        │       └── WEB-INF
        │            └── web.xml
        └── test
            └── java
    ```
3. 修改 pom.xml 文件，将 `packaging` 设置为 `war`
4. 刷新 Maven 结构，`webapp` 上会多一个小蓝点

### 2. 通过插件创建 Java EE 工程
1. 安装 `JBLJavaToWeb` 插件
2. 创建 Java SE Maven 工程
3. 选择相应的 module，右击，使用 JBL 就能快速补全 Web 项目