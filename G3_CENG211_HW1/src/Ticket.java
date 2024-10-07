public class Ticket {
    private int sectionNumber;
    private int rowNumber;
    private int seatNumber;
    private double price;
    private boolean bookingStatus;

    // Constructors
    public Ticket(int sectionNumber, int rowNumber, int seatNumber, double price) {
        this.sectionNumber = sectionNumber;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.price = price;
        this.bookingStatus = false;
    }

    public Ticket(){
        this.sectionNumber = -1;
        this.rowNumber = -1;
        this.seatNumber = -1;
        this.price = -1;
        this.bookingStatus = false;
    }

    public Ticket(Ticket ticket){
        this.sectionNumber = ticket.getSectionNumber();
        this.rowNumber = ticket.getRowNumber();
        this.seatNumber = ticket.getSeatNumber();
        this.price = ticket.getPrice();
        this.bookingStatus = ticket.isBooked();
    }

    // Methods
    public void bookTicket() { //prevents double booking
        if (!this.bookingStatus) {
            this.bookingStatus = true;
        } else {
            System.out.println("This ticket is already booked.");
        }
    }
    

    // Getters
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
    // Setters
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public void setRowNumber(int seatNumber) {
        this.rowNumber = (seatNumber - 1) / 60 + 1;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookingStatus(boolean booked) {
        bookingStatus = booked;
    }

    @Override
    public String toString() {
        return "Section: " + sectionNumber + ", Row: " + rowNumber + ", Seat: " + seatNumber + ", Price: " + price + ", Booking Status: " + bookingStatus;
    }


}
