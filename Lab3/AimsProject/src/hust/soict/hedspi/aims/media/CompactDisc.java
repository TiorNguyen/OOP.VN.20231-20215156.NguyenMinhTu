package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks;

<<<<<<< HEAD
    // Constructors
    public CompactDisc(int id, String title, String category, float cost, String director, ArrayList<Track> tracks) {
        super(id, title, category, cost, director);
        if(tracks!=null){
            this.tracks = new ArrayList<>(tracks);
        }


    }

    // Getter methods
=======
    
    public CompactDisc(int id, String title, String category, float cost, String director, ArrayList<Track> tracks) {
        super(id, title, category, cost, director);
        this.tracks = new ArrayList<>(tracks);
    }

    
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
    public String getArtist() {
        return artist;
    }

<<<<<<< HEAD
    // Other methods
    public void addTrack(Track track) {


=======
    
    public void addTrack(Track track) {
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list.");
        } else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
<<<<<<< HEAD
        if(tracks!=null)

=======
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("The track is not in the list.");
        }
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public int getLength() {
        int totalLength = 0;
<<<<<<< HEAD
        if(tracks!=null)
=======
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + this.getArtist());
        System.out.println("CD length: " + this.getLength());

<<<<<<< HEAD
        // Loop through each track and play
=======
        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompactDisc - ");
        sb.append("Title: ").append(getTitle()).append(", ");
        sb.append("Category: ").append(getCategory()).append(", ");
        sb.append("Cost: ").append(getCost()).append(", ");
        sb.append("Director: ").append(getDirector()).append(", ");
        sb.append("Artist: ").append(getArtist()).append(", ");
<<<<<<< HEAD
        if(getTracks()!=null)
=======
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        sb.append("Tracks: ").append(getTracks().size()).append(" tracks");
        return sb.toString();
    }
}
