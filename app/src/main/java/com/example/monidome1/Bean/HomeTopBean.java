package com.example.monidome1.Bean;

import java.util.List;

public class HomeTopBean {

    /**
     * data : [{"apkLink":"","audit":1,"author":"扔物线","canEdit":false,"chapterId":249,"chapterName":"干货资源","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":12554,"link":"http://i0k.cn/5axC1","niceDate":"刚刚","niceShareDate":"2020-03-23 16:36","origin":"","prefix":"","projectLink":"","publishTime":1617206400000,"realSuperChapterId":248,"selfVisible":0,"shareDate":1584952597000,"shareUser":"","superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"声明式 UI？Android 官方怒推的 Jetpack Compose 到底是什么？","type":1,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android指北","canEdit":false,"chapterId":249,"chapterName":"干货资源","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17189,"link":"https://mp.weixin.qq.com/s/BR5oMk8IFP2mMScKRrnNXA","niceDate":"刚刚","niceShareDate":"2021-02-04 16:36","origin":"","prefix":"","projectLink":"","publishTime":1616515200000,"realSuperChapterId":248,"selfVisible":0,"shareDate":1612427811000,"shareUser":"","superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"金三银四必备：2056页Android大厂面试真题解析限时免费领取！","type":1,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>记得mipmap刚出来的时候，出现过很多言论，XXX类型图片放mipmap更好。<\/p>\r\n<p>如今的观念基本停留在，仅将app icon放置到mipmap，其他的图片都放到drawable。<\/p>\r\n<p>那么我们想想：<\/p>\r\n<ol>\r\n<li>google 为啥要搞个mipmap，或者mipmap有什么特殊的能力？<\/li>\r\n<li>从源码上能做出相关分析吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17666,"link":"https://wanandroid.com/wenda/show/17666","niceDate":"2天前","niceShareDate":"2021-03-17 21:12","origin":"","prefix":"","projectLink":"","publishTime":1616080780000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1615986729000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | mipmap vs drawable，傻傻分不清楚？","type":1,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":360,"chapterName":"小编发布","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17675,"link":"https://wanandroid.com/blog/show/2964","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1616045214000,"realSuperChapterId":297,"selfVisible":0,"shareDate":1616045193000,"shareUser":"","superChapterId":298,"superChapterName":"原创文章","tags":[{"name":"本站发布","url":"/article/list/0?cid=360"}],"title":"公告：wanandroid api 对于毕设的回复","type":1,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候我们在自定义 View 的需要做动画的时候，我们可以依赖属性动画的回调周期性修改 自定义的属性值，然后调用 invalidate 方法实现。<\/p>\r\n<p>不过我还见过一个比较野的路子，它在 onDraw 里面直接修改属性，然后调用 invalidate() 方法。<\/p>\r\n<p>运行起来好像也没问题。<\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>在 onDraw 里面调用 修改绘制相关属性（例如画圆，修改半径） invalidate() ，这种与属性动画的回调调用 invalidate()源码分析有什么区别？<\/li>\r\n<li>在 onDraw 里面调用  invalidate() 会存在什么问题？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17629,"link":"https://www.wanandroid.com/wenda/show/17629","niceDate":"2021-03-15 00:43","niceShareDate":"2021-03-15 00:43","origin":"","prefix":"","projectLink":"","publishTime":1615740221000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1615740191000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | onDraw 里面调用 invalidate 做动画，有什么问题？","type":1,"userId":2,"visible":1,"zan":4}]
     * errorCode : 0
     * errorMsg :
     */

    private int errorCode;
    private String errorMsg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * apkLink :
         * audit : 1
         * author : 扔物线
         * canEdit : false
         * chapterId : 249
         * chapterName : 干货资源
         * collect : false
         * courseId : 13
         * desc :
         * descMd :
         * envelopePic :
         * fresh : true
         * host :
         * id : 12554
         * link : http://i0k.cn/5axC1
         * niceDate : 刚刚
         * niceShareDate : 2020-03-23 16:36
         * origin :
         * prefix :
         * projectLink :
         * publishTime : 1617206400000
         * realSuperChapterId : 248
         * selfVisible : 0
         * shareDate : 1584952597000
         * shareUser :
         * superChapterId : 249
         * superChapterName : 干货资源
         * tags : []
         * title : 声明式 UI？Android 官方怒推的 Jetpack Compose 到底是什么？
         * type : 1
         * userId : -1
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
