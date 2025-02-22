package com.taskviewer.api.web.controller;

import com.taskviewer.api.model.UserNotFoundException;
import com.taskviewer.api.web.rs.RsError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestExceptions {

  @ExceptionHandler(UserNotFoundException.class)
  public RsError userNotFound(final UserNotFoundException ex) throws Exception {
    final String message = ex.getMessage();
    log.debug(message);
    return new RsError.WithCode(
      404,
      message
    );
  }
}