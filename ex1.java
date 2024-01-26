public class ex1 {
    private int myId ;
    private String myName;
    private float myMoyen;
    public ex1(int id,String nom,float moy){
        this.myMoyen=moy;
        this.myName=nom;
        this.myId=id;
    }

    public int getMyId() {
        return myId;
    }

    public float getMyMoyen() {
        return myMoyen;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyId(int monId) {
        this.myId = monId;
    }

    public void setMyName(String monNom) {
        this.myName = monNom;
    }

    public void setMaMoyennne(float maMoyennne) {
        this.myMoyen = maMoyennne;
    }

}
