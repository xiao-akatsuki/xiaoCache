package com.xiaoCache.cache.simple;

import com.xiaoCache.cache.simple.MemoryOperation.CtlCache;

/**
 * [真实缓存](Real cache)
 * @description zh - 真实缓存
 * @description en - Real cache
 * @version V1.0
 * @author drh
 * @since 2021-10-24 7：53
 */
public class RealCache<K,V> {

    /**
     * 实例化unsafe
     */
    private static  CtlCache cache=CtlCache.getCtlcache();


    /**
     * [开辟内存](Open up memory)
     * @description zh - 开辟内存
     * @description en - Open up memory
     * @version V1.0
     * @author drh
     * @since 2021-10-27 9:08
     */
    public long getMemory(long size){
        try {
            cache.allocateMemory(size);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return size;
    }

    /**
     * [扩展内存](Extended memory)
     * @description zh - 开辟内存
     * @description en - Open up memory
     * @version V1.0
     * @author drh
     * @since 2021-10-27 9:08
     */
    public long addMemory(long address,long size){
        try {
            cache.reallocalMemory(address,size);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return size;
    }

    /**
     * [释放内存](Release memory)
     * @description zh - 释放内存
     * @description en - Release memory
     * @version V1.0
     * @author drh
     * @since 2021-10-27 9:12
     */
    public long removeMemory(long address){
        try {
          cache.freeMemory(address);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return address;
    }

    /**
     * [在给定的内存块中设置值](Set the value in the given memory block)
     * @description zh - 在给定的内存块中设置值
     * @description en - Set the value in the given memory block
     * @version V1.0
     * @author drh
     * @since 2021-10-27 9:38
     */
    public long setMemory(long address,long size,byte value){
        try {
            cache.allocateMemory(size);
        }catch (OutOfMemoryError error){
            throw error;
        }
        cache.setMemory(address,size,value);
        return value;
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-11-8 2:01
     */
    public Object put(Object o,long offset,V value){
        String typeName = value.getClass().getSimpleName();
        switch (typeName){
            case "Integer":
                cache.putInt(o,offset, (Integer) value);
                break;
            case "Object":
                cache.putObject(o,offset,value);
                break;
            case "Double":
                cache.putDouble(o,offset, (Double) value);
                break;
            case "Char":
                cache.putChar(o,offset, (Character) value);
                break;
            case "Long":
                cache.putLong(o,offset, (Long) value);
                break;
            case "Float":
                cache.putFloat(o,offset, (Float) value);
                break;
            case "Boolean":
                cache.putBoolean(o,offset, (Boolean) value);
                break;
            case "Byte":
                cache.putByte(o,offset, (Byte) value);
                break;
            default:
                throw new IllegalStateException();

        }
        return value;
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-11-8 2:20
     */
    public Object put(long offset,V value){
        String typeName = value.getClass().getSimpleName();
        switch (typeName){
            case "Integer":
                cache.putInt(offset, (Integer) value);
                break;
            case "Double":
                cache.putDouble(offset, (Double) value);
                break;
            case "Char":
                cache.putChar(offset, (Character) value);
                break;
            case "Long":
                cache.putLong(offset, (Long) value);
                break;
            case "Float":
                cache.putFloat(offset, (Float) value);
                break;
            case "Byte":
                cache.putByte(offset, (Byte) value);
                break;
            default:
                throw new IllegalStateException();
        }
        return value;
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-11-8 2:40
     */
    public V get(Object o,long offset,String Type){
        Object v;
        switch (Type){
            case "Integer":
                v=cache.getInt(o,offset);
            case "Double":
                v=cache.getDouble(o,offset);
                break;
            case "Char":
                v=cache.getChar(o,offset);
                break;
            case "Long":
                v=cache.getLong(o,offset);
                break;
            case "Float":
                v=cache.getFloat(o,offset);
                break;
            case "Byte":
                v=cache.getByte(o,offset);
                break;
            case "Object":
                v=cache.getObject(o,offset);
                break;
            case "Boolean":
                v=cache.getBoolean(o,offset);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Type);
        }
        return (V) v;
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-11-8 2:46
     */
    public V get(long offset,String Type){
        Object v;
        switch (Type){
            case "Integer":
                v=cache.getInt(offset);
            case "Double":
                v=cache.getDouble(offset);
                break;
            case "Char":
                v=cache.getChar(offset);
                break;
            case "Long":
                v=cache.getLong(offset);
                break;
            case "Float":
                v=cache.getFloat(offset);
                break;
            case "Byte":
                v=cache.getByte(offset);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Type);
        }
        return (V) v;
    }


}
