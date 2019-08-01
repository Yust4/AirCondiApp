package com.klima.Models;

import java.util.Date;

class AnnualRepair {
    Date date;
    String comment;

    public AnnualRepair(Date date, String comment) {
        this.date = date;
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
