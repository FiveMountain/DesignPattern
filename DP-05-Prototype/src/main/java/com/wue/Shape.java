package com.wue;

/**
 * @author FiveMountain
 * @date 2021/7/20 14:03
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    /**
     * draw
     */
    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
