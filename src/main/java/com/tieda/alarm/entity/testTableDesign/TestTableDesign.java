package com.tieda.alarm.entity.testTableDesign;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-09-28
 */
@TableName("TEST_TABLE_DESIGN")
public class TestTableDesign implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    @TableField("TABLENAME")
    private String tablename;
    @TableField("CELL")
    private Object cell;
    @TableField("CREATEDATE")
    private Date createdate;
    @TableField("NOTE")
    private String note;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Object getCell() {
        return cell;
    }

    public void setCell(Object cell) {
        this.cell = cell;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "TestTableDesign{" +
        "id=" + id +
        ", tablename=" + tablename +
        ", cell=" + cell +
        ", createdate=" + createdate +
        ", note=" + note +
        "}";
    }
}
