package com.taskviewer.api.model;

public interface Comment {

  Long id();

  String content();

  String user();

  String task();
}
