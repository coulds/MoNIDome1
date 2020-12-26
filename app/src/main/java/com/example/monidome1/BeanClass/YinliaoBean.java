package com.example.monidome1.BeanClass;

import java.util.List;

public class YinliaoBean {

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean{
        private String path;
        private String image;
        private String title;
        private String passtime;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }
    }

//    public static class ResultBean {
//        /**
//         * path : https://news.163.com/20/1027/04/FPTTJ2JU0001899O.html
//         * image : http://cms-bucket.ws.126.net/2020/1027/3d9a93e2p00qitsku001nc0009c0070c.png?imageView&thumbnail=140y88&quality=85
//         * title : 被推下水溺亡女子的女儿发声：妈妈和她不是闺蜜
//         * passtime : 2020-10-27 10:00:46
//         */
//
//        private String path;
//        private String image;
//        private String title;
//        private String passtime;
//
//        public String getPath() {
//            return path;
//        }
//
//        public void setPath(String path) {
//            this.path = path;
//        }
//
//        public String getImage() {
//            return image;
//        }
//
//        public void setImage(String image) {
//            this.image = image;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public String getPasstime() {
//            return passtime;
//        }
//
//        public void setPasstime(String passtime) {
//            this.passtime = passtime;
//        }
//    }
}
