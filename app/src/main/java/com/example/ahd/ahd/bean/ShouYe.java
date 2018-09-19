package com.example.ahd.ahd.bean;

public class ShouYe {

    /**
     * code : 0
     * info : OK
     * text : 成功
     * result : {"id":1266195,"perImg":"http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJCPzz8TBd6vLQ52Tde782nk9dfjhmic1mNKCaK7N7qO4wYQS6ryzyhodsZbFOSoDmibquqOV9qlrEg/132","totalIncome":"14.90","todayIncome":"14.90","surplusMoney":"14.90","inviteCode":"wglfoc","isBindWX":1,"isBindMobile":0}
     */

    private int code;
    private String info;
    private String text;
    private ResultBean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 1266195
         * perImg : http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJCPzz8TBd6vLQ52Tde782nk9dfjhmic1mNKCaK7N7qO4wYQS6ryzyhodsZbFOSoDmibquqOV9qlrEg/132
         * totalIncome : 14.90
         * todayIncome : 14.90
         * surplusMoney : 14.90
         * inviteCode : wglfoc
         * isBindWX : 1
         * isBindMobile : 0
         */

        private int id;
        private String perImg;
        private String totalIncome;
        private String todayIncome;
        private String surplusMoney;
        private String inviteCode;
        private int isBindWX;
        private int isBindMobile;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPerImg() {
            return perImg;
        }

        public void setPerImg(String perImg) {
            this.perImg = perImg;
        }

        public String getTotalIncome() {
            return totalIncome;
        }

        public void setTotalIncome(String totalIncome) {
            this.totalIncome = totalIncome;
        }

        public String getTodayIncome() {
            return todayIncome;
        }

        public void setTodayIncome(String todayIncome) {
            this.todayIncome = todayIncome;
        }

        public String getSurplusMoney() {
            return surplusMoney;
        }

        public void setSurplusMoney(String surplusMoney) {
            this.surplusMoney = surplusMoney;
        }

        public String getInviteCode() {
            return inviteCode;
        }

        public void setInviteCode(String inviteCode) {
            this.inviteCode = inviteCode;
        }

        public int getIsBindWX() {
            return isBindWX;
        }

        public void setIsBindWX(int isBindWX) {
            this.isBindWX = isBindWX;
        }

        public int getIsBindMobile() {
            return isBindMobile;
        }

        public void setIsBindMobile(int isBindMobile) {
            this.isBindMobile = isBindMobile;
        }
    }
}
