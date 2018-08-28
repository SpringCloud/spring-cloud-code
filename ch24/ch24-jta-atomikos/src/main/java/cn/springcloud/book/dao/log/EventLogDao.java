package cn.springcloud.book.dao.log;

import cn.springcloud.book.domain.log.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by caibosi on 2018-07-25.
 */
public interface EventLogDao extends JpaRepository<EventLog, Integer> {
}
