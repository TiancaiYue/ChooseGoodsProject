package com.shichuang.choosegoodsproject;

import java.util.List;

/**
 * Created by zmy on 2018/1/24.
 */

public class ThingsDetails {
    private int id = 0;
    private float promotion_price = 0;
    private int number = 0;
    private int order_base = 0;
    private int goods_id = 0;
    private String goods_name = "";
    private float market_price = 0;
    private float platform_price = 0;
    private String pics = "";
    private String bewrite = "";
    private float weight = 0;
    private float volume = 0;
    private int state = 0;
    private String url;
    private List<SpecTile> specTile;

    public class SpecTile {
        private List<Values> values;

        public class Values {
            private String id = "";
            private String name = "";
            private boolean isSelect = false;
            private boolean isCanSelect = true;

            public boolean isCanSelect() {
                return isCanSelect;
            }

            public void setCanSelect(boolean canSelect) {
                isCanSelect = canSelect;
            }

            public boolean isSelect() {
                return isSelect;
            }

            public void setSelect(boolean select) {
                isSelect = select;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }

        private String name = "";

        public List<Values> getValues() {
            return values;
        }

        public void setValues(List<Values> values) {
            this.values = values;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public List<SpecTile> getSpecTile() {
        return specTile;
    }

    public void setSpecTile(List<SpecTile> specTile) {
        this.specTile = specTile;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(float promotion_price) {
        this.promotion_price = promotion_price;
    }

    public int getOrder_base() {
        return order_base;
    }

    public void setOrder_base(int order_base) {
        this.order_base = order_base;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public float getMarket_price() {
        return market_price;
    }

    public void setMarket_price(float market_price) {
        this.market_price = market_price;
    }

    public float getPlatform_price() {
        return platform_price;
    }

    public void setPlatform_price(float platform_price) {
        this.platform_price = platform_price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getBewrite() {
        return bewrite;
    }

    public void setBewrite(String bewrite) {
        this.bewrite = bewrite;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<ThingsDetails.specList> getSpecList() {
        return specList;
    }

    public void setSpecList(List<ThingsDetails.specList> specList) {
        this.specList = specList;
    }

    private List<specList> specList;

    public static class specList {
        private int id = 0;
        private String pic = "";
        private String goods_id = "";
        private String spec_ids = "";
        private String spec_texts = "";
        private String spec_value_ids = "";
        private String spec_value_texts = "";
        private float market_price = 0;
        private float platform_price = 0;
        private int number = 0;
        private int warn_number = 0;
        private String goods_no = "";
        private String bar_code = "";
        private String add_time = "";
        private int is_delete = 0;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getSpec_ids() {
            return spec_ids;
        }

        public void setSpec_ids(String spec_ids) {
            this.spec_ids = spec_ids;
        }

        public String getSpec_texts() {
            return spec_texts;
        }

        public void setSpec_texts(String spec_texts) {
            this.spec_texts = spec_texts;
        }

        public String getSpec_value_ids() {
            return spec_value_ids;
        }

        public void setSpec_value_ids(String spec_value_ids) {
            this.spec_value_ids = spec_value_ids;
        }

        public String getSpec_value_texts() {
            return spec_value_texts;
        }

        public void setSpec_value_texts(String spec_value_texts) {
            this.spec_value_texts = spec_value_texts;
        }

        public float getMarket_price() {
            return market_price;
        }

        public void setMarket_price(float market_price) {
            this.market_price = market_price;
        }

        public float getPlatform_price() {
            return platform_price;
        }

        public void setPlatform_price(float platform_price) {
            this.platform_price = platform_price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getWarn_number() {
            return warn_number;
        }

        public void setWarn_number(int warn_number) {
            this.warn_number = warn_number;
        }

        public String getGoods_no() {
            return goods_no;
        }

        public void setGoods_no(String goods_no) {
            this.goods_no = goods_no;
        }

        public String getBar_code() {
            return bar_code;
        }

        public void setBar_code(String bar_code) {
            this.bar_code = bar_code;
        }

        public String getAdd_time() {
            return add_time;
        }

        public void setAdd_time(String add_time) {
            this.add_time = add_time;
        }

        public int getIs_delete() {
            return is_delete;
        }

        public void setIs_delete(int is_delete) {
            this.is_delete = is_delete;
        }
    }
}
