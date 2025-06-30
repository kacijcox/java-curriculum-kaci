package fileio;

import java.time.LocalDate;

public class Song {
    private String songName;
    private String performedBy;
    private LocalDate releaseDate;

    public Song(String songName, String performedBy, LocalDate releaseDate) {
        this.songName = songName;
        this.performedBy = performedBy;
        this.releaseDate = releaseDate;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return songName + "," + performedBy + "," + releaseDate;
    }
}
