import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
private static final DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a'.'");
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
         int hour = appointmentDate.getHour();
        return 12 <= hour && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String appointmentDescription = "You have an appointment on " + appointmentDate.format(formatter);
        return appointmentDescription;
    }

    public LocalDate getAnniversaryDate() {
         int year = LocalDate.now().getYear();
        return LocalDate.of(year, 9, 15);
    }
}
