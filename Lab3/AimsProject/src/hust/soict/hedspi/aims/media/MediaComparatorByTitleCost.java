package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
<<<<<<< HEAD
        // Trường hợp tiêu đề giống nhau, so sánh theo chi phí
=======
        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        return Float.compare(media2.getCost(), media1.getCost());
    }
}
