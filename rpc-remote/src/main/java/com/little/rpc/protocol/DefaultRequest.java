package com.little.rpc.protocol;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shengping.liao on 05/08/2017.
 */
public class DefaultRequest implements IRequest {
    private static final long serialVersionUID = -1L;

    private byte serialize;

    private long seq;

    private int callType;

    private int timeout;

    private long createMillisTime;

    private String serviceName;

    private String methodName;

    private Object[] parameters;

    private int messageType;

    private Object context;

    private transient Class<?>[] parameterClasses;

    private transient Map<String, Object> attachments = new HashMap<String, Object>();

    @Override
    public void setCallType(int callType) {
        this.callType = callType;
    }

    @Override
    public byte getSerialize() {
        return this.serialize;
    }

    @Override
    public int getCallType() {
        return this.callType;
    }

    @Override
    public int getTimeout() {
        return this.timeout;
    }

    @Override
    public void setSequence(long seq) {
        this.seq = seq;
    }

    @Override
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public long getSequence() {
        return this.seq;
    }

    @Override
    public long getCreateMillisTime() {
        return this.createMillisTime;
    }

    @Override
    public Object getContext() {
        return this.context;
    }

    @Override
    public void setCreateMillisTime(long createTime) {
        this.createMillisTime = createTime;
    }

    @Override
    public void setContext(Object context) {
        this.context = context;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    @Override
    public String getMethodName() {
        return this.methodName;
    }

    @Override
    public String[] getParamClassName() {
        if (this.parameters == null) {
            return new String[0];
        }
        String[] paramClassNames = new String[this.parameters.length];

        int k = 0;
        for (Object parameter : this.parameters) {
            if (parameter == null) {
                paramClassNames[k] = "NULL";
            } else {
                paramClassNames[k] = this.parameters[k].getClass().getName();
            }
            k++;
        }
        return paramClassNames;
    }

    @Override
    public Object[] getParameters() {
        return parameters;
    }

    @Override
    public int getMessageType() {
        return this.messageType;
    }

    @Override
    public void setAttachment(String name, Object attachment) {
        attachments.put(name, attachment);
    }

    @Override
    public Object getAttachment(String name) {
        return attachments.get(name);
    }

    @Override
    public Object getObject() {
        return this;
    }
}
