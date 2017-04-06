## [Q] 什么是 end-to-end exactly-once ?
[A] 一般我们把上游数据源 (Source) 看做一个 end，把下游数据接收 (Sink) 看做另一个 end：

```
 Source  -->  Spark Streaming  -->  Sink
 [end]                             [end]

```

目前的 Spark Streaming 处理过程**自身**是 exactly-once 的，而且对上游这个 end 的数据管理做得也不错（比如在 direct 模式里自己保存 Kafka 的偏移），但对下游除 HDFS 外的如 HBase, MySQL, Redis 等诸多 end 还不太友好，需要 user code 来实现幂等逻辑、才能保证 end-to-end 的 exactly-once。

而在 Spark 2.0 引入的 Structured Streaming 里，将把常见的下游 end 也管理起来（比如通过 batch id 来原生支持幂等），那么不需要 user code 做什么就可以保证 end-to-end 的 exactly-once 了，请见下面一张来自 databricks 的 slide[1]:

 ![end-to-end exactly-once](q%26a.imgs/end-to-end%20exactly-once.png)


- [1] Reynold Xin (Databricks), *"the Future of Real-time in Spark"*, 2016.02, http://www.slideshare.net/rxin/the-future-of-realtime-in-spark.

--

（本文完，参与本文的讨论请 [猛戳这里](https://github.com/lw-lin/CoolplaySpark/issues/25)，返回目录请 [猛戳这里](readme.md)）
