# Introduction

StackBlur is a fast, almost Gaussian blur created by Mario Klingemann.

- More infomations:http://www.quasimondo.com/StackBlurForCanvas/StackBlurDemo.html

This project implements StackBlur in NDK which maybe better than RenderScript.

# Getting Started

-  Add dependency in app build.gradle as follow：
``` java
compile 'loner.library:blur:1.0.0'
```

-  Call in code： 
``` java
ImageUtil.fastBlur(tmpBitmap, 25)//return bitmap，the first params is bitmap，the second params is ambiguity。
```

The code in the project is more detailed.

# More

- Memory will leak if the bitmap is too large.This is because ImageUtil.fastBlur() have not deal with large bitmap.

- The Source code in NDK is in https://github.com/LonerJimmy/DynamicHeadBg .





