package ba.unsa.etf.rpr;

public class Sat {
    private int sati,minute,sekunde;

    public Sat(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    public int getSati() {
        return sati;
    }

    public int getMinute() {
        return minute;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void Set(int sati, int minute, int sekunde) {
        setSekunde(sekunde);
        setMinute(minute);
        setSati(sati);
    }
    void Sljedeci() {
        setSekunde(getSekunde()+1);
        if (getSekunde() == 60) {
            setSekunde(0);
            setMinute(getMinute()+1);
        }
        if (getMinute() == 60) {
            setMinute(0);
            setSati(getSati()+1);
        }
        if (getSati() == 24) {
            setSati(0);
        }
    }
    void Prethodni() {
        setSekunde(getSekunde()-1);
        if (getSekunde() == -1) {
            setSekunde(59);
            setMinute(getMinute()-1);
        }
        if (getMinute() == -1) {
            setMinute(59);
            setSati(getSati()-1);
        }
        if (getSati() == 0) {
            setSati(23);
        }
    }
    void pomjeriZa(int pomak) {
        for (int i = 0; i<pomak; i = i + 1){
            Sljedeci();
        }
        for (int i = 0; i<-pomak; i = i + 1) {
            Prethodni();
        }
    }

    @Override
    public String toString() {
        return sati+":"+minute+":"+sekunde;
    }
    public void Ispisi() {
        System.out.println(this.toString());
    }
}
