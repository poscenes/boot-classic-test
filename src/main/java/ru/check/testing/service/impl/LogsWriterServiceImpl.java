package ru.check.testing.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.check.testing.model.LogRecord;
import ru.check.testing.repository.LogsRepository;
import ru.check.testing.service.LogsWriterService;

@Service
@Slf4j
public class LogsWriterServiceImpl implements LogsWriterService {
    private final LogsRepository repository;

    @Autowired
    public LogsWriterServiceImpl(LogsRepository repository) {
        this.repository = repository;
    }

    @Override
    public LogRecord saveLogs(LogRecord record) {
        log.info(record.toString());
        return repository.save(record);
    }
}
