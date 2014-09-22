# qiniu-plugin
Jenkins 的七牛插件,可以将构建好的结果上传到七牛.

1. 在全局配置里设置 App Key 和 Secret Key
![](https://gitcafe.com/ipy/qiniu-plugin/raw/master/resources/globalconfigure.png)
2. 在 Post-build action 里添加"上传到七牛"的选项
![](https://gitcafe.com/ipy/qiniu-plugin/raw/master/resources/projectconfigure.png)
3. 选择要上传的文件和 bucket
![](https://gitcafe.com/ipy/qiniu-plugin/raw/master/resources/projectoption.png)

插件包下载地址: [qiniu-plugin](http://jenkins-qiniu.qiniudn.com/target%2Fqiniu-plugin.hpi)
