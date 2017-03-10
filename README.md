# zlogger
一个基于<a href="https://github.com/orhanobut/logger">Logger</a>封装的Log日志管理工具
<ol>
<li>保持Logger的基本功能和用法</li>
<li>增加缓存日志到本地功能</li>
<li>新增<code>d,w,i,e,wtf</code>类型的输出筛选</li>
</ol>

##混淆规则
<code>-keep class com.affy.zlogger.\*\*{\*;}</code><br/>
 <code>-dontwarn com.affy.zlogger.\*\*</code>

