package com.xiaoCache.cache.simple.MemoryOperation;

import jdk.internal.ref.Cleaner;
import jdk.internal.vm.annotation.ForceInline;
import jdk.internal.vm.annotation.IntrinsicCandidate;
import sun.nio.ch.DirectBuffer;

import java.lang.reflect.Field;

import static com.xiaoCache.cache.simple.MemoryOperation.CacheConstants.ADDRESS_SIZE0;
import static com.xiaoCache.cache.simple.MemoryOperation.CacheConstants.PAGE_SIZE;


public final class InternalCache {

    private static final int ADDRESS_SIZE = ADDRESS_SIZE0;
    /**
     * zh- 该常量不同于从 staticFieldOffset、objectFieldOffset 或 arrayBaseOffset 返回的所有结果。
     * en- This constant differs from all results that will ever be returned from staticFieldOffset, objectFieldOffset, or arrayBaseOffset.
     */
    public static final int INVALID_FIELD_OFFSET = -1;
    private native long allocateMemory0(long bytes);
    private native void freeMemory0(long address);
    private native long reallocateMemory0(long address, long bytes);
    private native void setMemory0(Object o, long offset, long bytes, byte value);
    private native void copyMemory0(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes);
    private native long objectFieldOffset0(Field f);
    private native long staticFieldOffset0(Field f);
    private native Object staticFieldBase0(Field f);
    private native boolean shouldBeInitialized0(Class<?> c);
    private native void ensureClassInitialized0(Class<?> c);
    private native int arrayBaseOffset0(Class<?> arrayClass);
    private native int arrayIndexScale0(Class<?> arrayClass);
    private native int getLoadAverage0(double[] loadavg, int nelems);


    private static native void registerNatives();

    static {
        registerNatives();
    }

    private static final InternalCache internalCache=new InternalCache();

