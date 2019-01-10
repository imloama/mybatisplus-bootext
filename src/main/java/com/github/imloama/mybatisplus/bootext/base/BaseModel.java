package com.github.imloama.mybatisplus.bootext.base;


import java.io.Serializable;

public abstract class BaseModel<T extends BaseModel, ID extends Serializable> extends Convert<T>{

    public abstract  <ID> ID getPrimaryKey();

}
