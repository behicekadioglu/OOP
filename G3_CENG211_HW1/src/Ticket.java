public class Ticket {
    private int sectionNumber;
    private int rowNumber;
    private int seatNumber;
    private double price;
    private boolean bookingStatus;

    // Constructors
    public Ticket(int sectionNumber, int rowNumber, int seatNumber, double price) {
        this.setSectionNumber(sectionNumber);
        this.setRowNumber(rowNumber);
        this.setSeatNumber(seatNumber);
        this.setPrice(price);
        this.setBookingStatus(false);
    }

    public Ticket(int sectionNumber, int rowNumber, int seatNumber) {
        this.setSectionNumber(sectionNumber);
        this.setRowNumber(rowNumber);
        this.setSeatNumber(seatNumber);
        this.setBookingStatus(false);
    }

    public Ticket(Ticket ticket){
        this.sectionNumber = ticket.getSectionNumber();
        this.rowNumber = ticket.getRowNumber();
        this.seatNumber = ticket.getSeatNumber();
        this.price = ticket.getPrice();
        this.bookingStatus = ticket.isBooked();
    }

    // Methods
    // makes the ticket booked, if it is booked prints a string to say that
    public void bookTicket() {
        if (this.bookingStatus == false){
            this.setBookingStatus(true);
        } else {
            System.out.println("This ticket is already booked");
        }
    }
 
    // Getters and setters

    public int getSectionNumber() {
        return sectionNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return bookingStatus;
    }

    private void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    private void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    private void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public void setBookingStatus(boolean booked){
        this.bookingStatus = booked;
    }



    @Override
    public String toString() {
        return "Section: " + sectionNumber + ", Row: " + rowNumber + ", Seat: " + seatNumber + ", Price: " + price + ", Booking Status: " + bookingStatus;
    }


}
