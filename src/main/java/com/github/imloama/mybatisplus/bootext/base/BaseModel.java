package com.github.imloama.mybatisplus.bootext.base;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

public abstract class BaseModel<T extends Model<T>, ID extends Serializable> extends Model<T> {

    public abstract  <ID> ID getPrimaryKey();

}
