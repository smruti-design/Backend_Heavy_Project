package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId ;
    private String trainNumber;
    private Map<String, Time> stationTimes;
    private List<List<Integer>> seats;
    private List<String> stations;
}
