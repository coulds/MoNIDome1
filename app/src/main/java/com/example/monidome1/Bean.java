package com.example.monidome1;

import java.util.List;

public class Bean {


    private int code;
    private List<DateBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DateBean> getData() {
        return data;
    }

    public void setData(List<DateBean> data) {
        this.data = data;
    }

    public static class DateBean{
        private String id;
        private String title;
        private String pic;
        private String collect_num;
        private String food_str;
        private int num;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getCollect_num() {
            return collect_num;
        }

        public void setCollect_num(String collect_num) {
            this.collect_num = collect_num;
        }

        public String getFood_str() {
            return food_str;
        }

        public void setFood_str(String food_str) {
            this.food_str = food_str;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "DateBean{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", pic='" + pic + '\'' +
                    ", collect_num='" + collect_num + '\'' +
                    ", food_str='" + food_str + '\'' +
                    ", num=" + num +
                    '}';
        }
    }

}
