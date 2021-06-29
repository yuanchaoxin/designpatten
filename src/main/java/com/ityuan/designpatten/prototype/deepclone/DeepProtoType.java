package com.ityuan.designpatten.prototype.deepclone;

import java.io.*;

/**
 * @ClassName DeepProtoType
 * @Package com.ityuan.designpatten.prototype.deepclone
 * @Author yuanchaoxin
 * @Date 2021/6/28
 * @Version 1.0
 * @Description 深拷贝
 */
public class DeepProtoType implements Serializable,Cloneable {

    private static final long serialVersionUID = -4190269366027095149L;

    private String name;
    private DeepCloneableTarget deepCloneableTarget;


    /**
     * 方式一 重写clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepProtoType deepProtoType = (DeepProtoType) super.clone();
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    /**
     * 方式二 对象序列化实现（推荐）
     * @return
     */
    public Object deepClone() {
        //创建六对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            // 序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            //将当前对象以对象流方式输出
            objectOutputStream.writeObject(this);

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            DeepProtoType clone = (DeepProtoType)objectInputStream.readObject();
            return clone;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                objectInputStream.close();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }

        return null;
    }

    public DeepProtoType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }
}
