package Model;

public class watchList {
    private int idWatchList;
    private int LastWatch;
    private int Fav;
    movie idMovie;
    user userid;

    public int getIdWatchList() {
        return idWatchList;
    }

    public void setIdWatchList(int idWatchList) {
        this.idWatchList = idWatchList;
    }

    public int getLastWatch() {
        return LastWatch;
    }

    public void setLastWatch(int lastWatch) {
        LastWatch = lastWatch;
    }

    public int getFav() {
        return Fav;
    }

    public void setFav(int fav) {
        Fav = fav;
    }

    public movie getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(movie idMovie) {
        this.idMovie = idMovie;
    }

    public user getUserid() {
        return userid;
    }

    public void setUserid(user userid) {
        this.userid = userid;
    }
}
