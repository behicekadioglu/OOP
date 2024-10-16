public class Query {

    public void findTheSectionWithTheHighestRevenue(Venue venue){
        Section[] sections = venue.getSections();
        double highestRevenue = 0;
        int highestRevenueID = 0;

        for(int i = 0; i < sections.length; i++){
            if (sections[i].calculateRevenue()>highestRevenue){
                highestRevenue = sections[i].calculateRevenue();
                highestRevenueID = i+1;
            }
        }

        System.out.println("Section with the highest revenue is section " + highestRevenueID +
            ", and the revenue of this section is " + highestRevenue);
    }

    public void findTheTotalRevenueOfTheVenue(Venue venue){

    }

    public void findTheOccupancyRateOfTheVenue(Venue venue){

    }

    public void findTheHighetsPaidCustomersTickets(Venue venue){

    }

    public void findTheMostExpensiveTicket(Venue venue){

    }

    private void drawTheSection(Venue venue){

    }

}
