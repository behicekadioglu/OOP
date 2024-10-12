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
<<<<<<< Updated upstream

    //prevents double booking
    public void bookTicket() {
        if (!this.bookingStatus) {
            this.bookingStatus = true;
=======
    // makes the ticket booked, if it is booked prints a string to say that
    public void bookTicket() {
        if (this.bookingStatus == false){
            this.setBookingStatus(true);
>>>>>>> Stashed changes
        } else {
            System.out.println("This ticket is already booked");
        }
    }
<<<<<<< Updated upstream

    // Getters and Setters
=======
    
    // Getters and setters
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }
>>>>>>> Stashed changes



    @Override
    public String toString() {
        return "Section: " + sectionNumber + ", Row: " + rowNumber + ", Seat: " + seatNumber + ", Price: " + price + ", Booking Status: " + bookingStatus;
    }


}
