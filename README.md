# 简介

在android设备上，实现模糊效果有点棘手，不仅要考虑效果，还要在性能和实现复杂度上做抉择，这个项目是仿照下面网址的demo做的一个基于jni的高斯模糊效果。

http://www.quasimondo.com/StackBlurForCanvas/StackBlurDemo.html

当然大家也可以用Renderscipt来实现高斯模糊，根据资料来看，两种方法效率差不多（NDK开发稍微领先）。因为没有对renderscript进行了解，所以就不多做结论，大家可以按照这个demo来使用一下，跟renderscript做个比较。

# 使用介绍

-  项目build.gradle添加依赖项如下（还没传到jcenter上）：
``` java
allprojects {
    repositories {
        maven {
            url  "http://dl.bintray.com/loner/maven"
        }
    }
}
```

-  app build.gradle添加依赖项如下：
``` java
compile 'loner.library:blur:1.0.0'
```

-  这样就可以使用了，使用方法如下： 
``` java
ImageUtil.fastBlur(tmpBitmap, 25)//返回类型是bitmap，第一个参数是bitmap类型，第二个参数是模糊度。
```

# 补充

- 调用c++的ImageUtil.java代码还没有完善，当图片过大的时候（bitmap大于android给app的内存），就会内存泄漏，这个问题会慢慢修正。

- 如果大家对NDK中的c++代码感兴趣，大家可以看一下这个项目 https://github.com/LonerJimmy/DynamicHeadBg ，我把c++的代码还有mk文件放在jni文件目录下面。





