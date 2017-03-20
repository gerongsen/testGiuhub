package com.thinkinjava;
public class Base{
    private static String baseName = "base";
    public Base(){
        callName();
    }

    public void callName(){
        System. out. println(baseName);
    }

    static class Sub extends Base{
        private  String baseName = "sub";
        
        public Sub(){
            callName();
        }
        
        public void callName(){
            System. out. println (baseName) ;
        }
    }
    public static void main(String[] args){
        Base b = new Sub();
    }
}