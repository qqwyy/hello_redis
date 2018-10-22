package com.wyy.pattern.proxy.jdkProxy;

public class UserDaoImpl implements IUserDao{

    @Override
    public String getUserName(String name, Integer age){

        return "locImp Name:"+name+ "  age:"+age;
    }
}