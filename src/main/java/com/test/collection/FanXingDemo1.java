package com.test.collection;

/**
 * 泛型
 *
 */
public class FanXingDemo1 {
    public static void main(String[] args) {
        MyGeneric<String> myGeneric = new MyGeneric<>();
        myGeneric.setMvp("harden");
        System.out.println(myGeneric.getMvp("harden"));

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.show("12345");
        System.out.println(genericMethod.show2("12111"));
    }
}

/**
 * 泛型类
 * @param <Mvp>
 */
class MyGeneric<Mvp> {
    public void setMvp(Mvp mvp){
        System.out.println();
    }

    public Mvp getMvp(Mvp mvp){
        return mvp;
    }
}

/**
 * 含有泛型的方法
 * 修饰符 <代表泛型的变量> 返回值类型 方法名(参数){ }
 */
class GenericMethod {
    public <Mvp>  void show(Mvp mvp){
        System.out.println(mvp.getClass());
    }

    public <Mvp> Mvp show2(Mvp mvp){
        return mvp;
    }

}
