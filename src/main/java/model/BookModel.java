package model;

import java.io.Serializable;

public class BookModel implements Serializable {

    private static final long serialVersionUID = 2759877769831939845L;

    private String name;
    private int pageCount;

    public BookModel() {
    }

    public BookModel(String string, int anInt) {
        this.name = string;
        this.pageCount = anInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}