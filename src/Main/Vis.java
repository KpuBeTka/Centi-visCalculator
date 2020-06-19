package Main;

public class Vis {

    private Aspect aspect;
    private int nrOfAspects;

    public Vis(Aspect aspect, int nrOfAspects) {
        this.aspect = aspect;
        this.nrOfAspects = nrOfAspects;
    }

    public Aspect getAspect() {
        return aspect;
    }

    public void setAspect(Aspect aspect) {
        this.aspect = aspect;
    }

    public int getNrOfAspects() {
        return nrOfAspects;
    }

    public void setNrOfAspects(int nrOfAspects) {
        this.nrOfAspects = nrOfAspects;
    }

}
