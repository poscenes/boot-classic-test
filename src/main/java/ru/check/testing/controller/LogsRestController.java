package ru.check.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.check.testing.model.LogRecord;
import ru.check.testing.service.LogsWriterService;

@RestController
public class LogsRestController {
    private final LogsWriterService logsWriterService;

    @Autowired
    public LogsRestController(LogsWriterService logsWriterService) {
        this.logsWriterService = logsWriterService;
    }

    @PostMapping(value = "/logs", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> recordLogs(@RequestBody LogRecord logRecord) {
        logsWriterService.saveLogs(logRecord);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
