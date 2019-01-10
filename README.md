# 基于mybatis-plus，结合spring-boot，依赖redis作缓存，只需要建表，新建model mapper和service即可

项目代码主体实现拷贝来自于[Crown](https://gitee.com/cancerGit/Crown)，因原项目依赖内容较多，为了代码复用方便才做的这个项目

使用示例
-------

## 1. 添加jitpack.io

maven
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
gradle
```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

## 2. 添加依赖
maven
```xml
<dependency>
    <groupId>com.github.imloama</groupId>
    <artifactId>mybatisplus-bootext</artifactId>
    <version>Tag</version>
</dependency>
```
gradle
```groovy
dependencies {
    implementation 'com.github.imloama:mybatisplus-bootext:Tag'
}
```

## 3. 在application.properties或application.yml中配置缓存名称，数据库连接，redis连接
```
bootext.cacheName=MyProjectCacheName
```

## 4. 新建表

## 5. 新增model，继承BaseModel

## 6. 新建mapper，继承com.baomidou.mybatisplus.core.mapper.BaseMapper

## 7. 新趤service接口，继承IBaseService，新建service实现，继承BaseServiceImpl

## 8. 在SpriingBooApplication中，使用@MapperScan注解，配置自定义的mapper路径

## 9. 使用请参考[mybatisplus文档](https://mybatis.plus)