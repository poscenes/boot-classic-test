package ru.check.testing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.check.testing.model.LogRecord;

@Repository
public interface LogsRepository extends CrudRepository<LogRecord, Long> {
}
