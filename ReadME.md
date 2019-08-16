# Mapper Struct学习笔记
Mapper Struct 的[官网地址](http://mapstruct.org/)

## Mapper Struct是什么
在我们编码过程中会需要各种不同层之间实体类的转换，Mapper
Struct就是根据我们定义的生成策略，自动帮我们完成实体类之间的转换，听着是不是和lombok很像。

## Lesson 1 快速入门
### 引入maven依赖包以及maven的构建组建 
```xml
<properties>
    <org.mapstruct.version>1.3.0.Final</org.mapstruct.version>
</properties>
<dependencies>
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct</artifactId>
        <version>${org.mapstruct.version}</version>
    </dependency>
</dependencies>
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.5.1</version> <!-- or newer version -->
            <configuration>
                <source>1.8</source> <!-- depending on your project -->
                <target>1.8</target> <!-- depending on your project -->
                <annotationProcessorPaths>
                    <path>
                        <groupId>org.mapstruct</groupId>
                        <artifactId>mapstruct-processor</artifactId>
                        <version>${org.mapstruct.version}</version>
                    </path>
                    <!-- other annotation processors -->
                </annotationProcessorPaths>
            </configuration>
        </plugin>
    </plugins>
</build>
```
### 编写快速入门
见教程[Lesson1](./src/main/java/lesson1)   
在快速入门我们需要注意几点  
1. A类型转为换B类型，那么B类型是需要有默认的无参构造的，不然会报错
   ```class B does not have an accessible parameterless constructor```；
2. 枚举类型的字段会自动转为string类型,类型如A类值为枚举类```CarType.SEDAN```字段type
   会自动转为B类值为sedan字符串的type同名字段；
3. 默认字段对应规则为同名字段对应不看类型，类型会自动转换。

### 背后的技术
1. 遵循jsr269 的注解处理器
2. Service Provider Interface 服务发现技术
3. freemarker
