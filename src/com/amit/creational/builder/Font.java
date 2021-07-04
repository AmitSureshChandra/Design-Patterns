package com.amit.creational.builder;

public class Font {

    private final String text;
    private final String type;
    private final Integer size;
    private final Integer maxWidth;

    public static class Builder{
        private String text;
        private String type;
        private Integer size;
        private Integer maxWidth;

        public Font build(){
            return new Font(this);
        }

        public Builder text(String text){
            this.text = text;
            return this;
        }

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder size(Integer size){
            this.size = size;
            return this;
        }

        public Builder maxWidth(Integer maxWidth){
            this.maxWidth = maxWidth;
            return this;
        }
    }

    public Font(Builder builder) {
        this.text = builder.text;
        this.type = builder.type;
        this.size = builder.size;
        this.maxWidth = builder.maxWidth;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getMaxWidth() {
        return maxWidth;
    }
}
