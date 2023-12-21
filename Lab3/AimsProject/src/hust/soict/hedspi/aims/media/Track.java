package hust.soict.hedspi.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

<<<<<<< HEAD
    // Constructors
=======
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

<<<<<<< HEAD
    // Getter methods
=======
    
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object obj) {
<<<<<<< HEAD
        // Check if the reference is the same
=======
        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        if (this == obj) {
            return true;
        }

<<<<<<< HEAD
        // Check if the passed object is null or of a different class
=======
        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

<<<<<<< HEAD
        // Cast the object to Track
        Track otherTrack = (Track) obj;

        // Check if titles and lengths are equal
=======
        
        Track otherTrack = (Track) obj;

>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        return title.equals(otherTrack.title) && length == otherTrack.length;
    }
}
