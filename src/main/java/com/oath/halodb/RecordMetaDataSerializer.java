/*
 * Copyright 2018, Oath Inc
 * Licensed under the terms of the Apache License 2.0. Please refer to accompanying LICENSE file for terms.
 */

package com.oath.halodb;

import com.oath.halodb.cache.CacheSerializer;

import java.nio.ByteBuffer;

/**
 * @author Arjun Mannaly
 */
public class RecordMetaDataSerializer implements CacheSerializer<RecordMetaDataForCache> {

    public void serialize(RecordMetaDataForCache recordMetaData, ByteBuffer byteBuffer) {
        recordMetaData.serialize(byteBuffer);
        byteBuffer.flip();
    }

    public RecordMetaDataForCache deserialize(ByteBuffer byteBuffer) {
        return RecordMetaDataForCache.deserialize(byteBuffer);
    }

    public int serializedSize(RecordMetaDataForCache recordMetaData) {
        return RecordMetaDataForCache.SERIALIZED_SIZE;
    }
}
