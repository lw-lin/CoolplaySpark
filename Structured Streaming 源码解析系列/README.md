## Structured Streaming 源码解析系列

[「腾讯·广点通」](http://e.qq.com)技术团队荣誉出品

```
本文内容适用范围：
* 2016.12.28 update, Spark 2.1 全系列 √ (已发布：2.1.0, 开发中：2.1.1-SNAPSHOT)
```

- *一、概述*
  - [1.1 Structured Streaming 实现思路与实现概述](1.1 Structured Streaming 实现思路与实现概述.md)
  - 1.2 Structured Streaming 之 Output Modes 解析
- *二、Sources 与 Sinks*
  - [2.1 Structured Streaming 之 Source 解析](2.1 Structured Streaming 之 Source 解析.md)
  - [2.2 Structured Streaming 之 Sink 解析](2.2 Structured Streaming 之 Sink 解析.md)
- *三、状态存储*
  - [3.1 Structured Streaming 之状态存储解析](3.1 Structured Streaming 之状态存储解析.md)
- *四、Event Time 与 Watermark*
  - [4.1 Structured Streaming 之 Event Time 解析](4.1 Structured Streaming 之 Event Time 解析.md)
  - [4.2 Structured Streaming 之 Watermark 解析](4.2 Structured Streaming 之 Watermark 解析.md)
- *#、一些资源和 Q&A*
  - [Spark 资源集合](https://github.com/lw-lin/CoolplaySpark/tree/master/Spark%20%E8%B5%84%E6%BA%90%E9%9B%86%E5%90%88) (包括 Spark Streaming 中文微信群、Spark Summit 视频等资源集合)
  - [Q&A] Structured Streaming 与 Spark Streaming 的区别

## 致谢

> 谨以此《Structured Streaming 源码解析系列》和以往的《Spark Streaming 源码解析系列》，向“把大数据变得更简单 (make big data simple) ”的创新者们，表达感谢和敬意。

## 共享许可

![](https://licensebuttons.net/l/by-nc/4.0/88x31.png)

除非另有注明，本《Structured Streaming 源码解析系列》系列文章使用 [CC BY-NC（署名-非商业性使用）](https://creativecommons.org/licenses/by-nc/4.0/) 知识共享许可协议。
