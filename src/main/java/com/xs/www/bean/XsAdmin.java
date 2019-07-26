package com.xs.www.bean;

import java.util.Date;

/**
 * 系统管理员
 * @author wuyb
 */
public class XsAdmin {
    private Long id;

    private String name;

    private Byte age;

    private Short postId;

    private Short roleId;

    private Short systemId;

    private Date createTime;

    private Short createUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Short getPostId() {
        return postId;
    }

    public void setPostId(Short postId) {
        this.postId = postId;
    }

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public Short getSystemId() {
        return systemId;
    }

    public void setSystemId(Short systemId) {
        this.systemId = systemId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Short createUserId) {
        this.createUserId = createUserId;
    }
}