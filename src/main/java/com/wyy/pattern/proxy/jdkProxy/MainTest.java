package com.wyy.pattern.proxy.jdkProxy;

public class MainTest {

    //https://www.cnblogs.com/clonen/p/6735011.html
    public static void main(String[] args) {
        IUserDao invoker=(IUserDao) new UserDaoProxyInstance().getInstance(IUserDao.class);
        System.out.println(invoker.getUserName("zhangsan",new Integer(18)));


        IUserDao userDao = new UserDaoImpl();
        System.out.println(userDao.getUserName("lisi",new Integer(10)));
    }
}
