import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
public class Customer {
    private String customerName;
    private int numOfTickets;
    private Ticket[] bookedTickets;

    // Constructors

    public Customer() {
        this.customerName = "Default Name";
        this.numOfTickets = 1; // Example default value
        // number of sections, rows, and seats are given hard coded as the numbers in the homework description
        assignCustTickets(this.numOfTickets, 4, 10, 60);
    }

    public Customer(String customerName, int numOfTickets) {
<<<<<<< Updated upstream
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
=======
        this.setCustomerName(customerName);
        this.setNumOfTickets(numOfTickets);
        // number of sections, rows, and seats are given hard coded as the numbers in the homework description
        assignCustTickets(numOfTickets, 4, 10, 60);
    }

    public Customer(Customer customer) {
        this.customerName = customer.customerName;
        this.numOfTickets = customer.numOfTickets;
        this.custTickets = new Ticket[customer.custTickets.length];
        for (int i = 0; i < customer.custTickets.length; i++) {
            this.custTickets[i] = new Ticket(customer.custTickets[i]);
        }
    }

    // Methods

    // gives a random int number in the range of max and min, max is not included
    private int generateRandomInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt(min, max);
    }

    // determines tickets of the customer randomly in a random section
    // if the ticket is already booked chooses another random ticket from the same section
    private void assignCustTickets(int numOfTickets, int numOfSections,int numOfRows, int numOfSeats){
        this.custTickets = new Ticket[numOfTickets];
        int randSectionID = generateRandomInt(0, numOfSections);
        for(int i = 0; i < numOfTickets; i++){
            int randRow = generateRandomInt(0, numOfRows);
            int randSeat = generateRandomInt(0, numOfSeats);
            Ticket ticket = new Ticket(randSectionID, randRow, randSeat);
            while(ticket.isBooked()){
                randRow = generateRandomInt(0, numOfRows);
                randSeat = generateRandomInt(0, numOfSeats);
                ticket = new Ticket(randSectionID, randRow, randSeat);
            }
            this.custTickets[i] = ticket;
        }
    }

    // calculates the total price of the customers tickets
    public double getTotalPrice(){
        double totalPrice = 0.0;
        for(int i = 0; i < this.numOfTickets; i++){
            totalPrice += custTickets[i].getPrice();
        }
        return totalPrice;
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }
    public int getNumTickets() {
        return numOfTickets;
    }
    public Ticket[] getCustTickets() {
        return custTickets;
>>>>>>> Stashed changes
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

    

    // toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer Name: ").append(customerName).append("\n");
        sb.append("Number of Tickets: ").append(numOfTickets).append("\n");
        sb.append("Tickets: \n");
        for (int i = 0; i < numOfTickets; i++) {
            sb.append(custTickets[i].toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
    }
        Customer customer = (Customer) obj;
        return numOfTickets == customer.numOfTickets &&
               Objects.equals(customerName, customer.customerName) &&
               Arrays.equals(custTickets, customer.custTickets);
}
 

    
}
