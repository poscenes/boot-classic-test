package ru.check.testing.service;

import ru.check.testing.model.LogRecord;

public interface LogsWriterService {
    LogRecord saveLogs(LogRecord record);
}
