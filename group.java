public class group {
    String groupName;
    ex1[] listesEtudiants;


    public group(String nom){
        this.groupName=nom;
        this.listesEtudiants=new ex1[20];
    }

    public String toString(){
        return "Name: " + groupName;
    }

}
