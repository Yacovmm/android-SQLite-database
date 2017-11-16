package com.yacov.databaseapp;

/**
 * Created by YacovR on 19-Oct-17.
 */

public class Tasks {
    private int id;
    private String _taskName;
    private String _taskContent;

    public void Tasks(){

    }

    public Tasks(String _taskName, String _taskContent){
        this._taskName = _taskName;
        this._taskContent = _taskContent;
    }

    public int getId() {
        return id;
    }

    public String get_taskName() {
        return _taskName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void set_taskName(String _taskName) {
        this._taskName = _taskName;
    }

    public String get_taskContent() {
        return _taskContent;
    }

    public void set_taskContent(String _taskContent) {
        this._taskContent = _taskContent;
    }
}
