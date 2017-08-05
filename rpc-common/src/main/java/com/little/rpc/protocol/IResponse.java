package com.little.rpc.protocol;

/**
 * Created by shengping.liao on 05/08/2017.
 */
public interface IResponse extends ISerializable {
    void setMessageType(int messageType);

    int getMessageType();

    String getCause();

    Object getReturn();

    void setReturn(Object obj);
}
