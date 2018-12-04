package com.pract_3;

public class BookTest {
    public static void main(String[] args) {
        MCNVI.SecondLab.Book First = new MCNVI.SecondLab.Book("Captain's daughter", "\n" +
                "Alexander Pushkin", 1773, 320);
        System.out.println("MCNVI.SecondLab.Book: " + First.getName() + "\n" +"Author: "+ First.getAuthor() + "\n" +"Year: "+ First.getYear()+"\n"+"Number of pages: "+ First.getNumber_of_pages());
        First.setName("Children of captain grant");
        First.setYear(1773);
        First.setNumber_of_pages(332);
        System.out.println("\nMCNVI.SecondLab.Book: " + First.getName() + "\n" +"Author: "+ First.getAuthor() + "\n" +"Year: "+ First.getYear()+"\n"+"Number of pages: "+ First.getNumber_of_pages());
    }
}
