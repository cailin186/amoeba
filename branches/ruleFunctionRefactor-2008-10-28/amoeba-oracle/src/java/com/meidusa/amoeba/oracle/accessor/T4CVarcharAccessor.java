package com.meidusa.amoeba.oracle.accessor;

public class T4CVarcharAccessor extends CharCommonAccessor {

    @Override
    public Object getObject(byte[] data) {
        return super.getString(data);
    }

}