package generics_set_map.exemplo_log.model.entitie;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Log {
    private String name;
    private Date dataDoLog;

    public Log(String username, Date logMoment) {
        this.name = username;
        this.dataDoLog = logMoment;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataDoLog() {
        return dataDoLog;
    }

    public void setDataDoLog(Date dataDoLog) {
        this.dataDoLog = dataDoLog;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(name, log.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


}
