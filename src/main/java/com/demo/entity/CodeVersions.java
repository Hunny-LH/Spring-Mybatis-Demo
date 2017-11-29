package com.demo.entity;

import java.time.LocalDate;

/**
 * CodeVersions
 *
 * @author <a href="mailto:393803588@qq.com">HanL(liuhan3)</a>
 * @date 2017/11/21
 */
public class CodeVersions {

    private long id;

    private String codeVersions;

    private int order;

    private LocalDate createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodeVersions() {
        return codeVersions;
    }

    public void setCodeVersions(String codeVersions) {
        this.codeVersions = codeVersions;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "CodeVersions{" +
                "id=" + id +
                ", codeVersions='" + codeVersions + '\'' +
                ", order=" + order +
                ", createDate=" + createDate +
                '}';
    }
}
