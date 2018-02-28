# zlogger
一个基于<a href="https://github.com/orhanobut/logger">Logger</a>封装的Log日志管理工具
<ol>
<li>保持Logger的基本功能和用法</li>
<li>增加缓存日志到本地功能</li>
<li>新增<code>d,w,i,e,wtf</code>类型的输出筛选</li>
</ol>

##使用说明
1.保持和Logger同样的使用方式<br/>
2.增加是否缓存到本地的开关，用法为：
```java
ZLogger.init(TAG).methodCount(1).hideThreadInfo().cache2Local(context,true);
```

##Download
```java
implementation 'com.affy:zlogger:1.0.1'
```

##混淆规则
```java
-keep class com.affy.zlogger.**{*;}
-dontwarn com.affy.zlogger.**
```