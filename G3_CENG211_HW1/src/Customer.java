import java.util.Random;
public class Customer {
    private String customerName;
    private int numOfTickets;
    private Ticket[] bookedTickets;

    // Constructors
    public Customer(String customerName, int numOfTickets) {
        this.customerName = customerName;
        this.numOfTickets = numOfTickets;
        this.bookedTickets = new Ticket[numOfTickets];
    }
    // Getters
    public String getCustomerName() { 
        return customerName; 
    }
    public int getNumTickets() { 
        return numOfTickets; 
    }
    public Ticket[] getBookedTickets() { 
        return bookedTickets; 
    }

    //Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setNumTickets(int numTickets) {
        this.numOfTickets = numTickets;
    }
    public void bookTicket(Ticket ticket, int index) {
        bookedTickets[index] = ticket;
        ticket.setBookingStatus(true);
    }
    // Bilet alma işlemi (random section ve koltuklardan)
    public void purchaseTickets(Venue venue) {
        Random rand = new Random();
        int sectionCount = venue.getSections().length;

        for (int i = 0; i < numOfTickets; i++) {
            boolean ticketAssigned = false;

            // Bilet bulunana kadar döngü
            while (!ticketAssigned) {
                // Rastgele bir section seçiyoruz
                Section section = venue.getSections()[rand.nextInt(sectionCount)];
                
                // Rastgele bir satır ve koltuk seçiyoruz
                int row = rand.nextInt(10); // 10 satır var
                int seat = rand.nextInt(60); // 60 koltuk var

                // Bileti kontrol ediyoruz (daha önce alınmış mı?)
                if (!section.getTickets()[row][seat].isBooked()) {
                    // Eğer bilet boşsa, bileti alıyoruz
                    section.getTickets()[row][seat].setBookingStatus(true); // Bileti rezerve et
                    bookedTickets[i] = section.getTickets()[row][seat]; // Müşteri bilet listesine ekle
                    ticketAssigned = true; // Bilet başarıyla alındı
                }
            }
        }
    }
    public void printTickets() {
        System.out.println("Customer: " + customerName);
        for (Ticket ticket : bookedTickets) {
            if (ticket != null) {
                System.out.println("Section " + ticket.getSectionNumber() + ", Row " + ticket.getRowNumber() + ", Seat " + ticket.getSeatNumber() + ", Price: " + ticket.getPrice());
            }
        }
    }

    

}
