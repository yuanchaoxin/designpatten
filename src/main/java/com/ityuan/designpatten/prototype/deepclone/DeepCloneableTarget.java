package com.ityuan.designpatten.prototype.deepclone;

import java.io.Serializable;

/**
 * @ClassName DeepCloneableTarget
 * @Package com.ityuan.designpatten.prototype.deepclone
 * @Author yuanchaoxin
 * @Date 2021/6/28
 * @Version 1.0
 * @Description
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 8040485450001401234L;

    private String cloneName;
    private String cloneClass;

    public String getCloneName() {
        return cloneName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneableTarget deepCloneableTarget = (DeepCloneableTarget) super.clone();
        return deepCloneableTarget;
    }

    public DeepCloneableTarget() {
    }

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }
}
