package hust.soict.hedspi.test.store;


import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

<<<<<<< HEAD
        // Create some DVDs
=======
        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

<<<<<<< HEAD
        // Add DVDs to the store
=======
       
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

<<<<<<< HEAD
        // Print the current state of the store
        System.out.println("Current state of the store:");
        printStoreItems(store);

        // Remove a DVD from the store
        store.removeMedia(dvd2);

        // Print the updated state of the store
=======
        
        System.out.println("Current state of the store:");
        printStoreItems(store);

       
        store.removeMedia(dvd2);

        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        System.out.println("Updated state of the store:");
        printStoreItems(store);
    }

    private static void printStoreItems(Store store) {
        for (Media dvd : store.getItemsInStore()) {
            if (dvd != null) {
                System.out.println(dvd.getTitle());
            }
        }
        System.out.println("--------------");
    }
}

