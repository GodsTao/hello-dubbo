package com.juntao.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


/**
 * 注册被序列化的类，也就是我们的实体类，使kryo性能完全发挥，不注册也可以
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
//        classes.add(BidRequest.class);
        return classes;
    }
}
