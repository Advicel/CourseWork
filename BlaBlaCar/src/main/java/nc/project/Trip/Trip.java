package nc.project.Trip;

import nc.project.Driver.Driver;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Trip")
public class Trip {
    private String id;
    private String startPoint;
    private String endPoint;
    private Driver driver;
    private Date date;

    public Trip(String startPoint, String endPoint, Driver driver, Date date) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.driver = driver;
        this.date = date;
    }

    public Trip() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
