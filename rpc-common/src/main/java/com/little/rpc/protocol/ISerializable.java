package com.little.rpc.protocol;

import java.io.Serializable;

/**
 * Created by shengping.liao on 05/08/2017.
 */
public interface ISerializable extends Serializable {
    byte getSerialize();

    void setSequence(long seq);

    long getSequence();

    Object getObject();

    Object getContext();

    void setContext(Object context);
}
