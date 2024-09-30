package com.codewithme;

public class TexBox {
   public  String text = ""; //Field

    public void setText(String text){
        this.text = text; // 'this' references current object
    }
    public void clear(){
        text = "";
    }
}
