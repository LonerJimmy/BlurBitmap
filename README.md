# 简介

在android设备上，实现模糊效果有点棘手，不仅要考虑效果，还要再性能和实现复杂度上做抉择，这个项目是仿照下面网址的demo做的一个基于jni的高斯模糊效果。

http://www.quasimondo.com/StackBlurForCanvas/StackBlurDemo.html

当然大家也可以用Renderscipt来实现高斯模糊，根据资料来看，两种方法效率差不多（NDK开发稍微领先）。因为没有对renderscript进行了解，所以就不多做结论，大家可以按照这个demo来使用一下，跟renderscript做个比较。

# 使用介绍

因为还没有放到jcenter上，使用的话会稍微麻烦点。

-  把io库赋值到jniLibs中
-  在src/main中创建新的loner/jni/ImageUtil.java（一定是要这样的，因为我jni中对应的函数是这样的路径和名字）
   或者你直接把我这整个package复制到你的项目下面
-  这样就可以使用了，使用方法如下：
   ImageUtil.fastBlur(tmpBitmap, 25)
   返回类型是bitmap，传入的也是bitmap。

# 补充

因为还没有对它进行封装，现在只是实现，不过之后会慢慢完善这个，让它使用起来更加方便。

如果大家对NDK中的c++代码感兴趣，大家可以看一下这个项目

https://github.com/LonerJimmy/DynamicHeadBg

我把c++的代码还有mk文件放在jni文件目录下面。





