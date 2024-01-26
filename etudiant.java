public class etudiant {
     int id;
     String name;
     String email ;
    note [] listDeNote;

    public etudiant (int id , String name, String email){
        this.id=id;
        this.name=name;
        this.email=email;
        this.listDeNote=new note[10];
    }

    public String toString(){
        String str="";
        for (int i=0;i<10;i++){
            str+=listDeNote[i].toString();
        }
        return "Nom: "+name+" mon id: "+id+" mon email: "+email+" liste de notes"+str;
    }
}
