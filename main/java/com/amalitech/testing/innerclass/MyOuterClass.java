package com.amalitech.testing.innerclass;

public class MyOuterClass {
    private int x;

    class MyInnerClass{
        private int x;
        private int y;
        void go(){
            x = 42;
        }

        public MyInnerClass(int x){
            this.x = x;
        }

        public int getX(){
            return x;
        }
    }

    public int getX(){
        MyInnerClass myInnerClass = new MyInnerClass(x);
        return myInnerClass.getX();
    }
}
