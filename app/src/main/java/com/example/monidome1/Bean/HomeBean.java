package com.example.monidome1.Bean;

import java.util.List;

public class HomeBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17152,"link":"https://www.jianshu.com/p/d7364591f1d1","niceDate":"6小时前","niceShareDate":"6小时前","origin":"","prefix":"","projectLink":"","publishTime":1612160555000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612160555000,"shareUser":"吊儿郎当","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"&lt;API 28&gt; Activity的启动变成事务了，你知道么？","type":0,"userId":2554,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17146,"link":"https://mp.weixin.qq.com/s/t1qiAggzR0MgxJXTB9mBAw","niceDate":"11小时前","niceShareDate":"11小时前","origin":"","prefix":"","projectLink":"","publishTime":1612142220000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612142220000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何实现RecyclerView的刷新分页","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17139,"link":"https://juejin.cn/post/6923856791117758472","niceDate":"23小时前","niceShareDate":"23小时前","origin":"","prefix":"","projectLink":"","publishTime":1612099015000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612099015000,"shareUser":"一只修仙的猿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入浅出Java线程池：使用篇","type":0,"userId":66812,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17135,"link":"https://juejin.cn/post/6923859213403979789","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612093793000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612093793000,"shareUser":"飞洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"&ldquo;终于懂了&ldquo;系列：Jetpack AAC完整解析（五）DataBinding 重新认知！","type":0,"userId":31360,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":298,"chapterName":"我的博客","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17134,"link":"https://www.wanandroid.com/blog/show/2930","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612088982000,"realSuperChapterId":297,"selfVisible":0,"shareDate":1612086890000,"shareUser":"","superChapterId":298,"superChapterName":"原创文章","tags":[],"title":"Android 避坑指南：Gson 又搞了个坑！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":530,"chapterName":"11（R）","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17132,"link":"https://juejin.cn/post/6902285295513763848","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612086939000,"realSuperChapterId":452,"selfVisible":0,"shareDate":1612085665000,"shareUser":"鸿洋","superChapterId":453,"superChapterName":"版本适配","tags":[],"title":"Android 存储进化：分区存储","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在上一问，我们了解了 Java 中 lambda 表达式的原理：<\/p>\r\n<p><a href=\"https://www.wanandroid.com/wenda/show/16717\">每日一问 | Java中匿名内部类写成 lambda，真的只是语法糖吗？<\/a><\/p>\r\n<p>新的问题来了，看下面一段简单的 lambda 代码：<\/p>\r\n<pre><code>Runnable r = ()-&gt;{\r\n      Log.d(&quot;test&quot;,&quot;hello, lambda&quot;);\r\n};\r\nr.run();\r\n<\/code><\/pre><ol>\r\n<li>上述代码在 Android 中与 Java 中，运行时原理有何不同？<\/li>\r\n<li>与 Java 的 lambda 相比，哪个更像是语法糖？<\/li>\r\n<li>transformClassesWithDesugarForDebug 这个任务是做什么的？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"host":"","id":16771,"link":"https://www.wanandroid.com/wenda/show/16771","niceDate":"1天前","niceShareDate":"2021-01-06 01:46","origin":"","prefix":"","projectLink":"","publishTime":1612084837000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1609868785000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Java 中的 lambda 与 Android 中的 lambda 有什么不同？","type":0,"userId":2,"visible":1,"zan":10},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<blockquote>\r\n<p>本题目摘自一篇 Blog，大家先尝试思考下，过两天注明博客链接。<\/p>\r\n<\/blockquote>\r\n<p>众所周知，对于 RxJava我们可以使用：<\/p>\r\n<ol>\r\n<li>observeOn<\/li>\r\n<li>subscribeOn<\/li>\r\n<\/ol>\r\n<p>去做线程调度，我们看个例子：<\/p>\r\n<pre><code>fun fetchItem(): Single&lt;Item&gt; {\r\n    return download(itemId.getAndIncrement())\r\n        .flatMap(::unZip)\r\n        .flatMap(::checkMd5)\r\n}\r\n\r\nprivate fun download(id: Int): Single&lt;Item&gt; {\r\n    return Single.just(id)\r\n        //Simulate a long time operation\r\n        .delay(300, TimeUnit.MILLISECONDS, Schedulers.io())\r\n        .map { Item(it) }\r\n}\r\n\r\nprivate fun unZip(item: Item): Single&lt;Item&gt; {\r\n    return Single.just(item)\r\n        //Simulate a long time operation\r\n        .delay(300, TimeUnit.MILLISECONDS, Schedulers.io())\r\n}\r\n\r\nprivate fun checkMd5(item: Item): Single&lt;Item&gt; {\r\n    return Single.just(item)\r\n        //Simulate a long time operation\r\n        .delay(300, TimeUnit.MILLISECONDS, Schedulers.io())\r\n}\r\n<\/code><\/pre><p>上面模拟的操作中，download unZip checkMd5 都各自指定了调度器，导致 fetchItem 实际上发生了三次线程切换。 <\/p>\r\n<p>对于这种一系列的耗时操作来说，完全可以运行在同一条后台线程上。<\/p>\r\n<p>还有这个更刻意的例子：<\/p>\r\n<pre><code>Observable\r\n    .create(emitter -&gt; {\r\n        System.out.println(&quot;create on &quot; + Thread.currentThread().getName());\r\n        emitter.onNext(&quot;Test&quot;);\r\n        emitter.onComplete();\r\n    })\r\n    .subscribeOn(Schedulers.io())\r\n    .observeOn(Schedulers.io())\r\n    .map(s -&gt; {\r\n        System.out.println(&quot;map on &quot; + Thread.currentThread().getName());\r\n        return s;\r\n    })\r\n    .observeOn(Schedulers.io())\r\n    .flatMapCompletable(s -&gt; {\r\n        System.out.println(&quot;flatMap on &quot; + Thread.currentThread().getName());\r\n        return Completable.complete();\r\n    })\r\n    .subscribe();\r\n<\/code><\/pre><p>其实几次操作都交给了 io 线程调度，大概率运行在不同的线程上，实际上完全可以避免没有必要的 io 调度。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>我们如何无感知的避免这类多余的线程调度，例如当前方法已经运行在 io 线程，那么就没有必要再去做 io 线程调度了；<\/li>\r\n<li>无感知指的是，不需要刻意去修改业务逻辑代码，毕竟上面第一个例子那个几个方法内部指定Schedulers.io()也是合理的。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"host":"","id":16929,"link":"https://www.wanandroid.com/wenda/show/16929","niceDate":"1天前","niceShareDate":"2021-01-16 21:29","origin":"","prefix":"","projectLink":"","publishTime":1612083486000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1610803767000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 如何检测和避免 RxJava 的重复线程切换？","type":0,"userId":2,"visible":1,"zan":1},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17117,"link":"https://blog.csdn.net/willway_wang/article/details/113462075","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612074056000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612073165000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Java筑基&mdash;&mdash;访问者设计模式，以动物联合国大会为例","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17115,"link":"https://www.jianshu.com/p/a38bfaaa9fac","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612061346000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612061346000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入内存优化","type":0,"userId":73657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17109,"link":"https://blog.csdn.net/willway_wang/article/details/100184784","niceDate":"2021-01-29 17:51","niceShareDate":"2021-01-29 17:51","origin":"","prefix":"","projectLink":"","publishTime":1611913910000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611913910000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin 的 Backing Fields 和 Backing Properties","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17108,"link":"https://www.jianshu.com/p/5364894f9b90","niceDate":"2021-01-29 15:44","niceShareDate":"2021-01-29 15:44","origin":"","prefix":"","projectLink":"","publishTime":1611906283000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611906283000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入启动优化","type":0,"userId":73657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17104,"link":"https://mp.weixin.qq.com/s/LAi2ngSmi9CNOTfq-e8y6A","niceDate":"2021-01-29 09:33","niceShareDate":"2021-01-29 09:33","origin":"","prefix":"","projectLink":"","publishTime":1611883983000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611883983000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView实现拖动排序和滑动删除功能","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaojigugu","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"可配置：压缩方式、是否保留源文件、更大限度像素、目标尺寸、压缩格式（jpg、png、webp）、输出目录","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"host":"","id":17100,"link":"https://www.wanandroid.com/blog/show/2928","niceDate":"2021-01-28 23:59","niceShareDate":"2021-01-28 23:59","origin":"","prefix":"","projectLink":"https://github.com/xiaojigugu/MasterImageCompress","publishTime":1611849559000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1611849559000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"MasterImageCompress图片压缩框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17094,"link":"https://mp.weixin.qq.com/s/bmxxZ7CTVU5zYYx2fWRlIw","niceDate":"2021-01-28 09:19","niceShareDate":"2021-01-28 09:19","origin":"","prefix":"","projectLink":"","publishTime":1611796766000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611796766000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"WebView中Java与JavaScript的交互","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"979451341","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"实现功能\r\n\r\n1.用户的登录注册\r\n2.单聊，能清空聊天记录，且对于单人可以进行.语音通话，\r\n3.群聊，能清空聊天记录、修改群名和修改群头像（只有群主才可以做）\r\n4.消息类型：文字（包含系统表情）、语音、图片、视频、文件、语音通话记录（自定义消息）。\r\n5.扫码或输入用户名搜索添加好友。\r\n6.修改自身用户的头像和昵称、性别\r\n\r\n ","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/0669e4f5-9662-42ad-b6ee-cc7b3041827d.png","fresh":false,"host":"","id":17091,"link":"https://www.wanandroid.com/blog/show/2927","niceDate":"2021-01-28 00:35","niceShareDate":"2021-01-28 00:35","origin":"","prefix":"","projectLink":"https://github.com/979451341/WanIm","publishTime":1611765339000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1611765339000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"玩聊天，基于极光IM的即时通讯app，功能完善","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"youxinLu","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Flutter_Mall是一款Flutter开源在线商城应用程序，是基于litemall基础上进行开发，litemall包含了Spring Boot后端 + Vue管理员前端 + 微信小程序用户前端 + Vue用户移动端感兴趣的同学可以自行研究部署，Flutter_Mall基本上包含了litemall中小程序的功能。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/49c2f888-1bd8-465a-947b-a7381b501389.png","fresh":false,"host":"","id":17090,"link":"https://www.wanandroid.com/blog/show/2926","niceDate":"2021-01-28 00:34","niceShareDate":"2021-01-28 00:34","origin":"","prefix":"","projectLink":"https://github.com/youxinLu/flutter_mall","publishTime":1611765290000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1611765290000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Flutter_Mall 基于litemall的Flutter开源在线商城应用程序","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17089,"link":"https://www.jianshu.com/p/9a91ed789c9a","niceDate":"2021-01-28 00:33","niceShareDate":"2021-01-28 00:32","origin":"","prefix":"","projectLink":"","publishTime":1611765181000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1611765170000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"Qigsaw源码之Gradle插件解析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":185,"chapterName":"组件化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17085,"link":"https://www.jianshu.com/p/71bfc846e7b9","niceDate":"2021-01-28 00:32","niceShareDate":"2021-01-28 00:30","origin":"","prefix":"","projectLink":"","publishTime":1611765133000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1611765053000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"项目组件化实践","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17088,"link":"https://www.jianshu.com/p/e17ae38a9fed","niceDate":"2021-01-28 00:31","niceShareDate":"2021-01-28 00:31","origin":"","prefix":"","projectLink":"","publishTime":1611765112000,"realSuperChapterId":39,"selfVisible":0,"shareDate":1611765101000,"shareUser":"鸿洋","superChapterId":100,"superChapterName":"5.+高新技术","tags":[],"title":"DiffUtil和它的差量算法","type":0,"userId":2,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":498,"size":20,"total":9960}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17152,"link":"https://www.jianshu.com/p/d7364591f1d1","niceDate":"6小时前","niceShareDate":"6小时前","origin":"","prefix":"","projectLink":"","publishTime":1612160555000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612160555000,"shareUser":"吊儿郎当","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"&lt;API 28&gt; Activity的启动变成事务了，你知道么？","type":0,"userId":2554,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17146,"link":"https://mp.weixin.qq.com/s/t1qiAggzR0MgxJXTB9mBAw","niceDate":"11小时前","niceShareDate":"11小时前","origin":"","prefix":"","projectLink":"","publishTime":1612142220000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612142220000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何实现RecyclerView的刷新分页","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17139,"link":"https://juejin.cn/post/6923856791117758472","niceDate":"23小时前","niceShareDate":"23小时前","origin":"","prefix":"","projectLink":"","publishTime":1612099015000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612099015000,"shareUser":"一只修仙的猿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入浅出Java线程池：使用篇","type":0,"userId":66812,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17135,"link":"https://juejin.cn/post/6923859213403979789","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612093793000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612093793000,"shareUser":"飞洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"&ldquo;终于懂了&ldquo;系列：Jetpack AAC完整解析（五）DataBinding 重新认知！","type":0,"userId":31360,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":298,"chapterName":"我的博客","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17134,"link":"https://www.wanandroid.com/blog/show/2930","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612088982000,"realSuperChapterId":297,"selfVisible":0,"shareDate":1612086890000,"shareUser":"","superChapterId":298,"superChapterName":"原创文章","tags":[],"title":"Android 避坑指南：Gson 又搞了个坑！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":530,"chapterName":"11（R）","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17132,"link":"https://juejin.cn/post/6902285295513763848","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612086939000,"realSuperChapterId":452,"selfVisible":0,"shareDate":1612085665000,"shareUser":"鸿洋","superChapterId":453,"superChapterName":"版本适配","tags":[],"title":"Android 存储进化：分区存储","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在上一问，我们了解了 Java 中 lambda 表达式的原理：<\/p>\r\n<p><a href=\"https://www.wanandroid.com/wenda/show/16717\">每日一问 | Java中匿名内部类写成 lambda，真的只是语法糖吗？<\/a><\/p>\r\n<p>新的问题来了，看下面一段简单的 lambda 代码：<\/p>\r\n<pre><code>Runnable r = ()-&gt;{\r\n      Log.d(&quot;test&quot;,&quot;hello, lambda&quot;);\r\n};\r\nr.run();\r\n<\/code><\/pre><ol>\r\n<li>上述代码在 Android 中与 Java 中，运行时原理有何不同？<\/li>\r\n<li>与 Java 的 lambda 相比，哪个更像是语法糖？<\/li>\r\n<li>transformClassesWithDesugarForDebug 这个任务是做什么的？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"host":"","id":16771,"link":"https://www.wanandroid.com/wenda/show/16771","niceDate":"1天前","niceShareDate":"2021-01-06 01:46","origin":"","prefix":"","projectLink":"","publishTime":1612084837000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1609868785000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Java 中的 lambda 与 Android 中的 lambda 有什么不同？","type":0,"userId":2,"visible":1,"zan":10},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<blockquote>\r\n<p>本题目摘自一篇 Blog，大家先尝试思考下，过两天注明博客链接。<\/p>\r\n<\/blockquote>\r\n<p>众所周知，对于 RxJava我们可以使用：<\/p>\r\n<ol>\r\n<li>observeOn<\/li>\r\n<li>subscribeOn<\/li>\r\n<\/ol>\r\n<p>去做线程调度，我们看个例子：<\/p>\r\n<pre><code>fun fetchItem(): Single&lt;Item&gt; {\r\n    return download(itemId.getAndIncrement())\r\n        .flatMap(::unZip)\r\n        .flatMap(::checkMd5)\r\n}\r\n\r\nprivate fun download(id: Int): Single&lt;Item&gt; {\r\n    return Single.just(id)\r\n        //Simulate a long time operation\r\n        .delay(300, TimeUnit.MILLISECONDS, Schedulers.io())\r\n        .map { Item(it) }\r\n}\r\n\r\nprivate fun unZip(item: Item): Single&lt;Item&gt; {\r\n    return Single.just(item)\r\n        //Simulate a long time operation\r\n        .delay(300, TimeUnit.MILLISECONDS, Schedulers.io())\r\n}\r\n\r\nprivate fun checkMd5(item: Item): Single&lt;Item&gt; {\r\n    return Single.just(item)\r\n        //Simulate a long time operation\r\n        .delay(300, TimeUnit.MILLISECONDS, Schedulers.io())\r\n}\r\n<\/code><\/pre><p>上面模拟的操作中，download unZip checkMd5 都各自指定了调度器，导致 fetchItem 实际上发生了三次线程切换。 <\/p>\r\n<p>对于这种一系列的耗时操作来说，完全可以运行在同一条后台线程上。<\/p>\r\n<p>还有这个更刻意的例子：<\/p>\r\n<pre><code>Observable\r\n    .create(emitter -&gt; {\r\n        System.out.println(&quot;create on &quot; + Thread.currentThread().getName());\r\n        emitter.onNext(&quot;Test&quot;);\r\n        emitter.onComplete();\r\n    })\r\n    .subscribeOn(Schedulers.io())\r\n    .observeOn(Schedulers.io())\r\n    .map(s -&gt; {\r\n        System.out.println(&quot;map on &quot; + Thread.currentThread().getName());\r\n        return s;\r\n    })\r\n    .observeOn(Schedulers.io())\r\n    .flatMapCompletable(s -&gt; {\r\n        System.out.println(&quot;flatMap on &quot; + Thread.currentThread().getName());\r\n        return Completable.complete();\r\n    })\r\n    .subscribe();\r\n<\/code><\/pre><p>其实几次操作都交给了 io 线程调度，大概率运行在不同的线程上，实际上完全可以避免没有必要的 io 调度。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>我们如何无感知的避免这类多余的线程调度，例如当前方法已经运行在 io 线程，那么就没有必要再去做 io 线程调度了；<\/li>\r\n<li>无感知指的是，不需要刻意去修改业务逻辑代码，毕竟上面第一个例子那个几个方法内部指定Schedulers.io()也是合理的。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"host":"","id":16929,"link":"https://www.wanandroid.com/wenda/show/16929","niceDate":"1天前","niceShareDate":"2021-01-16 21:29","origin":"","prefix":"","projectLink":"","publishTime":1612083486000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1610803767000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 如何检测和避免 RxJava 的重复线程切换？","type":0,"userId":2,"visible":1,"zan":1},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17117,"link":"https://blog.csdn.net/willway_wang/article/details/113462075","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612074056000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612073165000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Java筑基&mdash;&mdash;访问者设计模式，以动物联合国大会为例","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17115,"link":"https://www.jianshu.com/p/a38bfaaa9fac","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612061346000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612061346000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入内存优化","type":0,"userId":73657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17109,"link":"https://blog.csdn.net/willway_wang/article/details/100184784","niceDate":"2021-01-29 17:51","niceShareDate":"2021-01-29 17:51","origin":"","prefix":"","projectLink":"","publishTime":1611913910000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611913910000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Kotlin 的 Backing Fields 和 Backing Properties","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17108,"link":"https://www.jianshu.com/p/5364894f9b90","niceDate":"2021-01-29 15:44","niceShareDate":"2021-01-29 15:44","origin":"","prefix":"","projectLink":"","publishTime":1611906283000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611906283000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入启动优化","type":0,"userId":73657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17104,"link":"https://mp.weixin.qq.com/s/LAi2ngSmi9CNOTfq-e8y6A","niceDate":"2021-01-29 09:33","niceShareDate":"2021-01-29 09:33","origin":"","prefix":"","projectLink":"","publishTime":1611883983000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611883983000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView实现拖动排序和滑动删除功能","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaojigugu","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"可配置：压缩方式、是否保留源文件、更大限度像素、目标尺寸、压缩格式（jpg、png、webp）、输出目录","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"host":"","id":17100,"link":"https://www.wanandroid.com/blog/show/2928","niceDate":"2021-01-28 23:59","niceShareDate":"2021-01-28 23:59","origin":"","prefix":"","projectLink":"https://github.com/xiaojigugu/MasterImageCompress","publishTime":1611849559000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1611849559000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"MasterImageCompress图片压缩框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17094,"link":"https://mp.weixin.qq.com/s/bmxxZ7CTVU5zYYx2fWRlIw","niceDate":"2021-01-28 09:19","niceShareDate":"2021-01-28 09:19","origin":"","prefix":"","projectLink":"","publishTime":1611796766000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1611796766000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"WebView中Java与JavaScript的交互","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"979451341","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"实现功能\r\n\r\n1.用户的登录注册\r\n2.单聊，能清空聊天记录，且对于单人可以进行.语音通话，\r\n3.群聊，能清空聊天记录、修改群名和修改群头像（只有群主才可以做）\r\n4.消息类型：文字（包含系统表情）、语音、图片、视频、文件、语音通话记录（自定义消息）。\r\n5.扫码或输入用户名搜索添加好友。\r\n6.修改自身用户的头像和昵称、性别\r\n\r\n ","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/0669e4f5-9662-42ad-b6ee-cc7b3041827d.png","fresh":false,"host":"","id":17091,"link":"https://www.wanandroid.com/blog/show/2927","niceDate":"2021-01-28 00:35","niceShareDate":"2021-01-28 00:35","origin":"","prefix":"","projectLink":"https://github.com/979451341/WanIm","publishTime":1611765339000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1611765339000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"玩聊天，基于极光IM的即时通讯app，功能完善","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"youxinLu","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Flutter_Mall是一款Flutter开源在线商城应用程序，是基于litemall基础上进行开发，litemall包含了Spring Boot后端 + Vue管理员前端 + 微信小程序用户前端 + Vue用户移动端感兴趣的同学可以自行研究部署，Flutter_Mall基本上包含了litemall中小程序的功能。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/49c2f888-1bd8-465a-947b-a7381b501389.png","fresh":false,"host":"","id":17090,"link":"https://www.wanandroid.com/blog/show/2926","niceDate":"2021-01-28 00:34","niceShareDate":"2021-01-28 00:34","origin":"","prefix":"","projectLink":"https://github.com/youxinLu/flutter_mall","publishTime":1611765290000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1611765290000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Flutter_Mall 基于litemall的Flutter开源在线商城应用程序","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17089,"link":"https://www.jianshu.com/p/9a91ed789c9a","niceDate":"2021-01-28 00:33","niceShareDate":"2021-01-28 00:32","origin":"","prefix":"","projectLink":"","publishTime":1611765181000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1611765170000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"Qigsaw源码之Gradle插件解析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":185,"chapterName":"组件化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17085,"link":"https://www.jianshu.com/p/71bfc846e7b9","niceDate":"2021-01-28 00:32","niceShareDate":"2021-01-28 00:30","origin":"","prefix":"","projectLink":"","publishTime":1611765133000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1611765053000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"项目组件化实践","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17088,"link":"https://www.jianshu.com/p/e17ae38a9fed","niceDate":"2021-01-28 00:31","niceShareDate":"2021-01-28 00:31","origin":"","prefix":"","projectLink":"","publishTime":1611765112000,"realSuperChapterId":39,"selfVisible":0,"shareDate":1611765101000,"shareUser":"鸿洋","superChapterId":100,"superChapterName":"5.+高新技术","tags":[],"title":"DiffUtil和它的差量算法","type":0,"userId":2,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 498
         * size : 20
         * total : 9960
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * host :
             * id : 17152
             * link : https://www.jianshu.com/p/d7364591f1d1
             * niceDate : 6小时前
             * niceShareDate : 6小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1612160555000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1612160555000
             * shareUser : 吊儿郎当
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : &lt;API 28&gt; Activity的启动变成事务了，你知道么？
             * type : 0
             * userId : 2554
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private String host;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
