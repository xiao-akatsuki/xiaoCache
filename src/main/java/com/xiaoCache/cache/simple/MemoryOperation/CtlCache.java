package com.xiaoCache.cache.simple.MemoryOperation;

import jdk.internal.misc.VM;
import jdk.internal.reflect.CallerSensitive;
import jdk.internal.reflect.Reflection;
import jdk.internal.vm.annotation.ForceInline;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * [控制内存](CtlCache)
 * @description zh - 控制内存
 * @description en - CtlCache
 * @version V1.0
 * @author drh
 * @since 2021-10-31 7：51
 */
public final class CtlCache {


    /**
     * [静态](static)
     * @description zh - 构造
     * @description en - structure
     * @version V1.0
     * @author drh
     * @since 2021-10-24 8:18
     */
    static {
        Reflection.registerMethodsToFilter(Unsafe.class, Set.of("getCtlcache"));
    }

    /**
     * [构造](structure)
     * @description zh - 构造
     * @description en - structure
     * @version V1.0
     * @author drh
     * @since 2021-10-31 7:51
     */
    private CtlCache(){}

    /**
     * 实例化CtlCache
     */
    private static final CtlCache ctlcache=new CtlCache();

    /**
     * 实例化InternalCache
     */
    private static final InternalCache internalCache= InternalCache.getInternalCache();

