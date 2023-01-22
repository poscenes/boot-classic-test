package ru.check.testing.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.check.testing.model.LogRecord;
import ru.check.testing.repository.LogsRepository;
import ru.check.testing.service.impl.LogsWriterServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LogsRestControllerTest {
    @Mock
    private LogsRepository repository;

    @InjectMocks
    @Autowired
    private LogsWriterServiceImpl service;

    @Test
    void recordLogs() {
        LogRecord record = new LogRecord();

        assertNotNull(repository);
        assertNotNull(service);
        assertNotNull(service.saveLogs(record));
    }
}