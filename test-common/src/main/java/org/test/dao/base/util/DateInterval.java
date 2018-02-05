package org.test.dao.base.util;

import java.util.Date;

/**
 * To change this template use File | Settings | File Templates.
 */
public class DateInterval {
    private Date left;//左区间
    private Date right;//右区间

    public DateInterval() {

    }

    public DateInterval(Date left, Date right) {
        this.left = left;
        this.right = right;
    }

    public Date getLeft() {
        return left;
    }

    public void setLeft(Date left) {
        this.left = left;
    }

    public Date getRight() {
        return right;
    }

    public void setRight(Date right) {
        this.right = right;
    }
}