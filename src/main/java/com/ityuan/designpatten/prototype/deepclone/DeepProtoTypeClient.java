package com.ityuan.designpatten.prototype.deepclone;

/**
 * @ClassName DeepProtoTypeClient
 * @Package com.ityuan.designpatten.prototype.deepclone
 * @Author yuanchaoxin
 * @Date 2021/6/28
 * @Version 1.0
 * @Description
 */
public class DeepProtoTypeClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("大牛", "牛仔");
        DeepProtoType deepProtoType = new DeepProtoType();

        deepProtoType.setName("deep");
        deepProtoType.setDeepCloneableTarget(deepCloneableTarget);

        // 方式一 完成深拷贝
        DeepProtoType clone = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType.getDeepCloneableTarget().hashCode());
        System.out.println(clone.getDeepCloneableTarget().hashCode());

        // 方式二 完成深拷贝
        DeepProtoType clone1 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType.getDeepCloneableTarget().hashCode());
        System.out.println(clone1.getDeepCloneableTarget().hashCode());
    }
}
