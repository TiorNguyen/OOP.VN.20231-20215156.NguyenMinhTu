package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        // Trường hợp tiêu đề giống nhau, so sánh theo chi phí
        return Float.compare(media2.getCost(), media1.getCost());
    }
}
