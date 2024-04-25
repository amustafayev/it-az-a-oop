package lesson6.sdf_ex.model;

import java.time.LocalDate;

public class DriverLicense {
    private String category;
    private String serialNum;
    private LocalDate issuingDate;
    private LocalDate validDate;

    @Override
    public String toString() {
        return "DriverLicense{" +
                "category='" + category + '\'' +
                ", serialNum='" + serialNum + '\'' +
                ", issuingDate=" + issuingDate +
                ", validDate=" + validDate +
                '}';
    }

    public DriverLicense(String serialNum) {
        this.serialNum = serialNum;
    }
}