    /**
     * zh- 该常量不同于从 staticFieldOffset、objectFieldOffset 或 arrayBaseOffset 返回的所有结果。
     * en- This constant differs from all results that will ever be returned from staticFieldOffset, objectFieldOffset, or arrayBaseOffset.
     */
    public static final int INVALID_FIELD_OFFSET =InternalCache.INVALID_FIELD_OFFSET;
    /**
     * [通过反射获取CtlCache类](Obtain the CtlCache class through reflection)
     * @description zh - 通过反射获取CtlCache类
     * @description en - Obtain the CtlCache class through reflection
     * @version V1.0
     * @author drh
     * @since 2021-10-31 7:51
     */
    @CallerSensitive
    public static CtlCache getCtlcache(){
        Class<?> caller=Reflection.getCallerClass();
        if (!VM.isSystemDomainLoader(caller.getClassLoader()))
                throw new SecurityException("Unsafe");
            return ctlcache;
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 8:23
     */
    @ForceInline
    public int getInt(Object o,long offset){
        return internalCache.getInt(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 8:45
     */
    @ForceInline
    public void putInt(Object o,long offset,int value){
        internalCache.putInt(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 8:48
     */
    @ForceInline
    public Object getObject(Object o,long offset){
        return internalCache.getObject(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 8:49
     */
    @ForceInline
    public void putObject(Object o,long offset,Object value){
        internalCache.putObject(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 8:53
     */
    @ForceInline
    public Boolean getBoolean(Object o,long offset){
        return internalCache.getBoolean(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 8:55
     */
    @ForceInline
    public void putBoolean(Object o,long offset,Boolean value){
        internalCache.putBoolean(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 8:56
     */
    @ForceInline
    public Byte getByte(Object o,long offset){
        return internalCache.getByte(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:04
     */
    @ForceInline
    public void putByte(Object o,long offset,Byte value){
        internalCache.putByte(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:06
     */
    @ForceInline
    public short getShort(Object o,long offset){
        return internalCache.getShort(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:07
     */
    @ForceInline
    public void putShort(Object o,long offset,Short value){
        internalCache.putShort(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:24
     */
    @ForceInline
    public char getChar(Object o,long offset){
        return internalCache.getChar(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:25
     */
    @ForceInline
    public void putChar(Object o,long offset,char value){
        internalCache.putChar(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:26
     */
    @ForceInline
    public long getLong(Object o,long offset){
       return internalCache.getLong(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:28
     */
    @ForceInline
    public void putLong(Object o,long offset,long value){
        internalCache.putLong(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:28
     */
    @ForceInline
    public Float getFloat(Object o,long offset){
       return internalCache.getFloat(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:29
     */
    @ForceInline
    public void putFloat(Object o,long offset,Float value){
        internalCache.putFloat(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:28
     */
    @ForceInline
    public Double getDouble(Object o,long offset){
        return internalCache.getDouble(o,offset);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:29
     */
    @ForceInline
    public void putDouble(Object o,long offset,Double value){
        internalCache.putDouble(o,offset,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:33
     */
    @ForceInline
    public Byte getByte(long addr){
        return internalCache.getByte(addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:34
     */
    @ForceInline
    public void putByte(long addr,byte value){
        internalCache.putByte(addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:35
     */
    @ForceInline
    public Short getShort(long addr){
        return internalCache.getShort(addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:36
     */
    @ForceInline
    public void putShort(long addr,Short value){
        internalCache.putShort(addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:37
     */
    @ForceInline
    public char getChar(long addr){
        return internalCache.getChar(addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:41
     */
    @ForceInline
    public void putChar(long addr,char value){
        internalCache.putChar(addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:42
     */
    @ForceInline
    public int getInt(long addr){
        return internalCache.getInt(addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:42
     */
    @ForceInline
    public void putInt(long addr,int value){
        internalCache.putInt(addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:43
     */
    @ForceInline
    public Long getLong(long addr){
        return internalCache.getLong(addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:44
     */
    @ForceInline
    public void putLong(long addr,long value){
        internalCache.putLong(addr, value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:45
     */
    @ForceInline
    public Float getFloat(long addr){
        return internalCache.getFloat(addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:46
     */
    @ForceInline
    public void putFloat(long addr,float value){
        internalCache.putFloat(addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:47
     */
    @ForceInline
    public Double getDouble(long addr){
        return internalCache.getDouble(addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 9:46
     */
    @ForceInline
    public void putDouble(long addr,Double value){
        internalCache.putDouble(addr,value);
    }

    /**
     * [获取本地指针](Get local pointer )
     * @description zh - 获取本地指针
     * @description en - Get local pointer
     * @version V1.0
     * @author drh
     * @since 2021-11-1 8：09
     */
    @ForceInline
    public long getAdress(long address){
        return internalCache.getAddress(address);
    }

    /**
     * [将指针存储到指定内存](Store the pointer to the specified memory)
     * @description zh - 将指针存储到指定内存
     * @description en - Store the pointer to the specified memory
     * @version V1.0
     * @author drh
     * @since 2021-11-1 8：10
     */
    @ForceInline
    public void putAddress(long address,long value){
        internalCache.putAddress(address,value);
    }

    /**
     * [分配新的内存块](Allocate a new memory block)
     * @description zh - 分配新的内存块
     * @description en - Allocate a new memory block
     * @version V1.0
     * @author drh
     * @since 2021-11-1 8：14
     */
    @ForceInline
    public long allocateMemory(long size){
        return internalCache.allocateMemory(size);
    }

    /**
     * [将给定内存块调整为指定大小](Resize the given memory block to the specified size)
     * @description zh - 将给定内存块调整为指定大小
     * @description en - Resize the given memory block to the specified size
     * @version V1.0
     * @author drh
     * @since 2021-11-1 9：01
     */
    @ForceInline
    public long realLocalMemory(long addr,long size){
        return internalCache.reaLocalMemory(addr,size);
    }

    /**
     * [将给定内存块中的所有字节设置为固定值](Set all bytes in a given memory block to a fixed value)
     * @description zh - 将给定内存块中的所有字节设置为固定值
     * @description en - Set all bytes in a given memory block to a fixed value
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2:55
     */
    @ForceInline
    public void setMemory(Object o,long offset,long size,byte value){
        internalCache.setMemory(o,offset,size,value);
    }

    /**
     * [将给定内存块中的所有字节设置为固定值](Set all bytes in a given memory block to a fixed value)
     * @description zh - 将给定内存块中的所有字节设置为固定值
     * @description en - Set all bytes in a given memory block to a fixed value
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:07
     */
    @ForceInline
    public void setMemory(long offset,long size, byte value){
        internalCache.setMemory(offset,size,value);
    }

    /**
     * [将给定内存块中的所有字节设置为另一个块的副本](Sets all bytes in a given block of memory to a copy of another block)
     * @description zh - 将给定内存块中的所有字节设置为另一个块的副本
     * @description en - Sets all bytes in a given block of memory to a copy of another block
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:07
     */
    @ForceInline
    public void copyMemory(Object srcBase, long srcOffset,
                           Object destBase, long destOffset,
                           long size){
        internalCache.copyMemory(srcBase,srcOffset,destBase,destOffset,size);
    }

    /**
     * [将给定内存块中的所有字节设置为另一个块的副本](Sets all bytes in a given block of memory to a copy of another block)
     * @description zh - 将给定内存块中的所有字节设置为另一个块的副本
     * @description en - Sets all bytes in a given block of memory to a copy of another block
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:15
     */
    @ForceInline
    public void copyMemory(long srcAddress, long destAddress, long size){
        internalCache.copyMemory(srcAddress, destAddress, size);
    }


    /**
     * [处理从allocatememory或reallocatememory获得的本机内存块](Process native memory blocks obtained from allocatememory or reallocatememory)
     * @description zh - 处理从allocatememory或reallocatememory获得的本机内存块
     * @description en - Process native memory blocks obtained from allocatememory or reallocatememory
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:23
     */
    @ForceInline
    public void freeMemory(long addr){
        internalCache.freeMemory(addr);
    }

    /**
     * [报告给定字段在其类的存储分配中的位置](Reports the location of a given field in the storage allocation of its class)
     * @description zh - 报告给定字段在其类的存储分配中的位置
     * @description en - Reports the location of a given field in the storage allocation of its class
     * @version V1.0
     * @author drh
     * @since 2021-11-3 8:13
     */
    @ForceInline
    public long objectFiledOffset(Field f){
        if (null==f){
            throw new NullPointerException();
        }
        Class<?> declaringClass = f.getDeclaringClass();
        if (declaringClass.isHidden()){
            throw new UnsupportedOperationException("can't get field offset on a hidden class: " + f);
        }
        if (declaringClass.isRecord()){
            throw new UnsupportedOperationException("can't get field offset on a record class: " + f);
        }
        return internalCache.objectFieldOffset(f);
    }

    /**
     * [结合 staticFieldBase 报告给定静态字段的位置](Reports the location of a given static field, in conjunction with staticFieldBase)
     * @description zh - 结合 staticFieldBase 报告给定静态字段的位置
     * @description en - Reports the location of a given static field, in conjunction with staticFieldBase
     * @version V1.0
     * @author drh
     * @since 2021-11-3 8:38
     */
    @ForceInline
    public long staticFieldOffset(Field f){
        if (null==f){
            throw new NullPointerException();
        }
        Class<?> declaringClass = f.getDeclaringClass();
        if (declaringClass.isHidden()) {
            throw new UnsupportedOperationException("can't get field offset on a hidden class: " + f);
        }
        if (declaringClass.isRecord()) {
            throw new UnsupportedOperationException("can't get field offset on a record class: " + f);
        }
        return internalCache.staticFieldOffset(f);
    }

    /**
     * [结合 staticFieldOffset 报告给定静态字段的位置](Reports the location of a given static field, in conjunction with staticFieldOffset)
     * @description zh - 结合 staticFieldOffset 报告给定静态字段的位置
     * @description en - Reports the location of a given static field, in conjunction with staticFieldOffset
     * @version V1.0
     * @author drh
     * @since 2021-11-3 8:45
     */
    @ForceInline
    public Object staticFieldBase(Field f){
        if (f == null) {
            throw new NullPointerException();
        }
        Class<?> declaringClass = f.getDeclaringClass();
        if (declaringClass.isHidden()) {
            throw new UnsupportedOperationException("can't get base address on a hidden class: " + f);
        }
        if (declaringClass.isRecord()) {
            throw new UnsupportedOperationException("can't get base address on a record class: " + f);
        }
        return internalCache.staticFieldBase(f);
    }

    /**
     * [检测给定的类是否需要初始化](Detects if the given class may need to be initialized)
     * @description zh - 检测给定的类是否需要初始化。 这通常与获取类的静态字段基数一起使用
     * @description en - Detects if the given class may need to be initialized
     * @version V1.0
     * @author drh
     * @since 2021-11-3 9：08
     */
    @ForceInline
    public boolean shouldBeInitialized(Class<?> c){
        return   internalCache.shouldBeInitialized(c);
    }

    /**
     * [确保给定的类已被初始化](Ensures the given class has been initialized)
     * @description zh - 确保给定的类已被初始化。 这通常与获取类的静态字段基数一起使用
     * @description en - Ensures the given class has been initialized
     * @version V1.0
     * @author drh
     * @since 2021-11-3 9：12
     */
    @ForceInline
    public void ensureClassInitialized(Class<?> c){
        internalCache.ensureClassInitialized(c);
    }

    /**
     * [报告给定数组类的存储分配中第一个元素的偏移量](Reports the offset of the first element in the storage allocation of a given array class)
     * @description zh - 报告给定数组类的存储分配中第一个元素的偏移量
     * @description en - Reports the offset of the first element in the storage allocation of a given array class
     * @version V1.0
     * @author drh
     * @since 2021-11-3 9：22
     */
    @ForceInline
    public int arrayBaseOffset(Class<?> arrayClass){
        return internalCache.arrayBaseOffset(arrayClass);
    }

    /**
     * The value of arrayBaseOffset(boolean[].class)
     */
    public static final int ARRAY_BOOLEAN_BASE_OFFSET = InternalCache.ARRAY_BOOLEAN_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(byte[].class)
     */
    public static final int ARRAY_BYTE_BASE_OFFSET=InternalCache.ARRAY_BYTE_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(short[].class)
     */
    public static final int ARRAY_SHORT_BASE_OFFSET = InternalCache.ARRAY_SHORT_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(char[].class)
     */
    public static final int ARRAY_CHAR_BASE_OFFSET = InternalCache.ARRAY_CHAR_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(int[].class)
     */
    public static final int ARRAY_INT_BASE_OFFSET = InternalCache.ARRAY_INT_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(long[].class)
     */
    public static final int ARRAY_LONG_BASE_OFFSET = InternalCache.ARRAY_LONG_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(float[].class)
     */
    public static final int ARRAY_FLOAT_BASE_OFFSET = InternalCache.ARRAY_FLOAT_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(double[].class)
     */
    public static final int ARRAY_DOUBLE_BASE_OFFSET = InternalCache.ARRAY_DOUBLE_BASE_OFFSET;
    /**
     * The value of arrayBaseOffset(Object[].class)
     */
    public static final int ARRAY_OBJECT_BASE_OFFSET = InternalCache.ARRAY_OBJECT_BASE_OFFSET;

    /**
     * [报告在给定数组类的存储分配中寻址元素的比例因子](Reports the scale factor for addressing elements in the storage allocation of a given array class)
     * @description zh - 报告在给定数组类的存储分配中寻址元素的比例因子
     * @description en - Reports the scale factor for addressing elements in the storage allocation of a given array class
     * @version V1.0
     * @author drh
     * @since 2021-11-3 9：56
     */
    public int arrayIndexScale(Class<?> arrayClass){
        return internalCache.arrayIndexScale(arrayClass);
    }

    /**
     * The value of arrayIndexScale(boolean[].class)
     */
    public static final int ARRAY_BOOLEAN_INDEX_SCALE = internalCache.ARRAY_BOOLEAN_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(byte[].class)
     */
    public static final int ARRAY_BYTE_INDEX_SCALE = internalCache.ARRAY_BYTE_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(short[].class)
     */
    public static final int ARRAY_SHORT_INDEX_SCALE = internalCache.ARRAY_SHORT_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(char[].class)
     */
    public static final int ARRAY_CHAR_INDEX_SCALE = internalCache.ARRAY_CHAR_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(int[].class)
     */
    public static final int ARRAY_INT_INDEX_SCALE = internalCache.ARRAY_INT_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(long[].class)
     */
    public static final int ARRAY_LONG_INDEX_SCALE = internalCache.ARRAY_LONG_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(float[].class)
     */
    public static final int ARRAY_FLOAT_INDEX_SCALE = internalCache.ARRAY_FLOAT_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(double[].class)
     */
    public static final int ARRAY_DOUBLE_INDEX_SCALE = internalCache.ARRAY_DOUBLE_INDEX_SCALE;
    /**
     * The value of arrayIndexScale(Object[].class)
     */
    public static final int ARRAY_OBJECT_INDEX_SCALE = internalCache.ARRAY_OBJECT_INDEX_SCALE;

    /**
     * [报告通过 putAddress 存储的本机指针的大小（以字节为单位）](Reports the size in bytes of a native pointer, as stored via putAddress)
     * @description zh - 报告通过 putAddress 存储的本机指针的大小（以字节为单位）
     * @description en - Reports the size in bytes of a native pointer, as stored via putAddress
     * @version V1.0
     * @author drh
     * @since 2021-11-3 10：40
     */
    @ForceInline
    public int addressSize(){
        return internalCache.addressSize();
    }

    /**
     * [报告本机内存页面的大小（以字节为单位）](Reports the size in bytes of a native memory page)
     * @description zh - 报告本机内存页面的大小（以字节为单位）
     * @description en - Reports the size in bytes of a native memory page
     * @version V1.0
     * @author drh
     * @since 2021-11-3 10：41
     */
    @ForceInline
    public int pageSize(){
        return internalCache.pageSize();
    }

    /**
     * [分配一个实例但不运行任何构造函数。 如果尚未初始化类，则对其进行初始化](Allocates an instance but does not run any constructor. Initializes the class if it has not yet been)
     * @description zh - 分配一个实例但不运行任何构造函数。 如果尚未初始化类，则对其进行初始化
     * @description en - Allocates an instance but does not run any constructor. Initializes the class if it has not yet been
     * @version V1.0
     * @author drh
     * @since 2021-11-3 10：58
     */
    @ForceInline
    public Object allocateInstance(Class<?> cls) throws InstantiationException {
        return internalCache.allocateInstance(cls);
    }

    /**
     * [在不告诉验证者的情况下抛出异常](Throws the exception without telling the verifier)
     * @description zh - 在不告诉验证者的情况下抛出异常
     * @description en - Throws the exception without telling the verifier
     * @version V1.0
     * @author drh
     * @since 2021-11-3 11:04
     */
    @ForceInline
    public void throwException(Throwable ee) {
        internalCache.throwException(ee);
    }

    /**
     * [如果当前保持预期状态，则将 Java 变量原子更新为 x](Atomically updates Java variable to x if it is currently holding expected)
     * @description zh - 如果当前保持预期状态，则将 Java 变量原子更新为 x
     * @description en - Atomically updates Java variable to x if it is currently holding expected
     * @version V1.0
     * @author drh
     * @since 2021-11-3 12：53
     */
    @ForceInline
    public final boolean compareAndSwapObject(Object o, long offset,
                                              Object expected,
                                              Object x){
        return internalCache.compareAndSetReference(o, offset, expected, x);
    }

    /**
     * [如果当前保持预期状态，则将 Java 变量原子更新为 x](Atomically updates Java variable to x if it is currently holding expected)
     * @description zh - 如果当前保持预期状态，则将 Java 变量原子更新为 x
     * @description en - Atomically updates Java variable to x if it is currently holding expected
     * @version V1.0
     * @author drh
     * @since 2021-11-3 12：53
     */
    @ForceInline
    public final boolean compareAndSwapInt(Object o, long offset,
                                           int expected,
                                           int x) {
        return internalCache.compareAndSetInt(o, offset, expected, x);
    }

    /**
     * [如果当前保持预期状态，则将 Java 变量原子更新为 x](Atomically updates Java variable to x if it is currently holding expected)
     * @description zh - 如果当前保持预期状态，则将 Java 变量原子更新为 x
     * @description en - Atomically updates Java variable to x if it is currently holding expected
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:13
     */
    @ForceInline
    public final boolean compareAndSwapLong(Object o, long offset,
                                            long expected,
                                            long x) {
        return internalCache.compareAndSetLong(o, offset, expected, x);
    }

    /**
     * [从给定的 Java 变量中获取引用值，具有 volatile 加载语义](Fetches a reference value from a given Java variable, with volatile load semantics)
     * @description zh - 从给定的 Java 变量中获取引用值，具有 volatile 加载语义
     * @description en - Fetches a reference value from a given Java variable, with volatile load semantics
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:16
     */
    @ForceInline
    public Object getObjectVolatile(Object o, long offset) {
        return internalCache.getReferenceVolatile(o, offset);
    }

    /**
     * [使用易失性存储语义将引用值存储到给定的 Java 变量中](Stores a reference value into a given Java variable, with volatile store semantics)
     * @description zh - 使用易失性存储语义将引用值存储到给定的 Java 变量中
     * @description en - Stores a reference value into a given Java variable, with volatile store semantics
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:28
     */
    @ForceInline
    public void putObjectVolatile(Object o, long offset, Object x) {
        internalCache.putReferenceVolatile(o, offset, x);
    }

    /**
     * [getInt(Object, long) 的可变版本](Volatile version of getInt(Object, long))
     * @description zh - getInt(Object, long) 的可变版本
     * @description en - Volatile version of getInt(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:29
     */
    @ForceInline
    public int getIntVolatile(Object o, long offset) {
        return internalCache.getIntVolatile(o, offset);
    }

    /**
     * [putInt(Object, long, int) 的易变版本](Volatile version of putInt(Object, long, int))
     * @description zh - putInt(Object, long, int) 的易变版本
     * @description en - Volatile version of putInt(Object, long, int)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:31
     */
    @ForceInline
    public void putIntVolatile(Object o, long offset, int x) {
        internalCache.putIntVolatile(o, offset, x);
    }

    /**
     * [getBoolean(Object, long) 的可变版本](Volatile version of getBoolean(Object, long))
     * @description zh - getBoolean(Object, long) 的可变版本
     * @description en - Volatile version of getBoolean(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:33
     */
    @ForceInline
    public boolean getBooleanVolatile(Object o, long offset) {
        return internalCache.getBooleanVolatile(o, offset);
    }

    /**
     * [putBoolean(Object, long, boolean) 的可变版本](Volatile version of putBoolean(Object, long, boolean))
     * @description zh - putBoolean(Object, long, boolean) 的可变版本
     * @description en - Volatile version of putBoolean(Object, long, boolean)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:34
     */
    @ForceInline
    public void putBooleanVolatile(Object o, long offset, boolean x) {
        internalCache.putBooleanVolatile(o, offset, x);
    }

    /**
     * [getByte(Object, long) 的易失版本](Volatile version of getByte(Object, long))
     * @description zh - getByte(Object, long) 的易失版本
     * @description en - Volatile version of getByte(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:35
     */
    @ForceInline
    public byte getByteVolatile(Object o, long offset) {
        return internalCache.getByteVolatile(o, offset);
    }

    /**
     * [putByte(Object, long, byte) 的易变版本](Volatile version of putByte(Object, long, byte))
     * @description zh - putByte(Object, long, byte) 的易变版本
     * @description en - Volatile version of putByte(Object, long, byte)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:36
     */
    @ForceInline
    public void putByteVolatile(Object o, long offset, byte x) {
        internalCache.putByteVolatile(o, offset, x);
    }

    /**
     * [getShort(Object, long) 的易变版本](Volatile version of getShort(Object, long))
     * @description zh - getShort(Object, long) 的易变版本
     * @description en - Volatile version of getShort(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:37
     */
    @ForceInline
    public short getShortVolatile(Object o, long offset) {
        return internalCache.getShortVolatile(o, offset);
    }

    /**
     * [putShort(Object, long, short) 的易变版本](Volatile version of putShort(Object, long, short))
     * @description zh - putShort(Object, long, short) 的易变版本
     * @description en - Volatile version of putShort(Object, long, short)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:39
     */
    @ForceInline
    public void putShortVolatile(Object o, long offset, short x) {
        internalCache.putShortVolatile(o, offset, x);
    }

    /**
     * [getChar(Object, long) 的可变版本](Volatile version of getChar(Object, long))
     * @description zh - getChar(Object, long) 的可变版本
     * @description en - Volatile version of getChar(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:41
     */
    @ForceInline
    public char getCharVolatile(Object o, long offset) {
        return internalCache.getCharVolatile(o, offset);
    }

    /**
     * [putChar(Object, long, char) 的易变版本](Volatile version of putChar(Object, long, char))
     * @description zh - putChar(Object, long, char) 的易变版本
     * @description en - Volatile version of putChar(Object, long, char)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:43
     */
    @ForceInline
    public void putCharVolatile(Object o, long offset, char x) {
        internalCache.putCharVolatile(o, offset, x);
    }

    /**
     * [getLong(Object, long) 的可变版本](Volatile version of getLong(Object, long))
     * @description zh - getLong(Object, long) 的可变版本
     * @description en - Volatile version of getLong(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:45
     */
    @ForceInline
    public long getLongVolatile(Object o, long offset) {
        return internalCache.getLongVolatile(o, offset);
    }

    /**
     * [putLong(Object, long, long) 的易变版本](Volatile version of putLong(Object, long, long))
     * @description zh - putLong(Object, long, long) 的易变版本
     * @description en - Volatile version of putLong(Object, long, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:47
     */
    @ForceInline
    public void putLongVolatile(Object o, long offset, long x) {
        internalCache.putLongVolatile(o, offset, x);
    }

    /**
     * [getFloat(Object, long) 的可变版本](Volatile version of getFloat(Object, long))
     * @description zh - getFloat(Object, long) 的可变版本
     * @description en - Volatile version of getFloat(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:49
     */
    @ForceInline
    public float getFloatVolatile(Object o, long offset) {
        return internalCache.getFloatVolatile(o, offset);
    }

    /**
     * [putFloat(Object, long, float) 的可变版本](Volatile version of putFloat(Object, long, float))
     * @description zh - putFloat(Object, long, float) 的可变版本
     * @description en - Volatile version of putFloat(Object, long, float)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:51
     */
    @ForceInline
    public void putFloatVolatile(Object o, long offset, float x) {
        internalCache.putFloatVolatile(o, offset, x);
    }

    /**
     * [getDouble(Object, long) 的可变版本](Volatile version of getDouble(Object, long))
     * @description zh - getDouble(Object, long) 的可变版本
     * @description en - Volatile version of getDouble(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:53
     */
    @ForceInline
    public double getDoubleVolatile(Object o, long offset) {
        return internalCache.getDoubleVolatile(o, offset);
    }

    /**
     * [putDouble(Object, long, double) 的可变版本](Volatile version of putDouble(Object, long, double))
     * @description zh - putDouble(Object, long, double) 的可变版本
     * @description en - Volatile version of putDouble(Object, long, double)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:55
     */
    @ForceInline
    public void putDoubleVolatile(Object o, long offset, double x) {
        internalCache.putDoubleVolatile(o, offset, x);
    }

    /**
     * [putObjectVolatile(Object, long, Object) 的版本不保证存储对其他线程的立即可见性](Version of putObjectVolatile(Object, long, Object) that does not guarantee immediate visibility of the store to other threads)
     * @description zh - putObjectVolatile(Object, long, Object) 的版本不保证存储对其他线程的立即可见性
     * @description en - Version of putObjectVolatile(Object, long, Object) that does not guarantee immediate visibility of the store to other threads
     * @version V1.0
     * @author drh
     * @since 2021-11-4 10:54
     */
    @ForceInline
    public void putOrderedObject(Object o, long offset, Object x) {
        internalCache.putReferenceRelease(o, offset, x);
    }

    /**
     * [putIntVolatile(Object, long, int) 的有序/懒惰版本](Ordered/Lazy version of putIntVolatile(Object, long, int))
     * @description zh - putIntVolatile(Object, long, int) 的有序/懒惰版本
     * @description en - Ordered/Lazy version of putIntVolatile(Object, long, int)
     * @version V1.0
     * @author drh
     * @since 2021-11-4 10:56
     */
    @ForceInline
    public void putOrderedInt(Object o, long offset, int x) {
        internalCache.putIntRelease(o, offset, x);
    }

    /**
     * [putLongVolatile(Object, long, long) 的有序/懒惰版本](putLongVolatile(Object, long, long) 的有序/懒惰版本)
     * @description zh - putIntVolatile(Object, long, int) 的有序/懒惰版本
     * @description en - Ordered/Lazy version of putLongVolatile(Object, long, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-4 10:56
     */
    @ForceInline
    public void putOrderedLong(Object o, long offset, long x) {
        internalCache.putLongRelease(o, offset, x);
    }

    /**
     * [解除阻塞的给定线程阻塞](Unblocks the given thread blocked on park)
     * @description zh - 解除阻塞的给定线程阻塞，或者，如果它没有阻塞
     * @description en - Unblocks the given thread blocked on park
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：16
     */
    @ForceInline
    public void unpark(Object thread) {
        internalCache.unpark(thread);
    }

    /**
     * [阻塞当前线程，在发生平衡 unpark 时返回](Blocks current thread, returning when a balancing unpark occurs)
     * @description zh - 阻塞当前线程，在发生平衡 unpark 时返回
     * @description en - Blocks current thread, returning when a balancing unpark occurs
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：17
     */
    @ForceInline
    public void park(boolean isAbsolute, long time) {
        internalCache.park(isAbsolute, time);
    }

    /**
     * [获取分配给可用处理器的系统运行队列中的平均负载在不同时间段内的平均值](Gets the load average in the system run queue assigned to the available processors averaged over various periods of time)
     * @description zh - 获取分配给可用处理器的系统运行队列中的平均负载在不同时间段内的平均值
     * @description en - Gets the load average in the system run queue assigned to the available processors averaged over various periods of time
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：39
     */
    @ForceInline
    public int getLoadAverage(double[] loadavg, int nelems) {
        return internalCache.getLoadAverage(loadavg, nelems);
    }

    /**
     * [原子地将给定值添加到给定对象 o 中给定偏移处的字段或数组元素的当前值](Atomically adds the given value to the current value of a field or array element within the given object o at the given offset)
     * @description zh - 原子地将给定值添加到给定对象 o 中给定偏移处的字段或数组元素的当前值
     * @description en - Atomically adds the given value to the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：46
     */
    @ForceInline
    public final int getAndAddInt(Object o, long offset, int delta) {
        return internalCache.getAndAddInt(o, offset, delta);
    }

    /**
     * [将给定值原子地添加到给定对象 o 中给定偏移量处的字段或数组元素的当前值](Atomically adds the given value to the current value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定值原子地添加到给定对象 o 中给定偏移量处的字段或数组元素的当前值
     * @description en - Atomically adds the given value to the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：49
     */
    @ForceInline
    public final long getAndAddLong(Object o, long offset, long delta) {
        return internalCache.getAndAddLong(o, offset, delta);
    }

    /**
     * [将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换](Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换
     * @description en - Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：42
     */
    @ForceInline
    public final int getAndSetInt(Object o, long offset, int newValue) {
        return internalCache.getAndSetInt(o, offset, newValue);
    }

    /**
     * [将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换](Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换
     * @description en - Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：55
     */
    @ForceInline
    public final long getAndSetLong(Object o, long offset, long newValue) {
        return internalCache.getAndSetLong(o, offset, newValue);
    }

    /**
     * [将给定的参考值与给定对象 o 中给定偏移量处的字段或数组元素的当前参考值进行原子交换](Atomically exchanges the given reference value with the current reference value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定的参考值与给定对象 o 中给定偏移量处的字段或数组元素的当前参考值进行原子交换
     * @description en - Atomically exchanges the given reference value with the current reference value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：58
     */
    @ForceInline
    public final Object getAndSetObject(Object o, long offset, Object newValue) {
        return internalCache.getAndSetReference(o, offset, newValue);
    }

    /**
     * [确保栅栏前的负载不会与栅栏后的负载和存储重新排序](Ensures that loads before the fence will not be reordered with loads and stores after the fence)
     * @description zh - 确保栅栏前的负载不会与栅栏后的负载和存储重新排序
     * @description en - Ensures that loads before the fence will not be reordered with loads and stores after the fence
     * @version V1.0
     * @author drh
     * @since 2021-11-4 1：37
     */
    @ForceInline
    public void loadFence() {
        internalCache.loadFence();
    }

    /**
     * [确保围栏之前的装载和存储不会与围栏之后的商店重新排序](Ensures that loads and stores before the fence will not be reordered with stores after the fence)
     * @description zh - 确保围栏之前的装载和存储不会与围栏之后的商店重新排序
     * @description en - Ensures that loads and stores before the fence will not be reordered with stores after the fence
     * @version V1.0
     * @author drh
     * @since 2021-11-4 1：39
     */
    @ForceInline
    public void storeFence() {

        internalCache.storeFence();
    }

    /**
     * [确保围栏之前的装载和存储不会与围栏之后的商店重新排序](Ensures that loads and stores before the fence will not be reordered with stores after the fence)
     * @description zh - 确保围栏之前的装载和存储不会与围栏之后的商店重新排序
     * @description en - Ensures that loads and stores before the fence will not be reordered with stores after the fence
     * @version V1.0
     * @author drh
     * @since 2021-11-4 1：41
     */
    @ForceInline
    public void fullFence() {
        internalCache.fullFence();
    }

    /**
     * [调用给定的直接字节缓冲区的清理器](Invokes the given direct byte buffer's cleaner, if any)
     * @description zh - 调用给定的直接字节缓冲区的清理器
     * @description en - Invokes the given direct byte buffer's cleaner, if any
     * @version V1.0
     * @author drh
     * @since 2021-11-4 1：43
     */
    public void invokeCleaner(java.nio.ByteBuffer directBuffer) {
        if (!directBuffer.isDirect())
            throw new IllegalArgumentException("buffer is non-direct");

        internalCache.invokeCleaner(directBuffer);
    }
}