    /**
     * [构造](structure)
     * @description zh - 构造
     * @description en - structure
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2：20
     */
    public static InternalCache getInternalCache(){
        return internalCache;
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:25
     */
    @IntrinsicCandidate
    public native int getInt(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:26
     */
    @IntrinsicCandidate
    public native void putInt(Object o,long offset,int value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:25
     */
    @IntrinsicCandidate
    public native Object getObject(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:27
     */
    @IntrinsicCandidate
    public native void putObject(Object o,long offset,Object value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:25
     */
    @IntrinsicCandidate
    public native boolean getBoolean(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:28
     */
    @IntrinsicCandidate
    public native void putBoolean(Object o,long offset,Boolean value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:29
     */
    @IntrinsicCandidate
    public native Byte getByte(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:30
     */
    @IntrinsicCandidate
    public native void putByte(Object o,long offset,Byte value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:37
     */
    @IntrinsicCandidate
    public native Short getShort(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:38
     */
    @IntrinsicCandidate
    public native void putShort(Object o,long offset,Short value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:38
     */
    @IntrinsicCandidate
    public native char getChar(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:38
     */
    @IntrinsicCandidate
    public native void putChar(Object o,long offset,char value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:38
     */
    @IntrinsicCandidate
    public native Long getLong(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:38
     */
    @IntrinsicCandidate
    public native void putLong(Object o,long offset,Long value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:39
     */
    @IntrinsicCandidate
    public native Float getFloat(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:40
     */
    @IntrinsicCandidate
    public native void putFloat(Object o,long offset,Float value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:53
     */
    @IntrinsicCandidate
    public native Double getDouble(Object o,long offset);

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:54
     */
    @IntrinsicCandidate
    public native void putDouble(Object o,long offset,Double value);

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:54
     */
    @ForceInline
    public  Byte getByte(long addr){
        return getByte(null,addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:56
     */
    @ForceInline
    public  void putByte(long addr,Byte value){
        putByte(null,addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:57
     */
    @ForceInline
    public  Short getShort(long addr){
       return getShort(null,addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 2:58
     */
    @ForceInline
    public  void putShort(long addr,Short value){
        putShort(null,addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:00
     */
    @ForceInline
    public  char getChar(long addr){
        return getChar(null,addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:00
     */
    @ForceInline
    public  void putChar(long addr,char value){
        putChar(null,addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:01
     */
    @ForceInline
    public  int getInt(long addr){
        return getInt(null,addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:02
     */
    @ForceInline
    public  void putInt(long addr,int value){
        putInt(null,addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:02
     */
    @ForceInline
    public  Long getLong(long addr){
        return getLong(null,addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:02
     */
    @ForceInline
    public  void putLong(long addr,long value){
        putLong(null,addr,value);
    }

    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:04
     */
    @ForceInline
    public  Float getFloat(long addr){
        return getFloat(null,addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:05
     */
    @ForceInline
    public  void putFloat(long addr,Float value){
        putFloat(null,addr,value);
    }


    /**
     * [寻址](Addressing)
     * @description zh - 寻址
     * @description en - Addressing
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:06
     */
    @ForceInline
    public  Double getDouble(long addr){
        return getDouble(null,addr);
    }

    /**
     * [存值](Stored value)
     * @description zh - 存值
     * @description en - Stored value
     * @version V1.0
     * @author drh
     * @since 2021-10-31 3:07
     */
    @ForceInline
    public  void putDouble(long addr,Double value){
        putDouble(null,addr,value);
    }

    /**
     * [获取本地指针(对象为空)](Get local pointer(Object is empty) )
     * @description zh - 获取本地指针(对象为空)
     * @description en - Get local pointer(Object is empty)
     * @version V1.0
     * @author drh
     * @since 2021-11-1 8：09
     */
    @ForceInline
    public long getAddress(long offset){
        return getAddress(null,offset);
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
    public void putAddress(long offset,long value){
        putAddress(null,offset,value);
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
    public long getAddress(Object o, long offset) {
        if (ADDRESS_SIZE == 4) {
            return Integer.toUnsignedLong(getInt(o, offset));
        } else {
            return getLong(o, offset);
        }
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
    public void putAddress(Object o, long offset, long x) {
        if (ADDRESS_SIZE == 4) {
            putInt(o, offset, (int)x);
        } else {
            putLong(o, offset, x);
        }
    }

    /**
     * [分配新的内存块](Allocate a new memory block)
     * @description zh - 分配新的内存块
     * @description en - Allocate a new memory block
     * @version V1.0
     * @author drh
     * @since 2021-11-1 8：14
     */
    public long allocateMemory(long size) {
        size = alignToHeapWordSize(size);

        allocateMemoryChecks(size);

        if (size == 0) {
            return 0;
        }

        long p = allocateMemory0(size);
        if (p == 0) {
            throw new OutOfMemoryError("Unable to allocate " + size + " bytes");
        }

        return p;
    }

    /**
     * [验证allocatememor的参数](Validate the arguments to allocateMemory)
     * @description zh - 验证allocatememor的参数
     * @description en - Validate the arguments to allocateMemory
     * @version V1.0
     * @author drh
     * @since 2021-11- 1 8:41
     */
    private void allocateMemoryChecks(long size) {
        checkSize(size);
    }

    /**
     * [检查长度的有效性](Check the validity of the length)
     * @description zh - 检查长度的有效性
     * @description en - Check the validity of the length
     * @version V1.0
     * @author drh
     * @since 2021-11- 1 8:43
     */
    private void checkSize(long size) {
        if (ADDRESS_SIZE == 4) {
            if (!is32BitClean(size)) {
                throw invalidInput();
            }
        } else if (size < 0) {
            throw invalidInput();
        }
    }

    /**
     * [异常](Exception)
     * @description zh - 异常
     * @description en - Exception
     * @version V1.0
     * @author drh
     * @since 2021-11- 1 8:50
     */
    public RuntimeException invalidInput() {
        throw new IllegalArgumentException();
    }

    /**
     * [检查是否为32位](Check if it is 32 bit)
     * @description zh - 检查是否为32位
     * @description en - Check if it is 32 bit
     * @version V1.0
     * @author drh
     * @since 2021-11- 1 8:48
     */
    private boolean is32BitClean(long size) {
        return size >>>32 ==0;
    }

    /**
     * [将分配大小设置为Heapwordsize的倍数](Round up allocation size to a multiple of HeapWordSize.)
     * @description zh - 将分配大小设置为Heapwordsize的倍数
     * @description en - Round up allocation size to a multiple of HeapWordSize
     * @version V1.0
     * @author drh
     * @since 2021-11- 1 8:39
     */
    private long alignToHeapWordSize(long size) {
        if (size>=0){
            return (size+ADDRESS_SIZE+1) & ~ (ADDRESS_SIZE0-1);
        }else {
            throw invalidInput();
        }
    }

    /**
     * [将给定内存块调整为指定大小](Resize the given memory block to the specified size)
     * @description zh - 将给定内存块调整为指定大小
     * @description en - Resize the given memory block to the specified size
     * @version V1.0
     * @author drh
     * @since 2021-11-1 9：01
     */
    public long reaLocalMemory(long addr, long size) {
        size = alignToHeapWordSize(size);

        reallocateMemoryChecks(addr, size);

        if (size == 0) {
            freeMemory(addr);
            return 0;
        }

        long p = (addr == 0) ? allocateMemory0(size) : reallocateMemory0(addr, size);
        if (p == 0) {
            throw new OutOfMemoryError("Unable to allocate " + size + " bytes");
        }

        return p;
    }

    /**
     * [处理从allocatememory或reallocatememory获得的本机内存块](Process native memory blocks obtained from allocatememory or reallocatememory)
     * @description zh - 处理从allocatememory或reallocatememory获得的本机内存块
     * @description en - Process native memory blocks obtained from allocatememory or reallocatememory
     * @version V1.0
     * @author drh
     * @since 2021-11-1 9：01
     */
    public void freeMemory(long addr) {
        freeMemoryChecks(addr);

        if (addr == 0) {
            return;
        }

        freeMemory0(addr);
    }



    /**
     * [验证 freeMemory 的参数](Validate the arguments to freeMemory)
     * @description zh - 验证 freeMemory 的参数
     * @description en - Validate the arguments to freeMemory
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2:05
     */
    private void freeMemoryChecks(long addr) {
        checkPointer(null, addr);
    }

    /**
     * [验证reallocatememory的参数](Validate the arguments to reallocateMemory)
     * @description zh - 验证reallocatememory的参数
     * @description en - Validate the arguments to reallocateMemory
     * @version V1.0
     * @author drh
     * @since 2021-11-1 9：01
     */
    private void reallocateMemoryChecks(long addr, long offset) {
        checkPointer(null, offset);
        checkSize(offset);
    }

    /**
     * [检查双指针寄存器有效性](Check the validity of the double pointer register)
     * @description zh - 检查双指针有效性
     * @description en - Check the validity of the double pointer register
     * @version V1.0
     * @author drh
     * @since 2021-11-1 9：01
     */
    private void checkPointer(Object o, long offset) {
        if (o == null) {
            checkNativeAddress(offset);
        } else {
            checkOffset(o, offset);
        }
    }

    /**
     * [检查相对于基础对象的偏移的有效性](Check the validity of an offset, relative to a base object)
     * @description zh - 检查相对于基础对象的偏移的有效性
     * @description en - Check the validity of an offset, relative to a base object
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2；22
     */
    private void checkOffset(Object o, long offset) {
        if (ADDRESS_SIZE == 4) {
            if (!is32BitClean(offset)) {
                throw invalidInput();
            }
        } else if (offset < 0) {
            throw invalidInput();
        }
    }

    /**
     * [检查本地地址的有效性](Check the validity of a native addressr)
     * @description zh - 检查本地地址的有效性
     * @description en - Check the validity of a native address
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2；22
     */
    private void checkNativeAddress(long offset) {
        if (ADDRESS_SIZE == 4) {
            if ((((offset >> 32) + 1) & ~1) != 0) {
                throw invalidInput();
            }
        }
    }

    /**
     * [将给定内存块中的所有字节设置为固定值](Set all bytes in a given memory block to a fixed value)
     * @description zh - 将给定内存块中的所有字节设置为固定值
     * @description en - Set all bytes in a given memory block to a fixed value
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2:35
     */
    public void setMemory(Object o, long offset, long size, byte value) {
        setMemoryChecks(o, offset, size, value);

        if (size == 0) {
            return;
        }

        setMemory0(o, offset, size, value);
    }

    /**
     * [将给定内存块中的所有字节设置为固定值](Set all bytes in a given memory block to a fixed value)
     * @description zh - 将给定内存块中的所有字节设置为固定值
     * @description en - Set all bytes in a given memory block to a fixed value
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:03
     */
    public void setMemory(long offset, long size, byte value) {
        setMemory(null,offset,size,value);
    }

    /**
     * [验证 setMemory 的参数](Validate the arguments to setMemory)
     * @description zh - 验证 setMemory 的参数
     * @description en - Validate the arguments to setMemory
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2:36
     */
    private void setMemoryChecks(Object o, long offset, long size, byte value) {
        checkPrimitivePointer(o, offset);
        checkSize(size);
    }

    /**
     * [检查指针是否是有效的原始数组类型指针 注意：堆外指针被认为是原始数组](Check that a pointer is a valid primitive array type pointer Note: pointers off-heap are considered to be primitive arrays)
     * @description zh - 检查指针是否是有效的原始数组类型指针 注意：堆外指针被认为是原始数组
     * @description en - Check that a pointer is a valid primitive array type pointer Note: pointers off-heap are considered to be primitive arrays
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2:36
     */
    private void checkPrimitivePointer(Object o, long offset) {
        checkPointer(o, offset);

        if (o != null) {
            checkPrimitiveArray(o.getClass());
        }
    }

    /**
     * [检查类型是否为原始数组类型](Check if a type is a primitive array type)
     * @description zh - 检查类型是否为原始数组类型
     * @description en - Check if a type is a primitive array type
     * @version V1.0
     * @author drh
     * @since 2021-11-1 2:58
     */
    private void checkPrimitiveArray(Class<?> c) {
        Class<?> componentType = c.getComponentType();
        if (componentType == null || !componentType.isPrimitive()) {
            throw invalidInput();
        }
    }

    /**
     * [将给定内存块中的所有字节设置为另一个块的副本](Sets all bytes in a given block of memory to a copy of another block)
     * @description zh - 将给定内存块中的所有字节设置为另一个块的副本
     * @description en - Sets all bytes in a given block of memory to a copy of another block
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:09
     */
    public void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long size) {
        copyMemoryChecks(srcBase, srcOffset, destBase, destOffset, size);

        if (size == 0) {
            return;
        }

        copyMemory0(srcBase, srcOffset, destBase, destOffset, size);
    }

    /**
     * [将给定内存块中的所有字节设置为另一个块的副本](Sets all bytes in a given block of memory to a copy of another block)
     * @description zh - 将给定内存块中的所有字节设置为另一个块的副本
     * @description en - Sets all bytes in a given block of memory to a copy of another block
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:09
     */
    public void copyMemory(long srcAddress, long destAddress, long size) {
        copyMemory(null,srcAddress,null,destAddress,size);
    }

    /**
     * [验证 copyMemory 的参数](Validate the arguments to copyMemory)
     * @description zh - 验证 copyMemory 的参数
     * @description en - Validate the arguments to copyMemory
     * @version V1.0
     * @author drh
     * @since 2021-11-1 3:09
     */
    private void copyMemoryChecks(Object srcBase, long srcOffset, Object destBase, long destOffset, long size) {
        checkSize(size);
        checkPrimitivePointer(srcBase, srcOffset);
        checkPrimitivePointer(destBase, destOffset);
    }

    /**
     * [报告给定字段在其类的存储分配中的位置](Reports the location of a given field in the storage allocation of its class)
     * @description zh - 报告给定字段在其类的存储分配中的位置
     * @description en - Reports the location of a given field in the storage allocation of its class
     * @version V1.0
     * @author drh
     * @since 2021-11-3 8:16
     */
    public long objectFieldOffset(Field f) {
        if (f == null) {
            throw new NullPointerException();
        }

        return objectFieldOffset0(f);
    }

    /**
     * [结合 staticFieldBase 报告给定静态字段的位置](Reports the location of a given static field, in conjunction with staticFieldBase)
     * @description zh - 结合 staticFieldBase 报告给定静态字段的位置
     * @description en - Reports the location of a given static field, in conjunction with staticFieldBase
     * @version V1.0
     * @author drh
     * @since 2021-11-3 8:40
     */
    public long staticFieldOffset(Field f) {
        if (f == null) {
            throw new NullPointerException();
        }

        return staticFieldOffset0(f);
    }

    /**
     * [结合 staticFieldOffset 报告给定静态字段的位置](Reports the location of a given static field, in conjunction with staticFieldOffset)
     * @description zh - 结合 staticFieldOffset 报告给定静态字段的位置
     * @description en - Reports the location of a given static field, in conjunction with staticFieldOffset
     * @version V1.0
     * @author drh
     * @since 2021-11-3 8:45
     */
    public Object staticFieldBase(Field f) {
        if (f == null) {
            throw new NullPointerException();
        }

        return staticFieldBase0(f);
    }

    /**
     * [检测给定的类是否需要初始化。 这通常与获取类的静态字段基数一起使用](Detects if the given class may need to be initialized. This is often needed in conjunction with obtaining the static field base of a class)
     * @description zh - 检测给定的类是否需要初始化。 这通常与获取类的静态字段基数一起使用
     * @description en - Detects if the given class may need to be initialized. This is often needed in conjunction with obtaining the static field base of a class
     * @version V1.0
     * @author drh
     * @since 2021-11-3 9：07
     */
    public boolean shouldBeInitialized(Class<?> c) {
        if (c == null) {
            throw new NullPointerException();
        }

        return shouldBeInitialized0(c);
    }

    public void ensureClassInitialized(Class<?> c) {
        if (c == null) {
            throw new NullPointerException();
        }

        ensureClassInitialized0(c);
    }

    /**
     * [报告给定数组类的存储分配中第一个元素的偏移量](Reports the offset of the first element in the storage allocation of a given array class)
     * @description zh - 报告给定数组类的存储分配中第一个元素的偏移量
     * @description en - Reports the offset of the first element in the storage allocation of a given array class
     * @version V1.0
     * @author drh
     * @since 2021-11-3 9：22
     */
    public int arrayBaseOffset(Class<?> arrayClass) {
        if (arrayClass == null) {
            throw new NullPointerException();
        }

        return arrayBaseOffset0(arrayClass);
    }

    /**
     * The value of arrayBaseOffset(boolean[].class)
     */
    public static final int ARRAY_BOOLEAN_BASE_OFFSET = internalCache.arrayBaseOffset(boolean[].class);
    /**
     * The value of arrayBaseOffset(boolean[].class)
     */
    public static final int ARRAY_BYTE_BASE_OFFSET = internalCache.arrayBaseOffset(byte[].class);
    /**
     * The value of arrayBaseOffset(short[].class)
     */
    public static final int ARRAY_SHORT_BASE_OFFSET = internalCache.arrayBaseOffset(short[].class); ;
    /**
     * The value of arrayBaseOffset(char[].class)
     */
    public static final int ARRAY_CHAR_BASE_OFFSET = internalCache.arrayBaseOffset(char[].class);
    /**
     * The value of arrayBaseOffset(int[].class)
     */
    public static final int ARRAY_INT_BASE_OFFSET = internalCache.arrayBaseOffset(int[].class);
    /**
     * The value of arrayBaseOffset(long[].class)
     */
    public static final int ARRAY_LONG_BASE_OFFSET = internalCache.arrayBaseOffset(long[].class);
    /**
     * The value of arrayBaseOffset(float[].class)
     */
    public static final int ARRAY_FLOAT_BASE_OFFSET = internalCache.arrayBaseOffset(float[].class);
    /**
     * The value of arrayBaseOffset(double[].class)
     */
    public static final int ARRAY_DOUBLE_BASE_OFFSET = internalCache.arrayBaseOffset(double[].class);
    /**
     * The value of arrayBaseOffset(Object[].class)
     */
    public static final int ARRAY_OBJECT_BASE_OFFSET = internalCache.arrayBaseOffset(Object[].class);

    /**
     * [报告在给定数组类的存储分配中寻址元素的比例因子](Reports the scale factor for addressing elements in the storage allocation of a given array class)
     * @description zh - 报告在给定数组类的存储分配中寻址元素的比例因子
     * @description en - Reports the scale factor for addressing elements in the storage allocation of a given array class
     * @version V1.0
     * @author drh
     * @since 2021-11-3 9：56
     */
    public int arrayIndexScale(Class<?> arrayClass) {
        if (arrayClass == null) {
            throw new NullPointerException();
        }

        return arrayIndexScale0(arrayClass);
    }

    /**
     * The value of arrayIndexScale(boolean[].class)
     */
    public static final int ARRAY_BOOLEAN_INDEX_SCALE = internalCache.arrayIndexScale(boolean[].class);
    /**
     * The value of arrayIndexScale(byte[].class)
     */
    public static final int ARRAY_BYTE_INDEX_SCALE = internalCache.arrayIndexScale(byte[].class);
    /**
     * The value of arrayIndexScale(short[].class)
     */
    public static final int ARRAY_SHORT_INDEX_SCALE = internalCache.arrayIndexScale(short[].class);
    /**
     * The value of arrayIndexScale(char[].class)
     */
    public static final int ARRAY_CHAR_INDEX_SCALE = internalCache.arrayIndexScale(char[].class);
    /**
     * The value of arrayIndexScale(int[].class)
     */
    public static final int ARRAY_INT_INDEX_SCALE = internalCache.arrayIndexScale(int[].class);
    /**
     * The value of arrayIndexScale(long[].class)
     */
    public static final int ARRAY_LONG_INDEX_SCALE = internalCache.arrayIndexScale(long[].class);
    /**
     * The value of arrayIndexScale(float[].class)
     */
    public static final int ARRAY_FLOAT_INDEX_SCALE = internalCache.arrayIndexScale(float[].class);
    /**
     * The value of arrayIndexScale(double[].class)
     */
    public static final int ARRAY_DOUBLE_INDEX_SCALE = internalCache.arrayIndexScale(double[].class);
    /**
     * The value of arrayIndexScale(Object[].class)
     */
    public static final int ARRAY_OBJECT_INDEX_SCALE = internalCache.arrayIndexScale(Object[].class);

    /**
     * [报告通过 putAddress 存储的本机指针的大小（以字节为单位）](Reports the size in bytes of a native pointer, as stored via putAddress)
     * @description zh - 报告通过 putAddress 存储的本机指针的大小（以字节为单位）
     * @description en - Reports the size in bytes of a native pointer, as stored via putAddress
     * @version V1.0
     * @author drh
     * @since 2021-11-3 10：40
     */
    public int addressSize() {
        return ADDRESS_SIZE;
    }

    /**
     * [报告本机内存页面的大小（以字节为单位）](Reports the size in bytes of a native memory page)
     * @description zh - 报告本机内存页面的大小（以字节为单位）
     * @description en - Reports the size in bytes of a native memory page
     * @version V1.0
     * @author drh
     * @since 2021-11-3 10：41
     */
    public int pageSize() {
        return PAGE_SIZE;
    }

    /**
     * [分配一个实例但不运行任何构造函数。 如果尚未初始化类，则对其进行初始化](Allocates an instance but does not run any constructor. Initializes the class if it has not yet been)
     * @description zh - 分配一个实例但不运行任何构造函数。 如果尚未初始化类，则对其进行初始化
     * @description en - Allocates an instance but does not run any constructor. Initializes the class if it has not yet been
     * @version V1.0
     * @author drh
     * @since 2021-11-3 10：58
     */
    @IntrinsicCandidate
    public native Object allocateInstance(Class<?> cls)throws InstantiationException;

    /**
     * [在不告诉验证者的情况下抛出异常](Throws the exception without telling the verifier)
     * @description zh - 在不告诉验证者的情况下抛出异常
     * @description en - Throws the exception without telling the verifier
     * @version V1.0
     * @author drh
     * @since 2021-11-3 11:04
     */
    public native void throwException(Throwable ee);

    /**
     * [如果当前保持预期状态，则将 Java 变量原子更新为 x](Atomically updates Java variable to x if it is currently holding expected)
     * @description zh - 如果当前保持预期状态，则将 Java 变量原子更新为 x
     * @description en - Atomically updates Java variable to x if it is currently holding expected
     * @version V1.0
     * @author drh
     * @since 2021-11-3 12：53
     */
    @IntrinsicCandidate
    public native boolean compareAndSetReference(Object o, long offset, Object expected, Object x);
    /**
     * [如果当前保持预期状态，则将 Java 变量原子更新为 x](Atomically updates Java variable to x if it is currently holding expected)
     * @description zh - 如果当前保持预期状态，则将 Java 变量原子更新为 x
     * @description en - Atomically updates Java variable to x if it is currently holding expected
     * @version V1.0
     * @author drh
     * @since 2021-11-3 12：53
     */
    @IntrinsicCandidate
    public native boolean compareAndSetInt(Object o, long offset, int expected, int x);
    /**
     * [如果当前保持预期状态，则将 Java 变量原子更新为 x](Atomically updates Java variable to x if it is currently holding expected)
     * @description zh - 如果当前保持预期状态，则将 Java 变量原子更新为 x
     * @description en - Atomically updates Java variable to x if it is currently holding expected
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1：14
     */
    @IntrinsicCandidate
    public native boolean compareAndSetLong(Object o, long offset,
                                            long expected,
                                            long x);

    /**
     * [从给定的 Java 变量中获取引用值，具有 volatile 加载语义](Fetches a reference value from a given Java variable, with volatile load semantics)
     * @description zh - 从给定的 Java 变量中获取引用值，具有 volatile 加载语义
     * @description en - Fetches a reference value from a given Java variable, with volatile load semantics
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:27
     */
    @IntrinsicCandidate
    public native Object getReferenceVolatile(Object o, long offset);

    /**
     * [使用易失性存储语义将引用值存储到给定的 Java 变量中](Stores a reference value into a given Java variable, with volatile store semantics)
     * @description zh - 使用易失性存储语义将引用值存储到给定的 Java 变量中
     * @description en - Stores a reference value into a given Java variable, with volatile store semantics
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:16
     */
    @IntrinsicCandidate
    public native void putReferenceVolatile(Object o, long offset, Object x);

    /**
     * [getInt(Object, long) 的可变版本](Volatile version of getInt(Object, long))
     * @description zh - getInt(Object, long) 的可变版本
     * @description en - Volatile version of getInt(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:30
     */
    @IntrinsicCandidate
    public native int getIntVolatile(Object o, long offset);

    /**
     * [putInt(Object, long, int) 的易变版本](Volatile version of putInt(Object, long, int))
     * @description zh - putInt(Object, long, int) 的易变版本
     * @description en - Volatile version of putInt(Object, long, int)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:32
     */
    @IntrinsicCandidate
    public native void putIntVolatile(Object o, long offset, int x);

    /**
     * [getBoolean(Object, long) 的可变版本](Volatile version of getBoolean(Object, long))
     * @description zh - getBoolean(Object, long) 的可变版本
     * @description en - Volatile version of getBoolean(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:33
     */
    @IntrinsicCandidate
    public native boolean getBooleanVolatile(Object o, long offset);

    /**
     * [putBoolean(Object, long, boolean) 的可变版本](Volatile version of putBoolean(Object, long, boolean))
     * @description zh - putBoolean(Object, long, boolean) 的可变版本
     * @description en - Volatile version of putBoolean(Object, long, boolean)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:35
     */
    @IntrinsicCandidate
    public native void putBooleanVolatile(Object o, long offset, boolean x);

    /**
     * [getByte(Object, long) 的易失版本](Volatile version of getByte(Object, long))
     * @description zh - getByte(Object, long) 的易失版本
     * @description en - Volatile version of getByte(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:36
     */
    @IntrinsicCandidate
    public native byte    getByteVolatile(Object o, long offset);

    /**
     * [putByte(Object, long, byte) 的易变版本](Volatile version of putByte(Object, long, byte))
     * @description zh - putByte(Object, long, byte) 的易变版本
     * @description en - Volatile version of putByte(Object, long, byte)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:37
     */
    @IntrinsicCandidate
    public native void    putByteVolatile(Object o, long offset, byte x);

    /**
     * [getShort(Object, long) 的易变版本](Volatile version of getShort(Object, long))
     * @description zh - getShort(Object, long) 的易变版本
     * @description en - Volatile version of getShort(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:38
     */
    @IntrinsicCandidate
    public native short   getShortVolatile(Object o, long offset);

    /**
     * [putShort(Object, long, short) 的易变版本](Volatile version of putShort(Object, long, short))
     * @description zh - putShort(Object, long, short) 的易变版本
     * @description en - Volatile version of putShort(Object, long, short)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:40
     */
    @IntrinsicCandidate
    public native void    putShortVolatile(Object o, long offset, short x);

    /**
     * [getChar(Object, long) 的可变版本](Volatile version of getChar(Object, long))
     * @description zh - getChar(Object, long) 的可变版本
     * @description en - Volatile version of getChar(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:41
     */
    @IntrinsicCandidate
    public native char    getCharVolatile(Object o, long offset);

    /**
     * [putChar(Object, long, char) 的易变版本](Volatile version of putChar(Object, long, char))
     * @description zh - putChar(Object, long, char) 的易变版本
     * @description en - Volatile version of putChar(Object, long, char)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:44
     */
    @IntrinsicCandidate
    public native void    putCharVolatile(Object o, long offset, char x);

    /**
     * [getLong(Object, long) 的可变版本](Volatile version of getLong(Object, long))
     * @description zh - getLong(Object, long) 的可变版本
     * @description en - Volatile version of getLong(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:46
     */
    @IntrinsicCandidate
    public native long    getLongVolatile(Object o, long offset);

    /**
     * [putLong(Object, long, long) 的易变版本](Volatile version of putLong(Object, long, long))
     * @description zh - putLong(Object, long, long) 的易变版本
     * @description en - Volatile version of putLong(Object, long, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:48
     */
    @IntrinsicCandidate
    public native void    putLongVolatile(Object o, long offset, long x);

    /**
     * [getFloat(Object, long) 的可变版本](Volatile version of getFloat(Object, long))
     * @description zh - getFloat(Object, long) 的可变版本
     * @description en - Volatile version of getFloat(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:50
     */
    @IntrinsicCandidate
    public native float   getFloatVolatile(Object o, long offset);

    /**
     * [putFloat(Object, long, float) 的可变版本](Volatile version of putFloat(Object, long, float))
     * @description zh - putFloat(Object, long, float) 的可变版本
     * @description en - Volatile version of putFloat(Object, long, float)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:52
     */
    @IntrinsicCandidate
    public native void    putFloatVolatile(Object o, long offset, float x);

    /**
     * [getDouble(Object, long) 的可变版本](Volatile version of getDouble(Object, long))
     * @description zh - getDouble(Object, long) 的可变版本
     * @description en - Volatile version of getDouble(Object, long)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:54
     */
    @IntrinsicCandidate
    public native double  getDoubleVolatile(Object o, long offset);

    /**
     * [putDouble(Object, long, double) 的可变版本](Volatile version of putDouble(Object, long, double))
     * @description zh - putDouble(Object, long, double) 的可变版本
     * @description en - Volatile version of putDouble(Object, long, double)
     * @version V1.0
     * @author drh
     * @since 2021-11-3 1:56
     */
    @IntrinsicCandidate
    public native void    putDoubleVolatile(Object o, long offset, double x);


    @IntrinsicCandidate
    public final void putReferenceRelease(Object o, long offset, Object x) {
        putReferenceVolatile(o, offset, x);
    }

    @IntrinsicCandidate
    public final void putIntRelease(Object o, long offset, int x) {
        putIntVolatile(o, offset, x);
    }

    @IntrinsicCandidate
    public final void putLongRelease(Object o, long offset, long x) {
        putLongVolatile(o, offset, x);
    }

    /**
     * [解除阻塞的给定线程阻塞，或者，如果它没有阻塞](Unblocks the given thread blocked on park, or, if it is not blocked)
     * @description zh - 解除阻塞的给定线程阻塞，或者，如果它没有阻塞
     * @description en - Unblocks the given thread blocked on park, or, if it is not blocked
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：16
     */
    @IntrinsicCandidate
    public native void unpark(Object thread);

    /**
     * [阻塞当前线程，在发生平衡 unpark 时返回](Blocks current thread, returning when a balancing unpark occurs)
     * @description zh - 阻塞当前线程，在发生平衡 unpark 时返回
     * @description en - Blocks current thread, returning when a balancing unpark occurs
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：17
     */
    @IntrinsicCandidate
    public native void park(boolean isAbsolute, long time);

    /**
     * [获取分配给可用处理器的系统运行队列中的平均负载在不同时间段内的平均值](Gets the load average in the system run queue assigned to the available processors averaged over various periods of time)
     * @description zh - 获取分配给可用处理器的系统运行队列中的平均负载在不同时间段内的平均值
     * @description en - Gets the load average in the system run queue assigned to the available processors averaged over various periods of time
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：17
     */
    public int getLoadAverage(double[] loadavg, int nelems) {
        if (nelems < 0 || nelems > 3 || nelems > loadavg.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return getLoadAverage0(loadavg, nelems);
    }

    /**
     * [原子地将给定值添加到给定对象 o 中给定偏移处的字段或数组元素的当前值](Atomically adds the given value to the current value of a field or array element within the given object o at the given offset)
     * @description zh - 原子地将给定值添加到给定对象 o 中给定偏移处的字段或数组元素的当前值
     * @description en - Atomically adds the given value to the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：46
     */
    @IntrinsicCandidate
    public final int getAndAddInt(Object o, long offset, int delta) {
        int v;
        do {
            v = getIntVolatile(o, offset);
        } while (!weakCompareAndSetInt(o, offset, v, v + delta));
        return v;
    }

    @IntrinsicCandidate
    public final boolean weakCompareAndSetInt(Object o, long offset,
                                              int expected,
                                              int x) {
        return compareAndSetInt(o, offset, expected, x);
    }

    /**
     * [将给定值原子地添加到给定对象 o 中给定偏移量处的字段或数组元素的当前值](Atomically adds the given value to the current value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定值原子地添加到给定对象 o 中给定偏移量处的字段或数组元素的当前值
     * @description en - Atomically adds the given value to the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：49
     */
    @IntrinsicCandidate
    public final long getAndAddLong(Object o, long offset, long delta) {
        long v;
        do {
            v = getLongVolatile(o, offset);
        } while (!weakCompareAndSetLong(o, offset, v, v + delta));
        return v;
    }
    @IntrinsicCandidate
    public final boolean weakCompareAndSetLong(Object o, long offset,
                                               long expected,
                                               long x) {
        return compareAndSetLong(o, offset, expected, x);
    }

    /**
     * [将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换](Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换
     * @description en - Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：42
     */
    @IntrinsicCandidate
    public final int getAndSetInt(Object o, long offset, int newValue) {
        int v;
        do {
            v = getIntVolatile(o, offset);
        } while (!weakCompareAndSetInt(o, offset, v, newValue));
        return v;
    }

    /**
     * [将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换](Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定值与给定偏移量处给定对象 o 内的字段或数组元素的当前值进行原子交换
     * @description en - Atomically exchanges the given value with the current value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：55
     */
    @IntrinsicCandidate
    public final long getAndSetLong(Object o, long offset, long newValue) {
        long v;
        do {
            v = getLongVolatile(o, offset);
        } while (!weakCompareAndSetLong(o, offset, v, newValue));
        return v;
    }

    /**
     * [将给定的参考值与给定对象 o 中给定偏移量处的字段或数组元素的当前参考值进行原子交换](Atomically exchanges the given reference value with the current reference value of a field or array element within the given object o at the given offset)
     * @description zh - 将给定的参考值与给定对象 o 中给定偏移量处的字段或数组元素的当前参考值进行原子交换
     * @description en - Atomically exchanges the given reference value with the current reference value of a field or array element within the given object o at the given offset
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：58
     */
    @IntrinsicCandidate
    public final Object getAndSetReference(Object o, long offset, Object newValue) {
        Object v;
        do {
            v = getReferenceVolatile(o, offset);
        } while (!weakCompareAndSetReference(o, offset, v, newValue));
        return v;
    }
    @IntrinsicCandidate
    public final boolean weakCompareAndSetReference(Object o, long offset,
                                                    Object expected,
                                                    Object x) {
        return compareAndSetReference(o, offset, expected, x);
    }

    /**
     * [确保栅栏前的负载不会与栅栏后的负载和存储重新排序](Ensures that loads before the fence will not be reordered with loads and stores after the fence)
     * @description zh - 确保栅栏前的负载不会与栅栏后的负载和存储重新排序
     * @description en - Ensures that loads before the fence will not be reordered with loads and stores after the fence
     * @version V1.0
     * @author drh
     * @since 2021-11-4 11：58
     */
    @IntrinsicCandidate
    public native void loadFence();

    /**
     * [确保围栏之前的装载和存储不会与围栏之后的商店重新排序](Ensures that loads and stores before the fence will not be reordered with stores after the fence)
     * @description zh - 确保围栏之前的装载和存储不会与围栏之后的商店重新排序
     * @description en - Ensures that loads and stores before the fence will not be reordered with stores after the fence
     * @version V1.0
     * @author drh
     * @since 2021-11-4 1：39
     */
    @IntrinsicCandidate
    public native void storeFence();

    /**
     * [确保围栏之前的装载和存储不会与围栏之后的商店重新排序](Ensures that loads and stores before the fence will not be reordered with stores after the fence)
     * @description zh - 确保围栏之前的装载和存储不会与围栏之后的商店重新排序
     * @description en - Ensures that loads and stores before the fence will not be reordered with stores after the fence
     * @version V1.0
     * @author drh
     * @since 2021-11-4 1：41
     */
    @IntrinsicCandidate
    public native void fullFence();

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

        DirectBuffer db = (DirectBuffer) directBuffer;
        if (db.attachment() != null)
            throw new IllegalArgumentException("duplicate or slice");

        Cleaner cleaner = db.cleaner();
        if (cleaner != null) {
            cleaner.clean();
        }
    }
}
