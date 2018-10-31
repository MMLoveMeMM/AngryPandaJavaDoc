JavaDoc 主要详细参考 : https://blog.csdn.net/vbirdbest/article/details/80296136<br>
android studio javadoc自动生成plugin安装:<br>
File -> Setting -> plugin -> install javadoc plugin<br>
javadoc 如果无法自动下载,就复制说明里面的链接,下载手动添加到android studio 安装目录的plugin下,比如我的D:\android\android-studio\plugins;<br>
javadoc 默认是不能存在中文字符的,所以在弹出生成的对话框的Other command line arguments中填上<br>
-encoding utf-8 -charset utf-8<br>
<br>
如何使用插件工具:<br>
生成注释:<br>
将鼠标放置方法上，点击Shift+Alt+G，自动生成注释!<br>
取消注释:<br>
点击Shift+Ctrl+Alt+Z，取消生成的注释;<br>
生成javadoc:<br>
点击“Tools—Generate JavaDoc…”,弹出对话框;<br>

注意:上面快捷键是在没有修改android studio keymap的情况,如果修改的是使用eclipse,那就不行了.

问题点:<br>
提示错误Plugin GsonFormat was not installed: Cannot download 'http://plugins.jetbrains.com/pluginManager/?action=download&id=GsonFormat&build=AI-162.2228.14&uuid=48b387ec-80ad-4cf7-be88-b9d355f4afb4': Read timed out<br>

解决办法:<br>
找到settings->system settings->updata下面的Use secure Connetion去掉,冒是因为使用了https协议下载导致的问题<br>
<br>
一个好的工具,程序风格检查:<br>
File -> Settings -> other Settings -> Checkstyle<br>
测试了一下,个人更愿意接受oracle的java程序风格<br>
