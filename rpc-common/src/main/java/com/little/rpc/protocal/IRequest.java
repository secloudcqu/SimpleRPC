package com.little.rpc.protocal;

/**
 * Created by shengping.liao on 05/08/2017.
 */
public interface IRequest extends ISerializable {
    void setCallType(int callType);

    int getCallType();

    int getTimeout();

    void setTimeout(int timeout);

    long getCreateMillisTime();

    void setCreateMillisTime(long createTime);

    String getServiceName();

    String getMethodName();

    String[] getParamClassName();

    Object[] getParameters();

    int getMessageType();

    void setAttachment(String name, Object attachment);

    Object getAttachment(String name);
}
